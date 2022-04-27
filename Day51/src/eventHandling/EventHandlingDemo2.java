package eventHandling;

import java.awt.*;
import java.awt.event.*;

class MainClass implements ActionListener {
	EventHandlingDemo2 obj;

	MainClass(EventHandlingDemo2 obj) {
		this.obj = obj;
	}

	public void actionPerformed(ActionEvent e) {
		obj.field.setText("You clicked the button");
	}
}

	class EventHandlingDemo2 extends Frame {
		TextField field;
		EventHandlingDemo2() {

// creating components in the constructor

		field = new TextField();
		field.setBounds(60, 50, 170, 20);
		Button button = new Button("click me");
		button.setBounds(100, 120, 80, 30);
		MainClass main = new MainClass(this);
		button.addActionListener(main);
		add(field);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);

	}

	public static void main(String args[]) {
		new EventHandlingDemo2();
	}
}

