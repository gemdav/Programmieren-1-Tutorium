________________ Stack {
    private final ________________ size;
    private final Stackable[] stack;
    private int pos = 0;

    public Stack(int size) {
        this.size = size;
        stack = ________________ Stackable[size];
    }

    public void push(________________ obj) ________________ StackFullException {
        if (pos == size) {
            ________________ new StackFullException();
        }
        stack[pos++] = obj;
    }

    public void pop(________________ obj) ________________ StackEmptyException {
        if(pos == 0) {
            ________________ new StackEmptyException();
        }
        ________________ popped = stack[--pos];
        stack[pos] = null;
        System.out.println(________________.getNumberAndName());
    }
}
