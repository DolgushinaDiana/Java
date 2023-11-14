import org.junit.Test;

import static org.junit.Assert.*;


public class StringProcessorTest {
    @Test(expected = Exception.class)
    public void copyesTest() {
        assertEquals("arar", StringProcessor.copyes("ar", 2));
        assertEquals("   ", StringProcessor.copyes(" ", 3));
        assertEquals("", StringProcessor.copyes("a", 0));
        assertEquals("отрицательное число", StringProcessor.copyes("aa", -1));
        assertEquals("link is null", StringProcessor.copyes(null, 5));
    }

    @Test()
    public void secondTest() {
        assertEquals(3, StringProcessor.second("abababb", "ab"));
        assertEquals(2, StringProcessor.second("aaa", "aa"));
        assertEquals(3, StringProcessor.second("aabaaa", "aa"));
        assertEquals(1, StringProcessor.second("", ""));
        assertEquals(3, StringProcessor.second("aardfsa", "a"));
        assertThrows(NullPointerException.class, () -> StringProcessor.second(null, "a"));
//        assertEquals("пустая строка", StringProcessor.second("aaa", ""));

    }

    @Test(expected = NullPointerException.class)
    public void secondTaskException() {
        StringProcessor.second(null, "a");
    }

    @Test(expected = NullPointerException.class)
    public void secondTaskException2() {
        StringProcessor.second("aaa", "");
    }


    @Test(expected = Exception.class)
    public void replace123Test() {

        assertEquals("одинодинтри45два", StringProcessor.replace123("113452"));
        assertEquals("00000", StringProcessor.replace123("00000"));
        assertEquals("", StringProcessor.replace123(""));
        assertEquals("один два", StringProcessor.replace123("1 2"));
        assertEquals("4657 7 ", StringProcessor.replace123("4657 7 "));
        assertEquals("link is null", StringProcessor.replace123(null));
    }

    @Test(expected = Exception.class)
    public void everSecondTest() {
        assertEquals("aaaaa", StringProcessor.everSecond(new StringBuilder("ababababab")));
        assertEquals("13579", StringProcessor.everSecond(new StringBuilder("123456789")));
        assertEquals("Java", StringProcessor.everSecond(new StringBuilder("Joacvda3")));
        assertEquals("", StringProcessor.everSecond(new StringBuilder()));
        assertEquals("  ", StringProcessor.everSecond(new StringBuilder("   ")));
        assertEquals("link is null", StringProcessor.everSecond(null));
    }

}
