package Exec;

import Document.ConcreteWebDocument;
import Document.WebDocument;

import java.util.HashMap;

import static Constants.JPMLConstants.NO_ATTRIBUTES;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("HelloWorld");
        // init
        WebDocument doc = new ConcreteWebDocument();

        // -------------------------------------------

        doc.appendTag("html", NO_ATTRIBUTES);
        {
            doc.appendTag("head", NO_ATTRIBUTES);
            doc.closeLatestTag();
            doc.appendTag("body", NO_ATTRIBUTES);
            for(int i=0; i<10; i++) {
                doc.appendTag("b", NO_ATTRIBUTES);
                doc.insertData(String.valueOf(i));
                doc.closeLatestTag();
                doc.appendTag("br", NO_ATTRIBUTES);
            }
            doc.closeLatestTag();
        }

        doc.closeLatestTag();

        // -------------------------------------------

        // build
        String docBuilder = doc.build();

        System.out.println(docBuilder);
    }
}
