package robomime;

import java.util.List;

public class Sensor {

    public String decrypt(String line) {
        List<Decryptor> decryptors = Decryptions.getDecryptors();
        for (Decryptor decryptor : decryptors) {
           if (decryptor.isContain(line)){
               String decrypt = decryptor.decrypt(line);
                return decrypt;
           }
        }
        return line;
    }
//
//    public List<String> decrypt(List<String> lines) {
//        for (String line : lines) {
//            String decrypted = .decrypt(line);
//            decrypt.add(decrypted);
//
//        }
}
