package com.main.ip.validator.myproject;

public class Validation {

	private String ipAdress;

	public Validation(String ipAdress) {
		this.ipAdress = ipAdress;
	}

	public void Validator() {

		int controlIp = ipAdress.length();
		if (controlIp <= 13) {

			String moldPrefix = "11.122.10.";
			String prefix = ipAdress.substring(0, 10);

			if (!moldPrefix.equals(prefix)) {
				// System.out.println("Geçersiz IP");
				System.out.println(EValidationOutput.INVALID_PREFIX.getInvalid() 
					+ EValidationOutput.INVALID_PREFIX.getIp()
					+ EValidationOutput.INVALID_PREFIX.getMessage());
			} else {

				String suffix = ipAdress.substring(10);
				int numeralSuffix = Integer.valueOf(suffix);
				if (numeralSuffix >= 19 && numeralSuffix <= 50) {
					System.out.println("Developer IP: " + ipAdress);
				} else {
					// System.out.println("Sistem Yöneticinize Baþvurunuz!");
					System.out.println(EValidationOutput.INVALID_SUFFIX.getInvalid()
							+ EValidationOutput.INVALID_SUFFIX.getIp() + EValidationOutput.INVALID_SUFFIX.getMessage());
				}
			}
		} else
			System.out.println("Contact Your System Administrator!");
	}

}
