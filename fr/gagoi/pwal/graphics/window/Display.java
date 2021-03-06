package fr.gagoi.pwal.graphics.window;

import java.util.ArrayList;

import javax.swing.JFrame;

import fr.gagoi.pwal.inputs.Keyboard;

@SuppressWarnings("serial")
public class Display extends JFrame implements Runnable {

	private int width, height, current_fps;
	private double fpsInv;
	private String title;
	private boolean isRunning = true;
	private AppCanvas canvas;
	private Keyboard keyboard = new Keyboard();

	public Display(String title, int width, int height, int fps) {
		setTitle(title);
		setFps(fps);
		setWidth(width);
		setHeight(height);
		canvas = new AppCanvas(width, height);
		add(canvas);
		addKeyListener(keyboard);
		canvas.addKeyListener(keyboard);
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
		long timer = System.currentTimeMillis(), start_time_FPS = System.currentTimeMillis();
		int tempFPS = 0;
		while (isRunning) {
			if (System.currentTimeMillis() >= timer + 1000) {
				timer = System.currentTimeMillis();
				current_fps = tempFPS;
				tempFPS = 0;
			}
			if (fpsInv > 0) {
				long sTime = System.currentTimeMillis();
				if (System.currentTimeMillis() >= start_time_FPS + fpsInv) {
					canvas.render();
					tempFPS++;
					start_time_FPS = System.currentTimeMillis();
				}
				try {
					Thread.sleep((long) (System.currentTimeMillis() - sTime + fpsInv));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else
				canvas.render();
		}
	}

	public ArrayList<Layer> getLayers() {
		return canvas.getLayers();
	}

	public int getCurrentFps() {
		return current_fps;
	}

	public Keyboard getKeyboard() {
		return this.keyboard;
	}
}
