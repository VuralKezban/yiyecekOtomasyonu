package yiyecekOto;

import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Method m = new Method();
		int devam;
		do {
			m.listele();
			System.out.println("Almak istedi�iniz �r�n� se�in: ");
			int urunNo = scan.nextInt();

			m.hesapla(urunNo);
			System.out.println("Devam etmek istiyorsan�z 1, ��kmak i�in 2 ye bas�n. ");
			devam = scan.nextInt();
		} while (devam == 1);
		m.odeme();
	}
}
