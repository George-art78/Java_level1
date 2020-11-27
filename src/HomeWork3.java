import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //     gameGuessTheNumber();
        //     gameGuessTheWord();
    }

    public static void gameGuessTheNumber () {
        int answer;
        do {
            int number = random.nextInt(10);
            boolean guess = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число от 0 до 9");
                int userNumber = sc.nextInt();
                if (userNumber > number) {
                    System.out.println("Загаданное число меньше.");
                }
                if (userNumber < number) {
                    System.out.println("Загаданное число больше.");
                }
                if (userNumber == number) {
                    guess = true;
                    break;
                }
            }
            if (guess) {
                System.out.println("Вы угадали! Загаданное число " + number);
            }
            else {
                System.out.println("Вы не угадали! Загаданное число " + number);
            }
            System.out.println("Повторить игру еще раз? 1 – да");
            answer = sc.nextInt();
        } while (answer == 1);
    }
    //
    public static void gameGuessTheWord () {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int word = random.nextInt(words.length);
        while (true) {
            System.out.println("Угадайте слово.");
            String an = sc.nextLine();
            if (an.equals(words[word])) {
                System.out.println("Вы угадали!");
                break;
            }
            else {
                for (int i = 0; i < 15; i++) {
                    if (i < words[word].length() && i < an.length() && words[word].charAt(i) == an.charAt(i)) {
                        System.out.println(an.charAt(i));
                    }
                    else {
                        System.out.println("#");
                    }
                }
            }
        }
        System.out.println("Вы угадали!");
    }
}

