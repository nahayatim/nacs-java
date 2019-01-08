package robomime;

public class ExclamationDecryptor implements Decryptor {

    @Override
    public Boolean isContain(String line) {
        return line.contains("!");
    }

    @Override
    public String decrypt(String line) {
       return line.replace("!","");
    }
}
