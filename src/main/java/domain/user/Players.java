package domain.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Players {
    private final List<Player> players = new ArrayList<>();

    public Players(String playerNames) {
        for (String name : playerNames.split(",")) {
            Player player = new Player(name);
            // 타입검증?
            players.add(player);
        }
    }
}

