package threads.demo;

public class ThreadSleepDemo extends Thread {

	public void start() {
		
		for (int i=1; i<5; i++) {
			System.out.println("get Ii : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadSleepDemo tsd = new ThreadSleepDemo();
		ThreadSleepDemo tsd1 = new ThreadSleepDemo();
		Thread t = new Thread(tsd);
		Thread t1 = new Thread(tsd);
		
		System.out.println("get id : " + t.getId());
		System.out.println("get id : " + t1.getId());
		
		tsd.start();
		tsd1.start();
//		t.start();
//		t1.start();
	}
}
