package fr.gagoi.pwal.graphics.window;

import java.util.ArrayList;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Display extends JFrame implements Runnable {

	private int fps, width, height, current_fps;
	private double fpsInv;
	private String title;
	private boolean isRunning = true;
	private AppCanvas canvas;

	public Display(String title, int width, int height, int fps) {
		setTitle(title);
		setFps(fps);
		setWidth(width);
		setHeight(height);
		canvas = new AppCanvas(width, height);
		add(canvas);
		setSize(width, height);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		new Thread(this).start();
	}

	/*
	 * Use -1 in order to have infinite refresh rate.
	 */
	public void setFps(int i) {
		this.fps = i;
		this.fpsInv = 1000 / i;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getFps() {
		return this.fps;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public String getTitle() {
		return this.title;
	}

	@Override
	public void run() {
		while (isRunning) {
			long timer = System.currentTimeMillis(), start_time_FPS = System.currentTimeMillis();
			int tempFPS = 0;
			while (isRunning) {
				long current_time = System.currentTimeMillis();
				if (current_time >= start_time_FPS + fpsInv) {
					canvas.render();
					tempFPS++;
				}
				if (System.currentTimeMillis() >= timer + 1000) {
					timer += 1000;
					current_fps = tempFPS;
					System.out.println(current_fps);
					tempFPS = 0;
				}
			}
		}
	}

	public ArrayList<Layer> getLayers() {
		return canvas.getLayers();
	}

}
