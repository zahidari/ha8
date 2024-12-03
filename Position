/**
 * Die Klasse repräsentiert eine Position auf einem Schachbrett.
 * Eine Position wird durch die x- und y-Koordinaten (1 bis 8) beschrieben.
 */
public class Position {

    private final int x, y;

    /**
     * Konstruktor, um eine Position mit den angegebenen Koordinaten zu erstellen.
     *
     * @param x die x-Koordinate (1 bis 8)
     * @param y die y-Koordinate (1 bis 8)
     * @throws WrongPositionException falls die Koordinaten außerhalb des gültigen Bereichs liegen
     */
    public Position(int x, int y) throws WrongPositionException {
        if (isValid(x, y)) {
            this.x = x;
            this.y = y;
        } else {
            throw new WrongPositionException();
        }
    }

    /**
     * Getter für die x-Koordinate.
     *
     * @return x-Koordinate der Position
     */
    public int getX() {
        return x;
    }

    /**
     * Getter für die y-Koordinate.
     *
     * @return y-Koordinate der Position
     */
    public int getY() {
        return y;
    }

    /**
     * Prüft, ob zwei Positionen gleich sind.
     * Zwei Positionen gelten als gleich, wenn ihre x- und y-Koordinaten übereinstimmen.
     *
     * @param p die zu vergleichende Position
     * @return true, wenn die Positionen gleich sind, sonst false
     */
    public boolean equals(Position p) {
        return this.x == p.x && this.y == p.y;
    }

    /**
     * Validiert die Koordinaten, ob sie im Bereich 1 bis 8 liegen.
     *
     * @param x die x-Koordinate
     * @param y die y-Koordinate
     * @return true, wenn die Koordinaten gültig sind, sonst false
     */
    public static boolean isValid(int x, int y) {
        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }

    /**
     * Überschreibt die toString-Methode, um die Position als String darzustellen.
     *
     * @return Position im Format "(x/y)"
     */
    @Override
    public String toString() {
        return "(" + x + "/" + y + ")";
    }
}
