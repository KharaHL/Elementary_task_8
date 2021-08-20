import java.util.ArrayList;

public class Fibanacci {
    private long max_value;
    private long minimal_value;
    private long length;
    private ArrayList<Long> minMAxFibanacci = new ArrayList<Long>();
    private ArrayList<Long> lengthFibanacci = new ArrayList<Long>();

    public Fibanacci(long minimal_value, long max_value, long length) {
        this.max_value = max_value;
        this.minimal_value = minimal_value;
        this.length = length;
    }
    public ArrayList craeteMinMaxFibanacci() {
        long g = 1;
        long f = 0;
        while (f <= max_value) {
            if (f >= minimal_value) {
                minMAxFibanacci.add(f);
            }
            f = f + g;
            g = f-g;
        }
        return minMAxFibanacci;
    }

    public ArrayList createLengthFibanacci() {
        long g = 1;
        long f = 0;
        long maxValue = (long) Math.pow(10, length);
        long minimalValue = (long) Math.pow(10, (length - 1));
        while (f <= maxValue) {
            if (f >= minimalValue) {
                lengthFibanacci.add(f);
            }
            f = f + g;
            g = f-g;
        }
        return lengthFibanacci;
    }
}
