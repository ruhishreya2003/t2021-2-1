import java.util.*;
public class Program1
{
    public static void main(String args[])
    {   Scanner ip=new Scanner(System.in);
        double a, b, output=0;
        String type_of_op;
        System.out.println("Enter input 1= ");
        a=ip.nextDouble();
        System.out.println("Enter input 2= ");
        b=ip.nextDouble();
        System.out.println("Enter Operator: ");
        type_of_op=ip.next();
        if(type_of_op.equals("+")){
            output=a+b;
        }
        else if(type_of_op.equals("-")){
           if(a>b){
            output=a-b;
           }
           else{
            output=b-a;
           }
        }
        else if(type_of_op.equals("*")){
            output=a*b;
        }
        else if(type_of_op.equals("/")){
            if(b!=0){
            output=a/b;
            }
            else{
                System.out.println("Division not possible");
                return;
            }
        }
        System.out.println("Output"+output);
    }
}
