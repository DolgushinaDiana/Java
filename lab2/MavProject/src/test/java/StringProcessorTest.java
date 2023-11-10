import org.junit.Test;

import static org.junit.Assert.*;


public class StringProcessorTest {
    @Test(expected = Exception.class)
    public void copyesTest() {
        StringProcessor st = new StringProcessor();
        assertEquals("arar", st.copyes("ar", 2));
        assertEquals("   ", st.copyes(" ", 3));
        assertEquals("", st.copyes("a", 0));
        assertEquals("отрицательное число", st.copyes("aa", -1));
    }

    @Test(expected = Exception.class)
    public void secondTest() {
        StringProcessor st = new StringProcessor();
        StringProcessor s=null;
        assertEquals(2, st.second("aaa", "aa"));
        assertEquals(3, st.second("aabaaa", "aa"));
        assertEquals(1, st.second("", ""));
        assertEquals(3, st.second("aardfsa", "a"));
        assertEquals("link is null", s.second("aardfsa", "a"));
        assertEquals("пустая строка", st.second("aaa", ""));

    }

    @Test(expected = Exception.class)
    public void replace123Test() {
        StringProcessor st = null;
        String s=null;
        assertEquals("одинодинтри45два", new StringProcessor().replace123("113452"));
        assertEquals("00000", new StringProcessor().replace123("00000"));
        assertEquals("", new StringProcessor().replace123(""));
        assertEquals("один два", new StringProcessor().replace123("1 2"));
        assertEquals("link is null", st.replace123(s));
    }

    @Test(expected = Exception.class)
    public void everSecondTest() {
        StringProcessor st = new StringProcessor();
        StringBuilder s=null;
        assertEquals("aaaaa", st.everSecond(new StringBuilder("ababababab")));
        assertEquals("13579", st.everSecond(new StringBuilder("123456789")));
        assertEquals("", st.everSecond(new StringBuilder("")));
        assertEquals("  ", st.everSecond(new StringBuilder("   ")));
        assertEquals("null", st.everSecond(s));
    }

}
