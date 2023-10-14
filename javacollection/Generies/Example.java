package Generies;

public class Example {
    public static<E>void printArray(E[] element){
        for(E elements:element){
            System.out.println(elements);
        }
        System.out.println();
    }
    public static void main(String[]args){
        Integer[] intArray = {10,20,30,40};
        Character[] charArray = {'c','a','i'};
        System.out.println("Print array elements");
        printArray(intArray);
        System.out.print("Print character array");
        printArray(charArray);
    }
}
