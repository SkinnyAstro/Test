import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("\nWhat is your name ?");
        String name= scan.nextLine();

        System.out.println("\nHi " +name+" ! I'm Javabot. Where are you from ?");
        String city= scan.nextLine();

        System.out.println("\nI hear its beautiful at " +city+"! I'm from a place called as Oracle");

        System.out.println("\nHow old are you");
        int age = scan.nextInt();

        System.out.println("\nSo you're, "+age+ " cool! I'm 40 years old");
        System.out.println("This means I'm " +(double)40/age+ " times older than you");

        System.out.println("\nEnough about me.What's your favourite language? (just don't say Python)");
        scan.nextLine(); // throw away next line to be wasted on empty space
        String language = scan.nextLine();

        System.out.println("I am from truemeds");

        System.out.println("\nJava, that's great! Nice chatting with you "+name+" I have to log off now.See ya !");

    }
}

