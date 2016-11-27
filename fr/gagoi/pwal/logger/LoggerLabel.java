package fr.gagoi.pwal.logger;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LoggerLabel extends JLabel{

	private ILoggedItem item;
	
	public LoggerLabel(ILoggedItem item) {
		this.item = item;
		update();
	}
	
	public void update(){
		setText(item.getName() + " : " + item.getValue());
	}

}
