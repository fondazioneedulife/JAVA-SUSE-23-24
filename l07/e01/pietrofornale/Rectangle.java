package l07.e01.pietrofornale;

public class Rectangle extends Quadrilateral implements SidedShape {
  private double length;
  private double height;

  public Rectangle(double length, double height) {
    this.length = length;
    this.height = height;
  }

  public double area() {
    return length * height;
  }

  public String sides() {
    return length + " : " + height;
  }
}
