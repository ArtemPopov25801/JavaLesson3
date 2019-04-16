import java.util.Arrays;

public class Student implements Humanoid {

    private String name;
    private String surename;
    private int age;
    private String university;
    private String[] lessons;


    public Student() {
        name = "Artem";
        surename = "Popov";
        age = 26;
        university = "Sharaga";
        lessons = new String[]{"math", "language", "physics"};

    }

    public Student(String name, String surename, String university, int age, String... lessons) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.university = university;
        this.lessons = lessons;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getSurename() {
        return surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws WrongAgeException {
        if (age < 14 || age > 45) {
            throw new WrongAgeException(age, "Введён некорректный возраст");
        }
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getLessonByIndex(int index) {
        return lessons[index];

    }

    public void setLessonByIndex(int index, String lesson) {
        this.lessons[index] = lesson;

    }

    public String getLessonsString() {
        String result = "";
        for (int i = 0; i < lessons.length; i++) {
            result += lessons[i];
            if (i != lessons.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" +
                "Фамилия: " + surename + "\n" +
                "Возраст: " + age + "\n" +
                "Университет: " + university + "\n" +
                "Предметы: " + getLessonsString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surename != null ? !surename.equals(student.surename) : student.surename != null) return false;
        if (university != null ? !university.equals(student.university) : student.university != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(lessons, student.lessons);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surename != null ? surename.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (university != null ? university.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lessons);
        return result;
    }

}
