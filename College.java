import java.util.Scanner;


class College {

    private String collegeName;

   
    College(String collegeName) {
        this.collegeName = collegeName;
    }

    
    class Admission {

       private String studentName;
        private String course;
       
        void acceptDetails() {
		Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course Name: ");
            course = sc.nextLine();
        }

        
        void displayDetails() {
            System.out.println("\n----- Admission Details -----");
            System.out.println("College Name: " + collegeName); 
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Enrolled: " + course);
        }
    }




    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter college name:");
	String collegeName=sc.nextLine();
	College college= new College(collegeName);
	College.Admission admission=college.new Admission();

       
        admission.acceptDetails();
        admission.displayDetails();
    }
}