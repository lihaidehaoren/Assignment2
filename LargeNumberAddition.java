import java.util.Scanner;

public class LargeNumberAddition {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        int n;
        n=input.nextInt();

            int p,q;
            p=input.nextInt();
            q=input.nextInt();


            String A =sc.nextLine();     //输入数组A的数值 长度为p
            String [] arr1 = A.split(" ");
            int [] a =new int[arr1.length];
            for(int i=0;i<a.length;i++){
                a[i]=Integer.parseInt(arr1[i]);
                System.out.print(a[i]);



        }

    }
}
