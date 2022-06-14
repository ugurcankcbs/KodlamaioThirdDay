public class Main {

    public static void main(String[] args) {
    Insturctor insturctor = new Insturctor(1, "Uğur Can","Kocabaş","ugurcankcs@gmail.com","123456789","Kodlamaio JAVA");
    Student student = new Student(30,"Aykut","Kocabaş","aykutkcbs@gmail.com","JAVA101", "987654321");

    InsturctorManager insturctorManager = new InsturctorManager();
    insturctorManager.courseOffered(insturctor);

    StudentManager studentManager=new StudentManager();
    studentManager.getCourse(student);

    }
}
