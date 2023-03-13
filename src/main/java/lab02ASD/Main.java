package lab02ASD;

public class Main {
    public static void main(String[] args) {

        MyArray a1 = new MyArray(2,4254,5,35,2);

        // random generated array
        MyArray a2 = new MyArray(a1.getLength());


        // test all methods

        System.out.println(a1.getIndexOf(2)); // 0

        a2.printArray();

        a1.printArray();
        a1.replace(0, 10);
        a1.printArray();

        // search by default
        int index = a1.binarySearch(5);
        System.out.println(index); // 2

        System.out.println(a1.sumAll()); // 4306

        System.out.println(a1.getMinValue()); // 2

        System.out.println(a1.getMaxValue()); // 4254

        System.out.println(MyArray.areSimilar(a1, a2)); // false

        MyArray sample1 = new MyArray(-1,-2, 3);
        MyArray sample2 = new MyArray(-1, -2, 3);

        System.out.println( sample1.areAdjacentNegatives()); // true

        System.out.println(MyArray.areSimilar(sample1, sample2)); // true

        System.out.println("comb sorted");
        a2.combSort();

        a2.printArray();

        System.out.println("sample");

        MyArray a5 = new MyArray(12,3,24,4);

        a5.moveElementFrom(0, 3);

        a5.printArray();

    }

}
