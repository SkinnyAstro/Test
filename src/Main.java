//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("What is your first name ?");
        String firstname = scanner.nextLine();


        System.out.println("What is your last name ?");
        String Lastname = scanner.nextLine();


        System.out.println("How old are you?");
        int age = scanner.nextInt();


        System.out.println("Make a username");
        scanner.nextLine();
        String Username = scanner.nextLine();


        System.out.println("What city do you live in?");
        String city = scanner.nextLine();


        System.out.println("What country is that?");
        String country = scanner.nextLine();


        System.out.println("Than you for joining Javagram!");
        System.out.println("\nHere is the information you have entered:");
        System.out.println("\tFirst name:" +firstname);
        System.out.println("\tLast name:" +Lastname);
        System.out.println("\tAge:" +age);
        System.out.println("\tUsername:"+Username);
        System.out.println("\tcity:"+city);
        System.out.println("\tcountry:"+country);





    }
}