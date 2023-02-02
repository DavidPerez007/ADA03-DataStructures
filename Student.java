import java.util.ArrayList;

public class Student {

    private String id;
    private String Name;
    private String LastName;
    private float avgGrade;
    private ArrayList<Course> courses = new ArrayList<>();
    

    public void calcularPromedio() {
        float sum = 0;
        for (Course course : courses) {
            sum += course.getGrade();
        }
        this.avgGrade = sum /= this.courses.size();
    }

}