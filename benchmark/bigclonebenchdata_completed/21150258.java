


class c21150258 {

    private String convert(InputStream input, String encoding) throws Exception {
        MyHelperClass emptyTags = new MyHelperClass();
        Process p = Runtime.getRuntime().exec("tidy -q -f /dev/null -wrap 0 --output-xml yes --doctype omit --force-output true --new-empty-tags  " + emptyTags + " --quote-nbsp no -utf8");
        Thread t =(Thread)(Object) new CopyThread(input,(OutputStream)(Object) p.getOutputStream());
        t.start();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy((InputStream)(Object)p.getInputStream(), output);
        p.waitFor();
        t.join();
        return output.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class InputStream {

}

class CopyThread {

CopyThread(InputStream o0, OutputStream o1){}
	CopyThread(){}}

class ByteArrayOutputStream {

}

class OutputStream {

}
