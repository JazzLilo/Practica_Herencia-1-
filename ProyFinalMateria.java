package Clase_HerenciaII_02;

public class ProyFinalMateria extends Proyecto
{
	private String materia;
	private int nroReuniones;
	private String [][] reuniones=new String [50][2];
	
	public ProyFinalMateria(String materia, int nroPersonas)
	{
		super("Robot",nroPersonas);
		this.materia = materia;
		this.nroReuniones = 3;
		this.reuniones[0][0] = "09/05/20";this.reuniones[0][1] = "14:11 pm";
		this.reuniones[1][0] = "10/05/20";this.reuniones[1][1] = "17:26 pm";
		this.reuniones[2][0] = "30/07/2020";this.reuniones[2][1]= "09:30 am";
	}
	public void mostrar()
	{
		
		System.out.println("\nPROYECTO FINAL:");
		super.mostrar();
		System.out.println("MATERIA: " + this.materia);
		System.out.println("NRO DE REUNIONES: " + this.nroReuniones);
		System.out.println("FECHA \t\t HORA");
		 for(int i=0;i<nroReuniones;i++)
	        {
	            System.out.println(reuniones[i][0]+"\t"+reuniones[i][1]);
	        }
	}
	
	public String getMateria() 
	{
		return materia;
	}
	public void setMateria(String materia) 
	{
		this.materia = materia;
	}

	public int getNroReuniones() 
	{
		return nroReuniones;
	}
	public void setNroReuniones(int nroReuniones) 
	{
		this.nroReuniones = nroReuniones;
	}

	public String[][] getReuniones() {
		return reuniones;
	}
	public void setReuniones(String[][] reuniones) 
	{
		this.reuniones = reuniones;
	}
}


	
	
	
	
