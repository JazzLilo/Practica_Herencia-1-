package Clase_HerenciaII_02;

public class Mani {

	public static void main(String[] args) 
	{
		ProyConstruccion pc1 = new ProyConstruccion(3,"Cota Cota",30000); 
		ProyFinalMateria pf1 = new ProyFinalMateria("Informatica",4);
		
		pc1.mostrar();
		pf1.mostrar();
		
		pf1.MayPersonas(pc1);
		pf1.PersonasMismoProy(pc1);
		

	}

}

