import java.util.Scanner;           //糊弄过去的，勿喷

public class LittleendianandBigendian {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        String D = sc.nextLine();
        String[] arr3 = D.split(" ");
        int[] d = new int[arr3.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(arr3[i]);
        }
        int n=d[0];

        String A = sc.nextLine();
        String[] arr1 = A.split(" ");

        String[] arr2 =new String[arr1.length];

        for (int i=0;i< arr1.length;i++){
            char [] x =new char[8];
            x [0]=arr1[i].charAt(6);
            x [1]=arr1[i].charAt(7);
            x [2]=arr1[i].charAt(4);
            x [3]=arr1[i].charAt(5);
            x [4]=arr1[i].charAt(2);
            x [5]=arr1[i].charAt(3);
            x [6]=arr1[i].charAt(0);
            x [7]=arr1[i].charAt(1);
            arr2[i]=String.valueOf(x);
        }

        System.out.print(arr2[0]);
        for (int i=1;i< arr1.length;i++){
            System.out.print(" ");
            System.out.print(arr2[i]);
        }

    }
}
