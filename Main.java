package yiyecekOto;

import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Method m = new Method();
		int devam;
		do {
			m.listele();
			System.out.println("Almak istediðiniz ürünü seçin: ");
			int urunNo = scan.nextInt();

			m.hesapla(urunNo);
			System.out.println("Devam etmek istiyorsanýz 1, çýkmak için 2 ye basýn. ");
			devam = scan.nextInt();
		} while (devam == 1);
		m.odeme();
	}
}
