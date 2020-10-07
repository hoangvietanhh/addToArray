import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};

        int[] newarr = addElement(arr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + "\t");
        }

    }

    public static int[] addElement (int[] array){
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println("Enter element: ");
        number = scanner.nextInt();

        int index;
        System.out.println("Enter index: ");
        index = scanner.nextInt();

        if (index<=0 || index>= array.length-1){
            System.out.println("Can add element.");
        } else {
            for (int i = array.length-1; i> index; i--){
                array[i] = array[i-1];
            }
            array[index] = number;
        }
        return array;
    }
}
