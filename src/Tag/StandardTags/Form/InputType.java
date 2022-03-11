package Tag.StandardTags.Form;

public enum InputType {
    BUTTON("button"),
    CHECKBOX("checkbox"),
    COLOR("color"),
    DATE("date"),
    DATETIME_LOCAL("datetime-local"),
    EMAIL("email"),
    FILE("file"),
    HIDDEN("hidden"),
    IMAGE("image"),
    MONTH("month"),
    NUMBER("number"),
    PASSWORD("password"),
    RADIO("radio"),
    RANGE("range"),
    RESET("reset"),
    SEARCH("search"),
    SUBMIT("submit"),
    TEL("tel"),
    TEXT("text"),
    TIME("time"),
    URL("url"),
    WEEK("week");

    // Enum attribute
    private final String name;

    // Constructor
    InputType(String name) {
        this.name = name;
    }
}
