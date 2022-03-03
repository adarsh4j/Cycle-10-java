import java.util.*;

class bsearch

{

	public static void main(String[] args)	{

		Scanner sc = new Scanner(System.in);

		bsearch b = new bsearch();

		System.out.print("Enter the number of elements:");

		int n=sc.nextInt();

		int a[] = new int[n];

		System.out.print("Enter the elements:");

		for(int i=0;i<n;i++)

				a[i] = sc.nextInt();

		System.out.print("Enter the item to be searched:");

		int item = sc.nextInt();	

		int index = b.search(a,n,item);

		if(index!=0)

			System.out.println(item+" is found at index "+index);	

		else

			System.out.println("Element "+item+" not in the array");

	}

	int search(int a[], int n, int item)

	{

		int beg=0,end=n-1,mid;

		while(beg<=end)

		{

			mid=(beg+end)/2;

			if(a[mid]==item)

			{

				return(mid+1);

			}

			else if(item>a[mid])

			{

				beg=mid+1;

			}

			else

			{

				end=mid-1;

			}

		}

		return 0;

	}

}
