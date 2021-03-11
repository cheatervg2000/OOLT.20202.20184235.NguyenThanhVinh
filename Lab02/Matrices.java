package lab02;
import java.util.Scanner;
public class Matrices {
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int col,row;
        do{
            System.out.println("Enter the numbers of columns of array: ");
            col = sc.nextInt();
            System.out.println("Enter the numbers of rows of array: ");
            row = sc.nextInt();
            if(col<=0||row<=0)
                System.out.println("Error . Enter again.");
        }while (col<=0||row<=0);
        int mt1[][] = new int[col][row];
        int mt2[][] = new int[col][row];
        int mt[][] = new int[col][row];
        CreateTwoMatrices(mt1,mt2,col,row,sc);
        displayMatrices(mt1);
        displayMatrices(mt2);
        AddTwoMatrices(mt1,mt2,mt);
        displayMatrices(mt);

    }
    static void CreateTwoMatrices(int mt1[][],int mt2[][],int col,int row,Scanner sc){
        System.out.println("Create mt1: ");
        for (int i = 0 ;i< row;i++){
            for (int j = 0;j< col;j++){
                System.out.print("mt1["+j+1+"]["+i+1+"] : ");
                mt1[j][i] = sc.nextInt();
            }
        }
        System.out.println("Create mt2: ");
        for (int i = 0 ;i< row;i++){
            for (int j = 0;j< col;j++){
                System.out.print("mt2["+j+1+"]["+i+1+"] :");
                mt2[j][i] = sc.nextInt();
            }
        }
    }
    static void AddTwoMatrices(int mt1[][],int mt2[][],int mt[][]){
        for (int i = 0;i < mt1[0].length;i++){
            for (int j=0;j < mt.length ;j++ ){
               mt[j][i] = mt1[j][i] + mt2[j][i];
            }
        }
    }
    static void displayMatrices(int mt[][]){
        System.out.println("Mt: ");
        for (int i = 0;i < mt[0].length;i++){
            for (int j= 0;j < mt.length ;j++ ){
                System.out.print(mt[j][i]+" ");
            }
            System.out.println("");
        }
    }

}
