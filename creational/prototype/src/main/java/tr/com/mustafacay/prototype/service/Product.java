package tr.com.mustafacay.prototype.service;

public interface Product extends Cloneable {
    public Object clone() throws CloneNotSupportedException;
}
