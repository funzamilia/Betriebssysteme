
public class Test {

	public static void main(String[] args) {
		Speicherzelle sz = new Speicherzelle();
		MeinThread mt = new MeinThread(sz, "mt");
		MeinThread mt2 = new MeinThread(sz, "mt1");
		
		mt.start();
		mt2.start();
		
		System.out.println("Etwas");
	}

}
