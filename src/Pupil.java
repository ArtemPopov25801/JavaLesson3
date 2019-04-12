import java.util.Arrays;

public class Pupil implements Humanoid {

    private String name;
    private String surename;
    private int age;
    private String[] lessons;


    public Pupil() {
        name = "Artem";
        surename = "Popov";
        age = 26;
        lessons = new String[]{"math", "language", "physics"};
    }

    public Pupil(String name, String surename, int age, String... lessons) {
        this.name = name;
        this.surename = surename;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String  getLessonByIndex(int index) {
        return lessons[index];

    }

    public void setLessonByIndex(int index, String lesson){
        this.lessons[index] = lesson ;

    }

    public String getLessonsString(){
        String result = "" ;
        for (int i = 0; i < lessons.length; i++){
             result += lessons[i];
            if ( i != lessons.length - 1 ){
                result += " ";
            }
        }
        return  result;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" +
                "Фамилия: " + surename + "\n" +
                "Возраст: " + age + "\n" +
                "Предметы: " + getLessonsString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pupil)) return false;

        Pupil pupil = (Pupil) o;

        if (age != pupil.age) return false;
        if (name != null ? !name.equals(pupil.name) : pupil.name != null) return false;
        if (surename != null ? !surename.equals(pupil.surename) : pupil.surename != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(lessons, pupil.lessons);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surename != null ? surename.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + Arrays.hashCode(lessons);
        return result;
    }
}


