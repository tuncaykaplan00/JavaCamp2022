package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// 220-284 sayıda 220 nin bölenlerinin toplamı 284, 284 ün bölenlerinin toplamı
		// 220 olursa bu iki sayı arkadaş sayıdır.

		int number1 = 1184;
		int number2 = 1210;

		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for (int j = 1; j < number2; j++) {
			if (number2 % j == 0) {
				total2 = total2 + j;
			}
		}
		// if(number1 == total2 || number2 == total1) iki koşuldan biri olursa yeterli demektir.
		// if(number1 == total2 && number2 == total1) alttaki kod ile aynı mantıkta çalışır.
		if (number1 == total2) {
			if (number2 == total1) {
				System.out.println("Sayılar arkadaş sayıdır.");
			}
		} else {
			System.out.println("Sayılar arkadaş sayı değildir.");
		}
	}
}
