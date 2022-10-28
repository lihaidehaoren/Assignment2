import java.util.Scanner;

public class Missingnumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Scanner input =new Scanner(System.in);

        boolean flag =false;
        int n;
        n= input.nextInt();
        boolean D[] =new boolean[n];
        for (int i=0;i<n;i++){
            D[i] =false;                      //初始化为false
        }

        String A = sc.nextLine();     //输入数组A的数值 长度为p
        String[] arr1 = A.split(" ");
        int[] a = new int[arr1.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(arr1[i]);
        }

        for (int i=0;i<a.length;i++){
            for (int j=0;j<n;j++){
                if (a[i]==j+1){
                    D[j]=true;
                }
            }
        }

        for (int i=0;i<n;i++){
            if (!D[i]&&!flag){
                System.out.print(i+1);
                flag =true;
            }
            else if (!D[i]&&flag) {
                System.out.print(" ");
                System.out.print(i+1);
            }
        }
        if (!flag){
            System.out.print("NULL");
        }

    }
}
