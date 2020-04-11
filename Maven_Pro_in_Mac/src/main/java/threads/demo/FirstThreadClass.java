package threads.demo;

public class FirstThreadClass implements Runnable,InterfaceWithClass{

	public static void main(String[] args) {
		FirstThreadClass ftc = new FirstThreadClass();
		Thread t = new Thread(ftc);
		t.start();
		ftc.test();
		
		A a = new A();
		a.sampleMetod();
	}

	public void run() {
		System.out.println("Inside Run method");
	}

	public void test() {
		System.out.println("I am implemented in Thread Demo");
	}

}
