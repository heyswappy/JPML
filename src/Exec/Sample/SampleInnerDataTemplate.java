package Exec.Sample;

import Document.ConcreteWebDocument;
import Document.WebDocument;
import Style.Style;
import Style.ConcreteStyle;
import Template.AbstractDocumentTemplate;

public class SampleInnerDataTemplate extends AbstractDocumentTemplate<SampleData> {
    @Override
    public WebDocument build(WebDocument document, SampleData data) {
        SampleDataPresenter presenter = data.presenter;
        for(int i=0; i<10; i++) {
            document.appendTag("b");
            document.insertData(String.valueOf(i));
            document.closeLatestTag();
            document.appendTag("br");
        }
        //
        document.appendTag("b");
        document.insertData(presenter.s);
        document.closeLatestTag();
        document.appendTag("br");
        //
        document.appendTag("b");
        document.insertData(presenter.d.toString());
        document.closeLatestTag();
        document.appendTag("br");
        //
        document.appendTag("b");
        document.insertData(presenter.i.toString());
        document.closeLatestTag();
        document.appendTag("br");
        //
        document.appendTag("b");
        document.insertData(presenter.b.toString());
        document.closeLatestTag();
        document.appendTag("br");
        //
        if(!presenter.s.equals("end")) {
            SampleDataPresenter sp = new SampleDataPresenter(12, "end", 0f, false, 0L, 0.0);
            SampleData p = new SampleData(sp);
            document.appendComponent(new SampleTemplate(), p);
        }
        //
        document.appendTag("b");
        document.insertData(presenter.f.toString());
        document.closeLatestTag();
        document.appendTag("br");
        //
        Style t = new ConcreteStyle();
        t.addStyle("color", "blue");
        t.addStyle("border", "1px dashed red");
        document.appendTag("b", t);
        document.insertData(presenter.l.toString());
        document.closeLatestTag();
        document.appendTag("br");

        return document;
    }

    @Override
    public WebDocument build(SampleData data) {
        WebDocument document = new ConcreteWebDocument();
        return build(document, data);
    }
}
