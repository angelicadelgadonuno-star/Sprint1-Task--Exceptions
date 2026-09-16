package Nivel1.Excepcions.Personalitzades;

public class EmptySaleException extends RuntimeException {

    public EmptySaleException() {
        super ("To make a sale you must add products first");
    }

}
