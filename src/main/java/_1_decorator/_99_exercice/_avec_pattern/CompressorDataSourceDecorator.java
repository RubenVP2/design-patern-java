package _1_decorator._99_exercice._avec_pattern;

import _1_decorator._99_exercice.Compressor;
import _1_decorator._99_exercice.DataSource;

public class CompressorDataSourceDecorator extends DataSourceDecorator {
    private Compressor compressor;

    CompressorDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
        compressor = new Compressor();
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(compressor.compress(data));
    }

    @Override
    public String readData() {
        return compressor.decompress(dataSource.readData());
    }
}
