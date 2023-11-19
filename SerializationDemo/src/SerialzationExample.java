import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialzationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		
		FileOutputStream fos=new FileOutputStream("abc.src");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.print("done ");
		
		FileInputStream fis=new FileInputStream("abc.src");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.print(d2.i+"  "+d2.j+" "+ d2.k+" "+d2.z+"  "+d2.s);
		
		
	}

}
