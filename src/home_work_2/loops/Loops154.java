package home_work_2.loops;

import java.util.Scanner;

public class Loops154 {
    public static void main(String[] args) {
    loops151();
    }
    public static void loops151() {
        System.out.println("Ряд Фибоначчи :");
        Scanner in = new Scanner(System.in);
        String inNut = String.valueOf(in.next());
        Long fab = Long.valueOf(inNut);
        int prev =0;
        int next =1;
        int i = 0;
            while ( i < fab) {
                next =  prev + next;
                prev = next - prev;
                i++;
                System.out.print(next + " ");
            }
    }

}

