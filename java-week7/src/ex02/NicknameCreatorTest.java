package ex02;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NicknameCreatorTest {

    NicknameCreator nicknameCreator = new NicknameCreator();

    @Test
    void testCreateNickname(){
        String hause = nicknameCreator.createNickname("hause");
        Assertions.assertEquals("ha",hause);

    }
}