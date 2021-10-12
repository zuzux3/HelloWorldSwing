package Start;

//importowanie pakietu Swing, którego zawartoœci¹ jest JFrame, JButton i JLabel
import javax.swing.*;
//importowanie awt w celu u¿yciu m.in. BorderLayout
import java.awt.*;
//importowanie event w celu wykorzystania ActionEvent i ActionListener
import java.awt.event.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	//tworzenie ramki
	JFrame frame = new JFrame("Hello World");
	//tworzenie etykiety
	JLabel label = new JLabel();
	public MyFrame() {
		//wywo³anie przycisku
		JButton btn = new JButton("Hello");
		//dodawanie przycisku
		this.add(btn);
		//tworzenie granicy przycisku, aby nie wyskakiwa³ na ca³¹ wielkoœæ okna
		btn.setBounds(50, 150, 95, 30);
		//dodawanie przycisku do ActionListener
		btn.addActionListener(this);
		
		//umieszczenie przycisku na dole okna
		frame.getContentPane().add(BorderLayout.SOUTH, btn);
		//umieszczanie napisu w œrodku po lewej stronie okna
		frame.getContentPane().add(BorderLayout.CENTER, label);
		//ustawianie zakoñczania 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ustawianie rozmiaru okienka
		frame.setSize(400,400);
		//ustawianie widocznoœci okienka
		frame.setVisible(true);
	}	
	
	//drukowanie "Hi" w konsoli
	//@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		//akcja - wyœwietlanie napisu Hi w oknie programu
		label.setText("Hi!");
	}
}
