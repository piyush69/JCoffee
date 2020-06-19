


class c15360205 {
public static MyHelperClass closeStream(InputStream o0){ return null; }
//public MyHelperClass closeStream(InputStream o0){ return null; }

    private static void initMimeTypes() {
        InputStream is = null;
        Properties extMimeTypes;// = new Properties();
        extMimeTypes = new Properties();
        try {
            try {
                is =(InputStream)(Object) MimeUtil.class.getClassLoader().getResourceAsStream("eu/medsea/mimeutil/mime-types.properties");
                if (is != null) {
//                    MyHelperClass extMimeTypes = new MyHelperClass();
                    ((Properties)(Object)(Properties) extMimeTypes).load(is);
                }
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.error("Error loading internal mime-types.properties", e);
            } finally {
                is =(InputStream)(Object) closeStream(is);
            }
            try {
                MyHelperClass File = new MyHelperClass();
                File f = new File(System.getProperty("user.home") + File.separator + ".mime-types.properties");
                if ((boolean)(Object)f.exists()) {
                    is =(InputStream)(Object) new FileInputStream(f);
                    if (is != null) {
                        MyHelperClass log = new MyHelperClass();
                        log.debug("Found a custom .mime-types.properties file in the users home directory.");
                        Properties props = new Properties();
                        props.load(is);
                        if ((int)(Object)props.size() > 0) {
//                            MyHelperClass extMimeTypes = new MyHelperClass();
                            extMimeTypes.putAll(props);
                        }
//                        MyHelperClass log = new MyHelperClass();
                        log.debug("Successfully parsed .mime-types.properties from users home directory.");
                    }
                }
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.error("Failed to parse .magic.mime file from users home directory. File will be ignored.", e);
            } finally {
                is =(InputStream)(Object) closeStream(is);
            }
            try {
                Enumeration e =(Enumeration)(Object) MimeUtil.class.getClassLoader().getResources("mime-types.properties");
                while ((boolean)(Object)e.hasMoreElements()) {
                    URL url = (URL)(URL)(Object) e.nextElement();
                    MyHelperClass log = new MyHelperClass();
                    if ((boolean)(Object)log.isDebugEnabled()) {
//                        MyHelperClass log = new MyHelperClass();
                        log.debug("Found custom mime-types.properties file on the classpath [" + url + "].");
                    }
                    Properties props = new Properties();
                    try {
                        is =(InputStream)(Object) url.openStream();
                        if (is != null) {
                            props.load(is);
                            if ((int)(Object)props.size() > 0) {
//                                MyHelperClass extMimeTypes = new MyHelperClass();
                                extMimeTypes.putAll(props);
//                                MyHelperClass log = new MyHelperClass();
                                if ((boolean)(Object)log.isDebugEnabled()) {
//                                    MyHelperClass log = new MyHelperClass();
                                    log.debug("Successfully loaded custome mime-type.properties file [" + url + "] from classpath.");
                                }
                            }
                        }
                    } catch (Exception ex) {
//                        MyHelperClass log = new MyHelperClass();
                        log.error("Failed while loading custom mime-type.properties file [" + url + "] from classpath. File will be ignored.");
                    }
                }
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.error("Problem while processing mime-types.properties files(s) from classpath. Files will be ignored.", e);
            } finally {
                is =(InputStream)(Object) closeStream(is);
            }
            try {
                String fname = System.getProperty("mime-mappings");
                if (fname != null && fname.length() != 0) {
                    is =(InputStream)(Object) new FileInputStream(fname);
                    if (is != null) {
                        MyHelperClass log = new MyHelperClass();
                        if ((boolean)(Object)log.isDebugEnabled()) {
//                            MyHelperClass log = new MyHelperClass();
                            log.debug("Found a custom mime-mappings property defined by the property -Dmime-mappings [" + System.getProperty("mime-mappings") + "].");
                        }
                        Properties props = new Properties();
                        props.load(is);
                        if ((int)(Object)props.size() > 0) {
//                            MyHelperClass extMimeTypes = new MyHelperClass();
                            extMimeTypes.putAll(props);
                        }
//                        MyHelperClass log = new MyHelperClass();
                        log.debug("Successfully loaded the mime mappings file from property -Dmime-mappings [" + System.getProperty("mime-mappings") + "].");
                    }
                }
            } catch (Exception ex) {
                MyHelperClass log = new MyHelperClass();
                log.error("Failed to load the mime-mappings file defined by the property -Dmime-mappings [" + System.getProperty("mime-mappings") + "].");
            } finally {
                is =(InputStream)(Object) closeStream(is);
            }
        } finally {
//            MyHelperClass extMimeTypes = new MyHelperClass();
            Iterator it =(Iterator)(Object) extMimeTypes.values().iterator();
            while ((boolean)(Object)it.hasNext()) {
                String[] types = ((String)(String)(Object) it.next()).split(",");
                for (int i = 0; i < types.length; i++) {
                    MyHelperClass MimeUtil = new MyHelperClass();
                    MimeUtil.addKnownMimeType(types[i]);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass addKnownMimeType(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass values(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass putAll(Properties o0){ return null; }}

class InputStream {

}

class MimeUtil {

}

class Properties {

public MyHelperClass values(){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass putAll(Properties o0){ return null; }
	public MyHelperClass size(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	FileInputStream(String o0){}}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}
