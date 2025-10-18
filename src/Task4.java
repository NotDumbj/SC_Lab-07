import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Array Elements:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("ArrayList Elements using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nArrayList Elements using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
