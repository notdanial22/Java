import java.util.Arrays;

public class TwoDArrays {
    public static  void  main(String[] args){
        // basically array of arrays is called 2d array.
        String[][] groceries = {{"banana","apple","pineapple"},
                                {"chilli","pumpkin", "cucumber"},
                                {"chicken", "beef", "fish"}};

        groceries[0][1] = "idk";
        for (String[] foods : groceries){
            Arrays.sort(foods);
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
