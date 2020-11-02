package com.main.ip.validator.myproject;

import java.util.Scanner;
 

public class Application {

	public static void main(String[] args) {
		/*
		 * 1- Elimizde 11.122.10.19 - 11.122.10.50 arasýnda IP bloðu olduðunu düþünelim.
		 * 
		 * Örn: Baþlangýç 11.122.10.19 11.122.10.20 11.122.10.21 ... 11.122.10.48
		 * 11.122.10.49 11.122.10.50 Bitiþ
		 * 
		 * 
		 * Scanner nesnesi ile klavyeden IP adresi alýnacaktýr. Alýnan IP adresi eðer
		 * 11.122.10 ile baþlayan bir IP deðilse, ekrana "Geçersiz IP" yazýn.
		 * 
		 * Eðer 11.122.10 ile baþlýyorsa girilen IP Subnetwork içindeki mi kontrol edin.
		 * (Yani 11.122.10.19 ile 11.122.10.50 arasýnda mýdýr kontrol edilecek.)
		 * 11.122.10.19 ve 11.122.10.50 aralýðýn içine dahildir.
		 * 
		 * Eðer subnet IP bloðuna aralýðýnda ise ekrana "Developer IP: <Ekrandan IP>"
		 * mesajý yazdýrýlacaktýr. Deðilse "Sistem Yöneticinize Baþvurunuz!" mesajý
		 * yazdýrýlacaktýr.
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
