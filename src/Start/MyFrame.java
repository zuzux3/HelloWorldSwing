package Start;

//importowanie pakietu Swing, którego zawartością jest JFrame
import javax.swing.JFrame;
//importowanie pakietu Swing, którego zawartością jest JButton
import javax.swing.JButton;

public class MyFrame extends JFrame{
	public MyFrame() {
		//wywołanie przycisku
		JButton btn = new JButton("Hello");
		//dodawanie przycisku
		this.add(btn);
		System.out.println("Hi");
		//wyświetlanie okienka
		//ustawianie rozmiaru okienka
		this.setSize(400,400);
		//ustawianie widoczności okienka
		this.setVisible(true);
	}	
}
