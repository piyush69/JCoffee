import java.io.*;
import java.lang.*;
import java.util.*;



class c5936410 {
public MyHelperClass NULL;
public MyHelperClass InetAddress;
public MyHelperClass toBrowser;
	public MyHelperClass logger;
	public MyHelperClass toWeb;
	public MyHelperClass writeCache;
	public MyHelperClass socketToWeb;
	public MyHelperClass socket;
	public MyHelperClass getWritableFileName(String o0){ return null; }

    public void run() {
        try {
            String getter = null;
            String str, targetHost = "", httpHeader = "";
            int targetPort = 80;
            while (true) {
                MyHelperClass fromBrowser = new MyHelperClass();
                str =(String)(Object) fromBrowser.readLine();
                if (str.startsWith("GET") || str.startsWith("DESCRIBE") || str.startsWith("POST") || str.startsWith("HEAD")) {
                    getter = str;
                }
                if (str.startsWith("Accept-Encoding: gzip")) {
                    str = "Accept-Encoding: identity";
                }
                httpHeader += str + "\r\n";
                if (str.startsWith("Host: ")) {
                    targetHost = str.substring(6);
                } else if (str.startsWith("DESCRIBE")) {
                    targetPort = 554;
                    targetHost = str.substring(str.indexOf("//") + 2);
                    targetHost = targetHost.substring(0, targetHost.indexOf("/"));
                }
                if (str.length() == 0) {
                    break;
                }
            }
            String target = targetHost;
            if (targetHost.indexOf(":") > -1) {
                try {
                    targetPort = Integer.parseInt(targetHost.substring(targetHost.indexOf(":") + 1));
                } catch (NumberFormatException nfe) {
                }
                target = targetHost.substring(0, targetHost.indexOf(":"));
            }
            MyHelperClass logger = new MyHelperClass();
            logger.trace("[PROXY] Connect to: " + target + " and port: " + targetPort);
            Socket socketToWeb =(Socket)(Object) NULL; //new Socket();
            socketToWeb = new Socket(InetAddress.getByName(target), targetPort);
//            MyHelperClass socketToWeb = new MyHelperClass();
            InputStream sockWebInputStream =(InputStream)(Object) socketToWeb.getInputStream();
            PrintWriter toWeb =(PrintWriter)(Object) NULL; //new PrintWriter();
            toWeb = new PrintWriter(new BufferedWriter(new OutputStreamWriter((OutputStream)(Object)socketToWeb.getOutputStream())), true);
//            MyHelperClass toWeb = new MyHelperClass();
            toWeb.println(httpHeader);
//            MyHelperClass toWeb = new MyHelperClass();
            toWeb.flush();
            StringTokenizer st = new StringTokenizer(getter, " ");
            st.nextToken();
            String askedResource = st.nextToken();
            askedResource = askedResource.substring(askedResource.indexOf(targetHost) + targetHost.length());
//            MyHelperClass logger = new MyHelperClass();
            logger.trace("[PROXY] Asked resource: " + askedResource);
            String directoryResource = askedResource.substring(0, askedResource.lastIndexOf("/"));
            directoryResource =(String)(Object) getWritableFileName(directoryResource);
            String fileResource = askedResource.substring(askedResource.lastIndexOf("/") + 1);
            fileResource =(String)(Object) getWritableFileName(fileResource);
            fileResource = fileResource + ".cached";
            String fileN = "proxycache/" + target + "/" + directoryResource;
            File directoryResourceFile = new File(fileN);
            if ((boolean)(Object)writeCache) {
                directoryResourceFile.mkdirs();
            }
            File cachedResource = new File(directoryResourceFile, fileResource);
            byte[] buffer = new byte[8192];
            boolean resourceExists = cachedResource.exists() || this.getClass().getResource("/" + fileN) != null;
            boolean inMemory =(boolean)(Object) writeCache && !resourceExists;
            FileOutputStream fOUT = null;
            if (resourceExists) {
                logger.trace("[PROXY] File is cached: " + cachedResource.getAbsolutePath());
                sockWebInputStream.close();
                if (cachedResource.exists()) {
                    sockWebInputStream = new FileInputStream(cachedResource);
                } else {
                    sockWebInputStream = this.getClass().getResourceAsStream("/" + fileN);
                }
            } else if ((boolean)(Object)writeCache) {
                logger.trace("[PROXY] File is not cached / Writing in it: " + cachedResource.getAbsolutePath());
                fOUT = new FileOutputStream(cachedResource, false);
            }
            OutputStream baos = null;
            if (inMemory) {
                baos = new ByteArrayOutputStream();
            } else {
                baos =(OutputStream)(Object) toBrowser;
            }
            long total_read = 0;
            int bytes_read;
            long CL = 10000000000L;
            while (total_read < CL && (bytes_read = sockWebInputStream.read(buffer)) != -1) {
                if (!resourceExists) {
                    if (10000000000L == CL) {
                        String s = new String(buffer, 0, bytes_read);
                        int clPos = s.indexOf("Content-Length: ");
                        if (clPos > -1) {
                            CL = Integer.parseInt(s.substring(clPos + 16, s.indexOf("\n", clPos)).trim());
                            logger.trace("Found Content Length: " + CL);
                        }
                    }
                    if (bytes_read >= 7) {
                        byte end[] = new byte[7];
                        System.arraycopy(buffer, bytes_read - 7, end, 0, 7);
                        if (new String(end).equals("\r\n0\r\n\r\n")) {
                            System.out.println("end of transfer chunked");
                            CL = -1;
                        }
                    }
                    if ((boolean)(Object)writeCache) {
                        fOUT.write(buffer, 0, bytes_read);
                    }
                }
                baos.write(buffer, 0, bytes_read);
                total_read += bytes_read;
            }
            if (inMemory) {
                baos.close();
                toBrowser.write(((ByteArrayOutputStream) baos).toByteArray());
            }
            if ((boolean)(Object)writeCache && fOUT != null) {
                fOUT.close();
            }
            socketToWeb.close();
            toBrowser.close();
        } catch (IOException e) {
        } finally {
            try {
                if (toWeb != null) {
                    toWeb.close();
                }
                if (toBrowser != null) {
                    toBrowser.close();
                }
                socket.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readLine(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass getByName(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class Socket {

Socket(MyHelperClass o0, int o1){}
	Socket(){}
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}
