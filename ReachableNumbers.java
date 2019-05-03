// Problem statement: https://codeforces.com/contest/1157/problem/A
import java.util.*;
import java.io.*;
import java.lang.*;

public class ReachableNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<Integer> mod = new HashSet<Integer>();
        mod.add(n);
        int x = apply_f(n);
        while (mod.contains(x) == false) {
            mod.add(x);
            n = x;
            x = apply_f(n);
        }
        System.out.println(mod.size());
        scan.close();
    }

    public static int apply_f(int n) {
        n++;
        while (n % 10 == 0) {
            n = n / 10;
        }
        return n;
    }
}
