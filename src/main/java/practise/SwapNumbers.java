package main.java.practise;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        a = a+b; b = a-b; a = a-b;

        b = b+c; c = b-c; b = b-c;

        c = c+d; d = c-d; c = c-d;

        System.err.print("a = "+a+",b = "+b+",c = "+c+",d = "+d);
    }
}
