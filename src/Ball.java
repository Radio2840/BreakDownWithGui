public class Ball {
    private int size;
    private int positionX;
    private int positionY;

    public Ball(int size, int positionX, int positionY) {
        this.size = size;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void moveball() {
        // moving code
    }
    public int getSize() {
        return size;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
