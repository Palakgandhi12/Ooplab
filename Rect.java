class Rect 
{
    double width;
    double height;

  
    Rect(double w, double h) 
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
        
        Rect r1 = new Rect(4, 40);
        Rect r2 = new Rect(3.5, 35.9);

      
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println();

       
        System.out.println("Rectangle 2:");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        System.out.println();

        if (r1.getArea() > r2.getArea()) 
	{
            System.out.println("Rectangle 1 has a larger area.");
        } 
	else if (r1.getArea() < r2.getArea()) 
	{
            System.out.println("Rectangle 2 has a larger area.");
        } 
	else 
	{
            System.out.println("Both rectangles have equal area.");
        }
    }
}
