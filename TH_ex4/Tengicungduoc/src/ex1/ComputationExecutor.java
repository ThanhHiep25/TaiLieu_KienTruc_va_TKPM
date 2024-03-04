package ex1;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;
public class ComputationExecutor {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Callable<Long>call=new ComputationTask("long-last-computation");
		FutureTask<Long> task=new FutureTask<>(call);
		new Thread(task).start();
		
		long result=task.get();
		System.out.println("Result:"+result);
	}

}
