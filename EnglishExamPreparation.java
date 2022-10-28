import java.util.Scanner;

public class EnglishExamPreparation {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        String D = sc.nextLine();
        String[] arr3 = D.split(" ");
        int[] d = new int[arr3.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(arr3[i]);
        }
        int n=d[0];

        int[] C =new int[n];
        while (n>0){
            int day=0;

            String A = sc.nextLine();     //输入数组A的数值
            String[] arr1 = A.split(" ");
            int[] a = new int[arr1.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(arr1[i]);
            }

            String B = sc.nextLine();     //输入数组B的数值
            String[] arr2 = B.split(" ");
            int[] b = new int[arr2.length];
            for (int i = 0; i < b.length; i++) {
                b[i] = Integer.parseInt(arr2[i]);
            }


            sort(a,b);

            int total=a[0]+a[1]+a[2]+a[3];

            while (total<100){
                for (int i=0;i<a.length;i++){
                    while (a[i]<30&&total<100){
                        a[i]=a[i]+1;
                        total=total+1;
                        day=day+b[i];
                    }
                }
            }
            C[n-1]=day;
            n=n-1;
        }
        for (int i=0;i<C.length;i++){
            System.out.println(C[C.length-i-1]);
        }

    }


    public static void sort(int[]a,int[]b){
        for (int i=1;i<b.length;i++){
            for (int j=0;j<b.length-1;j++){
                if (b[j]>b[j+1]){
                    int temp1 =b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp1;
                    int temp2 =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp2;
                }
            }
        }
    }




}
