package task_6;

public class Program {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 2);

        System.out.println(rectangle.isSquare());
    }

    static class Rectangle {
        private int length;
        private int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        public boolean isSquare() {
            return length == width;
        }
    }
}
