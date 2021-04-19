import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
		Login login = new Login();
		Scanner scan = new Scanner(System.in);
		System.out.println("Bankam�za ho�geldiniz.");
		System.out.println("*******************");
		System.out.println("Kullan�c� girisi : ");
		System.out.println("*******************");
		int girishakki = 3;
		
		
		while (true) {
			if (login.login(hesap)) {
				System.out.println("Giri� ba�ar�l�.");
				break;
				
			}
			else {
				System.out.println("Giri� ba�ar�s�z.");
				girishakki=girishakki-1;
				System.out.println("Kalan giri� hakk�n�z : " + girishakki);
				
			}
			if (girishakki == 0) {
				System.out.println("Giri� hakk�n�z kalmad�.");
				return;
			}
		}
		System.out.println("*******************");
		String islemler = "1. Bakiye G�r�nt�le\n" + "2. Para Yat�rma\n" + "3. Para �ekme\n" + "4. ��k�� i�in q'ya bas�n�z.";
		System.out.println(islemler);
		System.out.println("*******************");
		while (true) {
			System.out.println("��lem se�iniz.");
			 String islem = scan.nextLine();
			 
			 if (islem.equals("q")) {
				 System.out.println("��k�� yap�l�yor.");
			 }
			 else if (islem.equals(1)) {
				 System.out.println("Bakiyeniz : ");
			 }
			 else if (islem.equals(3)) {
				 System.out.println("�ekmek istedi�iniz miktar� giriniz : ");
				 int cekis = scan.nextInt();
				 System.out.println("Yeni bakiyeniz : " + (hesap.getBakiye()-cekis));}
			 
		     
				 else if (islem.equals(2)){
				System.out.println("Yat�rmak istedi�iniz miktar� giriniz : ");	 
				int yatirma = scan.nextInt();
				System.out.println("Yeni bakiyeniz : " + (hesap.getBakiye()-yatirma));
				
				
				 }
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
		
				 
				 
				 
			 }
		
		
	}
	

	

}
