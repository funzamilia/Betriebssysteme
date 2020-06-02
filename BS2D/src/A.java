
public class A {
	public int wert;
	public static Object o = new Object();

	public A(int startWert) {
		wert = startWert;
	}

	public void tausche(A a) {
		synchronized (o) {
			int h = wert;
			wert = a.wert;
			a.wert = h;
		}
	}
}
