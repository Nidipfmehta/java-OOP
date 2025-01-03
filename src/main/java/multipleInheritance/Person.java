package multipleInheritance;


public class Person {

    protected String name;
    protected int age;
//    int id;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getDietPlan() {
        return "Protein Diet";
    }

    public void appearForExam() {
        System.out.println(this.name + " is appearing for exams");
    }
}
