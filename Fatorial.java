package Buffereds;

import javax.swing.JOptionPane;

public class Fatorial {
   public static void main(String[] args) {
	   
	   int fatorial;
	   
	   fatorial = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
	   System.out.println("O Fatorial de: " +fatorial+ " será: " + Multiplica(fatorial));
   }

private static int Multiplica(int fatorial) {
	if(fatorial == 1) {
		return fatorial;
	}
	return fatorial * Multiplica(fatorial - 1);
}
}
