package Start;
//importowanie pakietu Swing, kt�rego zawarto�ci� jest JFrame
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		System.out.println("Hi");
		//wy�wietlanie okienka
		//ustawianie rozmiaru okienka
		this.setSize(400,400);
		//ustawianie widoczno�ci okienka
		this.setVisible(true);
	}	
}
