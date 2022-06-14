public class Student extends User{
    private String lesson;
    public Student(int id, String firstName, String lastName, String email,String lesson,String password){
        super(id, firstName, lastName, email, password);
        this.lesson = lesson;
    }
    public String getLesson(){return lesson;}
    public void setLesson (String lesson) {this.lesson = lesson;}
}
