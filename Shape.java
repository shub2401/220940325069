class Shape
{
    void draw()
    {
        System.out.println("Shape is Drawing");
    }
    void erase()
    {
        System.out.println("Shape is Erasing");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Circle is drawing");
    }
    void erase()
    {
        System.out.println("Circle is Erasing");
    }
 }
 class Triangle extends Shape
 {
    void draw()
    {
        System.out.println("Triangle is Drawing");
    }
    void erase()
    {
        System.out.println("Triangle is Erasing");
    }
 }
 class Square extends Shape
 {
    void draw()
    {
        System.out.println("Shape is Drawing");
    }
    void erase()
    {
        System.out.println("Shape is Erasing");
    }
 }
  class NewShape
 {
    public static void main(String[] args )
    {
        Shape obj1=new Circle();
        Shape obj2=new Triangle();
        Shape obj3=new Square();
        obj1.draw();
        obj1.erase();

        obj2.draw();
        obj2.erase();

        obj3.draw();
        obj3.erase();
    } 
 }