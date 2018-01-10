package pair1;
public class Pair<T>{
	private T first;
	private T second;

	public Pair(){first = null;second = null;}
	public Pair(T f,T s){this.first = f;this.second = s;}

	public T getFirst(){return first;}
	public T getSecond(){return second;}

	public void setFirst(T newValue){first = newValue;}
	public void setSecond(T newValue){second = newValue;}
}
