package bin.com.tomastech;

public class Tomas extends Persona{
	private int ki;
	private String status;

	public Tomas(int a, String b, int c){
		super(a,b);
		ki = c;
		status = ki>100?"Sayayin":"Yayirobe";
	}
	
	public void datos(){
		System.out.println(nombre+", "+edad+", "+status);
	}
}