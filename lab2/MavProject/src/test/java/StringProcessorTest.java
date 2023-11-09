import org.junit.Test;

import static org.junit.Assert.*;


public class StringProcessorTest {
    @Test
    public void copyesTest() {
        StringProcessor st = new StringProcessor();
        assertEquals("arar", st.copyes("ar", 2));
        assertEquals("   ", st.copyes(" ", 3));
    }

    @Test
    public void secondTest() {
        StringProcessor st = new StringProcessor();
        assertEquals(2, st.second("aaa", "aa"));
        assertEquals(0, st.second("aaa", ""));
        assertEquals(3, st.second("aabaaa", "aa"));
        assertEquals(1, st.second("", ""));
        assertEquals(3, st.second("aardfsa", "a"));

    }

    @Test
    public void replace123Test() {
        StringProcessor st = new StringProcessor();
        assertEquals("одинодинтри45два", st.replace123("113452"));
        assertEquals("00000", st.replace123("00000"));
        assertEquals("", st.replace123(""));
        assertEquals("один два", st.replace123("1 2"));
    }

    @Test
    public void everSecondTest() {
        StringProcessor st = new StringProcessor();
        assertEquals("aaaaa", st.everSecond(new StringBuilder("ababababab")));
        assertEquals("13579", st.everSecond(new StringBuilder("123456789")).toString());
        assertEquals("", st.everSecond(new StringBuilder("")).toString());
        assertEquals("  ", st.everSecond(new StringBuilder("   ")).toString());
    }

}
