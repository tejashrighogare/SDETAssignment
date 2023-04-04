package dataTypes;

public class Datatypes {
    //Write program for datatypes in java
    public static void main(String[] args) {
        boolean flag = true;
        booleanFunction(flag);
        int range = -4250000;
        integerFunction(range);
        float number = -42.3f;
        floatFunction(number);
        char character = '\u0051';
        charFunction(character);
        String myString = "Java Programming";
        stringFunction(myString);
    }

    public static void booleanFunction(boolean flag) {
        System.out.println(flag);
    }

    public static void integerFunction(int range) {
        System.out.println(range);
    }

    public static void floatFunction(float number) {
        System.out.println(number);
    }

    public static void charFunction(char character) {
        System.out.println(character);
    }

    public static void stringFunction(String myString) {
        System.out.println(myString);
    }
}