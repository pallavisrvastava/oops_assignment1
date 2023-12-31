import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();

        printSeries(N1, N2);

        scanner.close();
    }

    public static void printSeries(int N1, int N2) {
        int count = 0;
        int n = 1;

        while (count < N1) {
            int term = 3 * n + 2;
            if (term % N2 != 0) {
                System.out.println(term);
                count++;
            }
            n++;
        }
    }
}