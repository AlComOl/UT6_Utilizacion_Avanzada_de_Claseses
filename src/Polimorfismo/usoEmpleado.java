package Polimorfismo;

public class usoEmpleado {

	public static void main(String[] args) {
		
		Jefatura jefe_Proyect=new Jefatura("Alvaro",40000,2026,9,15);
		
		jefe_Proyect.estableceIncentivo(2500);
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Jose",30000,2000,07,07);
		misEmpleados[1]=new Empleado("Carlos",50000,1995,03,15);
		misEmpleados[2]=new Empleado("Vicent",20000,2005,02,06);
		misEmpleados[3]=new Empleado("Cloe",70000,2009,9,23);
		misEmpleados[4]= jefe_Proyect;
		misEmpleados[5]=new Jefatura("Alvaro",75000,2025,9,19);
		
		for(Empleado x : misEmpleados) {
			
			x.subeSueldo(5);
		}
		
		
		for(Empleado x:misEmpleados) {
			
			System.out.println("Nombre :"+ x.getNombre()
								+ " Sueldo :"+x.getSueldo()
								+ " Fecha de alta :"+ x.getAltaContrato());
		}

	}

}
