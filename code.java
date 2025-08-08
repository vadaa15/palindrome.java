package coding_language;
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num; // original number store karna
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10; // last digit nikalo
            reversedNum = reversedNum * 10 + digit; // digit ko reverse number me add karo
            num = num / 10; // last digit hatao
        }
        
        if (originalNum == reversedNum) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

	}
