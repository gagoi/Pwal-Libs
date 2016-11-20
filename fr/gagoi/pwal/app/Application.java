package fr.gagoi.pwal.app;

import java.util.ArrayList;

public class Application implements Runnable {

	private boolean isRunning = true;
	private int current_ups;
	private double upsInv;

	private ArrayList<AppElement> elements = new ArrayList<>();

	public Application(String name, int ups) {
		this.upsInv = 1000 / ups;
		new Thread(this, name).start();
	}

	@Override
	public void run() {
		while (isRunning) {
			long timer = System.currentTimeMillis(), start_time_UPS = System.currentTimeMillis();
			int tempUPS = 0;
			while (isRunning) {
				long current_time = System.currentTimeMillis();
				if (current_time >= start_time_UPS + upsInv) {
					updateAll();
					tempUPS++;
					start_time_UPS = System.currentTimeMillis();
				}
				if (System.currentTimeMillis() >= timer + 1000) {
					current_ups = tempUPS;
					tempUPS = 0;
					timer = System.currentTimeMillis();
				}
			}
		}
	}

	public synchronized void updateAll() {
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i) != null)
				elements.get(i).update();
			if (!elements.get(i).isRunning()) {
				elements.remove(i);
			}
		}
	}

	public void add(AppElement e) {
		this.elements.add(e);
	}

	public int getCurrentUps() {
		return current_ups;
	}

	public ArrayList<AppElement> getElements() {
		return elements;
	}

}
