/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Person {
    protected String name; 

    // Default Constructor 
    public Person() {
        this.name = "a Student";
    }

    // Public method declaration 
    public void displayGreeting() {
        System.out.println("Processing grades for " + name);
    }
}
