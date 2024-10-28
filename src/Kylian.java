public class Kylian {
    public static void main(String[] args) {
        double Wallet = 150;
        double Toycar = 20;

        if (Wallet>=Toycar){
            System.out.println("Yes we can buy this car \n");
            Wallet-=Toycar;
        }else {
            System.out.println("Sorry i only have "+Wallet+ " Money left");
        }

        double nike = 155.55;
        if (Wallet>=nike){
            System.out.println("Yes we can buy the nike shoes \n");
            Wallet-=nike;
        }else {
            System.out.println("No we do not have enough money , i only have " +Wallet+ " left with me\n");

        }

        double playstation = 80;
        if (Wallet>=playstation){
            System.out.println("Yes we can buy the playstation");
        }else {
            System.out.println("NO we cannot buy that as i only have "+Wallet+ " money left with me \n");
        }





    }
}
