package regex_sample;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) {

		// Desen
		Pattern pattern = Pattern.compile("yağışlı", Pattern.CASE_INSENSITIVE);

		// Desenin eşleşeceği kalıp
		Matcher matcher = pattern.matcher("Bugün hava yağışlı");

		// Eşleşmenin içerisinde istediğimiz deseni arıyor ve boolean bir sonuç üretiyor(true-false)
		boolean matchFound = matcher.find();

		if (matchFound)
		{
			System.out.println("Eşleşme bulundu");
		}
		else
		{
			System.out.println("Eşlenme bulunamadı");
		}

	}

}
