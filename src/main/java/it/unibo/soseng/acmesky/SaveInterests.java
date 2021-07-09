package it.unibo.soseng.acmesky;

import javax.inject.Inject;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SaveInterests implements JavaDelegate{

	@Inject
	private SaveInterestService saveInterestService;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		/*Il cliente manda un messaggio con:
		 * 
		 * punto di andata
		 * punto di arrivo
		 * periodo di partenza min
		 * periodo di partenza max
		 * periodo di ritorno min
		 * periodo di ritorno max
		 * costo massimo
		 * id cliente
		 * 
		 * Questi valori sono salvati in opportune variabili
		 * e vengono qui reperiti
		*/
		
		String departure_airport = execution.getVariable("departure_airport").toString();
		String arrival_airport = execution.getVariable("arrival_airport").toString();
		
		String departure_time_min = execution.getVariable("departure_time_min").toString();
		String departure_time_max = execution.getVariable("departure_time_max").toString();
		String arrival_time_min = execution.getVariable("arrival_time_min").toString();
		String arrival_time_max = execution.getVariable("arrival_time_max").toString();
		
		String client_id = execution.getVariable("client_id").toString(); 
		
		int cost = (int) execution.getVariable("cost");
		
		System.out.println("Chiamo il servizio per salvare gli interessi");
		
		saveInterestService.service(departure_airport, arrival_airport, departure_time_min, departure_time_max,
				arrival_time_min, arrival_time_max, client_id, cost);
		
	}

}
