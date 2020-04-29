import java.util.Scanner;

public class GopMang {
    public static void showArr(int[]arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static int[] AddArray(int[]arr1,int[]arr2,int[]arr3){
        for (int j=0;j<arr1.length;j++){
            arr3[j]=arr1[j];
            arr3[arr1.length+j]=arr2[j];
        }
        return arr3;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int amount=scanner.nextInt();
        int[] arrA=new int[amount];
        int[] arrB=new int[amount];
        int[] arrC=new int[amount*2];

        for (int i=0;i<amount;i++){
            System.out.println("Nhập các phần tử thứ "+(i+1)+" của mảng A: ");
            arrA[i]=scanner.nextInt();
            System.out.println("Nhập các phần tử thứ "+(i+1)+" của mảng B: ");
            arrB[i]=scanner.nextInt();
        }
        System.out.print("Mảng thứ nhất: ");
        showArr(arrA);
        System.out.print("\nMảng thứ 2: ");
        showArr(arrB);
        AddArray(arrA,arrB,arrC);
        System.out.print("\nMảng đã gộp: ");
        showArr(arrC);
    }
}
