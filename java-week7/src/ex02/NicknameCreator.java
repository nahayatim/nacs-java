package ex02;

public class NicknameCreator {

    public String createNickname(String word){
        Integer length = word.length();
         length = length/2;
        String halfOfWord = word.substring(0, length);
        return halfOfWord;
    }
}
