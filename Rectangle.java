public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle() {
        super();
    }
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    @Override
    public double area() {
        return (this.width * this.height);
    }
    @Override
    public double perimeter() {
        return (this.width * 2 + this.height * 2);
    }
    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f,height=%.2f,color%s,area=%.2f,perimeter=%.2f]", width, height, getColor(), area(), perimeter() );
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.height == other.height &&
                    this.width == other.width &&
                    this.getColor().equals(other.getColor());
        }
        return false;
    }
}
