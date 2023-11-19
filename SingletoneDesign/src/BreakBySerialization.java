import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakBySerialization {
    public static void main(String[] args) throws Exception
    {
    	   System.out.println("Jai Shree Ram");
           Samosa s1=Samosa.getSamosa();
           System.out.println(s1.hashCode());
           
           
           FileOutputStream fos=new FileOutputStream("abc.ob");
           ObjectOutputStream oos=new ObjectOutputStream(fos);
           oos.writeObject(s1);
           
           FileInputStream fis=new  FileInputStream("abc.ob");
           ObjectInputStream ois=new ObjectInputStream(fis);
           Samosa s2=(Samosa)ois.readObject();
           System.out.println(s2.hashCode());
    }
}
