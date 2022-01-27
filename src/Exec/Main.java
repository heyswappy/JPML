package Exec;

import Document.WebDocument;
import Exec.Sample.SampleData;
import Exec.Sample.SampleDataPresenter;
import Exec.Sample.SampleTemplate;
import Template.AbstractDocumentTemplate;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("HelloWorld");
        // init
        SampleDataPresenter dp = new SampleDataPresenter(1, "s", 0f, true, 0L, Double.parseDouble("0"));
        SampleData d = new SampleData(dp);
        AbstractDocumentTemplate<SampleData> t = new SampleTemplate();
        // build
        WebDocument document = t.build(d);
        // output
        String response = document.build();
        System.out.println(response);
    }
}
