import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n*** Royal bank of java***");
        System.out.println("Are you here for mortage ? Yes or No");
        String option = scan.nextLine();

        switch (option){
            case "yes":
                System.out.println("\nGreat!" +
                        "How much money do you have in your savings?" +
                        " And, how much do you owe in credit card debt?");

                double savings = scan.nextDouble();
                double credit = scan.nextDouble();
                System.out.println("How many years you have worked for ?");
                scan.nextLine();
                int years = scan.nextInt();
                System.out.println("What is your name ?");
                String name = scan.next();

                if (savings>=10000 && credit<5000 &&years>2){
                    System.out.println("Congratulations " + name +" you have been approved");
                }else {
                    System.out.println("Sorry you are not eligible for the mortage");
                }
                break;

            case "No":
                System.out.println("Ok Have a nice day !");

        }



    }
}
