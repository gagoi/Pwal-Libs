package fr.gagoi.pwal.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

	private boolean[] isPressed = new boolean[KeyEvent.KEY_LAST];
	private boolean[] isAlreadyPressed = new boolean[KeyEvent.KEY_LAST];

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		isPressed[code] = true;

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		isAlreadyPressed[code] = false;
		isPressed[code] = false;

	}

	public boolean isKeyPressed(int key) {
		return isPressed[key];
	}

	public boolean isAlreadyKeyPressed(int key) {
		return isAlreadyPressed[key];
	}

	public void sendConfirmKey(int keyCode) {
		isAlreadyPressed[keyCode] = true;
	}

}
