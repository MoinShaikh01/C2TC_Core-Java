package eventHandling;

import java.awt.*;
import java.awt.event.*;

	public class EventHandlingDemo3 extends Frame {
		TextField field;
		EventHandlingDemo3() {
		
		field = new TextField();
		field.setBounds(60, 50, 170, 20);
		Button button = new Button("click!!!");
		button.setBounds(50, 120, 80, 30);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				field.setText("Welcome");
			}
		});
		
		add(button);
		add(field);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String args[]) {
		new EventHandlingDemo3();
	}
	
}
