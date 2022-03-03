import java.util.*;

public class QSort

{

  public static void main(String[] args) 

   {

	Scanner obj=new Scanner(System.in);	System.out.println("Enter the number of elements:");

	int n =obj.nextInt();

	int a[]=new int[n];

	System.out.print("Enter the elements:");

	for(int i=0;i<n;i++)

         a[i]=obj.nextInt();

	qsort(a,0,n-1);

	System.out.println("The Sorted Array is:");

	for(int i=0;i<n;i++)

		System.out.println(a[i]);		

	}

   static void qsort(int a[], int beg, int end )

  { 

  	int j;

  	if(beg<end)

  	{

	 	j = partition(a,beg,end);

	 	qsort(a,beg,j-1);

	 	qsort(a,j+1,end);

  	}

   } 

  static int partition(int a[],int l, int r)

  {

	  int key = a[l];

	  int i=l+1,j=r;

	  do

	  {

	 	while(a[i]<=key && i<r)

		   	i++;

		 while(a[j]>key && j>l)

		   	j--;

	  	if(i<j)

		  {

		  	int temp=a[i];

		  	a[i]=a[j];

		  	a[j]=temp;

		  }

	  }while(i<j);

	  int t=a[l];

	  a[l]=a[j];

	  a[j]=t;

	  return j;

  }   

}
