import java.util.Scanner;

public class VolumeCalculator 
{

   
    public static double calculateVolume(double side) 
   {
        return side * side * side;
    }

    public static double calculateVolume(double length, double width, double height) 
    {
        return length * width * height;
    }


    public static double calculateVolume(float radius) 
    {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + calculateVolume(side));

      
        System.out.print("\nEnter length, width and height of rectangular cube: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + 
                           calculateVolume(length, width, height));

    
        System.out.print("\nEnter radius of sphere: ");
        float radius = sc.nextFloat();
        System.out.println("Volume of Sphere: " + calculateVolume(radius));

        sc.close();
    }
}