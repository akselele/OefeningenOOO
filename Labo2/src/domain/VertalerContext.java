package domain;

public class VertalerContext {
    String type, encodeOrDecode;

    public VertalerContext(String type, String encodeOrDecode){
        if (!(type.equalsIgnoreCase("spiegel") || type.equalsIgnoreCase("caesar")||type.equalsIgnoreCase("caesarschrift")))
        {
            throw new DomainException("geef geldige encryptiemanier");
        }
        if (!(encodeOrDecode.equalsIgnoreCase("encode") || encodeOrDecode.equalsIgnoreCase("decode")))
        {
            throw new DomainException("geeft decode of encode in");
        }
        this.type = type;
        this.encodeOrDecode = encodeOrDecode;
    }

    public String vertaal(String text){
        CaesarschriftStrategy resultC = new CaesarschriftStrategy();
        SpiegelingStrategy resultS = new SpiegelingStrategy();
        if (this.type.equalsIgnoreCase("spiegel")){
            if (this.encodeOrDecode.equalsIgnoreCase("encode")){
                return resultS.encodeAlgoritme(text);
            }else {
                return resultS.decodeAlgoritme(text);
            }
        }else
        {
            if (this.encodeOrDecode.equalsIgnoreCase("encode")){
                return resultC.encodeAlgoritme(text);
            }else {
                return resultC.decodeAlgoritme(text);
            }
        }
    }


}
