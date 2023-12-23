package Arrays;

import java.util.Scanner;

public class ThreeWayPartitioning {

    private int partition(int[] array, int startIndex, int endIndex, int element) {
        int partitionIndex = startIndex, elementIndex = -1;
        for (int i = startIndex; i <= endIndex; i++) {
            if (((elementIndex == -1) && array[i] >= element) || (array[i] >= element && array[i] <= array[elementIndex]))
                elementIndex = i;
            if (array[i] < element) partitionIndex++;
        }
        if (partitionIndex == array.length) return 0;

        array[partitionIndex] = array[partitionIndex] ^ array[elementIndex] ^ (array[elementIndex] = array[partitionIndex]);
        for (int i = startIndex, j = partitionIndex + 1; i < partitionIndex && j <= endIndex; ) {
            if (array[i] > element && array[j] < element) {
                array[i] = array[i] ^ array[j] ^ (array[j] = array[i]);
                i++;
                j++;
            } else if (array[i] < element) i++;
            else j++;
        }

        return partitionIndex;
    }

    public void threeWayPartition2(int[] array, int a, int b) {
        int aIndex = partition(array, 0, array.length - 1, a);
        partition(array, aIndex + 1, array.length - 1, b);
    }

    public void threeWayPartition(int[] array, int a, int b) {
        int s = 0, r = array.length - 1;
        for (int i = 0; s < r; i++) {
            if (array[i] > b) {
                array[i] = array[i] ^ array[r] ^ (array[r] = array[i]);
                i--;
                r--;
            } else if (array[i] < a) {
                array[i] = array[i] ^ array[s] ^ (array[s] = array[i]);
                i--;
                s++;
            }else if (array[r] > b) {
                r--;
            } else if (array[s] < a) {
                s++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{87, 78, 16, 94};
        new ThreeWayPartitioning().threeWayPartition(arr, 36, 72);
        for (int i : arr) System.out.println(i);
    }
}

class IntToDoubleExample2{
    public static void main(String args[]){
        int i=100;
//        Double d= (double) i;//first way
        Double d2= (double) i;//second way
//        System.out.println(d);
        System.out.println(d2);
    }
}

class ComplexNum<type extends Number>{
    public type r;
    public type i;
    public ComplexNum(type r, type i){
        this.r = r;
        this.i = i;
    }
    public ComplexNum<Double> add(ComplexNum<?> n){
        return new ComplexNum<Double>(n.r.doubleValue() + this.r.doubleValue(), n.i.doubleValue() + this.i.doubleValue());
    }

    @Override
    public String toString() {
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}

class ComplexNum<type extends Number>{
    public type r;
    public type i;
    public ComplexNum(type r, type i){
        this.r = r;
        this.i = i;
    }
    public ComplexNum<Double> add(ComplexNum<?> n){
        return new ComplexNum<Double>(n.r.doubleValue() + this.r.doubleValue(), n.i.doubleValue() + this.i.doubleValue());
    }

    @Override
    public String toString() {
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}

class asdf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = "+c3);
    }
}

class asdf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = "+c3);
    }
}
