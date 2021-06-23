package _1_decorator._99_exercice;


public class Demo {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");

        Encryptor encryptor = new Encryptor();
        Compressor compressor = new Compressor();
        String encrypted = encryptor.encode(salaryRecords);
        String encryptedAndCompressed = compressor.compress(encrypted);
        fileDataSource.writeData(encryptedAndCompressed);
    }
}