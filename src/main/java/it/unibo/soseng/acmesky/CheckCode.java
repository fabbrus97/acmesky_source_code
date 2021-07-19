package it.unibo.soseng.acmesky;

import javax.inject.Inject;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckCode implements JavaDelegate{

	@Inject 
	CheckCodeService checkCodeService;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		String code = execution.getVariable("code2check").toString();
		
		if (checkCodeService.service(code)) {
			execution.setVariable("codeCorrect", true);
			execution.setVariable("code2delete", code);
		} else {
			execution.setVariable("codeCorrect", false);
		}
		
		
	}

}
