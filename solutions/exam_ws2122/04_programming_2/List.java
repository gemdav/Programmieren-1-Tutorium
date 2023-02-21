class List extends AbstractList {

    @Override
    public void append(int value) {
        // if list is empty
        if (first == null) {
            first = new Node(value);
            return;
        }
        // if list has elements
        Node current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node(value));
    }

    @Override
    public void prepend(int value) {
        first = new Node(value, first);
    }

    @Override
    public int getFirst() throws EmptyListException {
        // if list is empty
        if (first == null) {
            throw new EmptyListException();
        }
        // if list has elements
        return first.getValue();
    }

    @Override
    public int getLast() throws EmptyListException {
        // if list is empty
        if (first == null) {
            throw new EmptyListException();
        }
        // if list has elements
        Node current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public void deleteFirst() {
        // if list is empty
        if (first == null) {
            return;
        }
        // if first is only element
        if(first.getNext() == null) {
            first = null;
            return;
        }
        // if there are more than 1 elements
        first = first.getNext();
    }

    @Override
    public void deleteLast() {
        // if list is empty
        if (first == null) {
            return;
        }
        // if first is only element
        if(first.getNext() == null) {
            first = null;
            return;
        }
        // if there are more than 1 elements
        Node current = first;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
    }
}

