           
package Java_Program;
import java.util.*;
public class BonusQuestion {

	static void solve(int[] desirArr,int [] Arr) {
    int size=desirArr.length;
    
    for(int i=0;i<size;i++){
        int count=0;
        int s=desirArr[i];
        if(s<=0){  //for negative and zero values;
            count=count-s;
            System.out.print(i+":"+count+"\n");
            continue;
        }
         
        while(s!=0){ //do we need to perform ops or not
            if(s%2==0){     //if even
                s/=2;
                count++;
            }
            if(s==1){       //base case 1
                count=count+1;
                s=0;
                
            }
            else if(s==3){  //base case 2
                count=count+3;
                s=0;
                
            }            
            else if((s%2==1)&&(s!=3)&&(s!=1)){  //finding which chain odd num belongs to
                if(s%4==1){ //belongs to chain5
                    //System.out.print(s+" ");
                    s-=1;
                    s/=2;
                    count+=2;
                    //System.out.print(s+"_");
                }
                else{  //s%4==3 : belongs to chain7
                    //System.out.print(s+" ");
                    s+=1;
                    s/=2;
                    count+=2;
                    //System.out.print(s+"_");
                }
            }
        }

        System.out.print(i+":"+count+"\n");
       
    }
    
    return;
    }


	public static void main(String[] args) {
      //expected answer = 
	    int desiredArray[] ={1,31,0,2,3,10,15,-3};
	    int startingArray[] ={0,0,0,0,0,0,0,0};
	    System.out.println("Index : Steps\n");
	    solve(desiredArray,startingArray);
	    /*
      expected output:
      0:1
      1:7
      2:0
      3:2
      4:3
      5:5
      6:6
      7:3
      */
	}
}
