package tr.com.mustafacay.iterator.service;

/**
 * Iterator arayüzü
  */
public interface MyIterator<T> {
    boolean hasNext();
    T next();
}
