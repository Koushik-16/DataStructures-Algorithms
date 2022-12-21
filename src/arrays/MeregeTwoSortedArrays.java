package arrays;

public class MeregeTwoSortedArrays {
		
		static int nextGap(int gap)
		{
			if (gap <= 1)
				return 0;
			return (int)((gap / 2) + (gap % 2));
		}
		static void mergeTwoSortedArray(int []arr1,
										int []arr2,
										int n, int m)
		{
			int x = Math.min(n, m);
		
				for (int i = 0; i < x; i++)
			{
				if (arr1[n - i - 1] > arr2[i])
				{
					
					int temp = arr1[n - i - 1];
					arr1[n - i - 1] = arr2[i];
					arr2[i] = temp;
				}
			}
		
		
			for (int gap = nextGap(n); gap > 0;
				gap = nextGap(gap))
			{
		
				
				for (int i = 0; i + gap < n; i++)
					if (arr1[i] > arr1[i + gap])
					{
						
						int temp = arr1[i];
						arr1[i] = arr1[i + gap];
						arr1[i + gap] = temp;
					}
			}
		
			
			for (int gap = nextGap(m); gap > 0;
				gap = nextGap(gap))
			{
		
			
				for (int i = 0; i + gap < m; i++)
					if (arr2[i] > arr2[i + gap])
					{
					
						int temp = arr2[i];
						arr2[i] = arr2[i + gap];
						arr2[i + gap] = temp;
					}
			}
			for (int i = 0; i < n; i++)
				System.out.print(arr1[i] + " ");
			for (int j = 0; j < m; j++)
				System.out.print(arr2[j] + " ");
		}
		
		public static void main (String[] args)
		{
			int arr1[] = { 1, 5, 9, 10, 15, 20 };
			int n = arr1.length;
			int arr2[] = { 2, 3, 8, 13 };
			int m = arr2.length;
		
			mergeTwoSortedArray(arr1, arr2, n, m);
		}
	}

	


