/*
9)	Define a class “Shape” with “draw()” function .
Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function. 
Define a class “ShapeDemo” in which  write  main()  function. In the main function create a reference 
to Shape class referring to any of the sub class.
Using this reference, call “draw()” and check the result.
*/
class Shape
{
	public void Draw() 
	{
		System.out.println("Shape is Drawn");
	} 	
}
class Circle extends Shape
{
	public void Draw() 
	{
		System.out.println("Circle is Drawn");
	} 
}
class PolyGon extends Shape
{
	public void Draw() 
	{
		System.out.println("PolyGon is Drawn");
	} 
}
class Rectangle extends Shape
{
	public void Draw() 
	{
		System.out.println("Reactangle is Drawn");
	} 
}
public class ShapeDemo
{
	public static void Perform(Shape ref) 
	{
		ref.Draw();
	}
	public static void main(String args[]) 
	{
		Perform(new PolyGon());
		Perform(new Rectangle());
		Perform(new Circle());
		
	}
}


