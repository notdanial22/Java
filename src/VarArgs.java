public class VarArgs {
    public static  void main (String[] args) {
        System.out.println(average(1,2));
    }
    static double average(int... numbers) {
        double sum = 0;
        if(numbers.length == 0){
            System.out.println("Please enter some numbers at least to get average.");
            return 0.0;
        }
        for(int number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
