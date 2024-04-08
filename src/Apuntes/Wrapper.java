package Apuntes;

public class Wrapper {
	// instance variables - replace the example below with your own
	public static void verFecha(String s)
	{
	//Integer e = new Integer(s);
	//int fecha = e.intValue();
	int fecha = Integer.valueOf(s).intValue();
	System.out.println(fecha % 100 + "-"+(fecha/100 % 100) + "-"+(fecha/10000) );
	}
	public static void main(String[] args)
	{
	Integer e1 = new Integer(5);
	Integer e2 = new Integer("7");
	String s1 = e1.toString();
	System.out.println("cadena " +s1);
	int i1 = Integer.parseInt("10", 10);
	System.out.println("entero " + i1);
	int i2 = Integer.parseInt("101", 2);
	System.out.println("entero " + i2);
	int i3 = Integer.parseInt("BABA", 16);
	System.out.println("entero " + i3);
	int i4 = Integer.parseInt("1024");
	System.out.println("entero " + i4 * 2);
	System.out.println("entero octal " + Integer.toOctalString(i4));
	System.out.println("entero hexadecimal " +
	Integer.toHexString(i3));
	Integer e3 = Integer.valueOf("22");
	int i5 = e3.intValue();
	// int i5 = Integer.valueOf("22").intValue();
	System.out.println("entero " + i5);
	int fecha = Integer.valueOf("20120203").intValue();
	System.out.println("Hoy " + fecha);
	verFecha("20120203");
	// sacaFecha("20120203", dia, mes, anyo);
	// System.out.println(dia + "-" + mes + "-"+ anyo);
	}
}
