package Start;

//importowanie pakietu Swing, którego zawartością jest JFrame
import javax.swing.JFrame;
//importowanie pakietu Swing, którego zawartością jest JButton
import javax.swing.JButton;
//importowanie event w celu wykorzystania ActionEvent i ActionListener
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
	public MyFrame() {
		//wywołanie przycisku
		JButton btn = new JButton("Hello");
		//dodawanie przycisku
		this.add(btn);
		btn.addActionListener(this);
		
		//wyświetlanie okienka
		//ustawianie rozmiaru okienka
		this.setSize(400,400);
		//ustawianie widoczności okienka
		this.setVisible(true);
	}	
	
	//drukowanie "Hi" w konsoli
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hi");
	}
}
