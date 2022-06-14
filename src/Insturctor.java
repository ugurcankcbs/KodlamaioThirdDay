public class Insturctor extends User {
    private String course;

    public Insturctor(int id,String firstName, String lastName, String eMail, String password,String course){
        super (id, firstName,lastName, eMail,password);
        this.course=course;
    }
    public String getCourse(){return course;}
    public void setCourse (String course){this.course = course;}
}

