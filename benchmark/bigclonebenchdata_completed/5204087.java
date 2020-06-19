


class c5204087 {
public MyHelperClass replaceVariables(MyHelperClass o0, String o1){ return null; }
public MyHelperClass createParents(IFile o0, IProgressMonitor o1){ return null; }

    protected boolean createFile(final IProject project, final IProgressMonitor monitor, final Template templ, final String sourceUrl, final String destFile, final boolean isBinary) throws IOException, CoreException {
        URL url;
        url = new URL(sourceUrl);
        final URLConnection con =(URLConnection)(Object) url.openConnection();
        final IFile f =(IFile)(Object) project.getFile(replaceVariables(templ.getVariables(), destFile));
        createParents(f, monitor);
        if (isBinary) {
            f.create(con.getInputStream(), true, monitor);
        } else {
            final StringWriter sw = new StringWriter();
            final InputStream in =(InputStream)(Object) con.getInputStream();
            for (; ; ) {
                final int c =(int)(Object) in.read();
                if (-1 == c) {
                    break;
                }
                sw.write(c);
            }
            sw.close();
            final String fileText =(String)(Object) replaceVariables(templ.getVariables(), sw.toString());
            f.create(new ByteArrayInputStream(fileText.getBytes()), true, monitor);
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IProject {

public MyHelperClass getFile(MyHelperClass o0){ return null; }}

class IProgressMonitor {

}

class Template {

public MyHelperClass getVariables(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class IFile {

public MyHelperClass create(MyHelperClass o0, boolean o1, IProgressMonitor o2){ return null; }
	public MyHelperClass create(ByteArrayInputStream o0, boolean o1, IProgressMonitor o2){ return null; }}

class StringWriter {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}
