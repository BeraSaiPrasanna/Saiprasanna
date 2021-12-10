import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator  {
	private static ArrayList<Humans> hum=new ArrayList<Humans>();
	public static void main(String[] args) {
	
		Humans h1=new Humans("Sai's age is",24);
		Humans h2=new Humans("Anshu's age is",45);
		Humans h3=new Humans("Prasanna's age is",20);
		Humans h4=new Humans("Kalki's age is",26);
		Humans h5=new Humans("Babydoll's is",16);
		hum.add(h1);
		hum.add(h2);
		hum.add(h3);
		hum.add(h4);
		hum.add(h5);
		getHuman();
	}
//	static public void getHuman() {
//		for(Humans human:hum) {
//			System.out.println(human.getName()+" "+human.getAge());
//		}
	static public void getHuman() {
		Iterator itr=hum.iterator();
		while(itr.hasNext()) {
			Humans h6=(Humans)itr.next();
			System.out.println(h6.getName()+" "+h6.getAge());
			
		}
		
	}
}