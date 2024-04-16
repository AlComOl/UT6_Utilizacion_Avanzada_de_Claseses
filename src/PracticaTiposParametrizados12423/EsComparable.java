package PracticaTiposParametrizados12423;

public interface EsComparable<T> {
	
	public boolean mayorQue(T t);

	public <T extends EsComparable<T>> int compara(T d);

	

}
