import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       Humanoid[] array  = new Humanoid[6];
        array[0] = new Pupil("a","b",1,"a1","a2","a3");
        array[1] = new Student("a","b","u",1,"t1","t2","t3");
        array[2] = new Pupil("c","b",1,"a1","a2","a3");
        array[3] = new Pupil();
        array[4] = new Student("a","v","u",1,"a1","a2","a3");
        array[5] = new Student();

        for (Humanoid humanoid:array) {
            System.out.println(humanoid);
        }

        List<Humanoid> duplicates = new ArrayList<>();


        for (int a = 0; a < array.length; a++) {
            String temp = array[a].getLessonsString();
            boolean hasRepeat = false;
            for (int b = a+1; b< array.length ; b++) {
                if( temp.equals(array[b].getLessonsString()) && !duplicates.contains(array[b])){
                    duplicates.add(array[b]);
                    hasRepeat = true;
                }
            }
            if ( hasRepeat ) {
                duplicates.add(array[a]);
            }
        }

        for (Humanoid humanoid :duplicates) {
            System.out.println(humanoid);
        }


    }


}