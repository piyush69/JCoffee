


class c20640293 {

    private static void findDictionary() {
        java.net.URL url = Translator.class.getResource("Translator.class");
        String location = url.getFile();
        MyHelperClass Settings = new MyHelperClass();
        String dictionaryName = (String)(String)(Object) Settings.getDefault().getSetting("dictionary");
        InputStream inputStream;
        try {
            if (location.indexOf(".jar!") == -1) inputStream =(InputStream)(Object) new FileInputStream(location.substring(0, location.indexOf("Translator.class")) + dictionaryName); else {
                JarFile jarFile;
                if (location.indexOf("rachota.sourceforge.net") != -1) {
                    String fileName = location.substring(0, location.indexOf("!/") + 2);
                    url =(java.net.URL)(Object) new URL("jar:http://rachota.sourceforge.net/rachota_22.jar!/");
                    JarURLConnection jarConnection = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                    jarFile =(JarFile)(Object) jarConnection.getJarFile();
                } else {
                    String fileName = System.getProperty("os.name").indexOf("Windows") == -1 ? "/" : "";
                    fileName = fileName + location.substring(6, location.indexOf(".jar") + 4);
                    MyHelperClass Tools = new MyHelperClass();
                    fileName =(String)(Object) Tools.replaceAll(fileName, "%20", " ");
                    jarFile = new JarFile(fileName);
                }
                ZipEntry entry =(ZipEntry)(Object) jarFile.getEntry("org/cesilko/rachota/core/" + dictionaryName);
                if (entry == null) {
                    entry =(ZipEntry)(Object) jarFile.getEntry("org/cesilko/rachota/core/Dictionary_en_US.properties");
//                    MyHelperClass Settings = new MyHelperClass();
                    Settings.getDefault().setSetting("dictionary", "Dictionary_en_US.properties");
                }
                inputStream =(InputStream)(Object) jarFile.getInputStream(entry);
            }
            PropertyResourceBundle dictionary;// = new PropertyResourceBundle();
            dictionary = new PropertyResourceBundle(inputStream);
        } catch (Exception e) {
            System.out.println("Error: Reading from " + dictionaryName + " dictionary failed.");
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setSetting(String o0, String o1){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getSetting(String o0){ return null; }
	public MyHelperClass replaceAll(String o0, String o1, String o2){ return null; }}

class Translator {

}

class InputStream {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class JarFile {

JarFile(String o0){}
	JarFile(){}
	public MyHelperClass getEntry(String o0){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }}

class ZipEntry {

}

class PropertyResourceBundle {

PropertyResourceBundle(){}
	PropertyResourceBundle(InputStream o0){}}
