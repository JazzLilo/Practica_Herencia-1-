package Clase_HerenciaII_02;

public class Proyecto {
	protected String nom;
	protected int nroPersonas;
	protected String [][] pers=new String [50][3];
	protected String fechaEntrega;
	
	public Proyecto(String nom, int nroPersonas)
	{
		this.nom = nom;
		this.nroPersonas = nroPersonas;
		this.pers[0][0] = "Juan";	this.pers[0][1] = "23";	this.pers[0][2] = "6667";
		this.pers[1][0] = "Heizeel"; this.pers[1][1] = "20 años"; this.pers[1][2] = "3379562";
		this.pers[2][0] = "David"; this.pers[2][1] = "22 años"; this.pers[2][2] = "9144152";
		this.pers[3][0] = "Daniel"; this.pers[3][1] = "20 años"; this.pers[3][2] = "9133795";
		this.fechaEntrega = "13/05/20";
	}
	public Proyecto(String nom, int nroPersonas, String fechaEntrega)
	{
		this.nom = nom;
		this.nroPersonas = nroPersonas;
		this.fechaEntrega = fechaEntrega;
		this.pers[0][0] = "Luis"; this.pers[0][1] = "20 años"; this.pers[0][2] = "3379562";
		this.pers[1][0] = "Carla"; this.pers[1][1] = "22 años"; this.pers[1][2] = "9144152";
		this.pers[2][0] = "Daniel"; this.pers[2][1] = "20 años"; this.pers[2][2] = "9133795";
	}
	public Proyecto(String fechaEntrega)
	{
		nom = "Aprendiendo C#";
		nroPersonas = 3;
		this.pers[0][0] = "Luis"; this.pers[0][1] = "20 años"; this.pers[0][2] = "3379562";
		this.pers[1][0] = "Carla"; this.pers[1][1] = "22 años"; this.pers[1][2] = "9144152";
		this.pers[2][0] = "Daniel"; this.pers[2][1] = "20 años"; this.pers[2][2] = "9133795";
		this.fechaEntrega = fechaEntrega;
	}
	
	public void mostrar()
	{
		System.out.println("Datos del Proyecto");
		System.out.println("-------------------------------------");
        System.out.println("NOMBRE DEL PROYECTO: " + nom);
        System.out.println("NUMERO DE PERSONAS: " + nroPersonas);
        System.out.println("NOMBRE \t EDAD \t CI");
        for(int i=0;i<nroPersonas;i++)
        {
            System.out.println(pers[i][0]+"\t"+pers[i][1]+"\t"+pers[i][2]);
        }
        System.out.println("FECHA DE ENTREGA: " + fechaEntrega); 
	}
	
	public String getNom() 
	{
		return nom;
	}
	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	public int getNroPersonas() 
	{
		return nroPersonas;
	}
	public void setNroPersonas(int nroPersonas) 
	{
		this.nroPersonas = nroPersonas;
	}

	public String[][] getPers() 
	{
		return pers;
	}
	public void setPers(String[][] pers) {
		this.pers = pers;
	}

	public String getFechaEntrega() 
	{
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) 
	{
		this.fechaEntrega = fechaEntrega;
	}
	
	public void MayPersonas(Proyecto x)
	{
		if (this.nroPersonas > x.nroPersonas) {
			System.out.println("\nEL PROYECTO" +" "+this.nom+" "+ "TIENE MAYOR NRO DE PERSONAS.");
		}
		else
			System.out.println("\nNO TIENE MAYOR NRO DE PERSONAS.");
	}
	
	public void PersonasMismoProy(Proyecto y)
	{
		for (int i = 0; i < nroPersonas; i++) {
			
			if (this.pers[i][0] == y.pers[i][0])
			{
				System.out.println("\n"+pers[i][0] +"\t\t"+ pers[i][1] +"\t\t"+ pers[i][2]);
			}
			else
				System.out.println("NO EXISTE LA MISMA PERSONA EN AMBOS PROYECTOS");
		}
	}
}

	
	
	
