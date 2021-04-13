package br.com.portfolio.tabuleiro.tabuleiro.classes;

public class Position {
    private int axis_x;
    private int axis_y;

    public Position() {
    }

    public Position(int axis_x, int axis_y) {
       setAxis_x(axis_x);
       setAxis_y(axis_y);
    }

    public int getAxis_x() {
        return axis_x;
    }

    public void setAxis_x(int axis_x) {
        this.axis_x = axis_x;
    }

    public int getAxis_y() {
        return axis_y;
    }

    public void setAxis_y(int axis_y) {
        this.axis_y = axis_y;
    }
}
