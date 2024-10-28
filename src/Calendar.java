public class Calendar {
    public static void main(String[] args) {

        String day = "Kylian";
        System.out.println("Hey are you free on "+day+ "?\n");
        System.out.println("Hmm Let me check ! \n");

        switch (day){
            case "Monday":
                System.out.println("Sorry I have to work late"); break;
            case "Tuesday":
                System.out.println("It looks like i have meeting all day"); break;
            case "Wednesday":
                System.out.println("I have a dentist appointment");break;
            case "Thursday":
                System.out.println("Sorry thursday is a date night");break;
            case "Friday":
                System.out.println("I'm Free");break;
            case "Saturday":
                System.out.println("Im Free");break;
            case "Sunday":
                System.out.println("I'm Free");break;

            default:
                System.out.println("That's not a day");
        }
    }
}
