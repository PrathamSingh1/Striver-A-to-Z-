import java.util.*;
// Functions are set of code which performs something for you
// Functions are used to modularise code
// Functions are used to increase readbility
// Functions are used to use same code multiple times

// void 
// return
// parameterised
// non parameterised

public class function{
    public static void printName() {
        System.out.println("hey Pratham Singh");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printName();

        sc.close();

    }

}