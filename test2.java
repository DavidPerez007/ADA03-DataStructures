
import java.util.ArrayList;
import java.util.PriorityQueue;

public class test2 {

    public static void main(String[] args) {

        PriorityQueue<Student> students = new PriorityQueue<>(new StudentComparator());

        Student joselito = new Student("joselito", "joselito", 5);
        Student pepe = new Student("pepe", "pepe", 10);
        Student jesulin = new Student("jesulin", "jesulin", 1);

        students.add(jesulin);
        students.add(joselito);
        students.add(pepe);

        // expected jesulin-0 joselito-5, pepe-10
        System.out.println("test2");
        for (Student student : students) {
            System.out.println(student.getName() + "-" + student.getAvg());
        }

    }
}
