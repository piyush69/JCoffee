


class c5620476 {
public MyHelperClass HTTPD_CONF;
	public MyHelperClass decodeParms(String o0, Properties o1){ return null; }
public MyHelperClass VOctopusConfigurationManager;
	public MyHelperClass logger;
	public MyHelperClass decodePercent(String o0){ return null; }

    private String[] verifyConnection(Socket clientConnection) throws Exception {
        List requestLines =(List)(Object) new ArrayList();
        InputStream is =(InputStream)(Object) clientConnection.getInputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        StringTokenizer st = new StringTokenizer(in.readLine());
        if (!(Boolean)(Object)st.hasMoreTokens()) {
            throw new IllegalArgumentException("There's no method token in this connection");
        }
        String method =(String)(Object) st.nextToken();
        if (!(Boolean)(Object)st.hasMoreTokens()) {
            throw new IllegalArgumentException("There's no URI token in this connection");
        }
        String uri =(String)(Object) decodePercent((String)(Object)st.nextToken());
        if (!(Boolean)(Object)st.hasMoreTokens()) {
            throw new IllegalArgumentException("There's no version token in this connection");
        }
        String version =(String)(Object) st.nextToken();
        Properties parms = new Properties();
        int qmi = uri.indexOf('?');
        if (qmi >= 0) {
            decodeParms(uri.substring(qmi + 1), parms);
            uri =(String)(Object) decodePercent(uri.substring(0, qmi));
        }
        String params = "";
        if ((int)(Object)parms.size() > 0) {
            params = "?";
            for (Object key : (Object[])(Object)parms.keySet()) {
                params = params + key + "=" + parms.getProperty(((String) key)) + "&";
            }
            params = params.substring(0, params.length() - 1).replace(" ", "%20");
        }
        logger.debug("HTTP Request: " + method + " " + uri + params + " " + version);
        requestLines.add(method + " " + uri + params + " " + version);
        Properties headerVars = new Properties();
        String line;
        String currentBoundary = null;
        Stack boundaryStack = new Stack();
        boolean readingBoundary = false;
        String additionalData = "";
        while ((boolean)(Object)in.ready() && (line =(String)(Object) in.readLine()) != null) {
            if (line.equals("") && (headerVars.get("Content-Type") == null || headerVars.get("Content-Length") == null)) {
                break;
            }
            logger.debug("HTTP Request Header: " + line);
            if (line.contains(": ")) {
                String vals[] = line.split(": ");
                headerVars.put(vals[0].trim(), vals[1].trim());
            }
            if (!readingBoundary && line.contains(": ")) {
                if (line.contains("boundary=")) {
                    currentBoundary = line.split("boundary=")[1].trim();
                    boundaryStack.push("--" + currentBoundary);
                }
                continue;
            } else if (line.equals("") && (boolean)(Object)boundaryStack.isEmpty()) {
                int val = Integer.parseInt((String)(String)(Object) headerVars.get("Content-Length"));
                if ((boolean)(Object)headerVars.getProperty("Content-Type").contains("x-www-form-urlencoded")) {
                    char buf[] = new char[val];
                    int read =(int)(Object) in.read(buf);
                    line = String.valueOf(buf, 0, read);
                    additionalData = line;
                    logger.debug("HTTP Request Header Form Parameters: " + line);
                }
            } else if (line.equals(boundaryStack.peek()) && !readingBoundary) {
                readingBoundary = true;
            } else if (line.equals(boundaryStack.peek()) && readingBoundary) {
                readingBoundary = false;
            } else if (line.contains(": ") && readingBoundary) {
                if (method.equalsIgnoreCase("PUT")) {
                    if (line.contains("form-data; ")) {
                        String formValues = line.split("form-data; ")[1];
                        for (String varValue : formValues.replace("\"", "").split("; ")) {
                            String[] vV = varValue.split("=");
                            vV[0] =(String)(Object) decodePercent(vV[0]);
                            vV[1] =(String)(Object) decodePercent(vV[1]);
                            headerVars.put(vV[0], vV[1]);
                        }
                    }
                }
            } else if (line.contains("") && readingBoundary && !(Boolean)(Object)boundaryStack.isEmpty() && headerVars.get("filename") != null) {
                int length = Integer.parseInt((String)(Object)headerVars.getProperty("Content-Length"));
                if ((boolean)(Object)headerVars.getProperty("Content-Transfer-Encoding").contains("binary")) {
                    File uploadFilePath = new File(HTTPD_CONF.getPropertyValue("TempDirectory"));
                    if (!(Boolean)(Object)uploadFilePath.exists()) {
                        logger.error("Temporaty dir does not exist: " + uploadFilePath.getCanonicalPath());
                    }
                    if (!(Boolean)(Object)uploadFilePath.isDirectory()) {
                        logger.error("Temporary dir is not a directory: " + uploadFilePath.getCanonicalPath());
                    }
                    if (!(Boolean)(Object)uploadFilePath.canWrite()) {
                        logger.error("VOctopus Webserver doesn't have permissions to write on temporary dir: " + uploadFilePath.getCanonicalPath());
                    }
                    FileOutputStream out = null;
                    try {
                        String putUploadPath = uploadFilePath.getAbsolutePath() + "/" + headerVars.getProperty("filename");
                        out = new FileOutputStream(putUploadPath);
                        OutputStream outf =(OutputStream)(Object) new BufferedOutputStream(out);
                        int c;
                        while ((boolean)(Object)in.ready() && (c =(int)(Object) in.read()) != -1 && length-- > 0) {
                            outf.write(c);
                        }
                    } finally {
                        if (out != null) {
                            out.close();
                        }
                    }
                    File copied = new File(VOctopusConfigurationManager.getInstance().getDocumentRootPath() + uri + headerVars.get("filename"));
                    File tempFile = new File(HTTPD_CONF.getPropertyValue("TempDirectory") + "/" + headerVars.get("filename"));
                    FileChannel ic =(FileChannel)(Object) (new FileInputStream(tempFile.getAbsolutePath()).getChannel());
                    FileChannel oc =(FileChannel)(Object) (new FileOutputStream((String)(Object)copied.getAbsolutePath()).getChannel());
                    ic.transferTo(0, ic.size(), oc);
                    ic.close();
                    oc.close();
                }
            }
        }
        for (Object var : (Object[])(Object)headerVars.keySet()) {
            requestLines.add(var + ": " + headerVars.get(var));
        }
        if (!additionalData.equals("")) {
            requestLines.add("ADDITIONAL" + additionalData);
        }
        return(String[])(Object) requestLines.toArray(new String[(int)(Object)requestLines.size()]);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getDocumentRootPath(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass getPropertyValue(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Socket {

public MyHelperClass getInputStream(){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass size(){ return null; }}

class ArrayList {

}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass ready(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(MyHelperClass o0){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class Properties {

public MyHelperClass get(Object o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass keySet(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Stack {

public MyHelperClass push(String o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass peek(){ return null; }}

class File {

File(){}
	File(String o0){}
	File(MyHelperClass o0){}
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(int o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}
