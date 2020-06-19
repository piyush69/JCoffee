import java.io.*;
import java.lang.*;
import java.util.*;



class c3573409 {
public MyHelperClass getSearchEngineSitemap(Tenant o0, String o1){ return null; }

    public synchronized void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CacheEntry entry = null;
        Tenant tenant = null;
        MyHelperClass tenantInfo = new MyHelperClass();
        if (!(Boolean)(Object)tenantInfo.getTenants().isEmpty()) {
//            MyHelperClass tenantInfo = new MyHelperClass();
            tenant =(Tenant)(Object) tenantInfo.getMatchingTenant(request);
            if (tenant == null) {
//                MyHelperClass tenantInfo = new MyHelperClass();
                tenant =(Tenant)(Object) tenantInfo.getTenants().get(0);
            }
            MyHelperClass tenantToCacheEntry = new MyHelperClass();
            entry =(CacheEntry)(Object) tenantToCacheEntry.get(tenant.getName());
        } else {
            MyHelperClass cacheEntry = new MyHelperClass();
            entry =(CacheEntry)(Object) cacheEntry;
        }
        if (entry == null) {
            MyHelperClass servletContext = new MyHelperClass();
            File tempDir = (File)(File)(Object) servletContext.getAttribute("javax.servlet.context.tempdir");
            tempDir = new File(tempDir, "pustefix-sitemap-cache");
            if (!tempDir.exists()) {
                tempDir.mkdirs();
            }
            entry = new CacheEntry();
            entry.file =(MyHelperClass)(Object) new File(tempDir, "sitemap" + (tenant == null ? "" : "-" + tenant.getName()) + ".xml");
            try {
                MyHelperClass AbstractPustefixRequestHandler = new MyHelperClass();
                String host =(String)(Object) AbstractPustefixRequestHandler.getServerName(request);
                Document doc =(Document)(Object) getSearchEngineSitemap(tenant, host);
                MyHelperClass TransformerFactory = new MyHelperClass();
                Transformer trf =(Transformer)(Object) TransformerFactory.newInstance().newTransformer();
                MyHelperClass OutputKeys = new MyHelperClass();
                trf.setOutputProperty(OutputKeys.INDENT, "yes");
                FileOutputStream out = new FileOutputStream((String)(Object)entry.file);
                MessageDigest digest;
                try {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                } catch (UncheckedIOException x) {
                    throw new RuntimeException("Can't create message digest", x);
                }
                DigestOutputStream digestOutput = new DigestOutputStream(out, digest);
                trf.transform(new DOMSource(doc), new StreamResult(digestOutput));
                digestOutput.close();
                byte[] digestBytes =(byte[])(Object) digest.digest();
                MyHelperClass MD5Utils = new MyHelperClass();
                entry.etag = MD5Utils.byteToHex(digestBytes);
            } catch (Exception x) {
                throw new ServletException("Error creating sitemap", x);
            }
        }
        String reqETag =(String)(Object) request.getHeader("If-None-Match");
        if (reqETag != null) {
            if (entry.etag.equals(reqETag)) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
                response.flushBuffer();
                return;
            }
        }
        long reqMod =(long)(Object) request.getDateHeader("If-Modified-Since");
        if (reqMod != -1) {
            if ((long)(Object)entry.file.lastModified() < reqMod + 1000) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
                response.flushBuffer();
                return;
            }
        }
        response.setContentType("application/xml");
        response.setContentLength((int)(int)(Object) entry.file.length());
        response.setDateHeader("Last-Modified", entry.file.lastModified());
        response.setHeader("ETag", entry.etag);
        OutputStream out = new BufferedOutputStream((OutputStream)(Object)response.getOutputStream());
        InputStream in = new FileInputStream((String)(Object)entry.file);
        int bytes_read;
        byte[] buffer = new byte[8];
        while ((bytes_read = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytes_read);
        }
        out.flush();
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INDENT;
	public MyHelperClass SC_NOT_MODIFIED;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getMatchingTenant(HttpServletRequest o0){ return null; }
	public MyHelperClass byteToHex(byte[] o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass getServerName(HttpServletRequest o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getTenants(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass newTransformer(){ return null; }}

class HttpServletRequest {

public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getDateHeader(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setDateHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass flushBuffer(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
	ServletException(String o0, Exception o1){}
	ServletException(){}
}

class CacheEntry {
public MyHelperClass etag;
	public MyHelperClass file;
}

class Tenant {

public MyHelperClass getName(){ return null; }}

class Document {

}

class Transformer {

public MyHelperClass transform(DOMSource o0, StreamResult o1){ return null; }
	public MyHelperClass setOutputProperty(MyHelperClass o0, String o1){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class DigestOutputStream {

DigestOutputStream(FileOutputStream o0, MessageDigest o1){}
	DigestOutputStream(){}
	public MyHelperClass close(){ return null; }}

class DOMSource {

DOMSource(Document o0){}
	DOMSource(){}}

class StreamResult {

StreamResult(DigestOutputStream o0){}
	StreamResult(){}}
