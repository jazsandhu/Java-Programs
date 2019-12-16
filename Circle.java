/*Jasdeep Sandhu - 121190151*/
package Assignment2;

public class Circle {
	
	class Circle2D {
		private double x;
		private double y;
		private int radius;
	
		public double getX() {
			return x;
		}
	
		public double getY() {
			return y;
		}
	
		public int getRadius() {
			return radius;
		}
	
		Circle2D() {
			x = 0.0;
			y = 0.0;
			radius = 1;
		}
	
		Circle2D(double newX, double newY, int newRadius) {
			x = newX;
			y = newY;
			radius = newRadius;
		}
	
		public double getArea() {
			return (radius * radius * Math.PI);
		}
	
		public double getPerimeter() {
			return (2 * radius * Math.PI);
		}
	
		public boolean contains(double x2, double y2) {
			if (Math.pow(x2 - getX(), 2) + Math.pow(y2 - getY(), 2) < Math.pow(getRadius(), 2)) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean contains(Circle2D circle) {
			if (Math.sqrt(Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2)) + circle.getRadius() < getRadius()) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean overlaps(Circle2D circle) {
			if (Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2) >= Math.pow(circle.getRadius() + getRadius(), 2)) {
				return true;
			} else {
				return false;
			}
		}
	}
}

