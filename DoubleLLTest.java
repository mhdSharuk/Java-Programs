public class DoubleLLTest {
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.append(5);
		dll.append(9);
		dll.push(7);
		dll.push(2);
		dll.print(dll.head);
	}
}
