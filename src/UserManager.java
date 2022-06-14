public class UserManager {
    public void login(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli kişi sisteme giriş yaptı.");
    }

    public void exit(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli kişi sistemden çıkış yaptı.");
    }
}
