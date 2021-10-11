package Start;

//importowanie pakietu Swing, którego zawartoœci¹ jest JFrame
import javax.swing.JFrame;
//importowanie pakietu Swing, którego zawartoœci¹ jest JButton
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
	public MyFrame() {
		//wywo³anie przycisku
		JButton btn = new JButton("Hello");
		//dodawanie przycisku
		this.add(btn);
		btn.addActionListener(this);
		
		//wyœwietlanie okienka
		//ustawianie rozmiaru okienka
		this.setSize(400,400);
		//ustawianie widocznoœci okienka
		this.setVisible(true);
	}	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hi");
	}
}
