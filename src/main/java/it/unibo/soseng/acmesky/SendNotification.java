package it.unibo.soseng.acmesky;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendNotification implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		execution.getProcessEngineServices()
			.getRuntimeService()
			.createMessageCorrelation("AckInterests")
			.correlate();
		
	}

}
