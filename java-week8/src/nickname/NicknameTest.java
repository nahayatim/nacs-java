package nickname;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NicknameTest {

    private Nickname nickname= new Nickname();

    @Test
    void nickname() {
        nickname.nickname(new ArrayList<>(),name->name.substring(0,name.length()/2));
        nickname.nickname(new ArrayList<>(),name->name.toUpperCase()+"Yo.");
    }
}