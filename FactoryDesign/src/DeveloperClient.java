
public class DeveloperClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1=EmployeeFactory.getEmployeeInstance("Web");
        e1.salary();
        
        Employee e2=EmployeeFactory.getEmployeeInstance("Android");
        e2.salary();
	}

}
