package haha.hihi.hinh;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        circle.resize(Math.random()*100);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
    }
}
