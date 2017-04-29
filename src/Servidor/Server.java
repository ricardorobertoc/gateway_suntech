package Servidor;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

import Cliente.TrataCliente;

public class Server {
	
private static final int serverPort = 7210;
	
public static void main(String[] args) throws IOException {
		
        ServerSocket servidor = new ServerSocket(serverPort);
        System.out.println("Porta " + serverPort + " aberta!");
        
        while (true) {
        	
            try {
            	
            	Socket cliente = servidor.accept();
            	
            	LocalDateTime dataHoraStart = LocalDateTime.now();
                System.out.println("Nova conexão com o cliente " +
                    cliente.getInetAddress().getHostAddress() + '/' + cliente.getPort() + 
                    " em ( " + dataHoraStart + " )"
                );
                
                //DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
                //out.writeUTF("ST300CMD;205736620;02;Disable1");
                
                
                TrataCliente tc = new TrataCliente(cliente);
                new Thread(tc).start();
                
                
             }catch(IOException e) {
                e.printStackTrace();
                break;
             }
            		
		}
        
        servidor.close();
    }

}
