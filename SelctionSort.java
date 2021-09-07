import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t\t Selection Sort");
        System.out.println("\t\t\t ----------------");
        System.out.println("Enter Size Of Array as You Want:");
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Array element No." + (i+1));
            arr[i] = s.nextInt();
        }
        System.out.println("Want To Sort Elements ?(y/n)");
        String chosse = s.next();
        switch (chosse) {
            case "y": {
                System.out.println("Sort Ascending or Descending ? (A/D)");
                String sort = s.next();
                switch (sort) {
                    case "A":
                        selectionSortAsc(arr);
                        break;
                    case "D":
                        selectionSortDec(arr);
                        break;
                    case "a":
                        selectionSortAsc(arr);
                        break;
                    case "d":
                        selectionSortDec(arr);
                        break;
                    default:
                        System.out.println("Worng Chosse");
                        System.exit(0);
                        
                }
            }
            break;
            case "n":
                System.out.println("Element With  no sort : ");
                System.out.println(Arrays.toString(arr));
                break;
            default:
                 System.out.println("Worng Chosse");
                        System.exit(0);
        }

    }

    public static void selectionSortAsc(int arr[]) { //10 60 7 0 6 9
        int min = 0, temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;//10
            for (int j = i + 1; j < arr.length; j++) {//9
                if (arr[j] < arr[min])/*
                   60<10??? >> no
                   7<10???  >> yes
                   0<7???   >> yes
                   6<0??    >> no
                   9<0      >> no
                 */ {
                    min = j;//min=0
                }
            }
            temp = arr[min];//temp=0
            arr[min] = arr[i];//0=10;
            arr[i] = temp;    //10=0;     
        }
        System.out.println(Arrays.toString(arr)); // 0 6 7 9 10 60
    }

    public static void selectionSortDec(int arr[]) { //10 60 7 0 6 9
        int max = 0, temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {//10 60 7 0 6 9
            max = i; //10
            for (int j = i + 1; j < arr.length; j++) {//7
                if (arr[j] > arr[max]) {
                    /* 
                    60>10??? >>> yes
                    7>60 ??? >>> no
                    0>60 ??? >>> no
                    6>60 ??? >>> no
                    9>60 ??? >>> no
                    
                     */
                    max = j; //max=60;
                }
            }
            temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));//60 10 9 7 6 0
    }
}
