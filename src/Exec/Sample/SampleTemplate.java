package Exec.Sample;

import Document.ConcreteWebDocument;
import Document.WebDocument;
import Template.AbstractDocumentTemplate;

import static Constants.JPMLConstants.NO_ATTRIBUTES;

public class SampleTemplate extends AbstractDocumentTemplate<SampleData> {

    @Override
    public WebDocument build(WebDocument document, SampleData data) throws Exception {
        // implement logic
        SampleDataPresenter presenter = data.presenter;
        document.appendTag("html", NO_ATTRIBUTES);
        {
            document.appendTag("head", NO_ATTRIBUTES);
            document.closeLatestTag();
            document.appendTag("body", NO_ATTRIBUTES);
            for(int i=0; i<10; i++) {
                document.appendTag("b", NO_ATTRIBUTES);
                document.insertData(String.valueOf(i));
                document.closeLatestTag();
                document.appendTag("br", NO_ATTRIBUTES);
            }
            //
            document.appendTag("b", NO_ATTRIBUTES);
            document.insertData(presenter.s);
            document.closeLatestTag();
            document.appendTag("br", NO_ATTRIBUTES);
            //
            document.appendTag("b", NO_ATTRIBUTES);
            document.insertData(presenter.d.toString());
            document.closeLatestTag();
            document.appendTag("br", NO_ATTRIBUTES);
            //
            document.appendTag("b", NO_ATTRIBUTES);
            document.insertData(presenter.i.toString());
            document.closeLatestTag();
            document.appendTag("br", NO_ATTRIBUTES);
            //
            document.appendTag("b", NO_ATTRIBUTES);
            document.insertData(presenter.b.toString());
            document.closeLatestTag();
            document.appendTag("br", NO_ATTRIBUTES);
            //
            document.appendTag("b", NO_ATTRIBUTES);
            document.insertData(presenter.f.toString());
            document.closeLatestTag();
            document.appendTag("br", NO_ATTRIBUTES);
            //
            document.appendTag("b", NO_ATTRIBUTES);
            document.insertData(presenter.l.toString());
            document.closeLatestTag();
            document.appendTag("br", NO_ATTRIBUTES);
            //
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
