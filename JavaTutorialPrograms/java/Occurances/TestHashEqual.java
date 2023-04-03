//Write program for equals and hashcode methods
package occurances;
public class TestHashEqual {
    public static void main(String[] args) {
        equalsHashcode("Andrew", "Andrew");
        notEqualHashcode("Rohan", "Roshan");
    }
    public static void equalsHashcode(String stringFirst, String stringSecond) {
        if (stringFirst.equals(stringSecond)) {
            System.out.println("string1 & string2 are equal variables, and their respective hashvalues are:" + " " + stringFirst.hashCode()
                    + " & " + stringSecond.hashCode());
        }
    }
    public static void notEqualHashcode(String stringFirst, String stringSecond) {
        if (!stringFirst.equals(stringSecond)) {
            System.out.println("\nstring3 & string4 are Un-equal variables, and their respective hashvalues are:" + " "
                    + stringFirst.hashCode() + " & " + stringSecond.hashCode());
        }
    }
}