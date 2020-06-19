


class c21079416 {
public static MyHelperClass renderFile(String o0, String o1, String o2, Writer o3){ return null; }
	public static MyHelperClass writeText(CmsOFBizRemoteClient o0, GenericValue o1, String o2, Map o3, String o4, Locale o5, Writer o6){ return null; }
//public MyHelperClass writeText(CmsOFBizRemoteClient o0, GenericValue o1, String o2, Map o3, String o4, Locale o5, Writer o6){ return null; }
//	public MyHelperClass renderFile(String o0, String o1, String o2, Writer o3){ return null; }

    public static void writeDataResourceText(GenericValue dataResource, String mimeTypeId, Locale locale, Map templateContext, CmsOFBizRemoteClient remoteClient, Writer out, boolean cache) throws IOException, GeneralException {
        Map context = (Map)(Map)(Object) templateContext.get("context");
        if (context == null) {
            MyHelperClass FastMap = new MyHelperClass();
            context =(Map)(Object) FastMap.newInstance();
        }
        String webSiteId = (String)(String)(Object) templateContext.get("webSiteId");
        MyHelperClass UtilValidate = new MyHelperClass();
        if ((boolean)(Object)UtilValidate.isEmpty(webSiteId)) {
            if (context != null) webSiteId = (String)(String)(Object) context.get("webSiteId");
        }
        String https = (String)(String)(Object) templateContext.get("https");
//        MyHelperClass UtilValidate = new MyHelperClass();
        if ((boolean)(Object)UtilValidate.isEmpty(https)) {
            if (context != null) https = (String)(String)(Object) context.get("https");
        }
        Map fields =(Map)(Object) dataResource.getAllFields();
        String dataResourceId = (String)(String)(Object) fields.get("dataResourceId");
        String dataResourceTypeId = (String)(String)(Object) fields.get("dataResourceTypeId");
//        MyHelperClass UtilValidate = new MyHelperClass();
        if ((boolean)(Object)UtilValidate.isEmpty(dataResourceTypeId)) {
            dataResourceTypeId = "SHORT_TEXT";
        }
        if ("SHORT_TEXT".equals(dataResourceTypeId) || "LINK".equals(dataResourceTypeId)) {
            String text = (String)(String)(Object) fields.get("objectInfo");
            writeText(remoteClient, dataResource, text, templateContext, mimeTypeId, locale, out);
        } else if ("ELECTRONIC_TEXT".equals(dataResourceTypeId)) {
            GenericValue electronicText;
            if (cache) {
                MyHelperClass UtilMisc = new MyHelperClass();
                electronicText =(GenericValue)(Object) remoteClient.findByPrimaryKeyCache("ElectronicText", UtilMisc.toMap("dataResourceId", dataResourceId));
            } else {
                MyHelperClass UtilMisc = new MyHelperClass();
                electronicText =(GenericValue)(Object) remoteClient.findByPrimaryKey("ElectronicText", UtilMisc.toMap("dataResourceId", dataResourceId));
            }
            fields =(Map)(Object) electronicText.getAllFields();
            String text = (String)(String)(Object) fields.get("textData");
            writeText(remoteClient, dataResource, text, templateContext, mimeTypeId, locale, out);
        } else if (dataResourceTypeId.endsWith("_OBJECT")) {
            String text = (String)(String)(Object) fields.get("dataResourceId");
            writeText(remoteClient, dataResource, text, templateContext, mimeTypeId, locale, out);
        } else if (dataResourceTypeId.equals("URL_RESOURCE")) {
            String text = null;
            URL url = new URL((String)(String)(Object) fields.get("objectInfo"));
            if (url.getHost() != null) {
                InputStream in =(InputStream)(Object) url.openStream();
                int c;
                StringWriter sw = new StringWriter();
                while ((c =(int)(Object) in.read()) != -1) {
                    sw.write(c);
                }
                sw.close();
                text = sw.toString();
            } else {
                MyHelperClass DataResourceWorker = new MyHelperClass();
                String prefix =(String)(Object) DataResourceWorker.buildRequestPrefix(remoteClient, locale, webSiteId, https);
                String sep = "";
                if (url.toString().indexOf("/") != 0 && prefix.lastIndexOf("/") != (prefix.length() - 1)) {
                    sep = "/";
                }
                String fixedUrlStr = prefix + sep + url.toString();
                URL fixedUrl = new URL(fixedUrlStr);
                text = (String)(String)(Object) fixedUrl.getContent();
            }
            out.write(text);
        } else if (dataResourceTypeId.endsWith("_FILE_BIN")) {
            writeText(remoteClient, dataResource, dataResourceId, templateContext, mimeTypeId, locale, out);
        } else if (dataResourceTypeId.endsWith("_FILE")) {
            String dataResourceMimeTypeId = (String)(String)(Object) fields.get("mimeTypeId");
            String objectInfo = (String)(String)(Object) fields.get("objectInfo");
            String rootDir = (String)(String)(Object) context.get("rootDir");
            if (dataResourceMimeTypeId == null || dataResourceMimeTypeId.startsWith("text")) {
                renderFile(dataResourceTypeId, objectInfo, rootDir, out);
            } else {
                writeText(remoteClient, dataResource, dataResourceId, templateContext, mimeTypeId, locale, out);
            }
        } else {
            throw new GeneralException("The dataResourceTypeId [" + dataResourceTypeId + "] is not supported in renderDataResourceAsText");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass toMap(String o0, String o1){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass buildRequestPrefix(CmsOFBizRemoteClient o0, Locale o1, String o2, String o3){ return null; }}

class GenericValue {

public MyHelperClass getAllFields(){ return null; }}

class Locale {

}

class Map {

public MyHelperClass get(String o0){ return null; }}

class CmsOFBizRemoteClient {

public MyHelperClass findByPrimaryKeyCache(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass findByPrimaryKey(String o0, MyHelperClass o1){ return null; }}

class Writer {

public MyHelperClass write(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GeneralException extends Exception{
	public GeneralException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class StringWriter {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
