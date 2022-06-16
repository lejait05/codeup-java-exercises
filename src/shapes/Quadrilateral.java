package shapes;

public abstract class Quadrilateral extends Shapes implements Measurable{
   protected double length;
   protected double width;
   public Quadrilateral(){}

    public Quadrilateral(double length, double width){
       this.length = length;
       this.width = width;
    }
    @Override
    public double getPerimeter(){
        return 0;
    }
    @Override
    public double getArea(){
        return 0;
    }
}
