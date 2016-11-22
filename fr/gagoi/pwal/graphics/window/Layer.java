package fr.gagoi.pwal.graphics.window;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Layer {

	private BufferedImage img;
	private ArrayList<GraphicElement> elements = new ArrayList<>();
	private int width, height, posX, posY;

	public Layer(int width, int height, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	}

	public Layer(Display d, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.width = d.getWidth();
		this.height = d.getHeight();
		img = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration().createCompatibleImage(width, height, BufferedImage.TYPE_INT_ARGB);
	}

	public void add(GraphicElement e) {
		elements.add(e);
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public BufferedImage getImage() {
		return img;
	}

	public void clear() {
		Graphics2D g = (Graphics2D) img.getGraphics();
		g.setBackground(new Color(0, true));
		g.clearRect(0, 0, width, height);
	}

	public void render() {
		Graphics g = img.getGraphics();
		for (int i = 0; i < elements.size(); i++) {
			elements.get(i).render(g);
			
		}
	}

	public void remove(int i) {
		this.elements.remove(i);
	}

	public void remove(GraphicElement e) {
		this.elements.remove(e);
	}
}
