
public class Speicherzelle {
	private volatile int wert;
	public static Speicherzelle sz1 = new Speicherzelle();

	public synchronized void setWert(int w) {
		System.out.println("Set " + Thread.currentThread().getName());
		wert = w;
	}

	public synchronized int getWert() {
		System.out.println("Get " + Thread.currentThread().getName());
		return wert;
	}

	public void swapWert(Speicherzelle s) {
		System.out.println("Swap " + Thread.currentThread().getName());
		try {
			System.out.println("Sleep " + Thread.currentThread().getName());
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int h = s.getWert();
		
		try {
			System.out.println("Sleep " + Thread.currentThread().getName());
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		s.setWert(wert);
		
		try {
			System.out.println("Sleep " + Thread.currentThread().getName());
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setWert(h);
		
		try {
			System.out.println("Sleep " + Thread.currentThread().getName());
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fertig");
	}
}
