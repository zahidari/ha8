import java.util.ArrayList;

/**
 * Die Klasse repraesentiert einen Springer im Schachspiel.
 * Sie berechnet die moeglichen Zuege entsprechend den Springerregeln.
 */
public class Knight extends Chessman {

    /**
     * Erstellt einen Springer an der angegebenen Position.
     *
     * @param pos die Startposition des Springers
     */
    public Knight(Position pos) {
        super(pos);
    }

    /**
     * Gibt alle moeglichen Zuege des Springers zurueck.
     * Der Springer bewegt sich in einem "L"-foermigen Muster:
     * zwei Felder in eine Richtung und eines in die andere.
     *
     * @return eine Liste von Positionen, die der Springer erreichen kann
     */
    @Override
    public ArrayList<Position> getMoveList() {
        ArrayList<Position> moves = new ArrayList<>();
        Position currentPos = getPosition();

        int[][] offsets = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
        };

        for (int[] offset : offsets) {
            int newX = currentPos.getX() + offset[0];
            int newY = currentPos.getY() + offset[1];
            if (Position.isValid(newX, newY)) {
                try {
                    moves.add(new Position(newX, newY));
                } catch (WrongPositionException e) {
                    // Sollte nicht auftreten, da die Position vorher geprüft wird.
                }
            }
        }
        return moves;
    }

    /**
     * @return die String-Darstellung seiner Position
     */
    @Override
    public String toString() {
        return "Springer: " + getPosition();
    }
}

