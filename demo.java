import java.util.Scanner;

public class demo {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        String A =sc.nextLine();           //输入数组A的数值 长度为p
        String [] arr1 = A.split(" ");
        int [] a =new int[arr1.length];
            for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(arr1[i]);
            System.out.print(a[i]);
            }
    }
}
