package _1_decorator._99_exercice._avec_pattern;


import _1_decorator._99_exercice.DataSource;
import _1_decorator._99_exercice.FileDataSource;
import _1_decorator._99_exercice._avec_pattern.CompressorDataSourceDecorator;
import _1_decorator._99_exercice._avec_pattern.EncryptionDataSourceDecorator;
import _1_decorator._99_exercice._avec_pattern.NoneDataSourceDecorator;

public class DemoAvecDecorator {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");

        DataSource dataSource = new EncryptionDataSourceDecorator(new CompressorDataSourceDecorator(new NoneDataSourceDecorator(fileDataSource)));
        dataSource.writeData(salaryRecords);
        System.out.println("# 2 : " + dataSource.readData() + " #");
    }
}