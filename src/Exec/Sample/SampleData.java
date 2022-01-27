package Exec.Sample;

import DocumentData.AbstractDocumentData;

public class SampleData extends AbstractDocumentData {
    public final SampleDataPresenter presenter;

    public SampleData(SampleDataPresenter presenter) {
        this.presenter = presenter;
    }
}
