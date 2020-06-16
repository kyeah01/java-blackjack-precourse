package controller;

import java.util.HashMap;
import java.util.List;

import domain.user.Player;
import domain.user.Players;
import view.InputView;

public class Controller {
    public static void draw() {
        // deck에서 한장 아무거나 드로우
    }

    public static void start() {
        String playerNameString = InputView.getPlayerName();
        Players players = new Players(playerNameString);
    }
}
