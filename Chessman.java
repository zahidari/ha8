import java.util.ArrayList;

/**
 * Die abstrakte Klasse stellt eine allgemeine Schachfigur dar.
 * Sie verwaltet die Position der Figur und definiert Methoden zur Bewegung und zur
 * Berechnung moeglicher Zuege.
 */
public abstract class Chessman {

    private Position pos;

    /**
     * Erstellt eine Schachfigur an der angegebenen Position.
     *
     * @param pos die Startposition der Figur
     */
    public Chessman(Position pos) {
        this.pos = pos;
    }

    /**
     * Gibt die aktuelle Position der Schachfigur zurueck.
     *
     * @return die aktuelle Position der Figur
     */
    public Position getPosition() {
        return this.pos;
    }

    /**
     * Bewegt die Schachfigur zur angegebenen Position, falls der Zug gueltig ist.
     *
     * @param pos die neue Position
     * @throws WrongMovementException wenn der Zug ungueltig ist
     */
    public void moveTo(Position pos) throws WrongMovementException {
        if (canMoveTo(pos)) {
            this.pos = pos;
        } else {
            throw new WrongMovementException();
        }
    }

    /**
     * Prueft, ob die Schachfigur zur angegebenen Position ziehen kann.
     *
     * @param pos die Zielposition
     * @return true, wenn die Position erreichbar ist, sonst false
     */
    public boolean canMoveTo(Position pos) {
        for(int i = 0; i < getMoveList().size(); i++){
            if(getMoveList().get(i).equals(pos)){
                return true;
            }
        }
        return false;
    }

    /**
     * Gibt eine Liste aller moeglichen Zuege der Schachfigur zurueck.
     *
     * @return eine Liste von Positionen, die die Figur erreichen kann
     */
    public abstract ArrayList<Position> getMoveList();
}
