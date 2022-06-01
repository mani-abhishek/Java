class Rectangle{
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle r) {
        this.length = r.length;
        this.width = r.width;
    }

    public void print() {
        System.out.println("Area of Rectangle = "+length*width);
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);

    }

    public void print() {
        System.out.println("Area of Square = "+length*length);
    }
}

class sol2 {
    public static void main(String[] args) {
        Square b = new Square(6.0);
        Rectangle c = new Rectangle(b);
        c.print();
        b.print();
    }
}