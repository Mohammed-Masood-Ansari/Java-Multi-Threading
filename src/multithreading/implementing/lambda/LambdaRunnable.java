package multithreading.implementing.lambda;

public class LambdaRunnable {

	Runnable runnable = ()->{
		System.out.println("lambda runnable is running");
		System.out.println("lambda runnable is completed");
	};
	
	public static void main(String[] args) {
		
		LambdaRunnable l = new LambdaRunnable();
		
		new Thread(l.runnable).start();
	}
}
