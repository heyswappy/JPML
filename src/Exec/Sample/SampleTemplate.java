package Exec.Sample;

import Document.ConcreteWebDocument;
import Document.WebDocument;
import Style.Style;
import Style.ConcreteStyle;
import Template.AbstractDocumentTemplate;

public class SampleTemplate extends AbstractDocumentTemplate<SampleData> {

    @Override
    public WebDocument build(WebDocument document, SampleData data) throws Exception {
        // implement logic
        SampleDataPresenter presenter = data.presenter;
        document.appendTag("html");
        document.appendTag("head");
        document.closeLatestTag();
        {
            document.appendTag("body");
            document.appendComponent(new SampleInnerDataTemplate(), data);
            document.closeLatestTag();
        }
        document.closeLatestTag();
        return document;
    }

    @Override
    public WebDocument build(SampleData data) throws Exception {
        WebDocument document = new ConcreteWebDocument();
        return build(document, data);
    }
}
