package shape;

import triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Shape();
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Square(4);
        shapes[3] = new Square(3);
        shapes[4] = new Circle(5);

        for(int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i]);
            if(shapes[i] instanceof Square){
                ((Square) shapes[i]).howToColor();
            }
        }
    }


}