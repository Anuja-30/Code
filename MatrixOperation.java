import java.util.Scanner;
class Matrix
{
	int row, coloum;
	int [][]arr1;
	int [][]arr2;
	int [][]arr3;
	int [][]arr4;
	int [][]arr5;
	Scanner sc =new Scanner(System.in);
	void Createarray()
	{
		System.out.println("Enter the row Number : ");
		row = sc.nextInt();
		System.out.println("Enter the coloum Number : ");
		coloum = sc.nextInt();
		System.out.print("\n");
		
		int i, j;
		arr1 = new int[row][coloum];
		System.out.println("Enter First Matrix Data :");
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("First Matrix :\n");
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
					System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("\n");
		arr2 = new int[row][coloum];
		System.out.println("Enter Second Matrix Data :");
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Second Matrix :\n");
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
					System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	void Addition()
	{
		int i, j;
		System.out.print("\n");
		arr3 = new int[row][coloum];
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("Addition of Matrix1 and Matrix2 : ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
					System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
	void Subtraction()
	{
		int i, j;
		System.out.print("\n");
		arr4 = new int[row][coloum];
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
				arr4[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		System.out.println("Subtraction of Matrix1 and Matrix2 : ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
					System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
	}
	void Multiplication()
	{
		int i, j;
		arr5 = new int[row][coloum];
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
				arr5[i][j] = 0;
				for(int k=0 ; k<coloum ; k++)
				{
					arr5[i][j] = arr1[i][k] - arr2[k][j];
				}
			}
		}
		System.out.println("Multiplication of Matrix1 and Matrix2 : ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<coloum; j++)
			{
				System.out.print(arr5[i][j] +" ");
			}
			System.out.println();
		}
	}
}
class MatrixOperation
{
	public static void main(String[] args)
	{
		Matrix M = new Matrix();
		M.Createarray();
		M.Addition();
		M.Subtraction();
		M.Multiplication();
	}
}	