
public class MeinSupercoolesProgramm {
	static int[] a0 = { 0, 0, 1 };
	static int[] a1 = { 1, 0, 1 };

	public static void schritt1a0() {
		a0[1] = a0[0];
		a0[2] = 2;
	}

	public static void schritt2a0() {
		a0[0] = a1[0];
		a0[2] = 3;
	}

	public static void schritt3a0() {
		a1[0] = a0[1];
	}

	public static void schritt1a1() {
		a1[1] = a1[0];
		a1[2] = 2;
	}

	public static void schritt2a1() {
		a1[0] = a0[0];
		a1[2] = 3;
	}

	public static void schritt3a1() {
		a0[0] = a1[1];
	}

	public static void main(String[] args) {
		boolean[] a0bekommt = { false, false, false, false, false, false };

		for (boolean b : a0bekommt) {
			if (b) {
				switch (a0[2]) {
				case 1:
					System.out.println("schritt1a0");
					schritt1a0();
					break;
				case 2:
					System.out.println("schritt2a0");
					schritt2a0();
					break;
				case 3:
					System.out.println("schritt3a0");
					schritt3a0();
					break;
				}
			} else {
				switch (a1[2]) {
				case 1:
					System.out.println("schritt1a1");
					schritt1a1();
					break;
				case 2:
					System.out.println("schritt2a1");
					schritt2a1();
					break;
				case 3:
					System.out.println("schritt3a1");
					schritt3a1();
					break;
				}
			}
		}
		System.out.println("A0: " + a0[0] + "     A1: " + a1[0]);

	}

}
