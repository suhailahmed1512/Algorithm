package org.hrank.algorithm.warmup;

/**
 * Class to implement time conversion
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ip = sc.next();

		String ipFormat = "hh:mm:ssaa";
		String opFormat = "HH:mm:ss";
		Date date;
		try {
			date = new SimpleDateFormat(ipFormat).parse(ip);
			System.out.println(new SimpleDateFormat(opFormat).format(date)
					.toString());

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}
}
