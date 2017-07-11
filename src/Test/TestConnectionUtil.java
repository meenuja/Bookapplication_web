package Test;
import java.sql.Connection;

public class TestConnectionUtil {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		{
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection conn = ConnectionUtil.getConnection();

	        System.out.println(conn);

		}
	}

	

}
