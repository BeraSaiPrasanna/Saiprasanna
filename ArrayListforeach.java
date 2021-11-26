import java.util.ArrayList;

public class ArrayListforeach {
	private static ArrayList<Humans> hum=new ArrayList<Humans>();
	public static void main(String[] args) {
	
		Humans h1=new Humans("keer's age is",24);
		Humans h2=new Humans("kanna age is",45);
		Humans h3=new Humans("purna age is",20);
		Humans h4=new Humans("Koamli's age is",26);
		Humans h5=new Humans("Dolly's is",16);
		hum.add(h1);
		hum.add(h2);
		hum.add(h3);
		hum.add(h4);
		hum.add(h5);
		getHuman();
	}
	static public void getHuman() {
		for(Humans human:hum) {
			System.out.println(human.getName()+" "+human.getAge());
		}
	}
}