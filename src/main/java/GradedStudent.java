/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class GradedStudent extends Person {
    private double[] marks;
    
public GradedStudent() {
    super(); // Calls parent constructor
    this.marks = new double[3]; // Allocates a 1D array for 3 subject marks
    }

    // Method with parameters to set instance data (Classes and Objects Q1)
    public void setMarks(double m1, double m2, double m3) {
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
    }

    // Using expressions, assignment operators, and array loops (Arrays Lab Q2)
    public double calculateTotal() {
        double total = 0.0;
        // Traversing array using a for loop
        for (int i = 0; i < marks.length; i++) {
            total += marks[i]; // Arithmetic operator assignment
        }
        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / marks.length;
    }

    // Conditional expressions & relational operators (Expressions & Operators Lab Sheet)
    public String calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 75) return "A";
        else if (avg >= 65) return "B";
        else if (avg >= 55) return "C";
        else if (avg >= 40) return "S";
        else return "F";
    }
}
