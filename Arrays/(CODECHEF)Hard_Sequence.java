//LINK TO THE PROBLEM
//https://www.codechef.com/NOV19B/problems/HRDSEQ


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while((t--)!=0)
        {
          int n=Integer.parseInt(br.readLine());
          int a[]=new int[129];
          int v[]=new int[256];
          int i;
          for (i=0;i<256 ;i++ )
          {
              v[i]=0;
          }
          a[1]=0;
          for(i=2;i<129;i++)
          {
              if(v[a[i-1]] != 0)
                a[i]=(i-1)-v[a[i-1]];
            else
                a[i]=0;
            v[a[i-1]]=i-1;
          }
          int count=0;
          for(i=1;i<=n;i++)
          {
              if(a[n]==a[i])
                count++;
          }
          System.out.println(count);
        }
	}
}


