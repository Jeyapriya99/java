/*Write a program to create a class DemoThread1,
 *  In the constructor, create a new thread and start the thread. In run() display a message 
 *  "running child Thread in loop : " display the value of the counter ranging from 1 to 10. Within the 
 *  loop put the thread to sleep for 2 seconds. In main create 3 objects of the DemoTread1 and execute the
 *   program.
 */


package day_6;

public class ThreadDemo2 extends Thread {
	public void run() {

	System.out.println(Thread.currentThread().getName());
	for (int i = 1; i < 10;i++) {
		try {
			Thread.sleep(200);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
		System.out.println("Running child thread in loop");
	}
	
}

	public static void main(String[] args) {
		ThreadDemo2 runnable = new ThreadDemo2();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
		
		Thread t1 = new Thread(tg1, runnable,"one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable,"two");
		t2.start();
		Thread t3 = new Thread(tg1, runnable,"one");
		t3.start();
		
	}

}
