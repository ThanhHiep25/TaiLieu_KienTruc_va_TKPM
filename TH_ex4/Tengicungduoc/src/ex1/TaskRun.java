package ex1;

public class TaskRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new AnotherTask("Collect Task",15);
		Runnable r2 = new AnotherTask("Process Task",23);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
