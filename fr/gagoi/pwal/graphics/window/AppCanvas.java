package fr.gagoi.pwal.graphics.window;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class AppCanvas extends Canvas {

	private BufferedImage imgApp;
	private int width, height;
	private ArrayList<Layer> layers = new ArrayList<>();

	public AppCanvas(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void render() {
		if(imgApp == null) {
			imgApp = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			return;
		}
		Graphics g = imgApp.getGraphics();
		g.clearRect(0, 0, width, height);
		for (Layer layer : layers) {
			layer.clear();
			layer.render();
			g.drawImage(layer.getImage(), layer.getPosX(), layer.getPosY(), layer.getWidth(), layer.getHeight(), null);
		}
		getGraphics().drawImage(imgApp, 0, 0, null);
	}

	public ArrayList<Layer> getLayers() {
		return layers;
	}
}
