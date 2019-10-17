package domain;

import java.time.LocalDate;

public interface Observer{
    String update(Account a, int total, LocalDate date);
}
