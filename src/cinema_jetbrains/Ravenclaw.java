package cinema_jetbrains;

import java.util.Scanner;

public class Ravenclaw {

    public static String concatStrings(String str1, String str2) {

    	try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

        return str1.concat(str2);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));
    }
}
