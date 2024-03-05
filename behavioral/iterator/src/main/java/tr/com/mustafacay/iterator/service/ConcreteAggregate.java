package tr.com.mustafacay.iterator.service;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteAggregate sınıfı
 */
public class ConcreteAggregate<T> implements MyAggregate<T> {
    private final List<T> items;

    public ConcreteAggregate() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public MyIterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
