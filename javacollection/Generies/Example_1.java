package Generies;
import java.util.*;

abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle.............");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle.............");
    }
}
public class Example_1 {
    public static void drawShapes(List<? extends Shape> lists){  
       for(Shape s:lists){  
       s.draw(); 
     }  
}  
    public static void main(String[]args){
        List<Rectangle>R = new ArrayList<Rectangle>();
        R.add(new Rectangle());
        List<Circle>C = new ArrayList<Circle>();
        C.add(new Circle());
        C.add(new Circle());
        drawShapes(C);
        drawShapes(R);
    }
}
