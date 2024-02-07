package l07.e01.pietrofornale;

public class Parallelepiped extends Rectangle{
  private double width;

  public Parallelepiped(double length, double height, double width) {
    super(length, height);
    this.width = width;
  }

  public double volume() {
    return area() * width;
  }

  public String sides() {
    return super.sides() + " : " + width;
  }

}
