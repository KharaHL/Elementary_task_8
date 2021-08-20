import java.util.ArrayList;

public class Output {
    public void print(ArrayList<Long> data) {
        System.out.println();
        for (long i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
