import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18790182 {
public MyHelperClass Object;
public MyHelperClass assertNull(MyHelperClass o0){ return null; }
	public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass assertEquals(String o0, String o1){ return null; }

    public void testAddingEntries() throws Throwable, Exception {
        DiskCache c = new DiskCache();
        {
            MyHelperClass rootFolder = new MyHelperClass();
            c.setRoot(rootFolder.getAbsolutePath());
            c.setHtmlExtension("htm");
            c.setPropertiesExtension("txt");
            assertEquals("htm",(String)(Object) c.getHtmlExtension());
            assertEquals("txt",(String)(Object) c.getPropertiesExtension());
//            MyHelperClass rootFolder = new MyHelperClass();
            assertEquals((String)(Object)rootFolder.getAbsolutePath(),(String)(Object) c.getRoot());
        }
        String key1 = "cat1/key1";
        String key2 = "cat1/key2";
        try {
            try {
                {
                    c.removeCacheEntry(key1, null);
                    CacheItem i =(CacheItem)(Object) c.getOrCreateCacheEntry(key1);
                    assertNull(i.getEncoding());
                    assertEquals((String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(long)(Object)(String)(Object)-1L, i.getLastModified());
                    assertEquals((String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(int)(Object)(String)(Object)-1, i.getTranslationCount());
                    assertFalse(i.isCached());
                    assertNull(i.getHeaders());
                    i.setLastModified(300005L);
                    i.setTranslationCount(10);
                    i.setEncoding("ISO-8859-7");
                    i.setHeader(new ResponseHeaderImpl("Test2", new String[] { "Value3", "Value4" }));
                    i.setHeader(new ResponseHeaderImpl("Test1", new String[] { "Value1", "Value2" }));
                    byte[] greekTextBytes = new byte[] { -57, -20, -27, -15, -34, -13, -23, -31, 32, -48, -17, -21, -23, -12, -23, -22, -34, 32, -59, -10, -25, -20, -27, -15, -33, -28, -31, 32, -60, -23, -31, -19, -35, -20, -27, -12, -31, -23, 32, -22, -31, -24, -25, -20, -27, -15, -23, -19, -36, 32, -60, -39, -47, -59, -63, -51, 32, -13, -12, -17, 32, -28, -33, -22, -12, -11, -17, 32, -13, -11, -29, -22, -17, -23, -19, -7, -19, -23, -2, -19, 32, -12, -25, -14, 32, -56, -27, -13, -13, -31, -21, -17, -19, -33, -22, -25, -14 };
                    String greekText = new String(greekTextBytes, "ISO-8859-7");
                    {
                        InputStream input = new ByteArrayInputStream(greekTextBytes);
                        try {
                            i.setContentAsStream(input);
                        } finally {
                            input.close();
                        }
                    }
                    assertEquals("ISO-8859-7",(String)(Object) i.getEncoding());
                    assertEquals((String)(Object)300005L,(String)(Object) i.getLastModified());
                    assertEquals((String)(Object)10,(String)(Object) i.getTranslationCount());
                    assertFalse(i.isCached());
                    i.updateAfterAllContentUpdated(null, null);
                    {
                        assertEquals((String)(Object)3,(String)(Object) i.getHeaders().size());
                        int ii = 0;
                        for (ResponseHeader h :(ResponseHeader[])(Object) (Object[])(Object)i.getHeaders()) {
                            ii++;
                            if (ii == 1) {
                                assertEquals("Content-Length",(String)(Object) h.getName());
                                assertEquals("[97]", Arrays.toString((long[])(Object)h.getValues()));
                            } else if (ii == 2) {
                                assertEquals("Test1",(String)(Object) h.getName());
                                assertEquals("[Value1, Value2]", Arrays.toString((long[])(Object)h.getValues()));
                            } else if (ii == 3) {
                                assertEquals("Test2",(String)(Object) h.getName());
                                assertEquals("[Value3, Value4]", Arrays.toString((long[])(Object)h.getValues()));
                            }
                        }
                    }
                    c.storeInCache(key1, i);
                    assertEquals("ISO-8859-7",(String)(Object) i.getEncoding());
                    assertEquals((String)(Object)300005L,(String)(Object) i.getLastModified());
                    assertEquals((String)(Object)10,(String)(Object) i.getTranslationCount());
                    assertTrue(i.isCached());
                    {
                        InputStream input =(InputStream)(Object) i.getContentAsStream();
                        StringWriter w = new StringWriter();
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(input, w, "ISO-8859-7");
//                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(input);
//                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(w);
                        assertEquals(greekText, w.toString());
                    }
                }
                {
                    c.removeCacheEntry(key2, null);
                    CacheItem i =(CacheItem)(Object) c.getOrCreateCacheEntry(key2);
                    assertNull(i.getEncoding());
                    assertEquals((String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(long)(Object)(String)(Object)-1L, i.getLastModified());
                    assertEquals((String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(int)(Object)(String)(Object)-1, i.getTranslationCount());
                    assertFalse(i.isCached());
                    assertNull(i.getHeaders());
                    i.setLastModified(350000L);
                    i.setTranslationCount(11);
                    i.setEncoding("ISO-8859-1");
                    i.setHeader(new ResponseHeaderImpl("Test3", new String[] { "Value3", "Value4" }));
                    i.setHeader(new ResponseHeaderImpl("Test4", new String[] { "Value1" }));
                    String englishText = "Hello this is another example";
                    {
                        InputStream input = new ByteArrayInputStream(englishText.getBytes("ISO-8859-1"));
                        try {
                            i.setContentAsStream(input);
                        } finally {
                            input.close();
                        }
                    }
                    assertEquals("ISO-8859-1",(String)(Object) i.getEncoding());
                    assertEquals((String)(Object)350000L,(String)(Object) i.getLastModified());
                    assertEquals((String)(Object)11,(String)(Object) i.getTranslationCount());
                    assertFalse(i.isCached());
                    i.updateAfterAllContentUpdated(null, null);
                    {
                        assertEquals((String)(Object)3,(String)(Object) i.getHeaders().size());
                        int ii = 0;
                        for (ResponseHeader h :(ResponseHeader[])(Object) (Object[])(Object)i.getHeaders()) {
                            ii++;
                            if (ii == 1) {
                                assertEquals("Content-Length",(String)(Object) h.getName());
                                assertEquals("[29]", Arrays.toString((long[])(Object)h.getValues()));
                            } else if (ii == 2) {
                                assertEquals("Test3",(String)(Object) h.getName());
                                assertEquals("[Value3, Value4]", Arrays.toString((long[])(Object)h.getValues()));
                            } else if (ii == 3) {
                                assertEquals("Test4",(String)(Object) h.getName());
                                assertEquals("[Value1]", Arrays.toString((long[])(Object)h.getValues()));
                            }
                        }
                    }
                    c.storeInCache(key2, i);
                    assertEquals("ISO-8859-1",(String)(Object) i.getEncoding());
                    assertEquals((String)(Object)350000L,(String)(Object) i.getLastModified());
                    assertEquals((String)(Object)11,(String)(Object) i.getTranslationCount());
                    assertTrue(i.isCached());
                    {
                        InputStream input =(InputStream)(Object) i.getContentAsStream();
                        StringWriter w = new StringWriter();
                        IOUtils.copy(input, w, "ISO-8859-1");
                        IOUtils.closeQuietly(input);
                        IOUtils.closeQuietly(w);
                        assertEquals(englishText, w.toString());
                    }
                }
                {
                    CacheItem i =(CacheItem)(Object) c.getOrCreateCacheEntry(key1);
                    assertEquals("ISO-8859-7",(String)(Object) i.getEncoding());
                    assertEquals((String)(Object)300005L,(String)(Object) i.getLastModified());
                    assertEquals((String)(Object)10,(String)(Object) i.getTranslationCount());
                    assertTrue(i.isCached());
                    {
                        assertEquals((String)(Object)3,(String)(Object) i.getHeaders().size());
                        int ii = 0;
                        for (ResponseHeader h :(ResponseHeader[])(Object) (Object[])(Object)i.getHeaders()) {
                            ii++;
                            if (ii == 1) {
                                assertEquals("Content-Length",(String)(Object) h.getName());
                                assertEquals("[97]", Arrays.toString((long[])(Object)h.getValues()));
                            } else if (ii == 2) {
                                assertEquals("Test1",(String)(Object) h.getName());
                                assertEquals("[Value1, Value2]", Arrays.toString((long[])(Object)h.getValues()));
                            } else if (ii == 3) {
                                assertEquals("Test2",(String)(Object) h.getName());
                                assertEquals("[Value3, Value4]", Arrays.toString((long[])(Object)h.getValues()));
                            }
                        }
                    }
                    byte[] greekTextBytes = new byte[] { -57, -20, -27, -15, -34, -13, -23, -31, 32, -48, -17, -21, -23, -12, -23, -22, -34, 32, -59, -10, -25, -20, -27, -15, -33, -28, -31, 32, -60, -23, -31, -19, -35, -20, -27, -12, -31, -23, 32, -22, -31, -24, -25, -20, -27, -15, -23, -19, -36, 32, -60, -39, -47, -59, -63, -51, 32, -13, -12, -17, 32, -28, -33, -22, -12, -11, -17, 32, -13, -11, -29, -22, -17, -23, -19, -7, -19, -23, -2, -19, 32, -12, -25, -14, 32, -56, -27, -13, -13, -31, -21, -17, -19, -33, -22, -25, -14 };
                    String greekText = new String(greekTextBytes, "ISO-8859-7");
                    {
                        InputStream input =(InputStream)(Object) i.getContentAsStream();
                        StringWriter w = new StringWriter();
                        IOUtils.copy(input, w, "ISO-8859-7");
                        IOUtils.closeQuietly(input);
                        IOUtils.closeQuietly(w);
                        assertEquals(greekText, w.toString());
                    }
                }
                {
                    c.removeCacheEntry(key1, null);
                    CacheItem i =(CacheItem)(Object) c.getOrCreateCacheEntry(key1);
                    assertNull(i.getEncoding());
                    assertEquals((String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(long)(Object)(String)(Object)-1L, i.getLastModified());
                    assertEquals((String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(int)(Object)(String)(Object)-1, i.getTranslationCount());
                    assertFalse(i.isCached());
                    assertNull(i.getHeaders());
                }
            } finally {
                c.removeCacheEntry(key1, null);
            }
        } finally {
            c.removeCacheEntry(key2, null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(StringWriter o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class DiskCache {

public MyHelperClass storeInCache(String o0, CacheItem o1){ return null; }
	public MyHelperClass getHtmlExtension(){ return null; }
	public MyHelperClass setPropertiesExtension(String o0){ return null; }
	public MyHelperClass getPropertiesExtension(){ return null; }
	public MyHelperClass getOrCreateCacheEntry(String o0){ return null; }
	public MyHelperClass setRoot(MyHelperClass o0){ return null; }
	public MyHelperClass removeCacheEntry(String o0, Object o1){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass setHtmlExtension(String o0){ return null; }}

class CacheItem {

public MyHelperClass setLastModified(long o0){ return null; }
	public MyHelperClass setEncoding(String o0){ return null; }
	public MyHelperClass getContentAsStream(){ return null; }
	public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass updateAfterAllContentUpdated(Object o0, Object o1){ return null; }
	public MyHelperClass setHeader(ResponseHeaderImpl o0){ return null; }
	public MyHelperClass getHeaders(){ return null; }
	public MyHelperClass setContentAsStream(InputStream o0){ return null; }
	public MyHelperClass setTranslationCount(int o0){ return null; }
	public MyHelperClass isCached(){ return null; }
	public MyHelperClass getTranslationCount(){ return null; }}

class ResponseHeaderImpl {

ResponseHeaderImpl(String o0, String[] o1){}
	ResponseHeaderImpl(){}}

class ResponseHeader {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValues(){ return null; }}
