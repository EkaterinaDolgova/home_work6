package skyro.company;

public class Main {

    public static void main(String[] args) {
        // Задание №1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i<2) {
                System.out.print(arr[i] + ",");
            }
            if (i==2){
                System.out.print(arr[i]);
                System.out.println("");
            }
        }
        for (int i1 = 3; i1 >=0; i1--) {
            if (i1<=2 && i1!=0) {
                System.out.print(arr[i1] + ",");
            }
            if (i1==0){
                System.out.print(arr[i1]);
                System.out.println("");
            }
        }
        double[] arrDouble = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            if (i<2) {
                System.out.print(arrDouble[i] + ",");
            }
            if (i==2){
                System.out.print(arrDouble[i]);
                System.out.println("");
            }
        }
        for (int i = 3; i >=0; i--) {
            if (i<=2 && i!=0) {
                System.out.print(arrDouble[i] + ",");
            }
            if (i==0){
                System.out.print(arrDouble[i]);
                System.out.println("");
            }
        }
        char[] arrChar = {'Y', 'E', 'S'};
        for (int i = 0; i < 3; i++) {
            if (i<2) {
                System.out.print(arrChar[i] + ",");
            }
            if (i==2){
                System.out.print(arrChar[i]);
                System.out.println("");
            }
        }
        for (int i = 3; i >=0; i--) {
            if (i<=2 && i!=0) {
                System.out.print(arrChar[i] + ",");
            }
            if (i==0){
                System.out.print(arrChar[i]);
                System.out.println("");
            }
        }
        //Задание №4
        for (int i = 0; i < 3; i++)  {
            int chet = arr[i]%2;
            if (chet!=0) {
                arr[i]=arr[i]+1;
            }
            System.out.print(arr[i] + ",");
        }
        }
    }

