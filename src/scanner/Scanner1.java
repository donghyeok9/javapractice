package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자입력:");
        String str = scanner.nextLine();
        System.out.println("입력문자"+str);

        System.out.println("정수입력:");
        int intValue = scanner.nextInt();
        System.out.println("입력정수"+intValue);

        System.out.println("실수입력");
        double doubleValue=scanner.nextDouble();
        System.out.println("입력실수"+doubleValue);
    }
}

