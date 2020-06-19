


class c18101018 {

    public void write(HttpServletRequest req, HttpServletResponse res, Object bean) throws IntrospectionException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
        MyHelperClass contentType = new MyHelperClass();
        res.setContentType(contentType);
        final Object r;
        if (HttpRpcOutput.class.isAssignableFrom(bean.getClass())) {
            HttpRpcOutput output = (HttpRpcOutput) bean;
            r = output.getResult();
        } else r = bean;
        if (r != null) {
            final ServletOutputStream outputStream =(ServletOutputStream)(Object) res.getOutputStream();
            if (File.class.isAssignableFrom(r.getClass())) {
                File file = (File) r;
                InputStream in = null;
                try {
                    in =(InputStream)(Object) new FileInputStream(file);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, outputStream);
                } finally {
                    if (in != null) in.close();
                }
            } else if (InputStream.class.isAssignableFrom(r.getClass())) {
                InputStream in = null;
                try {
                    in = (InputStream) r;
                    if (ByteArrayInputStream.class.isAssignableFrom(r.getClass())) res.addHeader("Content-Length", Integer.toString((int)(Object)in.available()));
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, outputStream);
                } finally {
                    if (in != null) in.close();
                }
            }
            outputStream.flush();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ServletOutputStream o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
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

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}

class File {

}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ByteArrayInputStream {

}

class HttpRpcOutput {

public MyHelperClass getResult(){ return null; }}
