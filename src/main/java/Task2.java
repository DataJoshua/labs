import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        ArrayList<Integer> sample= new ArrayList<>();

        // fill the asmple array
        for (int i = 1; i <= 20; i++) {
            sample.add(i);
        }

        System.out.println(editArray(sample, 2, 5));
    }

    public static ArrayList<Integer> editArray(ArrayList<Integer> a,  int k1, int k2){
        Scanner input = new Scanner(System.in);

        for (int i = k1; i <= k2; i++) {
            System.out.println("insert a value to put in the index " + i + " of the array");
            a.add(i, input.nextInt());
        }

        return a;
    }
}
