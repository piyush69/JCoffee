import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19687458 {
public MyHelperClass noise32k_gz;
	public MyHelperClass a_gz;
	public MyHelperClass IOUtils;
	public MyHelperClass noise1k_gz;
	public MyHelperClass hello_gz;
	public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }

    public void testMemberSeek() throws Throwable, IOException {
        MyHelperClass allfour_gz = new MyHelperClass();
        GZIPMembersInputStream gzin = new GZIPMembersInputStream(new ByteArrayInputStream(allfour_gz));
        gzin.setEofEachMember(true);
        MyHelperClass noise1k_gz = new MyHelperClass();
        gzin.compressedSeek(noise1k_gz.length + noise32k_gz.length);
        MyHelperClass IOUtils = new MyHelperClass();
        int count2 = IOUtils.copy(gzin, new NullOutputStream());
        assertEquals("wrong 1-byte member count", 1, count2);
        assertEquals("wrong Member2 start", noise1k_gz.length + noise32k_gz.length, gzin.getCurrentMemberStart());
        assertEquals("wrong Member2 end", noise1k_gz.length + noise32k_gz.length + a_gz.length, gzin.getCurrentMemberEnd());
        gzin.nextMember();
        int count3 = IOUtils.copy(gzin, new NullOutputStream());
        assertEquals("wrong 5-byte member count", 5, count3);
        assertEquals("wrong Member3 start", noise1k_gz.length + noise32k_gz.length + a_gz.length, gzin.getCurrentMemberStart());
        assertEquals("wrong Member3 end", noise1k_gz.length + noise32k_gz.length + a_gz.length + hello_gz.length, gzin.getCurrentMemberEnd());
        gzin.nextMember();
        int countEnd = IOUtils.copy(gzin, new NullOutputStream());
        assertEquals("wrong eof count", 0, countEnd);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GZIPMembersInputStream {

}

class NullOutputStream {

}
