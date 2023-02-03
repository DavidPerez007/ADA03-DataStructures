import java.util.ArrayList;

public class Student {

    private String id;
    private String name;
    private String lastName;
    private float avgGrade;
    private ArrayList<Course> courses = new ArrayList<>();

    public void calcularPromedio() {
        float sum = 0;
        for (Course course : courses) {
            sum += course.getGrade();
        }
        this.avgGrade = sum / this.courses.size();
    }

    public float getAvg() {
        return this.avgGrade;
    }
    public String getName(){
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

}