package fr.gagoi.pwal.app;

import java.util.ArrayList;

public class Application implements Runnable {

	private boolean isRunning = true;
	private int current_ups;
	private double upsInv;

	private ArrayList<AppElement> elements = new ArrayList<>();

	public Application() {
		new Thread(this, "").start();
	}

	@Override
	public void run() {
		while (isRunning) {
			long timer = System.currentTimeMillis(), start_time_UPS = System.currentTimeMillis();
			int tempUPS = 0;
			while (isRunning) {
				long current_time = System.currentTimeMillis();
				if (current_time >= start_time_UPS + upsInv) {
					for (AppElement appElement : elements) {
						if (tempUPS % appElement.getUpdateToSkip() == 0) {
							appElement.update();
						}
					}
					tempUPS++;
				}
				if (System.currentTimeMillis() >= timer + 1000) {
					timer += 1000;
					current_ups = tempUPS;
					System.out.println(current_ups);
					tempUPS = 0;
				}
			}
		}
	}

}
