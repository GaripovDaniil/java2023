package src;

public class MathOne {
    /**
     * <p>Находит факториал введенного числа</p>
     * @param number Число, факториал которого нужно найти
     * @return number!; 1, если введен 0 или 1; IllegalArgumentException, если введено отрицательное число
     */
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

    /**
     * <p>Находит сигнум введенного числа</p>
     * @param number число, знак которого нужно извлечь
     * @return 0, если введен 0; 1, если введено положительное число; -1, если введено отрицательное число
     */
    public static int sign(int number){
        return Integer.compare(number, 0);
    }
}
