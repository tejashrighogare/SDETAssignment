package ifElseIf;

public class IfElseIf {
    //Write program for if Else if
    public static void main(String[] args) {
        String cityName = "Agra";
        functionIfElseIf(cityName);
    }

    public static void functionIfElseIf(String cityName) {
        if (cityName == "Meerut") {
            System.out.println("city is meerut");
        } else if (cityName == "Noida") {
            System.out.println("city is noida");
        } else if (cityName == "Agra") {
            System.out.println("city is agra");
        } else {
            System.out.println(cityName);
        }
    }
}