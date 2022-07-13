import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Mainclass
{
    String color;
    String brand;
    int model;
    int mfgYr;
   
    
}
class DerivedClass extends Mainclass{
    public int mileage;
    public void logic(String cl,String bd,int y){
        this.color = color;
        this.brand = brand;
        mileage=y;
    }
}
public class Test {
    public static void main(String args[])
    {
  
        DerivedClass mb = new DerivedClass();
        
    }
}

