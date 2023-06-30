import java.util.Scanner;


public class NotOrtalamaHesaplayici {

	private static int quiz,vize,son;
	private static double ortalama;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen Quiz Notunu Girin");
		quiz = input.nextInt();
		System.out.println("Lütfen Vize Notunu Girin");
		vize = input.nextInt();
		System.out.println("Lütfen Final Notunu Girin");
		son = input.nextInt();
		input.close();
		
		if((quiz > 100) || (quiz < 0) || (vize > 100) || (vize < 0) || (son > 100) || (son < 0)) {
			System.out.println("Hatalı bir not girdiniz.");
			System.exit(-1);
		} else {
			Hesapla();
		}
		
	}
	
	private static void Hesapla() {
		ortalama = ((quiz * 0.2) + (vize * 0.4) + (son * 0.4)); //Yüzdelik etkileme indexi. Buradan ayarlama yapabilirsiniz.
		
		boolean gecmeDurum = ortalama >= 50 ? true : false;
		String gecisText = gecmeDurum == true ? "Geçtiniz" : "Kaldınız";
		
		System.out.println("Ortalamanız: " + ortalama);
		System.out.println("Geçme durumu: " + gecisText);
		System.exit(0);
	}

}
