package ex1;

public class AnotherTask extends Thread{
	private String taskName;
	private int counter;
	public AnotherTask(String taskName, int counter) {
		super();
		this.taskName = taskName;
		this.counter = counter;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<counter; i++) {
			System.out.println(taskName+"#"+i);
		}
	}
}
