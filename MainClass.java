package test;

public class MainClass {

	public static void main(String[] args) {
		TestLT print = new TestLT();
		Thread oddThread = new Thread(print ::printOdd);
		Thread evenThread = new Thread(print ::printEven);
		oddThread.start();
		evenThread.start();


	}

}
