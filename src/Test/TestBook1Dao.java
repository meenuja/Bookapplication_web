package Test;

public class TestBook1Dao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 String emailid="jaya@g.com";
		 String password="12345";
		        UserDao userDao = new UserDao();
		        User u=userDao.login(emailid, password);
		        System.out.println(u);

		}

	

}
