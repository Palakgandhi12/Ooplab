import java.util.Scanner;
class prectical3
{
 	public static void main(String[] args)
	{
		System.out.println("25093107005 Gandhi Palak");
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter a letter: ");
 		String ch = sc.next();
 	switch (ch)
	{
 		case "a":
 		case "e":
 		case "i":
 		case "o":
 		case "u":
 		case "A":
 		case "E":
 		case "I":
 		case "O":
 		case "U":
 	System.out.println("it is vowel.");
 	break;
 	default:
 	System.out.println("it is not vowel.");
 	}
 	sc.close();
 	}
}