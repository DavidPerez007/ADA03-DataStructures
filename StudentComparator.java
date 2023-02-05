import java.util.Comparator;

class StudentComparator implements Comparator<Student> {
  public int compare(Student a, Student b) {
    if(a.getAvg() > b.getAvg()){
      return -1;
    }
    else {
      return 1;
    }
  }
};