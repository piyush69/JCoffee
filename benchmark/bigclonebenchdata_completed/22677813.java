
import java.io.UncheckedIOException;


class c22677813 {
public MyHelperClass additionalWhitelist;
public MyHelperClass IOUtils;
	public MyHelperClass getResourceAsStream(String o0){ return null; }
	public MyHelperClass defineClass(String o0, byte[] o1, int o2, int o3){ return null; }

//        @Override
        public Class<?> loadClass(final String name) throws ClassNotFoundException {
            MyHelperClass StringUtils = new MyHelperClass();
            final String baseName =(String)(Object) StringUtils.substringBefore(name, "$");
            MyHelperClass whitelist = new MyHelperClass();
            if (baseName.startsWith("java") && !(Boolean)(Object)whitelist.contains(baseName) && !(Boolean)(Object)additionalWhitelist.contains(baseName)) {
                throw new NoClassDefFoundError(name + " is a restricted class for GAE");
            }
            if (!name.startsWith("com.gargoylesoftware")) {
                return this.loadClass(name);
            }
            this.loadClass(name);
            final InputStream is =(InputStream)(Object) getResourceAsStream(name.replaceAll("\\.", "/") + ".class");
            final ByteArrayOutputStream bos = new ByteArrayOutputStream();
            try {
                IOUtils.copy(is, bos);
                final byte[] bytes =(byte[])(Object) bos.toByteArray();
                return(Class<?>)(Object) defineClass(name, bytes, 0, bytes.length);
            } catch (final UncheckedIOException e) {
                throw new RuntimeException(e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass substringBefore(String o0, String o1){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class InputStream {

}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
