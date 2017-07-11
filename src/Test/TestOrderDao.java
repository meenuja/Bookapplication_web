package Test;
import java.time.LocalDate;

public class TestOrderDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order=new Order();
		order.setQuantity('2');
		order.setStatus("delivery");
		LocalDate date=LocalDate.parse("2017-06-29");
		order.setOrderedDate(date);
		order.setUserId(3);
		order.setBookId(3);

		OrderDao orderDAO = new OrderDao();
		orderDAO.register(order);
		System.out.println(order);


	}

}
