import java.util.ArrayList;
import java.util.Random;

public class Match {
    private static Random alea = new Random();

    public static Player playMatch(ArrayList<Player> players){
        return designatesTheWinner(players,alea.nextInt(players.size()));
    }

    private static Player designatesTheWinner(ArrayList<Player> players, int num){
        if (players.isEmpty()){
            return null;
        }
        else {
            return players.get(num);
        }
    }

}
