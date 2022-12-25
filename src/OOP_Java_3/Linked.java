package OOP_Java_3;

public interface Linked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int counter);
}
