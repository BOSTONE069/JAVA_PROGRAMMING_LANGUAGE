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
		t1.start();
		DownloadThread down = new DownloadThread();
		Thread t2 = new Thread(down);
		t2.start();

	}

}
