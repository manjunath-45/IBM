package Interface.example;

public class Main {
   
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10,12);
		Circle circle = new Circle(3);
		Triangle triangle = new Triangle(4,6);
		
		System.out.println("AOR : "+ rectangle.getArea());
		System.out.println("AOR : "+ circle.getArea());
		System.out.println("AOR : "+ triangle.getArea());
		
	}

}
