package _1_decorator._99_exercice._avec_pattern;

import _1_decorator._99_exercice.DataSource;
import _1_decorator._99_exercice.FileDataSource;

public class NoneDataSourceDecorator implements DataSource {

    protected FileDataSource fileDataSource;

    NoneDataSourceDecorator(FileDataSource fileDataSource) {
        this.fileDataSource = fileDataSource;
    }

    @Override
    public void writeData(String data) {
        fileDataSource.writeData(data);
    }

    @Override
    public String readData() {
        return fileDataSource.readData();
    }
}
