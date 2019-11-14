package domain;

public class StrategyFactory {

    public GeheimschriftStrategy createStrategy(String strategy){
        StrategyEnum strategyEnum = StrategyEnum.valueOf(strategy);
        String stagegyKlasseNaam = strategyEnum.getKlasseNaam();
        GeheimschriftStrategy geheimschriftStrategy = null;
        try {
            Class dbclass = Class.forName(stagegyKlasseNaam);
            Object dbObject = dbclass.newInstance();
            geheimschriftStrategy = (GeheimschriftStrategy) dbObject;
        }catch (Exception e){ }
        return geheimschriftStrategy;
    }
}
