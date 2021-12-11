package yiyecekOto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Method {

	static Scanner scan = new Scanner(System.in);
	static List<String> urunler = new ArrayList<>(
			Arrays.asList("Kek", "�ikolata", "Bisk�vi", "Su", "Kola", "Gazoz", "Meyve Suyu", "Kahve", "Cips", "�erez"));
	static List<Double> fiyat = new ArrayList<>(Arrays.asList(1.0, 1.5, 2.0, 1.25, 2.0, 1.5, 2.5, 1.5, 5.0, 6.0));
	static List<String> al�nanUrun = new ArrayList<>();
	static List<Double> al�nanUrunFiyat = new ArrayList<>();
	static List<String> al�nan = new ArrayList<>();
	static List<Double> al�nanlarFiyat = new ArrayList<>();
	static double toplam = 0;

	public void odeme() {
		double fiyat = 0;
		fiyat += paraGecerliMi();

		while (fiyat < toplam) {

			System.out.println((toplam - fiyat) + " Tl eksik �deme yapt�n�z.");
			fiyat += paraGecerliMi();
		}

		if (toplam < fiyat) {
			System.out.println("Para �st�: " + (fiyat - toplam));
		} else if (toplam == fiyat) {
			System.out.println("�deme ba�ar�l�d�r.");
		}
	}

	public void hesapla(int urunNo) {
		toplam += fiyat.get(urunNo);

		System.out.println("Toplam tutar: " + toplam);
	}
	public double fiyatHesapla() {
		double toplam = 0;
		for (int i = 0; i < al�nanUrunFiyat.size(); i++) {
			toplam += al�nanUrunFiyat.get(i);
		}
		System.out.println("�demeniz gereken toplam tutar: " + toplam);
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
			System.out.println("Otomata para at�n�z.  (Paran�z 1 tl , 5 tl, 10 tl, 20 tl �eklinde olmal�d�r.)");
			para = scan.nextInt();
			if (!(para == 1 || para == 5 || para == 10 || para == 20)) {
				System.out.println("paran�z ge�erli de�ildir, tekrar deneyiniz.");
			}
		} while (!(para == 1 || para == 5 || para == 10 || para == 20));
		return para;
	}

}
