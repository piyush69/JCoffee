


class c7377245 {

    public void write(HttpServletRequest req, HttpServletResponse res, Object bean) throws IntrospectionException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
        MyHelperClass contentType = new MyHelperClass();
        res.setContentType(contentType);
        final Object r;
        if (HttpRpcOutput.class.isAssignableFrom(bean.getClass())) {
            HttpRpcOutput output = (HttpRpcOutput) bean;
            r = output.getResult();
        } else r = bean;
        if (r != null) {
            if (File.class.isAssignableFrom(r.getClass())) {
                File file = (File) r;
                InputStream in = null;
                try {
                    in =(InputStream)(Object) new FileInputStream(file);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, res.getOutputStream());
                } finally {
                    if (in != null) in.close();
                }
            } else if (InputStream.class.isAssignableFrom(r.getClass())) {
                InputStream in = null;
                try {
                    in = (InputStream) r;
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, res.getOutputStream());
                } finally {
                    if (in != null) in.close();
                }
            } else if (XFile.class.isAssignableFrom(r.getClass())) {
                XFile file = (XFile) r;
                InputStream in = null;
                try {
                    in =(InputStream)(Object) new XFileInputStream(file);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, res.getOutputStream());
                } finally {
                    if (in != null) in.close();
                }
            }
            res.getOutputStream().flush();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass flush(){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class IntrospectionException extends Exception{
	public IntrospectionException(String errorMessage) { super(errorMessage); }
}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class XFile {

}

class XFileInputStream {

XFileInputStream(XFile o0){}
	XFileInputStream(){}}

class HttpRpcOutput {

public MyHelperClass getResult(){ return null; }}
