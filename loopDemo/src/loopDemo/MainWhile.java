package loopDemo;

public class MainWhile {

	public static void main(String[] args) {
		// For
		// i++ ile i=i+1 aynı durumdur.
		// i+=2 komutu i'yi 2 artır demektir.
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");
		int i=2;
		// While
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}

		System.out.println("While Döngüsü Bitti.");
	}

}
