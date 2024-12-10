package exercises;

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada;
        do {
            entrada = scanner.nextInt();
            System.out.println((entrada % 2 == 0) ? "par" : "impar");
        }while (entrada != 0);
    }
}
