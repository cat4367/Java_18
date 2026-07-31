package chapter12;

public class ThreadeExample {

	public static void main(String[] args) {
		Runnable task = new Task();
		Thread thread = new Thread(task);
		
		thread.start();
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}

	}

}
