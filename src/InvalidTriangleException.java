/**
 * Created by Mayank on 9/10/16.
 */
public class InvalidTriangleException extends Exception{
    private String message;

    public InvalidTriangleException(String message) {
        this.message = message;
    }

}
