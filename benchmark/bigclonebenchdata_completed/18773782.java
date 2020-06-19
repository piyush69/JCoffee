import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c18773782 {
public MyHelperClass checkLastModified(Node o0, MyHelperClass o1, MyHelperClass o2){ return null; }

//    @Override
    public void render(IContentNode contentNode, Request req, Response resp, Application app, ServerInfo serverInfo) {
        Node fileNode =(Node)(Object) contentNode.getNode();
        try {
            Node res =(Node)(Object) fileNode.getNode("jcr:content");
            if ((boolean)(Object)checkLastModified(res, req.getServletRequset(), resp.getServletResponse())) {
                return;
            }
            Property data =(Property)(Object) res.getProperty("jcr:data");
            InputStream is =(InputStream)(Object) data.getBinary().getStream();
            int contentLength = (int)(int)(Object) data.getBinary().getSize();
            String mime;
            if ((boolean)(Object)res.hasProperty("jcr:mimeType")) {
                mime =(String)(Object) res.getProperty("jcr:mimeType").getString();
            } else {
                mime =(String)(Object) serverInfo.getSerlvetContext().getMimeType(fileNode.getName());
            }
            if (mime != null && mime.startsWith("image")) {
                int w =(int)(Object) req.getInt("w", 0);
                int h =(int)(Object) req.getInt("h", 0);
                String fmt =(String)(Object) req.get("fmt");
                if (w != 0 || h != 0 || fmt != null) {
                    MyHelperClass ImageResource = new MyHelperClass();
                    Resource imgRes =(Resource)(Object) ImageResource.create(is, mime.substring(6), w, h, req.getInt("cut", 0), fmt);
                    imgRes.process(serverInfo);
                    return;
                }
            }
            resp.getServletResponse().setContentType(mime);
            resp.getServletResponse().setContentLength(contentLength);
            OutputStream os =(OutputStream)(Object) resp.getServletResponse().getOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
            os.flush();
            os.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getString(){ return null; }
	public MyHelperClass getMimeType(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass create(InputStream o0, String o1, int o2, int o3, MyHelperClass o4, String o5){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class IContentNode {

public MyHelperClass getNode(){ return null; }}

class Request {

public MyHelperClass getServletRequset(){ return null; }
	public MyHelperClass getInt(String o0, int o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Response {

public MyHelperClass getServletResponse(){ return null; }}

class Application {

}

class ServerInfo {

public MyHelperClass getSerlvetContext(){ return null; }}

class Node {

public MyHelperClass getNode(String o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass hasProperty(String o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class Property {

public MyHelperClass getBinary(){ return null; }}

class Resource {

public MyHelperClass process(ServerInfo o0){ return null; }}

class PathNotFoundException extends Exception{
	public PathNotFoundException(String errorMessage) { super(errorMessage); }
}

class RepositoryException extends Exception{
	public RepositoryException(String errorMessage) { super(errorMessage); }
}
