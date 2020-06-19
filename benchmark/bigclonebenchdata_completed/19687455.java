import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19687455 {
public MyHelperClass noise32k_gz;
	public MyHelperClass a_gz;
	public MyHelperClass IOUtils;
	public MyHelperClass noise1k_gz;
	public MyHelperClass hello_gz;
	public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }

    public void testReadPerMemberAllFour() throws Throwable, IOException {
        MyHelperClass allfour_gz = new MyHelperClass();
        GZIPMembersInputStream gzin = new GZIPMembersInputStream(new ByteArrayInputStream(allfour_gz));
        gzin.setEofEachMember(true);
        MyHelperClass IOUtils = new MyHelperClass();
        int count0 = IOUtils.copy(gzin, new NullOutputStream());
        assertEquals("wrong 1k member count", 1024, count0);
        assertEquals("wrong member number", 0, gzin.getMemberNumber());
        assertEquals("wrong member0 start", 0, gzin.getCurrentMemberStart());
        assertEquals("wrong member0 end", noise1k_gz.length, gzin.getCurrentMemberEnd());
        gzin.nextMember();
        int count1 = IOUtils.copy(gzin, new NullOutputStream());
        assertEquals("wrong 32k member count", (32 * 1024), count1);
        assertEquals("wrong member number", 1, gzin.getMemberNumber());
        assertEquals("wrong member1 start", noise1k_gz.length, gzin.getCurrentMemberStart());
        assertEquals("wrong member1 end", noise1k_gz.length + noise32k_gz.length, gzin.getCurrentMemberEnd());
        gzin.nextMember();
        int count2 = IOUtils.copy(gzin, new NullOutputStream());
        assertEquals("wrong 1-byte member count", 1, count2);
        assertEquals("wrong member number", 2, gzin.getMemberNumber());
        assertEquals("wrong member2 start", noise1k_gz.length + noise32k_gz.length, gzin.getCurrentMemberStart());
        assertEquals("wrong member2 end", noise1k_gz.length + noise32k_gz.length + a_gz.length, gzin.getCurrentMemberEnd());
        gzin.nextMember();
        int count3 = IOUtils.copy(gzin, new NullOutputStream());
        assertEquals("wrong 5-byte member count", 5, count3);
        assertEquals("wrong member number", 3, gzin.getMemberNumber());
        assertEquals("wrong member3 start", noise1k_gz.length + noise32k_gz.length + a_gz.length, gzin.getCurrentMemberStart());
        assertEquals("wrong member3 end", noise1k_gz.length + noise32k_gz.length + a_gz.length + hello_gz.length, gzin.getCurrentMemberEnd());
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
