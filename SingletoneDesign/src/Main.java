
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        System.out.println("Jai Shree Ram");
        Samosa s1=Samosa.getSamosa();
        System.out.println(s1.hashCode());
        Samosa s2=Samosa.getSamosa();
        System.out.println(s2.hashCode());
	}

}
