import java.util.*;
public class Program4 {
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
            int n,i;
            System.out.println("Enter the number of values:");
            n=ip.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the values:");
            for(i=0;i<n;i++){
                arr[i]=ip.nextInt();
                
            }
            int count[]=new int[9];
            for(int num : arr){
                for(i=1;i<=n;i++){
                    if(num%i==0){
                        count[i-1]++;
                    }
                }
            }
            System.out.print("Output: {");
        for (i = 0; i < 9; i++) {
            System.out.print((i + 1) + "=" + count[i]);
            if (i < 8) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    
}
