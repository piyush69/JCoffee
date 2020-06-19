
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16788962 {
public MyHelperClass LOG;

    protected InputStream[] getInputStreams(List files) throws ResourceException {
        InputStream[] result = new InputStream[(int)(Object)files.size()];
        int i = 0;
        try {
            for (URL url :(URL[])(Object) (Object[])(Object)files) {
                result[i++] =(InputStream)(Object) url.openStream();
            }
        } catch (UncheckedIOException e) {
            for (int j = 0; j < i; j++) {
                try {
                    if ((boolean)(Object)LOG.isDebugEnabled()) {
                        LOG.debug("Closing " + files.get(j));
                    }
                    result[j].close();
                } catch (UncheckedIOException e1) {
                    if ((boolean)(Object)LOG.isDebugEnabled()) {
                        LOG.debug(e1.getMessage(),(IOException)(Object) e1);
                    }
                }
            }
            if ((boolean)(Object)LOG.isDebugEnabled()) {
                LOG.debug(e.getMessage(),(IOException)(Object) e);
            }
            throw new ResourceException((String)(Object)e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0, IOException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ResourceException extends Exception{
	public ResourceException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
