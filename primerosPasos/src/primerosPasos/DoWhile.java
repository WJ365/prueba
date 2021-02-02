package primerosPasos;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {
		int num;
		do {
			String texto = JOptionPane.showInputDialog("introduce un numero ent");
			num=Integer.parseInt(texto);
		
		}while(num>=10 || num<0); 
			System.out.println("el numero introducido es"+ num);
		

	}

}
