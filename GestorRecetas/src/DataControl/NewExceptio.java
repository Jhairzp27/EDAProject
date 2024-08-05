package DataControl;

public class NewExceptio extends Exception {
    public NewExceptio(String message, String className, String methodName) {
        super("\n\nError in " + className + "." + methodName + ": " + message);
    }
}
