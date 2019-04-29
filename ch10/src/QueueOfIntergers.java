public class QueueOfIntergers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;
	//constructor
	public QueueOfIntergers() {
		size = 0;
		elements = new int[DEFAULT_CAPACITY];
	}
	//methods
	public void enqueue(int v) {
		if(size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}
	public int dequeue() {
		if(size<=0)	return -1;
		int v = elements[0];
		for(int j=1;j<size;j++) {
			elements[j]=elements[j-1];
		}
		size--;
		return v;
	}
	public boolean empty() {
		return size==0;
	}
	public int getSize() {
		return size;
	}
	//test
	public static void main(String[] args) {
		QueueOfIntergers queue = new QueueOfIntergers();
		for(int i=0;i<10;i++) {
			queue.enqueue(i);
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			queue.dequeue();
			System.out.print(i+" ");
		}
	}
}