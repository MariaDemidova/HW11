package demidova;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //--------------1===========
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(0, 1);
        arr1.add(1, 2);
        arr1.add(2, 3);
        System.out.println(changeElements(arr1, 1, 2));

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add(0, "one");
        arr2.add(1, "two");
        arr2.add(2, "three");
        System.out.println(changeElements(arr2, 1, 2));
        //---------------2-----------
        String[] arrOfStr = {"q", "ф"};

        ArrayList<String> temp = changeToArrayList(arrOfStr);
        System.out.println(temp);

        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();

        apple1.addFruits(new Apple(), 10);
        apple2.addFruits(new Apple(), 3);
        orange1.addFruits(new Orange(), 5);
        orange2.addFruits(new Orange(), 3);

        System.out.println("Box1 weight: " + apple1.getWeight());
        System.out.println("Box2 weight: " + apple2.getWeight());
        System.out.println("Box3 weight: " + orange1.getWeight());
        System.out.println("Box4 weight: " + orange2.getWeight());
        System.out.println("Box 1 equals box 3: "+orange1.compare(apple1));
        System.out.println("Box 2 equals box 4: "+orange2.compare(apple2));
        apple1.pour(apple2);
        orange1.pour(orange2);
        System.out.println("Box 1: "+apple1.getWeight());
        System.out.println("Box 2: "+apple2.getWeight());
        System.out.println("Box 3: "+orange1.getWeight());
        System.out.println("Box 4: "+orange2.getWeight());


    }


    //ex1
    public static <T> List<T> changeElements(List<T> arr1, int a, int b) {
        T temp = arr1.get(a);
        arr1.set(a, arr1.get(b));
        arr1.set(b, temp);
        return arr1;
    }

    //ex2
    public static <T> ArrayList<T> changeToArrayList(T[] arr) {
        ArrayList<T> arrAfterConvert = new ArrayList<>(Arrays.asList(arr));
        return arrAfterConvert;
    }
}
