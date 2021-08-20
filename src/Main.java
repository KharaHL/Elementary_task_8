import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        String exit="";
        Set set = new Set();
       do {
        set.set();
       Scanner scanner2 = new Scanner(System.in);
        System.out.println("Add another one?");
        exit = scanner2.nextLine();
    } while (exit.equalsIgnoreCase("Y")||exit.equalsIgnoreCase("Yes"));


}}

