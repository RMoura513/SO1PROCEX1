package view;

import javax.swing.JOptionPane;
import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController redesController = new RedesController();
		String os = System.getProperty("os.name");
		
     int opc;
     opc = Integer.parseInt(JOptionPane.showInputDialog("Digite '1' para saber o IP e '2' para saber a média de PING."
     		+ " Caso queira finalizar o programa, digite '0'"));
  
     while (opc != 0) {
     if (opc == 1) {
    	 String processo = "IPCONFIG";
	     redesController.IP(processo);
	    }
     
     if (opc == 2) {
	    	String ping = "PING -4 -n 10 www.google.com.br";
	    	redesController.Ping(ping);
	}

     opc = Integer.parseInt(JOptionPane.showInputDialog("Digite '1' para saber o IP e '2' para saber a média de PING."
      		+ " Caso queira finalizar o programa, digite '0'"));
     
}  
     if (opc == 0) {
     System.out.println("Programa finalizado.");
    	 
     } 
     }
}
