public class WrongPositionException extends Exception {
    /**
     * Fehlermeldung wird gerufen, wenn die Position außerhalb des Schachbrettes liegt
     */
    public WrongPositionException() {
        super("Position nicht auf dem Spielfeld");
    }
}
