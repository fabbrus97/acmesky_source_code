package it.unibo.soseng.acmesky;

import javax.inject.Inject;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RemoveCode implements JavaDelegate{

	@Inject
	RemoveCodeService removeCodeService;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		//nota: code2delete è salvato in it.unibo.soseng.acmesky.CheckCode
		removeCodeService.service(execution.getVariable("code2delete").toString());
	}

}
