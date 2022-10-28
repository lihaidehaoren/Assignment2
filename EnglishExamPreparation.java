import java.util.Scanner;

public class EnglishExamPreparation {
    public static void main(String[] args){

        int[] N=INPUT();
        int n=N[0];
        while (n>0){
            int[] a=INPUT();
            int[] b=INPUT();
            sort(a,b);

            
        }

    }

    public static int[] INPUT(){
        Scanner sc =new Scanner(System.in);
        String D = sc.nextLine();
        String[] arr3 = D.split(" ");
        int[] d = new int[arr3.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(arr3[i]);
        }
        return d;
    }

    public static void sort(int[]a,int[]b){
        for (int i=1;i<b.length;i++){
            for (int j=0;j<b.length;j++){
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
