package domain;

public class DomainException extends RuntimeException {
    private String message;
    public DomainException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
