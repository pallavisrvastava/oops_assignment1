import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N1 = scanner.nextLong();
        long N2 = scanner.nextLong();
        
        long lcm = calculateLCM(N1, N2);
        
        System.out.println(lcm);
        
        scanner.close();
    }

    public static long calculateLCM(long N1, long N2) {
        // Calculate the greatest common divisor (GCD) using Euclidean algorithm
        long gcd = calculateGCD(N1, N2);
        
        // LCM of two numbers = (N1 * N2) / GCD
        return (N1 * N2) / gcd;
    }

    public static long calculateGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}