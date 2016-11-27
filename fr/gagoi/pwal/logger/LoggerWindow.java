package fr.gagoi.pwal.logger;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

import fr.gagoi.pwal.app.AppElement;

@SuppressWarnings("serial")
public class LoggerWindow extends JFrame implements AppElement {
	private ArrayList<LoggerLabel> labels = new ArrayList<>();

	public LoggerWindow() {
		setTitle("Debug");
		setPreferredSize(new Dimension(400, 400));
		setLayout(new GridLayout(0, 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addItem(ILoggedItem item) {
		LoggerLabel label = new LoggerLabel(item);
		labels.add(label);
		getContentPane().add(label);
	}

	@Override
	public void update() {
		for (LoggerLabel loggerLabel : labels)
			loggerLabel.update();
	}

	@Override
	public boolean isRunning() {
		return true;
	}

}
