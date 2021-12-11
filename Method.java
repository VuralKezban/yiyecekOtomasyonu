package yiyecekOto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Method {

	static Scanner scan = new Scanner(System.in);
	static List<String> urunler = new ArrayList<>(
			Arrays.asList("Kek", "Çikolata", "Bisküvi", "Su", "Kola", "Gazoz", "Meyve Suyu", "Kahve", "Cips", "Çerez"));
	static List<Double> fiyat = new ArrayList<>(Arrays.asList(1.0, 1.5, 2.0, 1.25, 2.0, 1.5, 2.5, 1.5, 5.0, 6.0));
	static List<String> alýnanUrun = new ArrayList<>();
	static List<Double> alýnanUrunFiyat = new ArrayList<>();
	static List<String> alýnan = new ArrayList<>();
	static List<Double> alýnanlarFiyat = new ArrayList<>();
	static double toplam = 0;

	public void odeme() {
		double fiyat = 0;
		fiyat += paraGecerliMi();

		while (fiyat < toplam) {

			System.out.println((toplam - fiyat) + " Tl eksik ödeme yaptýnýz.");
			fiyat += paraGecerliMi();
		}

		if (toplam < fiyat) {
			System.out.println("Para üstü: " + (fiyat - toplam));
		} else if (toplam == fiyat) {
			System.out.println("Ödeme baþarýlýdýr.");
		}
	}

	public void hesapla(int urunNo) {
		toplam += fiyat.get(urunNo);

		System.out.println("Toplam tutar: " + toplam);
	}
	public double fiyatHesapla() {
		double toplam = 0;
		for (int i = 0; i < alýnanUrunFiyat.size(); i++) {
			toplam += alýnanUrunFiyat.get(i);
		}
		System.out.println("Ödemeniz gereken toplam tutar: " + toplam);
		return toplam;

	}
	public void listele() {
		System.out.println(" No\t Urunler \t Fiyatlar");
		System.out.println("====\t ======== \t =======");
		for (int i = 0; i < urunler.size(); i++) {
			System.out.println(i + "\t" + urunler.get(i) + "\t" + "\t" + fiyat.get(i));
		}

	}
	public int paraGecerliMi() {
		int para;
		do {
			System.out.println("Otomata para atýnýz.  (Paranýz 1 tl , 5 tl, 10 tl, 20 tl þeklinde olmalýdýr.)");
			para = scan.nextInt();
			if (!(para == 1 || para == 5 || para == 10 || para == 20)) {
				System.out.println("paranýz geçerli deðildir, tekrar deneyiniz.");
			}
		} while (!(para == 1 || para == 5 || para == 10 || para == 20));
		return para;
	}

}
