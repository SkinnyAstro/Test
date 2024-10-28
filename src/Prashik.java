import java.util.Scanner;
public class Prashik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().toLowerCase().charAt(0);

        if ((ch== 'a') || (ch == 'e' )|| (ch== 'i') ||(ch=='o') || (ch=='u')){
            System.out.println("Entered character is a vowel");
        }
          else {
            System.out.println("Character is constant");
        }

    }
}
