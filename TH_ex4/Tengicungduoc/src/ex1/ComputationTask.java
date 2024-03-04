package ex1;
import java.util.concurrent.Callable;
public class ComputationTask implements Callable<Long>{
	private String taskName;
	public ComputationTask(String taskName) {
		this.taskName = taskName;
	}
	@Override
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		long result = 0L;
		for(int i =0; i<1000; i++) {
			result+=i;
			System.out.println(taskName+" #"+i);
			Thread.sleep(10);
		}
		return result;
	}

}
