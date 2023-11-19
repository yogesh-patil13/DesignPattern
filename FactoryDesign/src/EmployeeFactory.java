
public class EmployeeFactory {
        
	public static Employee getEmployeeInstance(String s)
	{
		if(s.equals("Web"))
		{
			return new WebDeveloper();
		}
		else if(s.equals("Android"))
		{
			return new AndroidDeveloper();
		}
		return null;
	}
}
