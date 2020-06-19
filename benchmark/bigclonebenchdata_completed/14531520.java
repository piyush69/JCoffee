
import java.io.UncheckedIOException;


class c14531520 {

    public byte[] loadClassFirst(final String className) {
        if (className.startsWith("com.sun.sgs.impl.service.transaction.TransactionCoordinatorImpl")) {
            String resource = null;
            if (className.equals("com.sun.sgs.impl.service.transaction.TransactionCoordinatorImpl")) {
                resource = "com/sun/sgs/impl/service/transaction/TransactionCoordinatorImpl.class.bin";
            }
            if (resource != null) {
                final URL url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(resource);
                if (url != null) {
                    try {
                        MyHelperClass StreamUtil = new MyHelperClass();
                        return(byte[])(Object) StreamUtil.read(url.openStream());
                    } catch (final UncheckedIOException e) {
                    }
                }
                throw new IllegalStateException("Unable to load binary class");
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
