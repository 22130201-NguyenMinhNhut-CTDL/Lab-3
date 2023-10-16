package Task2;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Product p1 = new Product("001", "7 UP", 9.0, "Nước");
		Product p2 = new Product("002", "Lays", 12.0, "Snack");
		Product p3 = new Product("003", "Bánh Quy", 7.0, "Cookie");
		Product p4 = new Product("004", "Mirinda", 10.0, "Nước");
		
		OrderItem ot1 = new OrderItem(p1, 2);
		OrderItem ot2 = new OrderItem(p2, 2);
		OrderItem ot3 = new OrderItem(p3, 2);
		OrderItem ot4 = new OrderItem(p4, 2);
		
		OrderItem[] items = {ot1 ,ot2, ot3, ot4};
		
		Order o1 = new Order(items);
		
		System.out.println("Cost: " + o1.cost());
		System.out.println("Contains: " + o1.contains(p4));
		System.out.println("Contains: " + o1.contains(p3));
		System.out.println("Filter: " + Arrays.toString(o1.filter("Nước")));
		System.out.println(Arrays.toString(o1.sort(items)));

	}
}

