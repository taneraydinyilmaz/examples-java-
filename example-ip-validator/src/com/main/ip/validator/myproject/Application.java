package com.main.ip.validator.myproject;

import java.util.Scanner;
 

public class Application {

	public static void main(String[] args) {
		/*
		 * 1- Elimizde 11.122.10.19 - 11.122.10.50 aras�nda IP blo�u oldu�unu d���nelim.
		 * 
		 * �rn: Ba�lang�� 11.122.10.19 11.122.10.20 11.122.10.21 ... 11.122.10.48
		 * 11.122.10.49 11.122.10.50 Biti�
		 * 
		 * 
		 * Scanner nesnesi ile klavyeden IP adresi al�nacakt�r. Al�nan IP adresi e�er
		 * 11.122.10 ile ba�layan bir IP de�ilse, ekrana "Ge�ersiz IP" yaz�n.
		 * 
		 * E�er 11.122.10 ile ba�l�yorsa girilen IP Subnetwork i�indeki mi kontrol edin.
		 * (Yani 11.122.10.19 ile 11.122.10.50 aras�nda m�d�r kontrol edilecek.)
		 * 11.122.10.19 ve 11.122.10.50 aral���n i�ine dahildir.
		 * 
		 * E�er subnet IP blo�una aral���nda ise ekrana "Developer IP: <Ekrandan IP>"
		 * mesaj� yazd�r�lacakt�r. De�ilse "Sistem Y�neticinize Ba�vurunuz!" mesaj�
		 * yazd�r�lacakt�r.
		 */

		System.out.println("IP Range: 11.122.10.19 - 11.122.10.50");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter ip address: ");
		String inputIp = scanner.nextLine();
 
		Validation validation = new Validation(inputIp);
		validation.Validator();

		scanner.close();
	}
}
