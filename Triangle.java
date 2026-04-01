public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle() {
        super();
    }
    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        super(color);
    }
    public double getSideA(){
        return this.a;
    }
    public double getSideB() {
        return this.b;
    }
    public double getSideC() {
        return this.c;
    }
    @Override
    public double area() {
        double s;
        s = (a+b+c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override
    public double perimeter() {
        return a+b+c;
    }
    @Override
    public String toString() {
        return String.format("Triangle[a=%.2f,b=%.2f,c=%.2f,color=%s,area=%.2f,perimeter=%.2f", a,b,c, super.getColor(), area(), perimeter());
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            Triangle other = (Triangle) obj;
            return  this.a == other.a &&
                    this.b == other.b &&
                    this.c == other.c &&
                    this.getColor().equals(other.getColor());
        }
        return false;
    }
}
