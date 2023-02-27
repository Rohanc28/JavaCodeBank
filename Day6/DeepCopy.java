//package Java_Program;
class DeepCopy  {  
    int x = 1;  
}  
public class DeepCopyExample   {
    public static void main(String argvs[])  {   
        //Scanner scan=new Scanner(System.in);
        DeepCopy obj1 = new DeepCopy();  
  
        DeepCopy obj2 = new DeepCopy();;  
  
        obj2.x = 2;  
        //no copy of values as both objects are separate entities
        System.out.println("The value of x is: " + obj1.x);  
    }  
}   
