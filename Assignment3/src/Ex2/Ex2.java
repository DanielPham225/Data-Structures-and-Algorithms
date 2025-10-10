package Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String compare = reverse(s);
        if(s.equals(compare)) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }

    }
    public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return s.charAt(s.length()-1) + reverse(s.substring(0, s.length() -1));
    }
}
