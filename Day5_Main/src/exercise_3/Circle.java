package exercise_3;

public class Circle extends Shape {
	   private int radius;
	   public Circle(int radius, Color color) {
	      super(color);
	      this.radius = radius;
	   }
	   public void draw() {
	      color.drawCircle(radius);
	   }
	}