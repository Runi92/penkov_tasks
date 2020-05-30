package task_5;

public abstract class AbstractFigure {
    private String color;

    public AbstractFigure(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected abstract int calcSquare();

    protected abstract int calcPerim();
}
