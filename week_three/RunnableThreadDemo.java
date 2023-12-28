package week_three;

public class RunnableThreadDemo implements Runnable {
	
	public void run() {
		for(int i=0; i<10; i++) {
			
			System.out.println("Hey Thread started");	
		}
	}

	public static void main(String[] args) {
		RunnableThreadDemo d = new RunnableThreadDemo();
		Thread t1 = new Thread(d);
		System.out.println("State of the thread: " + t1.getState());
		System.out.println("State of the thread: " + t1.getName());
		t1.start();
		System.out.println("State of the thread: " + t1.getState());
		System.out.println("State of the thread: " + t1.getName());
		DownloadThread down = new DownloadThread();
		Thread t2 = new Thread(down);
		System.out.println("State of the thread: " + t2.getState());
		System.out.println("State of the thread: " + t2.getName());
		t2.start();
		System.out.println("State of the thread: " + t2.getState());
		System.out.println("State of the thread: " + t2.getName());
	}

}
