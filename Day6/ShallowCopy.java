package Java_Program;
import java.util.Scanner;

class ShallowCopyClass{
    public int dataField =100;
}

public class ShallowCopy{
  public static void main(String[] args){
    //Scanner scan=new Scanner(System.in);
    ShallowCopyClass copyObject1=new ShallowCopyClass();
    ShallowCopyClass copyObject2=copyObject1;
    //on change to one object, change occurs in all objects due to reference
    copyObject2.dataField=0;
    System.out.println("Obj1: "+copyObject1.dataField);
    
    }
}
