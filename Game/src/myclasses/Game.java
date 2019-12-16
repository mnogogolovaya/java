package myclasses;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public void run() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа - угадай число");
        System.out.println("Игрок, у тебя 100 очков");
        System.out.println("");
        System.out.println("Задумано число от 5 до 10. Угадай: ");
        int sum = 100;
        int number = random.nextInt(10-5+1)+5;
        int attempt = 0;
        int win = 0;
        boolean repeat =  true;
        do {
            do {
            int userNumber = scanner.nextInt();
            if (number == userNumber) {
                System.out.println("Было загадано число: " +number);
                if(0 == attempt) {
                    System.out.println("Твой угадал Кол-во очеов" +win);
                } else if (1 == attempt) {
                    win+=sum;
                    System.out.println("Ты угадал! У тебя остались твои  " +win +"очков");
                } else if (2 == attempt) {
                    win+=sum/2;
                    System.out.println("Ты угадал! Твоё кол=во очков уменьшилось в 2 раза. У тебя теперь: " +win);
                } else if (3 == attempt) {
                    System.out.println("Ты проиграл всё, но ты угадал! У тебя " + 0 + "очков!");
                }
                break;
            } else {
                System.out.println("Ты проиграл, попробуй ещё раз!");
                attempt++; 
            }
            if(attempt > 4) {
                System.out.println("У вас 0 очков");
                System.out.println("Было загадано число: " +number);
                break;
            }
        } while (true);
        System.out.println("Хочешь продолжить игру?!?!?!");
        System.out.println("Да - любая клавиша || Нет - E (Английскую)");
        String exitGame = scanner.next();
        if ("e".equals(exitGame)) {
            repeat = false;
        }
        if (win == 0) {
            System.out.println("У тебя 0 очков");
            System.out.println("Покедова!");
        }
    }while (repeat);
}
}