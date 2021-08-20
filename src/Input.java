import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public long inputMinimalValue() {
        boolean ok = false;
        long minimalValue = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input minimal value:");
                minimalValue = scanner.nextLong();
                if (minimalValue < 0) {
                    throw new IllegalArgumentException("the minimum value must be positive");
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return minimalValue;
    }

    public long inputMaxlValue() {
        boolean ok = false;
        long maxValue = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input max value:");
                maxValue = scanner.nextLong();
                if (maxValue <= 0) {
                    throw new IllegalArgumentException("the maximum value must be positive");
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return maxValue;
    }

    public long inputLength() {
        boolean ok = false;
        long length = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input length:");
                length = scanner.nextLong();
                if (length <= 0) {
                    throw new IllegalArgumentException("the length must be positive");
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return length;
    }
}
