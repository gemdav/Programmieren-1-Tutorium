import java.util.Random;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<E> maybe = ________________ Stack [10];

        while(true) {
            try {
                if(getRandomBoolean()) {
                    maybe.push(new Yes());
                } else {
                    maybe.push(new No());
                }
            } ________________ (StackFullException e) {
                break;
            }
        }

        while(true) {
            try {
                maybe.pop();
            } ________________ (StackEmptyException e) {
                break;
            }
        }
    }

    static Random r = new Random();

    static boolean getRandomBoolean() {
        ________________ r.nextBoolean();
    }
}
