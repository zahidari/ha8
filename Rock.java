import java.util.ArrayList;

/**
 * Die Klasse repraesentiert einen Turm im Schachspiel.
 * Sie berechnet alle moeglichen Zuege basierend auf den Bewegungsregeln fuer Tuerme.
 */
public class Rook extends Chessman {

    /**
     * Konstruktor, um einen Turm an der angegebenen Position zu erstellen.
     *
     * @param startPos die Startposition des Turms
     */
    public Rook(Position startPos) {
        super(startPos);
    }

    /**
     * Ermittelt die Liste aller gueltigen Zuege fuer den Turm.
     * Ein Turm kann sich horizontal und vertikal ueber das gesamte Schachbrett bewegen.
     *
     * @return Liste von Positionen, die der Turm erreichen kann
     */
    @Override
    public ArrayList<Position> getMoveList() {
        ArrayList<Position> zugListe = new ArrayList<>();
        Position aktuellePosition = getPosition();
        int posX = aktuellePosition.getX();
        int posY = aktuellePosition.getY();

        // Horizontale Bewegungen
        for (int i = 1; i <= 8; i++) {
            if (i != posX) {
                try {
                    zugListe.add(new Position(i, posY));
                } catch (WrongPositionException e) {
                    // Diese Exception sollte nicht auftreten, da die Positionen gueltig sind.
                }
            }
        }
        
        // Vertikale Bewegungen
        for (int j = 1; j <= 8; j++) {
            if (j != posY) {
                try {
                    zugListe.add(new Position(posX, j));
                } catch (WrongPositionException e) {
                    // Diese Exception sollte nicht auftreten, da die Positionen gueltig sind.
                }
            }
        }
        return zugListe;
    }

    /**
     * Gibt die aktuelle Position des Turms als String zurueck.
     *
     * @return String-Darstellung der Position des Turms
     */
    @Override
    public String toString() {
        return "Turm: " + getPosition();
    }
}
