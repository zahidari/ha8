public class WrongMovementException extends Exception {
    /**
     * Fehlermeldung wird gerufen, wenn die Bewgung runter von dem Schachbrett fuehrt
     */
    public WrongMovementException() {
        super("Position ist nicht zu erreichen");
    }
}
