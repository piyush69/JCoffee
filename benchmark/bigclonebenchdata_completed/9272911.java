


class c9272911 {
public MyHelperClass launchWorkflow(ProcessContext o0, Object o1){ return null; }
public MyHelperClass lowerCaseFirstLetterForContext;
	public MyHelperClass logger;
	public MyHelperClass StringUtils;
	public MyHelperClass getContextKeyFileUrls(){ return null; }
	public MyHelperClass getContextKeyQuoteCharacter(){ return null; }
	public MyHelperClass getContextKeySeparator(){ return null; }
	public MyHelperClass getContextKeyPrefix(){ return null; }

    @SuppressWarnings("unchecked")
    public ProcessContext execute(ProcessContext context) throws Exception {
        List urls = (List)(List)(Object) context.get(getContextKeyFileUrls(),(Class<String>)(Object) List.class, true);
        for (String url :(String[])(Object) (Object[])(Object)urls) {
            long time = System.currentTimeMillis();
            logger.info("Starting url: " + url);
            InputStream is = null;
            if (url.startsWith("http://") || url.startsWith("ftp://")) {
                is =(InputStream)(Object) (new URL(url).openStream());
            } else {
                is =(InputStream)(Object) new FileInputStream(url);
            }
            String separator = (String)(String)(Object) context.get(getContextKeySeparator(), String.class, false);
            if (separator == null) {
                separator = "\t";
            }
            String quoteCharacter = (String)(String)(Object) context.get(getContextKeyQuoteCharacter(), String.class, false);
            DelimitedFileReader reader = new DelimitedFileReader(is, separator, quoteCharacter, true);
            Set columns =(Set)(Object) reader.getColumnHeaders();
            while ((boolean)(Object)reader.next()) {
                logger.debug("Starting row: " + reader.getRowNumber());
                for (String column :(String[])(Object) (Object[])(Object)columns) {
                    String value =(String)(Object) StringUtils.trimToNull(reader.get(column));
                    String key = getContextKeyPrefix() + column;
                    if ((boolean)(Object)lowerCaseFirstLetterForContext && key.length() > 1) {
                        key = key.substring(0, 1).toLowerCase() + key.substring(1);
                    } else if ((boolean)(Object)lowerCaseFirstLetterForContext) {
                        key = key.toLowerCase();
                    }
                    context.put(key, value);
                    logger.debug("Added key[" + key + "] value[" + value + "]");
                }
                launchWorkflow(context, null);
            }
            logger.info("Finished url [" + url + "] in " + ((System.currentTimeMillis() + 1 - time) / 1000) + " secs");
        }
        return context;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trimToNull(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class ProcessContext {

public MyHelperClass get(MyHelperClass o0, Class<String> o1, boolean o2){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class List {

}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class DelimitedFileReader {

DelimitedFileReader(){}
	DelimitedFileReader(InputStream o0, String o1, String o2, boolean o3){}
	public MyHelperClass getColumnHeaders(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getRowNumber(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Set {

}
