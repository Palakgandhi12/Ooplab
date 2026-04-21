package exam;

import student.Student;

public class Result extends Student {
    int marks1, marks2, marks3;

    // Constructor
    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);  // call parent constructor
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    // Method to display result
    public void displayResult() {
        displayStudent(); // call parent method
        
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    // Main method
    public static void main(String[] args) {
        Result r = new Result(101, "Palak", 85, 90, 88);
        r.displayResult();
    }
}