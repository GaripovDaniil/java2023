package src;

public class MathOne {
    public static int fact(int number){
        if (number < 0) throw new IllegalArgumentException();
        if (number == 0 || number == 1){
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= number; i++){
            result *= i;
        }
        return result;
    }

    public static int sign(int number){
        return Integer.compare(number, 0);
    }
}
