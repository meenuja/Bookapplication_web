package Test;

public class TestUserDao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
        user.setName("jayapriya");
        user.setEmailid("jp123@g.com");
        user.setPassword("pass123");
 
        UserDao userDAO = new UserDao();
        userDAO.register(user);
 

	}

}
