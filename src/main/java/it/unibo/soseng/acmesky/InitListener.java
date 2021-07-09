package it.unibo.soseng.acmesky;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;


public class InitListener implements ExecutionListener {
	
	@Override
    public void notify(DelegateExecution execution) throws Exception {
     

        /*nomi e percorsi dei file:
	     /public/simonef/server_list/airline.list  
	     /public/simonef/server_list/geo-distance-provider.list  
	     /public/simonef/server_list/payment-provider.list  
	     /public/simonef/server_list/prontogram.list
	    */
		
		setVariable(execution, "/public/simonef/server_list/airline.list", "airlines");
		setVariable(execution, "/public/simonef/server_list/geo-distance-provider.list", "geoproviders");
		setVariable(execution, "/public/simonef/server_list/payment-provider.list", "payments");
		setVariable(execution, "/public/simonef/server_list/prontogram.list", "prontograms");
		
	}
	
	void setVariable(DelegateExecution execution, String fileName, String varName) throws Exception {
		ArrayList<String> airlines = new ArrayList<String>();
		//FIXME questa classe deve leggere diversi file - uno per le compagnie aeree, uno per i servizi bancari...
		//e inizializzare altrettante variabili
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
		
		String airline = bufferedReader.readLine();
		while(airline != null) {
			airlines.add(airline);
			airline = bufferedReader.readLine();
		}
        
        execution.setVariable(varName, airlines);
	}
		
}