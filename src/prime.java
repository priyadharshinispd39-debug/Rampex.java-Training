import java.util.Scanner;
public class prime{

    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
        if(count==2){
            System.out.println("prime num");
        }
        else{
            System.out.println(" not prime num");
        }
        sc.close();


    }
}