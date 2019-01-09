import java.util.Scanner;

public class Matrixes
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows for A: ");
    int a1=sc.nextInt();
    System.out.print("Enter columns for A: ");
    int a2=sc.nextInt();
    
    System.out.print("Enter rows for B: ");
    int b1=sc.nextInt();
    System.out.print("Enter columns for B: ");
    int b2=sc.nextInt();
    
    int[][] mA = new int[a1][a2];
    int[][] mB = new int[b1][b2];
    
    for(int i=0; i<mA.length; i++)
    {
      for(int h=0; h<mA[0].length; h++)
      {
        System.out.print("Enter A[" + i + "][" + h + "]");
        mA[i][h]=sc.nextInt();
      }
    }
    
    for(int i=0; i<mB.length; i++)
    {
      for(int h=0; h<mB[0].length; h++)
      {
        System.out.print("Enter B[" + i + "][" + h + "]");
        mB[i][h]=sc.nextInt();
      }
    }
    
    System.out.print("Enter 1 for addition, 2 for subtraction, or 3 for multiplication: ");
    int choice=sc.nextInt();
    
    switch(choice)
    {
      case(1):
        if (checkArray(mA,mB,choice))
      {
        int[][] answer=new int[mA.length][mA[0].length];
        for (int j=0; j<mA.length; j++)
        {
          for (int k=0; k<mA[0].length; k++)
          {
            answer[j][k]=mA[j][k] + mB[j][k];
          }
        }
        for (int p=0; p<answer.length; p++)
        {
          for (int l=0; l<answer[0].length; l++)
          {
            System.out.print(answer[p][l] + " ");
          }
          System.out.println(); 
        }
      }
        else
        {
          System.out.print("Need same dimensin matrices to add, run again");
        }
        break;
      case(2):
        if (checkArray(mA,mB,choice))
      {
        int[][] answer=new int[mA.length][mA[0].length];
        for (int j=0; j<mA.length; j++)
        {
          for (int k=0; k<mA[0].length; k++)
          {
            answer[j][k]=mA[j][k] - mB[j][k];
          }
        }
        for (int p=0; p<answer.length; p++)
        {
          for (int l=0; l<answer[0].length; l++)
          {
            System.out.print(answer[p][l] + " ");
          }
          System.out.println(); 
        }
      }
        else
        {
          System.out.print("Need same dimensin matrices to subtract, run again");
        }
        break;
      case(3):
        if (checkArray(mA,mB,choice))
      {
        int[][] answer=new int[mA.length][mB[0].length];
        for (int j=0; j<answer.length; j++)
        {
          for (int k=0; k<answer[0].length; k++)
          {
            for (int m=0; m<mB.length; m++)
            {
              answer[j][k] += mA[j][m]*mB[m][k];
            }
          }
        }
        for (int p=0; p<answer.length; p++)
        {
          for (int l=0; l<answer[0].length; l++)
          {
            System.out.print(answer[p][l] + " ");
          }
          System.out.println();
        }
      }
        else
        {
          System.out.print("Need number of columns in first matrix equal to number of rows in second matrix, run again");
        }
        break;
    }
  }
  public static boolean checkArray(int[][] a,int[][] b, int c)
  {
    switch(c)
    {
      case(1):
        if (a.length==b.length && a[0].length==b[0].length)
        return true;
        else
          return false;
      case(2):
        if (a.length==b.length && a[0].length==b[0].length)
        return true;
        else
          return false;
      case(3):
        if (a[0].length!=b.length)
        return false;
        else
          return true;
    }
    return false;
  }
}



    