


class c10548278 {

    public ActionForward saveImageMap(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        MyHelperClass log = new MyHelperClass();
        log.debug("MapAction saveImageMap()");
        MyHelperClass RequestUtil = new MyHelperClass();
        String imageURL =(String)(Object) RequestUtil.getRequest(request, "imgUrl");
        DataInputStream di = null;
        FileOutputStream fo = null;
        byte[] b = new byte[1];
        URL url = new URL(imageURL);
        URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
        urlConnection.connect();
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + "map.png");
        OutputStream outstream =(OutputStream)(Object) response.getOutputStream();
        byte abyte0[] = new byte[4096];
        try {
            BufferedInputStream instream = new BufferedInputStream(urlConnection.getInputStream());
            int i;
            while ((i =(int)(Object) instream.read(abyte0, 0, 4096)) != -1) outstream.write(abyte0, 0, i);
            instream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRequest(HttpServletRequest o0, String o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class ActionMapping {

}

class ActionForm {

}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class ActionForward {

}

class DataInputStream {

}

class FileOutputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
