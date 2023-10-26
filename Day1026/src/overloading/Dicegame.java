package overloading;

import java.util.Scanner;

public class Dicegame {
    private int diceFace;
    private int userGuess;

    private void rollDice() {
        diceFace = (int) (Math.random() * 6) + 1;
    }

    private int getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        return num;
    }

    private void checkUserGuess() {
        if (diceFace == userGuess)
            System.out.println("정답");
        else
            System.out.println("땡");
    }

    public void Playgame() {
        userGuess = getUserInput("숫자를 입력해보시지: ");
        rollDice();
        checkUserGuess();
    }

    public static void main(String[] args) {
        Dicegame dc = new Dicegame();
        dc.Playgame();
    }
}