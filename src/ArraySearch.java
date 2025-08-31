import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "banana" , "pineapple", "peach"};
        String target;
        Boolean isFound = false;


        System.out.print("Please enter the fruit you want to search: ");
        target =  scanner.nextLine();

        for (int i=0; i < fruits.length ; i++) {
            if(fruits[i].equals(target.toLowerCase())){
                System.out.println("Fruit found at index " + i + "😄");
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println("Fruit not found in the array.☹️🥺");
        }


//        int[]  numbs  = {1 , 2, 3,9 , 6, 5 };

//        int target = 5;
//        boolean isFound = false;
//
//        for (int i=0; i < numbs.length ; i++){
//            if  (numbs[i] == target) {
//                System.out.println("Element found at index " + i);
//                isFound = true;
//                break;
//            }
//        }
//
//        if(!isFound) {
//            System.out.println("Element is not found in the array");
//        }

        scanner.close();
    }
}
