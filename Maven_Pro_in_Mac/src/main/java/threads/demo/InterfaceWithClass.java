package threads.demo;

public interface InterfaceWithClass {

	void test();
	
	class A {
		private void syso() {
			System.out.println("I am within an Interface..");
		}
		
		public void sampleMetod() {
			System.out.println("I am sampleMetod within an Interface..");
		}
		
		public static void main(String[] args) {
			A a = new A();
			a.syso();
		}
	}
	
	
}
