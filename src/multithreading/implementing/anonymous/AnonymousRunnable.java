package multithreading.implementing.anonymous;

public class AnonymousRunnable {

	Runnable runnable = new Runnable() {
		@Override
		public void run() {
			System.out.println("anonymous runnable is running...");
			System.out.println("anonymous runnable is stoped.....");
		}
	};
	
	public static void main(String[] args) {
		AnonymousRunnable a = new AnonymousRunnable();
		Thread t = new Thread(a.runnable);
		t.start();
	}
}
