package view;

import java.util.Scanner;

public class InputView {
    private final static Scanner scan = new Scanner(System.in);

    public static String getPlayerName() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String playerNames = scan.nextLine();
        return playerNames;
    }

    public static int getBettingMoney(String playerName) {
        System.out.println( playerName + "의 배팅 금액은?");
        int money = scan.nextInt();
        return money;
    }
}
