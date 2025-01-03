package multipleInheritance;

public class Student extends Person implements IStudent{

    private int studentId;
    private int marks;

    public Student(String name, int age, int studentId, int marks) {
        super(name, age);
        this.studentId = studentId;
        this.marks = marks;
    }

    @Override
    public String getDietPlan() {
        return "Protein Diet for student";
    }
}
