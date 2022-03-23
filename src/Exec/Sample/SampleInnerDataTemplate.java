package Exec.Sample;

import Document.ConcreteWebDocument;
import Document.WebDocument;
import Style.Style;
import Style.ObjectStyle;
import Tag.StandardTags.Format.BoldTag;
import Template.AbstractDocumentTemplate;

public class SampleInnerDataTemplate extends AbstractDocumentTemplate<SampleData> {
    @Override
    public WebDocument build(WebDocument document, SampleData data) {
        SampleDataPresenter presenter = data.presenter;
        for(int i=0; i<10; i++) {
            document.appendTag("b");
            document.insertData(String.valueOf(i));
            document.closeTag();
            document.appendTag("br");
        }
        //
        document.appendTag("b")
                .insertData(presenter.s)
                .closeTag();
        document.appendTag("br");
        //
        document.appendTag("b")
                .insertData(presenter.d.toString())
                .closeTag();
        document.appendTag("br");
        //
        document.appendTag("b")
                .insertData(presenter.i.toString())
                .closeTag();
        document.appendTag("br");
        //
        document.appendTag("b")
                .insertData(presenter.b.toString())
                .closeTag();
        document.appendTag("br");
        //
        if(!presenter.s.equals("end")) {
            SampleDataPresenter sp = new SampleDataPresenter(12, "end", 0f, false, 0L, 0.0);
            SampleData p = new SampleData(sp);
            document.appendComponent(new SampleTemplate(), p);
        }
        //
        document.appendTag("b")
                .insertData(presenter.f.toString())
                .closeTag();
        document.appendTag("br");
        //
        Style boldStyle = new ObjectStyle()
                .addStyle("color", "blue")
                .addStyle("border", "1px dashed red");
        document.appendTag(  new BoldTag().setStyle(boldStyle))
                .insertData(presenter.l.toString())
                .closeTag();
        document.appendTag("br");
        return document;
    }

    @Override
    public WebDocument build(SampleData data) {
        WebDocument document = new ConcreteWebDocument();
        return build(document, data);
    }
}
