import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerImpl2 implements ActionListener{

	@Override
	public synchronized void actionPerformed(ActionEvent e) {	//synchronized um gleichzeitigen Zugriff von verschiedenen Threads zu verhindern
		System.out.println("ActionListener 2 wurde aufgerufen");
	}

}
