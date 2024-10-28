import java.util.Scanner;
public class UpperCase {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)){
            System.out.println("Entered character is upper case");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("Entered character is lower case");
        }else {
            System.out.println("Not a valid character");
        }


    }
}

