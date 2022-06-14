public class StudentManager extends UserManager{
    public void getCourse(Student student){
        System.out.println(student.getFirstName()+student.getLastName()+" adlı öğrenci "+ student.getLesson() +" kursunu satın aldı.");
    }
}
