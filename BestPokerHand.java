import java.util.Arrays;
import java.util.Scanner;

public class BestPokerHand {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        String A = sc.nextLine();
        String[] arr1 = A.split(" ");

        String B = sc.nextLine();
        String[] arr2 = B.split(" ");

        String C = sc.nextLine();
        String[] arr3 = C.split(" ");

        String D = sc.nextLine();
        String[] arr4 = D.split(" ");

        String E = sc.nextLine();
        String[] arr5 = E.split(" ");



        int[] pai =new int[5];
        pai [0] =Integer.parseInt(arr1[1]);
        pai [1] =Integer.parseInt(arr2[1]);
        pai [2] =Integer.parseInt(arr3[1]);
        pai [3] =Integer.parseInt(arr4[1]);
        pai [4] =Integer.parseInt(arr5[1]);

        Arrays.sort(pai);

        if (arr1[0].equals(arr2[0])&&arr1[0].equals(arr3[0])&&arr1[0].equals(arr4[0])&&arr1[0].equals(arr5[0])&&pai[1]-pai[0]==1&&pai[2]-pai[1]==1&&pai[3]-pai[2]==1&&pai[4]-pai[3]==1){
            System.out.print("Straight Flush");
        }
        else if (arr1[0].equals(arr2[0])&&arr1[0].equals(arr3[0])&&arr1[0].equals(arr4[0])&&arr1[0].equals(arr5[0])){
            System.out.print("Flush");
        }
        else if (pai[1]-pai[0]==1&&pai[2]-pai[1]==1&&pai[3]-pai[2]==1&&pai[4]-pai[3]==1){
            System.out.print("Straight");
        }
        else if (pai[0]==pai[1]&&pai[1]==pai[2]||pai[1]==pai[2]&&pai[2]==pai[3]||pai[2]==pai[3]&&pai[3]==pai[4]){
            System.out.print("Three of a Kind");
        }
        else if (pai[0]==pai[1]||pai[1]==pai[2]||pai[2]==pai[3]||pai[3]==pai[4]){
            System.out.print("Pair");
        }
        else {
            System.out.print("High Card");
        }



    }
}
