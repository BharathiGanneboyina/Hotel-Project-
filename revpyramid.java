import java.util.*;
import java.io.*;
class revpyramid
 {
   public static void main(String a[])
      {
		  System.out.println("enter the number");
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		 revpyramid obj=new revpyramid();
		  obj.rev(n);
		 int i,j,k;
             for(i=n;i>=1;i--)
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
	    void rev(int n)
      {
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
                				