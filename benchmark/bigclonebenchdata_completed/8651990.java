import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8651990 {
public MyHelperClass fa;
	public MyHelperClass PartialGetHelper;
	public MyHelperClass logger;
	public MyHelperClass IOUtils;
	public MyHelperClass getFileModule(){ return null; }
	public MyHelperClass resolveFileAttachment(){ return null; }

//    @Override
    public void sendContent(OutputStream out, Range range, Map<String, String> params, String contentType) throws Throwable, IOException, NotAuthorizedException, BadRequestException, NotFoundException {
        try {
            resolveFileAttachment();
        } catch (NoFileByTheIdException e) {
            throw new NotFoundException(e.getLocalizedMessage());
        }
        DefinableEntity owningEntity =(DefinableEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) fa.getOwner().getEntity();
        InputStream in =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getFileModule().readFile(owningEntity.getParentBinder(), owningEntity, fa);
        try {
            if (range != null) {
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)logger.isDebugEnabled()) logger.debug("sendContent: ranged content: " + toString(fa));
                PartialGetHelper.writeRange(in, range, out);
            } else {
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)logger.isDebugEnabled()) logger.debug("sendContent: send whole file " + toString(fa));
                IOUtils.copy(in, out);
            }
            out.flush();
        } catch (ReadingException e) {
            throw new IOException(e);
        } catch (WritingException e) {
            throw new IOException(e);
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getOwner(){ return null; }
	public MyHelperClass writeRange(InputStream o0, Range o1, OutputStream o2){ return null; }
	public MyHelperClass readFile(MyHelperClass o0, DefinableEntity o1, MyHelperClass o2){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class Range {

}

class NotAuthorizedException extends Exception{
	public NotAuthorizedException(String errorMessage) { super(errorMessage); }
}

class BadRequestException extends Exception{
	public BadRequestException(String errorMessage) { super(errorMessage); }
}

class NotFoundException extends Exception{
	public NotFoundException(String errorMessage) { super(errorMessage); }
}

class NoFileByTheIdException extends Exception{
	public NoFileByTheIdException(String errorMessage) { super(errorMessage); }
}

class DefinableEntity {

public MyHelperClass getParentBinder(){ return null; }}

class ReadingException extends Exception{
	public ReadingException(String errorMessage) { super(errorMessage); }
}

class WritingException extends Exception{
	public WritingException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
