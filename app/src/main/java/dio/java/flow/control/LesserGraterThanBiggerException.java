package dio.java.flow.control;

public class LesserGraterThanBiggerException extends Exception {
    public LesserGraterThanBiggerException(int bigger, int smaller) {
        super("The bigger number " + bigger + " is lesser than the smaller number " + smaller);
    }
}
