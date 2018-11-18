package Thougtworks;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
		
public class RatioOFChars {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int no = Integer.parseInt(br.readLine());
		String website;

		for (int i = 0; i < no; i++) {
			website = br.readLine();
			int strLen = website.length();
			int vowelsCnt = 0;
			for (int j = 4; j <= (strLen-4); j++) {
				switch (website.charAt(j)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowelsCnt++;
				}
			}
			System.out.println((strLen - vowelsCnt - 4) + "/" + strLen);
		}
	}

}