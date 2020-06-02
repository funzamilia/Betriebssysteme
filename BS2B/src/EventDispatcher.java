import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public interface EventDispatcher {
	public void addActionListener(ActionListener al);
	public void processActionEvent(ActionEvent ae);
}
