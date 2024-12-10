package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> fibonacci = new ArrayList<Long>();
        fibonacci.add(0L);
        fibonacci.add(1L);
        for(int i= 1; fibonacci.size() < n; i++){
            long num = fibonacci.get(i-1) + fibonacci.get(i);
            fibonacci.add(num);
        }
        System.out.println(fibonacci);
    }
}
