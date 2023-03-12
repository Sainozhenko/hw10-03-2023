import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Задача1
//        Создать класс MaxElementInArray, содержащий метод, который находит максимальный элемент массива и возвращает его:
//        создать класс MaxElementInArray, содержащую имя массива (private int[] ints)
//        Создать конструктор, принимающий массив public MaxElementInArray( int[] ints ){ this.ints = ints;}
//        Написать метод, находящий максимальный элемент массива
//        В классе Main: создать массив целых чисел, cоздать обьект (экземпляр) класса MaxElementInArray для этого массива и вывести на экран значение максимального элемента этого массива

        int[] ints = {99,66,3,55,999};
        for (int i =0; i<ints.length; i++){
        }
       MaxElementInArray maxElementArray = new MaxElementInArray(ints);
        System.out.println("Max number is: "+ maxElementArray.getMax()+" " +"of array: "+ Arrays.toString(ints));
    }
}