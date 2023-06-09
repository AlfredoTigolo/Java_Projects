public class TestMyQueue {

	public static void main(String[] args) {
		myQueue myQ = new myQueue(3);
		Integer line = new Integer(args[0]);
		Integer test = new Integer(args[1]);
		Integer great = new Integer(args[2]);
		myQ.enQueue(line);
		myQ.enQueue(test);
		myQ.enQueue(great);
		myQ.peek();
	}
}