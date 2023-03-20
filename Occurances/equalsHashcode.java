package Occurances;

class Test_hash_equal {
    public static void main(String[] args) {
        equalsHashcode("Andrew", "Andrew");
        notEqualHashcode("Rohan", "Roshan");
    }

    public static void equalsHashcode(String a, String b) {
        if (a.equals(b)) {
            System.out.println("a & b are equal variables, and their respective hashvalues are:" + " " + a.hashCode()
                    + " & " + b.hashCode());
        }
    }

    public static void notEqualHashcode(String c, String d) {
        if (!c.equals(d)) {
            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "
                    + c.hashCode() + " & " + d.hashCode());
        }
    }
}