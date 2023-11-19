import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakByReflectionAPI {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        System.out.println("Jai Shree Ram");
        Samosa s1=Samosa.getSamosa();
        System.out.println(s1.hashCode());
        
        Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2=constructor.newInstance();
        System.out.println(s2.hashCode());
	}
}
