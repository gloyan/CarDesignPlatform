import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
		Login login = new Login();
		Scanner scan = new Scanner(System.in);
		System.out.println("Bankamýza hoþgeldiniz.");
		System.out.println("*******************");
		System.out.println("Kullanýcý girisi : ");
		System.out.println("*******************");
		int girishakki = 3;
		
		
		while (true) {
			if (login.login(hesap)) {
				System.out.println("Giriþ baþarýlý.");
				break;
				
			}
			else {
				System.out.println("Giriþ baþarýsýz.");
				girishakki=girishakki-1;
				System.out.println("Kalan giriþ hakkýnýz : " + girishakki);
				
			}
			if (girishakki == 0) {
				System.out.println("Giriþ hakkýnýz kalmadý.");
				return;
			}
		}
		System.out.println("*******************");
		String islemler = "1. Bakiye Görüntüle\n" + "2. Para Yatýrma\n" + "3. Para Çekme\n" + "4. Çýkýþ için q'ya basýnýz.";
		System.out.println(islemler);
		System.out.println("*******************");
		while (true) {
			System.out.println("Ýþlem seçiniz.");
			 String islem = scan.nextLine();
			 
			 if (islem.equals("q")) {
				 System.out.println("Çýkýþ yapýlýyor.");
			 }
			 else if (islem.equals(1)) {
				 System.out.println("Bakiyeniz : ");
			 }
			 else if (islem.equals(3)) {
				 System.out.println("Çekmek istediðiniz miktarý giriniz : ");
				 int cekis = scan.nextInt();
				 System.out.println("Yeni bakiyeniz : " + (hesap.getBakiye()-cekis));}
			 
		     
				 else if (islem.equals(2)){
				System.out.println("Yatýrmak istediðiniz miktarý giriniz : ");	 
				int yatirma = scan.nextInt();
				System.out.println("Yeni bakiyeniz : " + (hesap.getBakiye()-yatirma));
				
				
				 }
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
		
				 
				 
				 
			 }
		
		
	}
	

	

}
