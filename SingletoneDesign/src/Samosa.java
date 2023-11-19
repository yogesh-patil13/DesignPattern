import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {
    private static Samosa samosa;
	private Samosa() throws Exception {
		if(samosa!=null)
		throw new Exception("cant use Reflection");
	}
	
	public static Samosa getSamosa() throws Exception
	{
		if(samosa==null)
		{
			samosa=new Samosa();
			
		}
		return samosa;
	}
	
	public Object readResolve()
	{
		return samosa;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		//return super.clone();
		return samosa;
	}
}
