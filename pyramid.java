import java.util.*;
import java.io.*;
class pyramid
 {
   public static void main(String a[])
      {
		  System.out.println("enter the number");
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
	     int i,j,k;
		 
             for(i=1;i<=n;i++)
            {
                for(j=n-1;j>=i;j--)
                 {
                   System.out.print(" ");
                 }
                 for(k=1;k<=(i*2)-1;k++)
                  {
				   System.out.print("*");
				  }
				  System.out.print("\n");
			}
	   }
  }	   
                				