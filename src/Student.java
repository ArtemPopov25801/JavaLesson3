
public class Student implements Humanoid {

    public static void main(String args[]) {

        double[] array2 = new double[args.length];
        for (int i = 0; i < array2.length; i++) {

            array2[i] = Double.parseDouble(args[i]);
            System.out.println(array2[i]);

        }

    }

    private String university;
    private int course;


    public Student() {
        this.university = "Sharaga";
        this.course = 5928;
    }

    public Student(String university, int course) {
        this.university = university;
        this.course = course;
    }


    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public void SetName(String name) {
        return name;
    }
}
