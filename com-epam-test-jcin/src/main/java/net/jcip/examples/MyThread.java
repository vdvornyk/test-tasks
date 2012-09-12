package net.jcip.examples;

public class MyThread implements Runnable {

	private final int isWait;
	private static int counter = 0;

	public MyThread(int isWait) {
		this.isWait = isWait;
	}

	@Override
	public void run() {
		if (isWait == 0) {
			increment();
		} else {
			waiter();
		}
	}

	public void increment() {

		while (counter <= 10) {
			System.out.println("counter =" + counter);
			++counter;
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		synchronized (MyThread.class) {
			MyThread.class.notify();
		}

	}

	public void waiter() {
		synchronized (MyThread.class) {
			while (counter <= 10) {
				try {
					System.out.println("Im waiting for counter...");
					MyThread.class.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("counter =" + counter);
		}
	}
}