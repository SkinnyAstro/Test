

public class Workbook3 {
    public static void main(String[] args) {

        double Change=3.50;
        double Price =2.50;
        System.out.println("ME: Hi Java do i have enough change to buy chips?");
        System.out.println("JAVA: "+(Change>Price) + "\n");

        int count = 12;
        int maxcount = 10;
        System.out.println("Me: Hi java , can the elevator hold everyone?");
        System.out.println("JAVA:" +(count<maxcount) +"\n");

        int invitesent = 20;
        int inviteeaccept=20;
        System.out.println("Me: Hi java, can everyone attend my dinner party?");
        System.out.println("JAVA:" + (invitesent==inviteeaccept) + "\n");

        String word= "happy";
        String word2= "Not happy";
        System.out.println("ME: Hi Java, will my friend be happy ?");
        System.out.println("Java: " + word.equals(word2) + "\n");



        int Minseat = 100;
        int Myseat = 50;
        System.out.println("Me: Hi java, will i win the election?");
        System.out.println("JAVA:" + (Myseat>Minseat) + "\n");




    }
}
