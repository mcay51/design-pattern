package tr.com.mustafacay.iterator.service;
/**
 * Aggregate arayüzü
  */
interface MyAggregate<T> {
    MyIterator<T> createIterator();
}

