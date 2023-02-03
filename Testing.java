import java.util.PriorityQueue;

public class Testing {
    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>(new StudentComparator());
        students.add(new Student().getAvg());
    } 
}
