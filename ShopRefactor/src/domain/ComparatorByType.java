package domain;

import java.util.Comparator;

public class ComparatorByType implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1 == null || o2 == null) return -1;
        return o1.getType().compareTo(o2.getType());
    }
}
