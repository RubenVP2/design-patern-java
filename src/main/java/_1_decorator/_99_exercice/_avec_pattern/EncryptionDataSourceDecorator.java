package _1_decorator._99_exercice._avec_pattern;

import _1_decorator._99_exercice.DataSource;
import _1_decorator._99_exercice.Encryptor;

public class EncryptionDataSourceDecorator extends DataSourceDecorator {
    private Encryptor encryptor;

    EncryptionDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
        encryptor = new Encryptor();
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(encryptor.encode(data));
    }

    @Override
    public String readData() {
        return encryptor.decode(dataSource.readData());
    }
}
