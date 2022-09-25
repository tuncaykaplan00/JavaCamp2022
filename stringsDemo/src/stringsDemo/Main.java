package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		// mesaj.length dizideki karakter sayısını belirtir.
		System.out.println("Eleman Sayısı = " + mesaj.length());
		System.out.println("5'inci Eleman = " + mesaj.charAt(4));

		// concat kodu istediğimiz diziyi eklememizi sağlar.
		System.out.println(mesaj.concat(" Yaşasın!"));

		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		// Boşlukta bir karakterdir.
		// 'a' yada String olursa "av" şeklinde olur.
		System.out.println(mesaj.lastIndexOf("a"));
		// lastIndexOf komutu sondan aramaya başlar fakar soldan sırasını belirtir.

	}

}
