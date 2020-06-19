


class c19687456 {
public MyHelperClass IOUtils;
	public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }

    public void testReadPerMemberSixSmall() throws IOException {
        MyHelperClass sixsmall_gz = new MyHelperClass();
        GZIPMembersInputStream gzin = new GZIPMembersInputStream(new ByteArrayInputStream(sixsmall_gz));
        gzin.setEofEachMember(true);
        for (int i = 0; i < 3; i++) {
            MyHelperClass IOUtils = new MyHelperClass();
            int count2 =(int)(Object) IOUtils.copy(gzin, new NullOutputStream());
            assertEquals("wrong 1-byte member count", 1, count2);
            gzin.nextMember();
            int count3 =(int)(Object) IOUtils.copy(gzin, new NullOutputStream());
            assertEquals("wrong 5-byte member count", 5, count3);
            gzin.nextMember();
        }
        int countEnd =(int)(Object) IOUtils.copy(gzin, new NullOutputStream());
        assertEquals("wrong eof count", 0, countEnd);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(GZIPMembersInputStream o0, NullOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GZIPMembersInputStream {

GZIPMembersInputStream(ByteArrayInputStream o0){}
	GZIPMembersInputStream(){}
	public MyHelperClass nextMember(){ return null; }
	public MyHelperClass setEofEachMember(boolean o0){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class NullOutputStream {

}
