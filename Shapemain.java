import java.util.Scanner;
class Shape
{
	double d1,d2;

	void getData(Double d1,double d2)
	{
		this.d1=d1;
		this.d2=d2;
	}
}
class Triangle extends Shape
{
	void calculateArea()
	{
		System.out.println("Area of Trinagle "+0.5*d1*d2);	
	}	
}
class Ractangle extends Shape
{
	void calculateArea()
	{
		System.out.println("Area of Reactangle "+d1*d2);
	}
}
class Shapemain
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Ractangle r1 = new Ractangle();
		System.out.println("Enter a value of d1");
		double d1=sc.nextDouble();
		System.out.println("Enter a value of d2");
		double d2=sc.nextDouble();
		r1.getData(d1,d2);
		r1.calculateArea();


		Triangle t1 = new Triangle();
		t1.getData(d1,d2);
		t1.calculateArea();
	
	}
}