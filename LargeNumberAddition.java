import java.util.Scanner;                 //此为测试版本，正式版本请移步至LargeNumberAddition2

public class LargeNumberAddition {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        int n;
        n=input.nextInt();

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
            String[] arr1 = A.split(" ");
            int[] a = new int[arr1.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(arr1[i]);
            }

            String B = sc.nextLine();     //输入数组B的数值 长度为q
            String[] arr2 = B.split(" ");
            int[] b = new int[arr2.length];
            for (int i = 0; i < b.length; i++) {
                b[i] = Integer.parseInt(arr2[i]);
            }

            if (p >=q){
                int[]c=new int[p];
                for (int i=0;i<p;i++){
                    c[i]=a[i];
                }
                for (int i=0;i<q;i++){
                    c[p-i-1]=c[p-i-1]+b[q-i-1];
                }
                for (int i=1;i<p;i++){
                    if (c[i]>=10){
                        c[i]=c[i]-10;
                        c[i-1]=c[i-1]+1;
                    }
                }
                for(int i=0;i<c.length;i++){
                    System.out.print(c[i]);
                }
                System.out.println();
            }
            else {
                int[]c=new int[q];
                for (int i=0;i<q;i++){
                    c[i]=b[i];
                }
                for (int i=0;i<p;i++){
                    c[q-i-1]=c[q-i-1]+a[p-i-1];
                }
                for (int i=1;i<q;i++){
                    if (c[i]>=10){
                        c[i]=c[i]-10;
                        c[i-1]=c[i-1]+1;
                    }
                }
                for(int i=0;i<c.length;i++){
                    System.out.print(c[i]);
                }
                System.out.println();
            }

            n=n-1;
        }
    }
}

