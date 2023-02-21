public class Rectangle {

    private char[][] rect;
    
    public Rectangle(char[][] rect) {
        this.rect = rect;
    }

    public Rectangle(int height, int width, char character) {
        this.rect = new char[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                rect[y][x] = character;
            }
        }
    }

    public Rectangle(int height, int width) {
        this(height, width, '.');
    }

    Rectangle add(Rectangle other) {
        // dimensions
        int thisHeight = this.rect.length;
        int thisWidth = this.rect[0].length;
        int newHeight = this.rect.length + other.rect.length;
        int newWidth = this.rect[0].length + other.rect[0].length;
        // create new rect
        char[][] newRect = new char[newHeight][newWidth];
        for (int y = 0; y < newHeight; y++) {
            for (int x = 0; x < newWidth; x++) {
                if(y < thisHeight && x < thisWidth) {
                    // top left
                    newRect[y][x] = this.rect[y][x];
                } else if (y >= thisHeight && x >= thisWidth) {
                    // bottom right
                    newRect[y][x] = other.rect[y - thisHeight][x - thisWidth];
                } else {
                    newRect[y][x] = '.';
                }
            }
        }
        // return new Rectangle
        return new Rectangle(newRect);
    }

    void print() {
        for (int y = 0; y < rect.length; y++) {
            for (int x = 0; x < rect[0].length; x++) {
                System.out.print(rect[y][x]);
            }
            System.out.println();
        }
    }
}
