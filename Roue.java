import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Roue {
    int team =0;

    ArrayList<Player> resultat = new ArrayList();




    public void playRoue(ArrayList<Player> players){
        while (!players.isEmpty()){
            Player winner= Match.playMatch(players);
            players.remove(winner);
            team++;
            winner.setTeam((team%2)+ 1);
            winner.setRole(Role.values()[team%(Role.values().length)]);
            resultat.add(winner);
        }
        Collections.sort(resultat);
        this.displayWinner(resultat);
    }

    public void displayWinner(ArrayList<Player> players){
        int j =1;
        for (Player p1:players) {
            System.out.println(p1.getName()+ " -> " + p1.getRole().name()+ " -> Team : "+p1.getTeam());
            j++;
        }
    }




}
