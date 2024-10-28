public class ReturnValues {
    public static void main(String[] args) {
        double area1 =calculateArea(2.3,3.6);// these values which are we passing are known as Arguments
        double area2 =calculateArea(2.5,5.0);
        double area3=calculateArea(5,6);

        String englishExplaination = explainArea("English");
        String frenchExplaination = explainArea("French");
        String spanishExplaination = explainArea("Spanish");
        String italianExplaination = explainArea("Italian");
    }
    public static double calculateArea(double length , double width) // the variables which will store the values are known as paramters
    {
      
        if (length <0 || width<0){
            System.out.println("Invalid");
            System.exit(0);
        }
        double area = length* width;
        return area;
    }

    public static String explainArea(String language) {
        if (language.equals("English")) {
            return "Area equals length*width";
        } else if (language.equals("French")) {
           return "La surface est egale a la longueur * la largeur";
        } else if (language.equals("Spanish")) {
            return "area es igual a largo * ancho";
        } else {
            return "Language not available";
        }

    }


}



//switch (language){
//        case "English": return "Area equals length*width";
//        case "French": return  "La surface est egale a la longueur * la largeur";
//        case "Spanish": return "area es igual a largo * ancho";
//default:return "Language not available";
//        }