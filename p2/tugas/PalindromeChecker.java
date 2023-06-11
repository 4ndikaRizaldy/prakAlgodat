package algodat.p2.tugas;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulangi = true;
        
        while (ulangi) {
            System.out.print("Masukkan kalimat: ");
            String sentence = input.nextLine();
            
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < sentence.length(); i++) {
                stack.push(sentence.charAt(i));
            }
            
            StringBuilder reversedSentence = new StringBuilder();
            while (!stack.isEmpty()) {
                reversedSentence.append(stack.pop());
            }
            
            System.out.println("Hasil: " + reversedSentence.toString());
            
            String reversed = reversedSentence.toString();
            if (sentence.equalsIgnoreCase(reversed)) {
                System.out.println("Termasuk palindrome");
            } else {
                System.out.println("Bukan palindrome");
            }
            
            System.out.print("Ulangi? (y/n): ");
            String pilihan = input.nextLine();
            if (!pilihan.equalsIgnoreCase("y")) {
                ulangi = false;
            }
        }
    }
}
