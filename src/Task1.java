import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static ArrayList<Integer> sort(ArrayList<Integer> list){
        list.sort(Integer::compare);
        return list;
    }

    public static int getSecondSmallest(ArrayList<Integer> list){
        return list.get(1);
    }
    public static int getSecondLargest(ArrayList<Integer> list){
        return list.get(list.size()-2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers;
        int x;
        System.out.println("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if(x < 2){
            System.out.println("Invalid input. Array can't be that short.");
            return;
        }
        numbers = new ArrayList<Integer>(x);
        System.out.println("Enter array elements: ");
        for  (int i = 1; i <= x; i++) {
            numbers.add(sc.nextInt());
        }
        numbers = sort(numbers);
        System.out.println("The second smallest number is: " + getSecondSmallest(numbers));
        System.out.println("The second largest number is: " + getSecondLargest(numbers));
    }
}
