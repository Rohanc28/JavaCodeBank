package Java_Program;

class ShallowCopy  {  
    int x = 1;  
}  
public class ShallowCopyExample   {
    public static void main(String argvs[])  {   
        //Scanner scan=new Scanner(System.in);
        ShallowCopy obj1 = new ShallowCopy();  
  
        ShallowCopy obj2 = obj1;  
  
        obj2.x = 2;  
        //values are copied as both objects share reference
        System.out.println("The value of x is: " + obj1.x);  
    }  
}   
