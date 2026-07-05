import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private HashMap<String, Integer> studentMap = new HashMap<>();
    public void addStudent(String name, int grade) {
        studentMap.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }
    public void getGrade(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println(name + "'s grade is " + studentMap.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }
    public void updateGrade(String name, int newGrade) {
        if (studentMap.containsKey(name)) {
            studentMap.put(name, newGrade);
            System.out.println(name + "'s grade updated to " + newGrade);
        } else {
            System.out.println("Student not found.");
        }
    }
    public void displayStudents() {
        System.out.println("\nStudent Grades:");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        StudentGrades grades = new StudentGrades();
        grades.addStudent("Pavan", 85);
        grades.addStudent("Rahul", 90);
        grades.addStudent("Anjali", 88);
        grades.displayStudents();
        grades.getGrade("Rahul");
        grades.getGrade("Kiran");
        grades.updateGrade("Pavan", 95);
        grades.updateGrade("Kiran", 80);
        grades.displayStudents();
    }
}