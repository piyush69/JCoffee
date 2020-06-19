


class c18051587 {

    public static void run(File targetFolder, URL url) throws UpdateException {
        try {
            run(targetFolder,(URL)(Object) new ZipInputStream(url.openStream()));
        } catch (Exception e) {
            if (e instanceof UpdateException) throw (UpdateException) e; else throw new UpdateException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class UpdateException extends Exception{
	public UpdateException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(MyHelperClass o0){}
	ZipInputStream(){}}
