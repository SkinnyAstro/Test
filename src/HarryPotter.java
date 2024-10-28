public class HarryPotter {
    public static void main(String[] args) {
        int gryfindoor = 450;
        int ravenclaw = 550;

        int grydifference = gryfindoor-ravenclaw;
        //int ravdifference = ravenclaw-gryfindoor;

        if (grydifference==300){
            System.out.println("Gryfindoor is the champion");
        } else if (grydifference<=-100) {
            System.out.println(" You are third");
        } else if (grydifference>=100) {
            System.out.println("You are fourth");

        }else {
            System.out.println("You are second");
        }
    }
}
