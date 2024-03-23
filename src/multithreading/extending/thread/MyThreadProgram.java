package multithreading.extending.thread;

public class MyThreadProgram {

	public static class UserThread extends Thread {

		@Override
		public void run() {
			System.out.println("thread running");
			System.out.println("My Thread completed");
		}
	}

	public static void main(String[] args) {
		UserThread u = new UserThread();
		u.start();
	}
}
