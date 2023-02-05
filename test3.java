import java.util.Comparator;
import java.util.PriorityQueue;

public class test3 {
    public static void main(String[] args) {

        Comparator<Student> comparadorStudents = new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAvg() > o2.getAvg()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        };

        PriorityQueue<Student> students = new PriorityQueue<>(comparadorStudents);

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

        System.out.println("asdf"+students.remove(pepe));
        for (Student student : students) {
            System.out.println(student.getName() + "-" + student.getAvg());
        }
    }
}
