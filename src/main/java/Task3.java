import customExceptions.NotAnumberException;

import javax.naming.LimitExceededException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // restrictions for x

        int n = 10;

        // 1.)
        ArrayList<Integer> x = createArrayX(n);

        // 2.)
        ArrayList<Double> y = createArrayYFromFunction(n);

        ArrayList<ArrayList<Double>> coordinates = getCoordinatesMap(x, y);

        // print the
        for(ArrayList<Double> e : coordinates){
            System.out.print("[");
            for(Double i : e){
                System.out.print(i + ", ");
            }
            System.out.print("]");
            System.out.println("");
        }

    }


    // 1.)
    public static ArrayList<Integer> createArrayX(int n){
        ArrayList<Integer> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("enter k1: ");
            int k1 = input.nextInt();

            System.out.println("enter k2:");
            int k2 = input.nextInt();

            for (int i = 0; i < n; i++) {
                // enter random numbers from 0 to 100 into the array
                result.add((int)(Math.random() * 100));
            }

            if(k1 > n || k2 > n){
                throw new LimitExceededException("The values k1, k2 have to enter the limit of valid indexes of the array ("+ n + ")");
            }

            // change the value of indexes k1, k2 from the keyboard

            System.out.println("insert value for the index "+ k1 + " of the array");
            result.add(k1, input.nextInt());

            System.out.println("insert value for the index "+ k2 + " of the array");
            result.add(k2, input.nextInt());

        }catch(InputMismatchException e){
            System.out.println("The values of k1 and k2 must be integers");
        }catch(LimitExceededException e){
            System.out.println(e.getMessage());
        }

        return result;
    }

    // 2.)
    public static ArrayList<Double> createArrayYFromFunction(int n){
        ArrayList<Double> result = new ArrayList<>();
        ArrayList<Integer> x = createArrayX(n);

        // create the result array
        for (Integer i: x) {
            // fill the result array with the output of the function f() and the elements generated by Array x
            result.add(Task1.f((double)i));
        }

        return result;
    }

    public static ArrayList<ArrayList<Double>> getCoordinatesMap(ArrayList<Integer> x, ArrayList<Double> y){

        ArrayList<ArrayList<Double>> result = new ArrayList<>();

        for (int i = 0; i < x.size(); i++) {
            ArrayList<Double> item = new ArrayList<>();
            item.add((double)x.get(i));
            item.add(y.get(i));
            result.add(item);
        }
        return result;
    }
}
