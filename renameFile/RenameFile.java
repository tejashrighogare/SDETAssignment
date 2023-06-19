package renameFile;
import java.io.*;
public class RenameFile {
    public static void main(String[] args) {
        File fileObject = new File("C:/Users/tejashrig/Documents/SDETAssignment/src/Occurances/Occurancesassign.java");
        renameFile(fileObject);
    }

    public static void renameFile(File fileObject) {
        File rename = new File("C:/Users/tejashrig/Documents/SDETAssignment/src/Occurances/OccurancesassignRename.java");
        // store the return value of renameTo() method in flag
        boolean flag = fileObject.renameTo(rename);
        // if renameTo() return true then if block is executed
        if (flag == true) {
            System.out.println("File Successfully Renamed");
        }
        // if renameTo() return false then else block is executed
        else {
            System.out.println("Operation Failed");
        }
    }
}