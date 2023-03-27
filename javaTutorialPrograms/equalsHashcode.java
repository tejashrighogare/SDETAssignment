//Write program for equals and hashcode methods
package Occurances;
class Test_hash_equal {
    public static void main(String[] args) {
        equalsHashcode("Andrew", "Andrew");
        notEqualHashcode("Rohan", "Roshan");
    }
    public static void equalsHashcode(String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println("string1 & string2 are equal variables, and their respective hashvalues are:" + " " + string1.hashCode()
                    + " & " + string2.hashCode());
        }
    }
    public static void notEqualHashcode(String string3, String string4) {
        if (!string3.equals(string4)) {
            System.out.println("\nstring3 & string4 are Un-equal variables, and their respective hashvalues are:" + " "
                    + string3.hashCode() + " & " + string4.hashCode());
        }
    }
}