package ex04.app;

import java.util.ArrayList;
import java.util.List;

import ex04.entities.Circle;
import ex04.entities.Rectangle;
import ex04.entities.Shape;

public class Program {

	public static void main(String[] args) {

		// Creating a list of shapes and instancing a kind rectangle and a kind
		// circle
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		// the method totalArea() receives a list of shapes and calculate the area of
		// all of them at the list, using an interface overriding the function area() by
		// Rectangle and Circle classes
		System.out.println("Total area: " + String.format("%.2f", totalArea(myShapes)));

		// Now, if I try to call totalArea() sending a Circle type, it will returns an
		// error, because a list of Shape (at parameter of totalArea), is not a super
		// class of Circle list. Got that?
		List<Circle> myCircles = new ArrayList<Circle>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		// Let's see that:

		// System.out.println("Total area: " +
		// String.format("%.2f",totalArea(myCircles)));

		// try removing the "//" at the beginning of this two lines above, to see the up
		// casting error

		// Now look at this option, it's not a good solution, but works!

		// If I can try to call a method totalArea2() (the same of the older one), only
		// to receive another kind of parameter.

		// Let's see that at a new method totalArea2() and calling a list of circle.
		System.out.println("Total area: " + String.format("%.2f", totalArea2(myCircles)));

		// In this case, totalArea2() receive any kind of shape (Circle, Rectangle,
		// etc), since this shape kind extends shape class. Look this new example using
		// a Rectangle kind.

		// First of all, let's instancing the rectangles.
		List<Rectangle> myRectangle = new ArrayList<Rectangle>();
		myRectangle.add(new Rectangle(2.0, 5.0));
		myRectangle.add(new Rectangle(3.0, 3.5));

		// Now, sending the data of Rectangle.
		System.out.println("Total area: " + String.format("%.2f", totalArea2(myRectangle)));

	}

	public static double totalArea(List<Shape> list) {
		double sum = 0;

		for (Shape s : list) {
			System.out.println("Calculating area of: " + s.getClass());
			sum += s.area();
		}

		return sum;
	}

	public static double totalArea2(List<? extends Shape> list) {

		// It's not possible to add a new element in this list

		// list.add(new Rectangle(3.0, 4.0));

		// 'Cause a list of Rectangles is not a sub type of a list of Shapes, even
		// though
		// a type Rectangle is a sub type of Shape. Not the list!

		double sum = 0;

		for (Shape s : list) {
			System.out.println("Calculating area of: " + s.getClass());
			sum += s.area();
		}

		return sum;
	}

}
