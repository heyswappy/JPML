package Exception;

import java.util.Arrays;

public class ExceptionUtils {

    public static ConstructorNotFoundException getConstructorNotFoundExceptionWithClassAndSignature(Class cls, Class[] signature, Exception e) {
        String message = String.format("Class: %s, Signature: %s", cls.getName(), Arrays.toString(signature));
        return new ConstructorNotFoundException(message, e);
    }

    public static TagInstantiationException getTagInstantiationExceptionWithTagNameAndSignature(String tagName, Class[] signature, Exception e) {
        String message = String.format("TagName: %s, Signature: %s", tagName, Arrays.toString(signature));
        return new TagInstantiationException(message, e);
    }

    public static WrongTagClosedException getWrongTagClosedException(String expected, String actual) {
        String message = String.format("Expected tag %s got tag %s", expected, actual);
        return new WrongTagClosedException(message);
    }
}
