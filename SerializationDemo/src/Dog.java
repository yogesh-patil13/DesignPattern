import java.io.Serializable;

public class Dog implements Serializable{
    int i=10;
    int j=20;
    transient int k=500;
    static int z=100;
    transient static int s=150;
}
