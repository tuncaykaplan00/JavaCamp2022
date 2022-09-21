package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		// B ve C case durumları bu şekilde yazılırsa ortak cevabı verir.
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
			// Default bize aksi durumlardaki cevabı vermektedir.
			// Ctrl+Shift+F Format Code
		}

	}

}
