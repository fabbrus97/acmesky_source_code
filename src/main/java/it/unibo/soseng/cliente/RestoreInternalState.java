package it.unibo.soseng.cliente;

import javax.inject.Inject;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RestoreInternalState implements JavaDelegate{

	@Inject
	RestoreInternalStateService restoreInternalStateService;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		
		restoreInternalStateService.service(execution.getVariable("username").toString(), execution.getVariable("flight_code").toString()); 		
	}

}