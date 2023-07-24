package org.example;

import org.example.config.SpringConfig;
import org.example.service.ClientService;
import org.example.service.StockOptions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context;
        try {
        context= new AnnotationConfigApplicationContext(SpringConfig.class);
        
        StockOptions sname = context.getBean(StockOptions.class);
        sname.createStock("LNT", 1451.50);
        sname.createStock("Reliance", 923.90);
        sname.createStock("Tata Steel", 435.60);
        
        ClientService clientinterface = context.getBean(ClientService.class);
        clientinterface.Menu();
        
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
