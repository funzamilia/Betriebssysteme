import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class EventDispatcherImpl implements EventDispatcher{
	LinkedList<ActionListener> alList = new LinkedList<ActionListener>();
	
	@Override
	public void addActionListener(ActionListener al) {
		alList.add(al);
		
	}

	@Override
	public void processActionEvent(ActionEvent ae) {
		for(ActionListener al : alList) {
			new Thread() {	//Neuer Thread je Aufruf
				public void run(){
						al.actionPerformed(ae);
				}
			}.start();
		}
		
	}

}
