package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Приветствую, " + name + "\n\n");
        System.out.println("Угол\tСинус\n");
        for(int angle = 0; angle <= 45; angle += 5){
            var sine = Math.sin(Math.toRadians(angle));
            System.out.println(angle + "\t\t" + sine);
        }
    }
}
