package Start;
//importowanie pakietu Swing, którego zawartością jest JFrame
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		System.out.println("Hi");
		//wyświetlanie okienka
		//ustawianie rozmiaru okienka
		this.setSize(400,400);
		//ustawianie widoczności okienka
		this.setVisible(true);
	}	
}
