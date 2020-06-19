


class c9836308 {
public static MyHelperClass renderFile(String o0, String o1, String o2, Writer o3){ return null; }
	public static MyHelperClass writeText(GenericValue o0, String o1, Map o2, String o3, Locale o4, Writer o5){ return null; }
//public MyHelperClass writeText(GenericValue o0, String o1, Map o2, String o3, Locale o4, Writer o5){ return null; }
//	public MyHelperClass renderFile(String o0, String o1, String o2, Writer o3){ return null; }

    public static void writeDataResourceText(GenericValue dataResource, String mimeTypeId, Locale locale, Map templateContext, GenericDelegator delegator, Writer out, boolean cache) throws IOException, GeneralException {
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
        String dataResourceId =(String)(Object) dataResource.getString("dataResourceId");
        String dataResourceTypeId =(String)(Object) dataResource.getString("dataResourceTypeId");
//        MyHelperClass UtilValidate = new MyHelperClass();
        if ((boolean)(Object)UtilValidate.isEmpty(dataResourceTypeId)) {
            dataResourceTypeId = "SHORT_TEXT";
        }
        if ("SHORT_TEXT".equals(dataResourceTypeId) || "LINK".equals(dataResourceTypeId)) {
            String text =(String)(Object) dataResource.getString("objectInfo");
            writeText(dataResource, text, templateContext, mimeTypeId, locale, out);
        } else if ("ELECTRONIC_TEXT".equals(dataResourceTypeId)) {
            GenericValue electronicText;
            if (cache) {
                MyHelperClass UtilMisc = new MyHelperClass();
                electronicText =(GenericValue)(Object) delegator.findByPrimaryKeyCache("ElectronicText", UtilMisc.toMap("dataResourceId", dataResourceId));
            } else {
                MyHelperClass UtilMisc = new MyHelperClass();
                electronicText =(GenericValue)(Object) delegator.findByPrimaryKey("ElectronicText", UtilMisc.toMap("dataResourceId", dataResourceId));
            }
            String text =(String)(Object) electronicText.getString("textData");
            writeText(dataResource, text, templateContext, mimeTypeId, locale, out);
        } else if (dataResourceTypeId.endsWith("_OBJECT")) {
            String text = (String)(String)(Object) dataResource.get("dataResourceId");
            writeText(dataResource, text, templateContext, mimeTypeId, locale, out);
        } else if (dataResourceTypeId.equals("URL_RESOURCE")) {
            String text = null;
            MyHelperClass FlexibleLocation = new MyHelperClass();
            URL url =(URL)(Object) FlexibleLocation.resolveLocation(dataResource.getString("objectInfo"));
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
                String prefix =(String)(Object) DataResourceWorker.buildRequestPrefix(delegator, locale, webSiteId, https);
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
            writeText(dataResource, dataResourceId, templateContext, mimeTypeId, locale, out);
        } else if (dataResourceTypeId.endsWith("_FILE")) {
            String dataResourceMimeTypeId =(String)(Object) dataResource.getString("mimeTypeId");
            String objectInfo =(String)(Object) dataResource.getString("objectInfo");
            String rootDir = (String)(String)(Object) context.get("rootDir");
            if (dataResourceMimeTypeId == null || dataResourceMimeTypeId.startsWith("text")) {
                renderFile(dataResourceTypeId, objectInfo, rootDir, out);
            } else {
                writeText(dataResource, dataResourceId, templateContext, mimeTypeId, locale, out);
            }
        } else {
            throw new GeneralException("The dataResourceTypeId [" + dataResourceTypeId + "] is not supported in renderDataResourceAsText");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass toMap(String o0, String o1){ return null; }
	public MyHelperClass buildRequestPrefix(GenericDelegator o0, Locale o1, String o2, String o3){ return null; }
	public MyHelperClass resolveLocation(MyHelperClass o0){ return null; }}

class GenericValue {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class Locale {

}

class Map {

public MyHelperClass get(String o0){ return null; }}

class GenericDelegator {

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
