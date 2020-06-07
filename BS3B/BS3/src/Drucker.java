
import java.io.*;

class Drucker {
	private Object o = new Object();
	void druckeDatei(String dateiname) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(dateiname));
			String line = in.readLine();
			//Test.s.acquire();	B 6)
			//synchronized (o) {	//B 4) Verhindert gemischte Ausgabe
				while (line != null) {
					// Zeile line auf dem Drucker ausgeben, 
					// hier simuliert durch Bildschirmausgabe
						System.out.println(line);
						line = in.readLine();
				}
			//Test.s.release();
		} catch (Exception e) {
			System.out.println("Eine Ausnahme ist aufgetreten.");
		}
	}
}
