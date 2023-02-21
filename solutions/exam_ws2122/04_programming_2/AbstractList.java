abstract class AbstractList {
    protected Node first = null;

    abstract public void append(int value);

    abstract public void prepend(int value);

    abstract public int getFirst() throws EmptyListException;

    abstract public int getLast() throws EmptyListException;

    abstract public void deleteFirst();

    abstract public void deleteLast();
}

