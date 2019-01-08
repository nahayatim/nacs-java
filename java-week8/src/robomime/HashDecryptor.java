package robomime;

public class HashDecryptor implements Decryptor {

    @Override
    public Boolean isContain(String line) {
        return line.contains("#");
    }

    @Override
    public String decrypt(String line) {
        line = line.replace("#", "");
        if (line.contains("robomime")){
            line = line.replace("robomime", "");
        }
        return line;

    }
}
