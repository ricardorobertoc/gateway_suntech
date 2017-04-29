package Cliente;

import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

import Service.ServiceModel;
import String.TipoString;



public class TrataCliente implements Runnable{
	
	private Socket cliente;
	private Scanner scanner;
	private ServiceModel serviceModel;
	 
	public TrataCliente(Socket cli ) {
		this.cliente = cli;
		 
	}

	public void run() {
		
		try {
			scanner = new Scanner(cliente.getInputStream());
			
			while (scanner.hasNextLine()) {
		    	
		        
		        String[] stString = scanner.nextLine().split(";");
		        
		        System.out.println(Arrays.toString(stString));
		        System.out.println("Mantendo " +
	                    cliente.getInetAddress().getHostAddress() + '/' + cliente.getPort());
		        
		        if ( TipoString.getStt().equals(stString[0]) ) 
		    	{
		        	serviceModel = new ServiceModel();
		        	serviceModel.tratarPosicaoModel(stString);
		    		
				} 
		    	
		    	else if ( TipoString.getAlt().equals(stString[0]) || 
							TipoString.getEvt().equals(stString[0]) ||  
								TipoString.getEmg().equals(stString[0]) )
				{
		    		serviceModel = new ServiceModel();
		    		serviceModel.tratarEventoModel(stString);
				}
		        
		        
		        
		    }
			
			cliente.close();
			
			System.out.println("fechou");
			LocalDateTime dataHoraStart = LocalDateTime.now();
			System.out.println(dataHoraStart);
			scanner.close();
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
    

}