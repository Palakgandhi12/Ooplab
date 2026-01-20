class Rectangle {
    double width = 1;
    double height = 1;

    
    	Rectangle() 
	{

    	}	

   
    Rectangle(double w, double h) 
    {
        width = w;
        height = h;
    }

  
    double getArea()
    {
        return width * height;
    }

    double getPerimeter() 
    {
        return 2 * (width + height);
    }
	public static void main(String[] args) 
	{
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 5);

        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());

        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Perimeter of r2: " + r2.getPerimeter());
    }
}
