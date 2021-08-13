public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using Runnable Interface
		Thread threadOne = new Thread(new ThreadRunnable(100));
		threadOne.start();
		Thread threadTwo = new Thread(new ThreadRunnable(10));
		threadTwo.start();

		// start many threads
		for (int i = 0; i < 10; i++) {
			Thread threads = new Thread(new ThreadRunnable(50));
			threads.start();
		}
		
		// use Thread extends and start many threads
		for (int i = 0; i < 10; i++) {
			ThreadClass threads = new ThreadClass(5);
			threads.start();
		}
		
		
		
		System.out.println("*******************************************");
		System.out.println("Main Program finished");
		System.out.println("*******************************************");
	}
}
