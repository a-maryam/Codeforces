// using java comparator
// problem statement: https://codeforces.com/contest/230/problem/A
import java.io.*;
import java.util.*;
 
public class Dragons {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        d[] ds = new d[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new d(scan.nextInt(), scan.nextInt());
        }
        Arrays.sort(ds, new MyComparator());
        boolean die = false;
        int index = 0;
        while ((index <= ds.length - 1) && ds[index].x < s) {
            s += ds[index].y;
            index++;
        }
        if (index != ds.length) {
            die = true;
        }
        System.out.println(die ? "NO" : "YES");
    }
 
    static class d {
        int x;
        int y;
 
        public d(int a, int b) {
            x = a;
            y = b;
        }
    }
 
    static class MyComparator implements Comparator<d> {
        public int compare(d a, d b) {
            if (a.x < b.x) {
                return -1;
            } else if (a.x > b.x) {
                return 1;
            }
            return 0;
        }
    }
}
