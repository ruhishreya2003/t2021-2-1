import java.util.*;
public class Program3 {
    public static void main(String args[])
    {
        Scanner ip=new Scanner(System.in);
        int a,i;
        System.out.print("Enter the input: ");
        a=ip.nextInt();
        if(a%2==0){
            a=a-1;
        }
        for(i=0;i<a;i++){
            System.out.print(((2*i)+1));
            if(i<(a-1)){
               System.out.print(", ") ;
            }
        }
        }
    } 
    
