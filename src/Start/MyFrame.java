package Start;

//importowanie pakietu Swing, którego zawartoœci¹ jest JFrame
import javax.swing.JFrame;
//importowanie pakietu Swing, którego zawartoœci¹ jest JButton
import javax.swing.JButton;

public class MyFrame extends JFrame{
	public MyFrame() {
		//wywo³anie przycisku
		JButton btn = new JButton("Hello");
		//dodawanie przycisku
		this.add(btn);
		System.out.println("Hi");
		//wyœwietlanie okienka
		//ustawianie rozmiaru okienka
		this.setSize(400,400);
		//ustawianie widocznoœci okienka
		this.setVisible(true);
	}	
}
