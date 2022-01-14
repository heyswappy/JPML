package Document;

public class ConcreteWebDocument extends AbstractWebDocument{

    @Override
    public String build() {
        return document.toString();
    }
}
