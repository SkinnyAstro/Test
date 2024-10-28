import java.util.Scanner;

public class Shahu {
    public static void main(String[] args){

        Scanner Position = new Scanner(System.in);
        System.out.println("Enter Grade & Check which Postion you have - ");
        String txt = Position.nextLine();
        if(txt.equalsIgnoreCase("A")){
            System.out.println("He is a Manager");
        }else if(txt.equalsIgnoreCase("B")){
            System.out.println("He is a Lead");
        }else{
            System.out.println("Other are normal People");
        }
    }
}