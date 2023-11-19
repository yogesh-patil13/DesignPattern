
public class Main {
    public static void main(String[] args)
    {
    	User user=new User.UserBuilder().setId(1).setUserName("Yogesh").setEmail("Yo yo@gmail").build();
    	System.out.print(user);
    }
}
