package haha.hihi.hinh;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setLength(side);
        super.setWidth(side);
    } @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }


}
