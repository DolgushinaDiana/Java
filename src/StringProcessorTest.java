import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringProcessorTest {
    @Test
    public void firstTest(){
        StringProcessor st=new StringProcessor();
        assertEquals("arar",st.first("ar",2));
        assertEquals("   ",st.first(" ",3));
    }
    @Test
    public void secondTest(){
        StringProcessor st=new StringProcessor();
        assertEquals(2,st.second("aaa","aa"));
        assertEquals(0,st.second("aaa",""));
        assertEquals(3,st.second("aabaaa","aa"));
        assertEquals(1,st.second("",""));
        assertEquals(3,st.second("aardfsa","a"));
    }
    @Test
    public void thirdTest(){
        StringProcessor st=new StringProcessor();
        assertEquals("одинодинтри45два",st.third("113452"));
        assertEquals("00000",st.third("00000"));
        assertEquals("",st.third(""));
    }

}
