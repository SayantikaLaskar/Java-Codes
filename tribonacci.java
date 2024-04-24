import java.util.Scanner;

public class tribonacci {

    public static void main(String[] args) {
        System.out.println("Enter limit of the series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t0=0, t1=1, t2=1;
        int temp;
        if(n==0){ 
            System.out.println(0);;
        }
        else if(n==1||n==2){ 
            System.out.println(1);;
        }
        for(int i=3; i<=n; i++){
            temp=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=temp;
        }
        System.out.println(t2);
    }
    
}
