import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    void getRe() {
        assertEquals(2, new ComplexNumber(2, 2).getRe());
    }

    @Test
    void getIm() {
        assertEquals(2, new ComplexNumber(2, 2).getIm());
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}