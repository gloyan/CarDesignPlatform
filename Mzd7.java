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
	
	String islemler = "Toplama yapmak i�in 1'e bas�n�z\n"
			           + "��karma yapmak i�in 2'ye bas�n�z\n"
			           + "�arpma yapmak i�in 3'e bas�n�z\n"
			           + "B�lme yapmak i�in 4'e bas�n�z\n"
			           +"��k�� yapmak i�in q'ya bas�n�z\n";
	System.out.println(islemler);
	
	while (true) {
		System.out.print("��lemi se�iniz : ");
		String islem = scan.nextLine();
		
	
		if (islem.equals("1")) {
		System.out.print("Ka� say�y� toplamak istersiniz? (2 veya 3) : " );
		int hane = scan.nextInt();
		  if (hane == 2) {
			  System.out.print("Birinci say� : ");
			  int a = scan.nextInt();
			  System.out.print("�kinci say� : ");
			  int b = scan.nextInt();
			  scan.nextLine();
			  System.out.print("Say�lar�n�z�n toplam� : " + toplama(a,b));
			  break;
		  }
		  else if (hane == 3) {
			  System.out.print("Birinci say� : ");
			  int a = scan.nextInt();
			  System.out.print("�kinci say� : ");
			  int b = scan.nextInt();
			  System.out.print("���nc� say� : ");
			  int c = scan.nextInt();
			  scan.nextLine();
			  System.out.println("Say�lar�n�z�n toplam� : " + toplama(a,b,c));
			  break;
			  
		  }
		  else if (!(hane==2 || hane==3)){
			  System.out.println("Ge�erli hane say�s� giriniz.");
			  break;
			  
		  }
	}
		
	else if (islem.equals("3")) {
		System.out.print("Ka� say�y� �arpmak istersiniz? (2 veya 3)");
		int hane = scan.nextInt();
		  if (hane == 2) {
			  System.out.print("Birinci say� : ");
			  int a = scan.nextInt();
			  System.out.print("�kinci say� : ");
			  int b = scan.nextInt();
			  scan.nextLine();
			  System.out.println("Say�lar�n�z�n �arp�m� : " + carpma(a,b));
			  break;
		  }
		  else if (hane == 3) {
			  System.out.print("Birinci say� : ");
			  int a = scan.nextInt();
			  System.out.print("�kinci say� : ");
			  int b = scan.nextInt();
			  System.out.print("���nc� say� : ");
			  int c = scan.nextInt();
			  scan.nextLine();
			  System.out.println("Say�lar�n�z�n �arp�m� : " + carpma(a,b,c));
			  break;
		  }
		  else {
			  System.out.println("Ge�erli hane say�s� giriniz.");
			 
		 
		  }
		  break;
		  }
	
	if (islem.equals("2")) {
		  System.out.print("Birinci say� : ");
		  int a = scan.nextInt();
		  System.out.print("�kinci say� : ");
		  int b = scan.nextInt();
		  scan.nextLine();
		  System.out.print("Say�lar�n�z fark� : + cikarma(a,b)");
		  break;
		  
	  }
	  else if (islem.equals("4")) {
		  System.out.print("Birinci say� : ");
		  int a = scan.nextInt();
		  System.out.print("�kinci say� : ");
		  int b = scan.nextInt();
		  scan.nextLine();
		  System.out.print("Say�lar�n�z�n birbirine b�l�m� : " + bolme(a,b));
		  break;
	  }
	  else if (islem.equals("q")) {
		  System.out.println("��k�� yap�l�yor...");
		  break;
	  }
	  else {
		  System.out.println("L�tfen ge�erli bir i�lem giriniz.");
	  }
	}
}
}