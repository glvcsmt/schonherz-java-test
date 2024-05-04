package sec.schonherz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTests {

    @Test
    @DisplayName("MyClassTeszt")
    void MyClassTeszt() {
        MyClass mc = new MyClass();
        assertEquals(mc.szorzat(2,5), 10);
    }

    @Test
    public void testCaesarCode(){
        assertEquals("de", Main.caesarCode("ab", 3));
        assertEquals("ef", Main.caesarCode("bc", 3));
        assertEquals("d", Main.caesarCode("a", 3));
        assertEquals("c", Main.caesarCode("z", 3));
        assertEquals("hi", Main.caesarCode("ab", 7));
    }

}