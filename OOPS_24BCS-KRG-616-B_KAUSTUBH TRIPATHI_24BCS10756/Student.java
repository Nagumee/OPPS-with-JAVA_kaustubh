//create a java program demonstrating encapsulation by creating a class student with private fields name, id and marks, provide public getter / setter methords to access and modify the fields

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private int marks;

    public Student() {}

    public Student(String name, int id, int marks) {
        setName(name);
        setId(id);
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("---");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();

        System.out.print("Enter name: ");
        student1.setName(sc.nextLine());

        System.out.print("Enter id: ");
        student1.setId(sc.nextInt());

        System.out.print("Enter marks: ");
        student1.setMarks(sc.nextInt());

        System.out.println("Student Details:");
        student1.displayInfo();

        Student student2 = new Student(student1.getName(), student1.getId(), student1.getMarks());

        sc.close();
    }
}