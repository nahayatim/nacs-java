package robomime;

import java.util.Arrays;
import java.util.List;

public class Decryptions {

    private  static List<Decryptor> decryptors = Arrays.asList(
            new AndDecryptor(), new ExclamationDecryptor(), new HashDecryptor());

    public static List<Decryptor> getDecryptors() {
        return decryptors;
    }
}
