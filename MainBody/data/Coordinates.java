package data;

public class Coordinates {
    private double x; //меньше 849
    private long y; //больше -247

    public Coordinates(double x, long y) throws Exception {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) throws Exception {
        if (x < 849)
            this.x = x;
        else
            throw new Exception("Координата \"x\" должна быть < 849. Выберите другое значение");
    }

    public long getY() {
        return y;
    }

    public void setY(long y) throws Exception {
        if (y > -963)
            this.y = y;
        else
            throw new Exception("Координата \"x\" должна быть > -963. Выберите другое значение");
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

