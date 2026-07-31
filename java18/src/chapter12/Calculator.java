package chapter12;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {	
	//'synchronized' 동기화메소드로 만듬 = 스레드1이 사용시 값을 못바꾸게하기위해 이 작업이 끝나고 다른 스레드가 실행된다
		this.memory = memory;
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		try {Thread.sleep(2000);
	} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
}
