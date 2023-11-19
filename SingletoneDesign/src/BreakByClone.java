
public class BreakByClone {
    
	public static void main(String[] args) throws Exception {
	   Samosa s1=Samosa.getSamosa();
	   System.out.println(s1.hashCode());
	   
	   Samosa s2=(Samosa)s1.clone();
	   System.out.println(s2.hashCode());
	}
	
}
