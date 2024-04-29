import java.io.*;
import java.util.Scanner;


class myexcep extends Exception {
    public myexcep(String msg) {
        super(msg);
    }
}


public class Qion16uest {
    public static void main(String[] args) throws myexcep {
        try {
            String c = "Australia";
            if (c != "India") {
                throw new myexcep("NoMatchException");
            }
        } catch (myexcep ex) {
            System.out.println(ex.getMessage());
        }
    }
}
