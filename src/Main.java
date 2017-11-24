package bin;
import bin.com.tomastech.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Tomas uno = new Tomas(30,"Tomas",99);
		
		uno.datos();
		
		//espera un enter la consola, pa que no se cierre sola tras ejecucion
		Scanner scanner = new Scanner(System.in); 
		scanner.nextLine();
	}
}