package batch;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
/**
 * 
 * @author 张大川
 *  监听器 实现 JobEx  JobExecutionListener
 */
public class TestListener implements JobExecutionListener  {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if( jobExecution.getStatus() == BatchStatus.COMPLETED ){
	      System.out.println("成功");
	    }
	    else if(jobExecution.getStatus() == BatchStatus.FAILED){
	        //job failure
	    }

	}

}
