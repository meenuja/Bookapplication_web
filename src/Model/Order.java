package Model;
import java.time.LocalDate;

public class Order {
	private int id;
	private int quantity;
	private int userId;
	private int bookId;
	private String status;
	private LocalDate orderedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookId() {
		return bookId;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", quantity=" + quantity + ", userId=" + userId + ", bookId=" + bookId + ", status="
				+ status + ", orderedDate=" + orderedDate + "]";
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(LocalDate orderedDate) {
		this.orderedDate = orderedDate;
	}
}
