public class Parameter1 {
    public static void main(String[] args) {

        tipWaiter(55.50);

    }

    public static void tipWaiter(double bill){
        double tip = 15*bill/100;
        System.out.println("Thank you for your service , please accept this tip:"+tip);

    }
}
