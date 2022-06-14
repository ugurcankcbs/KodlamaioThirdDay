public class InsturctorManager extends UserManager{

    public void courseOffered(Insturctor instructor){

        System.out.println("Öğretmenimiz "+instructor.getFirstName()+instructor.getLastName()+" 'ın vereceği ders :"+instructor.getCourse());
    }
}
