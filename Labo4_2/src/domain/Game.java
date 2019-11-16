package domain;

import java.util.*;

public class Game implements Subject {
    private Map<Integer, Player> players;
    private Queue<Player> playerQueue = new LinkedList<>();
    private Map<Player, List<Turn>> turns;
    private Map<EventType, List<Observer>> observers;
    private Dice dice;
    private int currentTurn;

    public Game()
    {
        players = new HashMap<>();
        turns = new HashMap<>();
        observers = new HashMap<>();
        dice = new Dice();
        currentTurn = 1;
    }


    @Override
    public void registerObserver(EventType e, Observer o) {
        if (observers.get(e) == null)
        {
            List<Observer> a = new ArrayList<>();
            a.add(o);
            observers.put(e, a);

        }else observers.get(e).add(o);

    }

    @Override
    public void removeObserver(EventType e, Observer o) {
        observers.get(e).remove(o);

    }

    @Override
    public void notifyObserver(EventType e, String s) {
        for (int i = 0; i < observers.get(e).size(); i++)
        {
            observers.get(e).get(i).update(s);
        }

    }

    public void addPlayer(Player player)
    {
        players.put(player.getPlayerid(), player);
        playerQueue.add(player);
        turns.put(player, new ArrayList<Turn>());
    }

    public Map<Integer, Player> getPlayers() {
        return players;
    }
}
