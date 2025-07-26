package test;

public class TestLT {

	private int  number=1;
	private final  int limit =10;
	public synchronized void printOdd() {
		while(number<=limit) {
			while(number%2==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			if(number<= limit) {
				System.out.println("Odd thread"+number);
				number++;
				notify();
			}
		}
	}
	public synchronized void printEven() {
		while(number<=limit) {
			while(number%2==1) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			if(number<=limit) {
				System.out.println("Even thread"+number);
				number++;
				notify();
			}
		}
	}
	

}
