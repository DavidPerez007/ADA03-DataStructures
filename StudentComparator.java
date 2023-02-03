import java.util.Comparator;

class StudentComparator implements Comparator<Student> {
  public int compare(Student a, Student b) {
    return Float.compare(b.getAvg(), a.getAvg());
  }
}