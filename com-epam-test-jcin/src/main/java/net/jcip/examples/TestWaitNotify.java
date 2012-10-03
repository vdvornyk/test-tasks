package net.jcip.examples;

public class TestWaitNotify {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("processors=" + Runtime.getRuntime().availableProcessors());

		Thread th1 = new Thread(new MyThread(0));
		Thread th2 = new Thread(new MyThread(1));

		// Thread.sleep(300);

		// th1.start();
		// th2.start();

	}
}
