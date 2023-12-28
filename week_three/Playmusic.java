package week_three;

public class Playmusic extends Thread {
	
	public void run() {
		for(int i=0; i<10; i++) {
			
			System.out.println("Music Playing............");	
		}
	}

	public static void main(String[] args) {
		Playmusic p = new Playmusic();
		p.start();
		for(int i=0; i<10; i++) {
			System.out.println("coding");
		}

	}

}
