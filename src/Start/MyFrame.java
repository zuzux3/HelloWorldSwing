package Start;

//importowanie pakietu Swing, kt�rego zawarto�ci� jest JFrame
import javax.swing.JFrame;
//importowanie pakietu Swing, kt�rego zawarto�ci� jest JButton
import javax.swing.JButton;

public class MyFrame extends JFrame{
	public MyFrame() {
		//wywo�anie przycisku
		JButton btn = new JButton("Hello");
		//dodawanie przycisku
		this.add(btn);
		System.out.println("Hi");
		//wy�wietlanie okienka
		//ustawianie rozmiaru okienka
		this.setSize(400,400);
		//ustawianie widoczno�ci okienka
		this.setVisible(true);
	}	
}
