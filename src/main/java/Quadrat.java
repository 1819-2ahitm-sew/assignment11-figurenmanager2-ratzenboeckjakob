public class Quadrat extends Figure {

    private int length;

    public Quadrat(){
    }

    public Quadrat(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public double cicumference() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Quadrat mit der Fläche -> " + area() + ", und mit Umfang -> " + cicumference();
    }
}
