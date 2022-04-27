package eventHandling;

import java.awt.*;
import java.awt.event.*;
	
	class  EventHandlingDemo1 extends Frame implements ActionListener{
		TextField textField;
		EventHandlingDemo1() {
			textField = new TextField();
			textField.setBounds(60,50,170,20);
			Button button = new Button("Enter");
			button.setBounds(90,140,75,40);
			button.addActionListener(this);
			add(button);
			add(textField);
			setSize(350,350);
			setLayout(null);
			setVisible(true);
	}

		public void actionPerformed(ActionEvent e){
			textField.setText("Keep Learning");
}
		
		public static void main(String args[]){
			new EventHandlingDemo1();
		}
}
