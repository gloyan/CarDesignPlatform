package mýzýd;

public class Queue {
		private int front ;
		private int back;
		private int size;
		private int capacity;
		private int[] array;
		
		public Queue(int capacity) {
			this.capacity = capacity;
			array = new int[capacity] ;
			front = 0;
			size = 0;
			back = capacity - 1;
		}
		public boolean isFull(Queue queue)  {
			return queue.size == queue.capacity;
			
			
		}
		public boolean isEmpty() {
		   return size == 0;
		   
			
		}
		
		public void addQueue(int item) {
			
		}
		public int removeQueue() {
			
		}
		public int getFront() {
			
		}
		public int getBack() {
			
		}
		
		
		
		
		
		

}
