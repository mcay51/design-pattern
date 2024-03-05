package tr.com.mustafacay.iterator.service;

import java.util.List;

/**
 * Iterator arayüzünü uygulayan ConcreteIterator sınıfı
  */
public class ConcreteIterator<T> implements MyIterator<T> {
    private final List<T> list;
    private int position;

    public ConcreteIterator(List<T> list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(position++);
        }
        throw new IndexOutOfBoundsException("No more elements in the collection.");
    }
}
