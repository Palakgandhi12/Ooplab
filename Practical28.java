interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}


class Result implements Exam, Classify {

    
    public boolean isPassed(int mark) {
        return mark >= 40; 
    }

 
    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else if (average >= 50)
            return "Second Division";
        else if (average >= 40)
            return "Third Division";
        else
            return "Fail";
    }
}


public class Practical28{
    public static void main(String[] args) {

        Result r = new Result();

        int marks = 55;
        double average = 58.5;

        if (r.isPassed(marks))
            System.out.println("Student Passed");
        else
            System.out.println("Student Failed");

        System.out.println("Division: " + r.getDivision(average));
    }
}