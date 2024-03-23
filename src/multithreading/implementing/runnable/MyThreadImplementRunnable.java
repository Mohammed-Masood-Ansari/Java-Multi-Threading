package multithreading.implementing.runnable;

public class MyThreadImplementRunnable {

	public static class UserThread implements Runnable {

		@Override
		public void run() {
			System.out.println("thread running");
			System.out.println("My Thread completed");
		}
	}

	public static void main(String[] args) {
		/*
		 * create a object of thread class and pass UserThread
		 * object in Thread constructor.
		 */
		Thread thread = new Thread(new UserThread());
		thread.start();
	}
}
