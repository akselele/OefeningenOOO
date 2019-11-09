package src;

import java.time.LocalDate;

public interface Observer
{
    void update(Rekening rekening, int totaal, LocalDate datum, EventType type);
}
