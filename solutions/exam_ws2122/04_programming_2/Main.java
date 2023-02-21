class Main {
    public static void main(String[] args) {
        List list = new List();

        for(int i = 0; i < 10; i++) {
            list.prepend(i);
        }

        try {
            for( ;; list.deleteFirst()) {
                System.out.println(list.getFirst() + " ");
            }
        } catch (EmptyListException e) {
            System.out.println("List is empty.");
        } finally {
            list.deleteFirst();
        }

        for(int i = 9; i >= 0; i--) {
            list.append(i);
        }

        try {
            for( ;; list.deleteLast()) {
                System.out.println(list.getLast() + " ");
            }
        } catch (EmptyListException e) {
            System.out.println("List is empty.");
        } finally {
            list.deleteLast();
        }
    }
}

