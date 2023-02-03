import java.util.ArrayList;
import java.util.PriorityQueue;

public class Testing {
    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>(new StudentComparator());

        //definimos los cursos 
        Course math = new Course("math", 5);
        Course biology = new Course("biology", 10);
        Course geography = new Course("geography", 0);

        // construimos estudiante de ejemplo 1
        Student joselito = new Student();
        joselito.setName("joselito");
        ArrayList<Course> joselitoCourses = new ArrayList<>();
        joselitoCourses.add(math);
        joselitoCourses.add(biology);
        joselitoCourses.add(geography);
        joselito.setCourses(joselitoCourses);
        joselito.calcularPromedio();
        

        // construimos estudiante de ejemplo 2
        Student pepe = new Student();
        pepe.setName("pepe");
        ArrayList<Course> pepeCourses = new ArrayList<>();
        pepeCourses.add(biology);
        pepe.setCourses(pepeCourses);
        pepe.calcularPromedio();
        

        // construimos estudiante de ejemplo 3
        Student jesulin = new Student();
        jesulin.setName("jesulin");
        ArrayList<Course> jesulinCourses = new ArrayList<>();
        jesulinCourses.add(geography);
        jesulin.setCourses(jesulinCourses);
        jesulin.calcularPromedio();


        students.add(jesulin);
        students.add(pepe);
        students.add(joselito);

        //expected jesulin-0  joselito-5, pepe-10
        for (Student student: students){
            System.out.println(student.getName()+"-"+ student.getAvg());
        }

    } 
}
