package Start;
//importowanie pakietu Swing, którego zawartoœci¹ jest JFrame
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		System.out.println("Hi");
		//wyœwietlanie okienka
		//ustawianie rozmiaru okienka
		this.setSize(400,400);
		//ustawianie widocznoœci okienka
		this.setVisible(true);
	}	
}
