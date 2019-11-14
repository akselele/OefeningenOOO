package domain;

import java.util.ArrayList;
import java.util.List;

public class VertalerContext {
    private GeheimschriftStrategy geheimschriftStrategy;


    public VertalerContext(){

    }

    public void setGeheimschriftStrategy(GeheimschriftStrategy geheimschriftStrategy){
        this.geheimschriftStrategy = geheimschriftStrategy;
    }

    public String encode(String text){
        return geheimschriftStrategy.encodeAlgoritme(text);
    }

    public String decode(String text){
        return geheimschriftStrategy.decodeAlgoritme(text);
    }

    public String[] getTaalLijst(){
        List <String> taalLijst = new ArrayList<String>();
        for (StrategyEnum strategy : StrategyEnum.values()){
            taalLijst.add(strategy.toString());
        }
        String[] taalLijstStr = new String[taalLijst.size()];
        taalLijstStr = taalLijst.toArray(taalLijstStr);
        return taalLijstStr;
    }

}
