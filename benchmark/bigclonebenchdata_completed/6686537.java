
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6686537 {
public static MyHelperClass ServiceDigester;
	public static MyHelperClass logger;
	public static MyHelperClass CACHE_FILE;
//public MyHelperClass logger;
//	public MyHelperClass CACHE_FILE;
//	public MyHelperClass ServiceDigester;

    private static Map loadServiceCache() {
        ArrayList preferredOrder = new ArrayList();
        HashMap serviceFileMapping = new HashMap();
        MyHelperClass IsqlToolkit = new MyHelperClass();
        File file = new File(IsqlToolkit.getBaseDirectory(), CACHE_FILE);
        if (!(Boolean)(Object)file.exists()) {
            return (Map)(Object)serviceFileMapping;
        }
        if ((boolean)(Object)file.canRead()) {
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
                BufferedReader lineReader = new BufferedReader(fileReader);
                while ((boolean)(Object)lineReader.ready()) {
                    String data =(String)(Object) lineReader.readLine();
                    if (data.charAt(0) == '#') {
                        continue;
                    }
                    int idx0 = 0;
                    MyHelperClass SERVICE_FIELD_SEPERATOR = new MyHelperClass();
                    int idx1 = data.indexOf((int)(Object)SERVICE_FIELD_SEPERATOR);
                    MyHelperClass StringUtilities = new MyHelperClass();
                    String name =(String)(Object) StringUtilities.decodeASCII(data.substring(idx0, idx1));
//                    MyHelperClass StringUtilities = new MyHelperClass();
                    String uri =(String)(Object) StringUtilities.decodeASCII(data.substring(idx1 + 1));
                    MyHelperClass KEY_SERVICE_LIST = new MyHelperClass();
                    if (name.equalsIgnoreCase((String)(Object)KEY_SERVICE_LIST)) {
                        MyHelperClass SERVICE_SEPERATOR = new MyHelperClass();
                        StringTokenizer st = new StringTokenizer(uri, SERVICE_SEPERATOR);
                        while ((boolean)(Object)st.hasMoreTokens()) {
                            String serviceName =(String)(Object) st.nextToken();
                            preferredOrder.add(serviceName.toLowerCase().trim());
                        }
                        continue;
                    }
                    try {
                        URL url = new URL(uri);
                        File serviceFile = new File(url.getFile());
                        if ((boolean)(Object)serviceFile.isDirectory()) {
                            MyHelperClass messages = new MyHelperClass();
                            logger.warn(messages.format("compatability_kit.service_mapped_to_directory", name, uri));
                            continue;
                        } else if (!(Boolean)(Object)serviceFile.canRead()) {
                            MyHelperClass messages = new MyHelperClass();
                            logger.warn(messages.format("compatability_kit.service_not_readable", name, uri));
                            continue;
                        } else if (!(Boolean)(Object)serviceFile.exists()) {
                            MyHelperClass messages = new MyHelperClass();
                            logger.warn(messages.format("compatability_kit.service_does_not_exist", name, uri));
                            continue;
                        }
                        String bindName = name.toLowerCase().trim();
                        InputStream inputStream = null;
                        try {
                            inputStream =(InputStream)(Object) url.openStream();
                            InputSource inputSource = new InputSource(inputStream);
//                            MyHelperClass IsqlToolkit = new MyHelperClass();
                            bindName =(String)(Object) ServiceDigester.parseService(inputSource, IsqlToolkit.getSharedEntityResolver()).getName();
                        } catch (Exception error) {
                            continue;
                        }
                        if (serviceFileMapping.put(bindName, serviceFile) != null) {
                            MyHelperClass messages = new MyHelperClass();
                            logger.warn(messages.format("compatability_kit.service_duplicate_name_error", name, uri));
                        }
                    } catch (UncheckedIOException e) {
                        MyHelperClass messages = new MyHelperClass();
                        logger.error((String)(Object)messages.format("compatability_kit.service_uri_error", name, uri),(IOException)(Object) e);
                    }
                }
            } catch (UncheckedIOException ioe) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("compatability_kit.service_generic_error",(IOException)(Object) ioe);
            } finally {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Throwable ignored) {
                    }
                }
            }
        }
        return (Map)(Object)serviceFileMapping;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSharedEntityResolver(){ return null; }
	public MyHelperClass parseService(InputSource o0, MyHelperClass o1){ return null; }
	public MyHelperClass format(String o0, String o1, String o2){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass decodeASCII(String o0){ return null; }
	public MyHelperClass warn(MyHelperClass o0){ return null; }
	public MyHelperClass getBaseDirectory(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class Map {

}

class File {

File(){}
	File(MyHelperClass o0){}
	File(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

class HashMap {

public MyHelperClass put(String o0, File o1){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass ready(){ return null; }}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(String o0, MyHelperClass o1){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class InputStream {

}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
