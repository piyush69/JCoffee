


class c13930252 {
public MyHelperClass assertEquals(String o0, LogLevel o1, MyHelperClass o2){ return null; }

//    @Test
    public void testValidLogConfiguration() throws IOException, IllegalArgumentException {
        MyHelperClass PROPERTIES_FILE_NAME = new MyHelperClass();
        URL url =(URL)(Object) ClassLoader.getSystemResource((String)(Object)PROPERTIES_FILE_NAME);
        if (url == null) {
//            MyHelperClass PROPERTIES_FILE_NAME = new MyHelperClass();
            throw new IOException("Could not find configuration file " + PROPERTIES_FILE_NAME + " in class path");
        }
        Properties properties = new Properties();
        properties.load(url.openStream());
        MyHelperClass PROPERTY_KEY_LOGLEVEL = new MyHelperClass();
        LogLevel logLevel =(LogLevel)(Object) LogLevel.valueOf((String)(String)(Object) properties.get(PROPERTY_KEY_LOGLEVEL));
        if (logLevel == null) {
//            MyHelperClass PROPERTIES_FILE_NAME = new MyHelperClass();
            throw new IOException("Invalid configuration file " + PROPERTIES_FILE_NAME + ": no entry for " + PROPERTY_KEY_LOGLEVEL);
        }
        String loggerIdentifier = "Test logger";
        MyHelperClass LoggerFactory = new MyHelperClass();
        Logger logger =(Logger)(Object) LoggerFactory.getLogger(loggerIdentifier);
        assertEquals("Logger has wrong log level", logLevel, logger.getLogLevel());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLogger(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(MyHelperClass o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}

class LogLevel {

public static MyHelperClass valueOf(String o0){ return null; }}

class Logger {

public MyHelperClass getLogLevel(){ return null; }}
