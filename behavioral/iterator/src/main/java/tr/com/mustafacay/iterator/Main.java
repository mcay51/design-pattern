package tr.com.mustafacay.iterator;

import tr.com.mustafacay.iterator.service.ConcreteAggregate;
import tr.com.mustafacay.iterator.service.MyIterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Iterator Design Pattern");

        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.addItem("One");
        aggregate.addItem("Two");
        aggregate.addItem("Three");

        MyIterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}