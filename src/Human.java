
public class Human implements Humanoid {

    public static void main(String args[]) {

        double[] array1 = new double[args.length];
        for (int i = 0; i < array1.length; i++) {

            array1[i] = Double.parseDouble(args[i]);
            System.out.println(array1[i]);

        }

    }

    private String name;
    private String surename;
    private int age;


    public Human() {
        name = "Artem";
        surename = "Popov";
        age = 26;

    }

    public Human(String name, String surename, int age) {
        this.name = name;
        this.surename = surename;
        this.age = age;

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

    @Override
    String SetName (String name);
    {
        return name;
    }
}


