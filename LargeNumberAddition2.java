import java.util.ArrayList;
import java.util.Scanner;

public class LargeNumberAddition2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        int n,m;
        n=input.nextInt();
        m=n;

        ArrayList<String> ARR = new ArrayList<>();

        while (n>0) {
            String D = sc.nextLine();
            String[] arr3 = D.split(" ");
            int[] d = new int[arr3.length];
            for (int i = 0; i < d.length; i++) {
                d[i] = Integer.parseInt(arr3[i]);
            }
            int p,q;
            p=d[0];
            q=d[1];

            String A = sc.nextLine();     //输入数组A的数值 长度为p
            String[] a = A.split(" ");
            String arr1 =new String();
            for (int i=0;i<a.length;i++){
                arr1=(arr1+a[i]);
            }

            String B = sc.nextLine();     //输入数组B的数值 长度为q
            String[] b = B.split(" ");
            String arr2 =new String();
            for (int i=0;i<b.length;i++){
                arr2=(arr2+b[i]);
            }

            String add =addStrings(arr1,arr2);
            ARR.add(add);
            n=n-1;
        }
        for (int i=0;i<m;i++){
        System.out.println(ARR.get(i));
        }
    }



    public static String addStrings(String arr1,String arr2){
        int m=arr1.length()-1;
        int n=arr2.length()-1;
        int counter=0;
        StringBuffer as =new StringBuffer();
        while (m>=0||n>=0||counter!=0){
            int x = m >=0?arr1.charAt(m)-'0':0;
            int y = n >=0?arr2.charAt(n)-'0':0;
            int res =x+y+counter;
            as.append(res%10);
            counter=res/10;
            m--;
            n--;
        }
        as.reverse();
        return as.toString();
    }
}

