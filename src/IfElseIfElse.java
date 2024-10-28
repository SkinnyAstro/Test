public class IfElseIfElse {
    public static void main(String[] args) {

        String weather = "sunny";
        if (weather.equals("sunny")){
            System.out.println("It's a nice day for walk");
        } else if (weather.equals("rainy")) {
            System.out.println("Bring an umbrella");

        }else {
            System.out.println("Not sure what to do in this weather");
        }
        int score = 70;
        if (score>=85){
            System.out.println("You got an A!");
        } else if (score>=70) {
            System.out.println("You got an B!");

        } else if (score>=60) {
            System.out.println("You got an C!");
        } else if (score>=50) {
            System.out.println("You got an D!");
        } else {
            System.out.println("You failed");
        }
        String jobTitle = "CEO";
        if (jobTitle.equals("manager")){
            System.out.println("You're in charge of a team");
        } else if (jobTitle.equals("CEO")) {
            System.out.println("You're the boss");

        }else {
            System.out.println("You're an employee");
        }

        char grade = 'B';
        if (grade=='B'){
            System.out.println("Good Job!");

        } else if (grade=='A') {
            System.out.println("Excellent work!");
        } else if (grade=='C') {
            System.out.println("You did okay!");

        } else if (grade=='D') {
            System.out.println("Hey, you ");
        }else {
            System.out.println("You failed");
        }

    }
}
