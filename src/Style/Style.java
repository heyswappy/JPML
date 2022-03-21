package Style;

public interface Style<ChildStyle extends Style<?>> {

    public ChildStyle addStyle(String key, String value);

    public String build();
}
