import java.util.*;
public class q6 {
    //pyramid pattern
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int r=scanner.nextInt();
        for(int i=1;i<=r;i++)
        {
        //printing  r-i spaces
        for(int j=1;j<=r-i;j++)
        {
            System.out.print(" ");
        }
        //print 2*i-1
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
System.out.println();
        }
        }
        
    }

