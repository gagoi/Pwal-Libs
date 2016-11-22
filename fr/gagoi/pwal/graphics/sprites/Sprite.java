package fr.gagoi.pwal.graphics.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {

	private String name, path;
	private int width, height;
	private BufferedImage img;
	
	public Sprite(String name, String path) {
		this.name = name;
		this.path = path;
		
		try {
			this.img = ImageIO.read(getClass().getResourceAsStream(path));
			this.width = img.getWidth();
			this.height = img.getHeight();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Sprite(String name, String path, int width, int height, int xOffset, int yOffset) {
		this.name = name;
		this.path = path;
		this.width = width;
		this.height = height;
		
		try {
			this.img = ImageIO.read(getClass().getResourceAsStream(path)).getSubimage(xOffset, yOffset, width, height);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public BufferedImage getImage(){
		return this.img;
	}
	
	@Override
	public String toString() {
		return super.toString() + "{name:" + name + "; path:" + path + "; width:" + width + "; height:" + height + "}";
	}

}
