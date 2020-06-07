import java.util.concurrent.Semaphore;

class Test {
	public static Semaphore s = new Semaphore(1);
	
	public static void main(String[] argv) {
		String[] arr = {"C:\\Users\\Saleh Omar\\Desktop\\Studium4\\EclipseSemester4\\BS3\\src\\haensel.txt", "C:\\Users\\Saleh Omar\\Desktop\\Studium4\\EclipseSemester4\\BS3\\src\\gretel.txt"};
		if (arr.length >= 2) {
			Drucker d = new Drucker();
			Benutzer haensel = new Benutzer(d, arr[0], 5);
			Benutzer gretel = new Benutzer(d, arr[1], 5);
			Thread haenselT = new Thread(haensel);	//B 1) Man nutzt die Runnable Klasse Benutzer, um einen neuen Thread zu starten.
			Thread gretelT = new Thread(gretel);
			haenselT.start();
			gretelT.start();
		} else {
			System.out.println("Bitte zwei Dateinamen als Argumente uebergeben!");
		}
	}
}
