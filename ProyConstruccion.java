package Clase_HerenciaII_02;

public class ProyConstruccion extends Proyecto
{
	private int nroMateriales;
	private String [][] material=new String [50][2];
	private String lugar;
	private int presupuesto;
	
	public ProyConstruccion(int nroMateriales, String lugar, int presupuesto)
	{
		super("Casa",3,"23/03/2022");
		this.nroMateriales = nroMateriales;
		this.material[0][0] = "Colores  "; this.material[0][1]   = "12";
		this.material[1][0] = "Boligrafos "; this.material[1][1] = "8"; 
		this.material[2][0] = "Encendedor "; this.material[2][1] = "8"; 
		this.lugar = lugar;
		this.presupuesto = presupuesto;
	}
	
	public void mostrar()
	{
		System.out.println("\n PROYECTO EN CONSTRUCCION:");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		super.mostrar();
		System.out.println("LUGAR: " + this.lugar);
		System.out.println("PRESUPUESTO EN Bs: " + this.presupuesto);
		System.out.println("NROMATERIALES: " + this.nroMateriales);
		System.out.println("MATERIAL \t CANTIDAD");
		 for(int i=0;i<nroMateriales;i++)
	        {
	            System.out.println(material[i][0]+ "\t" +material[i][1]);
	        }
	}
	public int getNroMateriales() 
	{
		return nroMateriales;
	}
	public void setNroMateriales(int nroMateriales) 
	{
		this.nroMateriales = nroMateriales;
	}

	public String[][] getMaterial() 
	{
		return material;
	}
	public void setMaterial(String[][] material) 
	{
		this.material = material;
	}

	public String getLugar() 
	{
		return lugar;
	}
	public void setLugar(String lugar) 
	{
		this.lugar = lugar;
	}

	public int getPresupuesto() 
	{
		return presupuesto;
	}
	public void setPresupuesto(int presupuesto) 
	{
		this.presupuesto = presupuesto;
	}
	
	public void MostrarPersonas(Proyecto y)
	{
		System.out.println("----------------------------------------");
		for (int i = 0; i < this.nroPersonas; i++)
		{
			for (int j=0; j < y.nroPersonas ; j++)
			{
				if(this.pers[i][0].equals(y.pers[j][2]))
				{
					System.out.println("Estan en l:"+" " + this.pers[i][j]);
				}
			}
		}
	}
}

	
	