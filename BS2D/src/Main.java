
public class Main {
	private static A a0;
	private static A a1;

	public static void main(String[] args) {
		a0 = new A(0);
		a1 = new A(1);
		WertTausch wt1 = new WertTausch(a0, a1); // Thread X
		WertTausch wt2 = new WertTausch(a1, a0); // Thread Y
		
		System.out.println("Davor: ");
		System.out.println("a0 = " + a0.wert);
		System.out.println("a1 = " + a1.wert);
		
		wt1.start();
		wt2.start(); 
		
		try {
			wt1.join();	//Damit der Main Thread wartet.
			wt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Danach: ");
		System.out.println("a0 = " + a0.wert);
		System.out.println("a1 = " + a1.wert);
	}
}
