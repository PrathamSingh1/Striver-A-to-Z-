import java.util.*;
// Functions are set of code which performs something for you
// Functions are used to modularise code
// Functions are used to increase readbility
// Functions are used to use same code multiple times

// void 
// return
// parameterised
// non parameterised

// Take two numbers and print its sum


// pass by value
// pass by reference

public class function{
    public static int sum(int num1, int num2) {
        int num3 = num1 + num2;
        return num3;
    }

    public static int maxx(int num1, int num2){
        if(num1 >= num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    public static void doSomething(String s) {
        s = 't' + s.substring(0);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        String s = "raj";
        // int res = sum(num1, num2);
        // int maximum = maxx(num1, num2);
        doSomething(s);
        System.out.println(s);

        sc.close();

    }

}