package fecha;

public class Combi extends ruta{
	private String Conductor;
	private String llegada;
	private String salida;
	private int num;
	private String tiempo;

	
	public Combi(String Conductor,  int num, String llegada, String salida,String tiempo, int numruta, String ruta) {
	super (numruta, ruta); 
	this.Conductor=Conductor;
	this.num=num;
	this.llegada=llegada;
	this.salida=salida;
	this.tiempo=tiempo;
	}


	public String getConductor() {
		return Conductor;
	}


	public void setConductor(String conductor) {
		Conductor = conductor;
	}


	public String getLlegada() {
		return llegada;
	}


	public void setLlegada(String llegada) {
		this.llegada = llegada;
	}


	public String getSalida() {
		return salida;
	}


	public void setSalida(String salida) {
		this.salida = salida;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getTiempo() {
		return tiempo;
	}


	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}


	


}
