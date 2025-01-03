package multipleInheritance;

public class Faculty  extends  Person implements IFaculty{

    private int facultyId;
    protected String subject;

    public Faculty(String name, int age, int facultyId, String subject) {
        super(name, age);
        this.subject = subject;
        this.facultyId = facultyId;
    }

    @Override
    public String getDietPlan() {
        return "Protein Diet for faculty";
    }

    public void createQuestionPaper() {
        System.out.println(this.name + " created question paper");
    }
}
