import java.util.Scanner;
public class Quizz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Which country held the Summer olympics ?");
        System.out.println("\t a) Chine \t b) Ireland \t c) Brazil \t d) Italy");
        String Firstanswer = scan.nextLine();

        System.out.println("Which planet is the hottest ?");
        System.out.println("\t a) Venus \t b) Saturn \t c) Mercury \t d) Mars");
        String Secondanswer = scan.nextLine();

        System.out.println("What is the rarest type of blood ?");
        System.out.println("\t a) O \t b) A \t c) B \t d) AB-Negative");
        String Thirdanswer = scan.nextLine();

        System.out.println("Which one of these charactets is friends with Harry potter?");
        System.out.println("\t a) Hermoine granger \t b) Ron weasley \t c) Dracoy malfoy ");
        String Fourthanswer = scan.nextLine();


        int score =0;
        if (Firstanswer.equals("c")){
            score+=5;
        }

        if (Secondanswer.equals("a")) {
            score += 5;

        }
        if (Thirdanswer.equals("d")){
            score+=5;
        }
        if (Fourthanswer.equals("a")||Fourthanswer.equals("b")){
            score+=5;
        }

        System.out.println("Your final score is "+score+"/20");

        if (score>=15){
            System.out.println("Wow, you know your stuff");
        } else if (score>5) {
            System.out.println("Not bad!");
            
        }else {
            System.out.println("Better luck next time");
        }


    }

}

