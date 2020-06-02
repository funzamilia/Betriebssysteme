
public class ActionListenerTest {

	public static void main(String[] args) {
		ActionListenerImpl1 al1 = new ActionListenerImpl1();
		ActionListenerImpl2 al2 = new ActionListenerImpl2();
		EventDispatcherImpl edi = new EventDispatcherImpl();
		edi.addActionListener(al1);
		edi.addActionListener(al2);
		edi.processActionEvent(null);
		
	}

}
