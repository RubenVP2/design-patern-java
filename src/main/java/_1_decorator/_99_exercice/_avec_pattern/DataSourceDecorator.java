package _1_decorator._99_exercice._avec_pattern;

import _1_decorator._99_exercice.DataSource;

public class DataSourceDecorator implements DataSource {

    protected DataSource dataSource;

    DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
