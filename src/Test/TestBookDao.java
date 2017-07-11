package Test;
import java.time.LocalDate;

public class TestBookDao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setName("java");
		book.setPrice(200);
		LocalDate date=LocalDate.parse("2017-06-29");
		book.setPub_date(date);
		book.setAutuor_id(3);
		

		BookDao bookDAO = new BookDao();
		//bookDAO.register(book);
		System.out.println(book);
bookDAO.listbook();
			}

	

}
