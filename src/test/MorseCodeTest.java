package test;

import de.berlin.Input_Output;
import org.junit.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by Stolle Fabian on 09.01.2017.
 */
public class MorseCodeTest {
    private Input_Output checkMorseCode;

    @Before
    public  void setUp() throws Exception {
        checkMorseCode = new Input_Output();
    }
    @After
    public   void tearDown() throws Exception{
        checkMorseCode = null;
    }
    @Test
    public void testToMorsecodeAsciiToMorse () {assertTrue(".-_.-.._.-.._._//_--_._.._-._._//_._-._-_..._-.-._...._._-._".equals(checkMorseCode.getMorseCode("Alle meine Entschen")));}
    @Test
    public void testToMorsecodeMorseToAscii () {assertTrue("heyho_lets_go".equals(checkMorseCode.getAsciiCode("...._._-.--_...._---_//_.-.._._-_..._//_--._---_")));}
}
