package domain;

import java.util.*;

public class Game implements Subject {
    private Map<Integer, Player> players;
    private Queue<Player> playerQueue = new LinkedList<>();
    private Map<Player, List<Turn>> turns;
    private Map<EventType, List<Observer>> observers;
    private Dice dice;
    private int currentTurn;
    private Player current;
    private int lastscore;

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
    public void play(int playerId) {
        current = playerQueue.poll();
        int a = dice.throwdice();
        int b = dice.throwdice();
        Turn t = new Turn(current, a, b, lastscore);
        turns.get(current).add(t);
        lastscore = a + b;
        playerQueue.add(current);
        Player p = playerQueue.peek();
        p.setCurrent(true);
        setCurrentTurn();
        notifyObserver(EventType.PLAYERVIEW, t.toString());

    }

    public void addPlayer(Player player)
    {
        players.put(player.getPlayerid(), player);
        playerQueue.add(player);
        turns.put(player, new ArrayList<Turn>());
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    private void setCurrentTurn()
    {
        int i;
        ArrayList<Integer> a = new ArrayList();
        for (Map.Entry<Player, List<Turn>> entry : turns.entrySet())
        {
            a.add(entry.getValue().size());
        }
        if (a.get(0) == a.get(1) && a.get(1) == a.get(2))
        {
           this.currentTurn = a.get(0)+1;
            notifyObserver(EventType.SCOREVIEW,getScoreViewString());
        }else this.currentTurn = a.get(0);
        if (this.currentTurn == 5)
        {
            stop();
        }
    }

    private String getScoreViewString() {
        String result ="";
        for (Map.Entry<Player,List<Turn>> entry:this.turns.entrySet()) {
            int sum =0;
            for (Turn t:entry.getValue()) {
                sum += t.getCurrent();
            }
            result += entry.getKey().getNaam() + "" + sum + " ";
        }
        return result;    }

    public Map<Integer, Player> getPlayers() {
        return players;
    }
    public void stop()
    {
        notifyObserver(EventType.SCOREVIEW, "Game over " + getWinner());
    }

    private String getWinner() {
        int max = 0;
        Player winner = null;
        for (Map.Entry<Player, List<Turn> > t : turns.entrySet())
        {
            if (max < getScore(t.getKey()))
            {
                winner = t.getKey();
                max = getScore(t.getKey());
            }
        }
        return "The winner is " + winner.getNaam() + " score: " + max;

    }

    private int getScore(Player player)
    {
        int som = 0;
        List<Turn> turn = turns.get(player);
        for (Turn t : turn)
        {
            som += t.getCurrent();
        }
        return som;
    }


}
