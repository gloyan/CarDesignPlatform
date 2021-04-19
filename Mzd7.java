package mzd;

import java.util.Scanner;

public class Mzd7 {
    public static int toplama(int a , int b) {
    	return (a+b);
    	
    }
    public static int toplama(int a , int b , int c) {
    	return (a+b+c);
    }
	public static int cikarma(int a , int b) {
		return (a-b);
		
	}
	public static int carpma(int a , int b) {
		return (a*b);
	}
		public static int carpma(int a , int b , int c) {
			return (a*b*c);
	}
	public static double bolme (int a , int b) {
		return(a/b);
	}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String islemler = "Toplama yapmak için 1'e basýnýz\n"
			           + "Çýkarma yapmak için 2'ye basýnýz\n"
			           + "Çarpma yapmak için 3'e basýnýz\n"
			           + "Bölme yapmak için 4'e basýnýz\n"
			           +"Çýkýþ yapmak için q'ya basýnýz\n";
	System.out.println(islemler);
	
	while (true) {
		System.out.print("Ýþlemi seçiniz : ");
		String islem = scan.nextLine();
		
	
		if (islem.equals("1")) {
		System.out.print("Kaç sayýyý toplamak istersiniz? (2 veya 3) : " );
		int hane = scan.nextInt();
		  if (hane == 2) {
			  System.out.print("Birinci sayý : ");
			  int a = scan.nextInt();
			  System.out.print("Ýkinci sayý : ");
			  int b = scan.nextInt();
			  scan.nextLine();
			  System.out.print("Sayýlarýnýzýn toplamý : " + toplama(a,b));
			  break;
		  }
		  else if (hane == 3) {
			  System.out.print("Birinci sayý : ");
			  int a = scan.nextInt();
			  System.out.print("Ýkinci sayý : ");
			  int b = scan.nextInt();
			  System.out.print("Üçüncü sayý : ");
			  int c = scan.nextInt();
			  scan.nextLine();
			  System.out.println("Sayýlarýnýzýn toplamý : " + toplama(a,b,c));
			  break;
			  
		  }
		  else if (!(hane==2 || hane==3)){
			  System.out.println("Geçerli hane sayýsý giriniz.");
			  break;
			  
		  }
	}
		
	else if (islem.equals("3")) {
		System.out.print("Kaç sayýyý çarpmak istersiniz? (2 veya 3)");
		int hane = scan.nextInt();
		  if (hane == 2) {
			  System.out.print("Birinci sayý : ");
			  int a = scan.nextInt();
			  System.out.print("Ýkinci sayý : ");
			  int b = scan.nextInt();
			  scan.nextLine();
			  System.out.println("Sayýlarýnýzýn çarpýmý : " + carpma(a,b));
			  break;
		  }
		  else if (hane == 3) {
			  System.out.print("Birinci sayý : ");
			  int a = scan.nextInt();
			  System.out.print("Ýkinci sayý : ");
			  int b = scan.nextInt();
			  System.out.print("Üçüncü sayý : ");
			  int c = scan.nextInt();
			  scan.nextLine();
			  System.out.println("Sayýlarýnýzýn çarpýmý : " + carpma(a,b,c));
			  break;
		  }
		  else {
			  System.out.println("Geçerli hane sayýsý giriniz.");
			 
		 
		  }
		  break;
		  }
	
	if (islem.equals("2")) {
		  System.out.print("Birinci sayý : ");
		  int a = scan.nextInt();
		  System.out.print("Ýkinci sayý : ");
		  int b = scan.nextInt();
		  scan.nextLine();
		  System.out.print("Sayýlarýnýz farký : + cikarma(a,b)");
		  break;
		  
	  }
	  else if (islem.equals("4")) {
		  System.out.print("Birinci sayý : ");
		  int a = scan.nextInt();
		  System.out.print("Ýkinci sayý : ");
		  int b = scan.nextInt();
		  scan.nextLine();
		  System.out.print("Sayýlarýnýzýn birbirine bölümü : " + bolme(a,b));
		  break;
	  }
	  else if (islem.equals("q")) {
		  System.out.println("Çýkýþ yapýlýyor...");
		  break;
	  }
	  else {
		  System.out.println("Lütfen geçerli bir iþlem giriniz.");
	  }
	}
}
}