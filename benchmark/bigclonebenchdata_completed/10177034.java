


class c10177034 {

    public static synchronized BaseFont getL2BaseFont() {
        MyHelperClass l2baseFont = new MyHelperClass();
        if (l2baseFont == null) {
            MyHelperClass ConfigProvider = new MyHelperClass();
            final ConfigProvider conf =(ConfigProvider)(Object) ConfigProvider.getInstance();
            try {
                final ByteArrayOutputStream tmpBaos = new ByteArrayOutputStream();
                String fontPath =(String)(Object) conf.getNotEmptyProperty("font.path", null);
                String fontName;
                String fontEncoding;
                InputStream tmpIs;
                if (fontPath != null) {
                    fontName =(String)(Object) conf.getNotEmptyProperty("font.name", null);
                    if (fontName == null) {
                        fontName =(String)(Object) (new File(fontPath).getName());
                    }
                    fontEncoding =(String)(Object) conf.getNotEmptyProperty("font.encoding", null);
                    if (fontEncoding == null) {
                        MyHelperClass BaseFont = new MyHelperClass();
                        fontEncoding =(String)(Object) BaseFont.WINANSI;
                    }
                    tmpIs =(InputStream)(Object) new FileInputStream(fontPath);
                } else {
                    MyHelperClass Constants = new MyHelperClass();
                    fontName =(String)(Object) Constants.L2TEXT_FONT_NAME;
                    MyHelperClass BaseFont = new MyHelperClass();
                    fontEncoding =(String)(Object) BaseFont.IDENTITY_H;
//                    MyHelperClass Constants = new MyHelperClass();
                    tmpIs =(InputStream)(Object) FontUtils.class.getResourceAsStream((String)(Object)Constants.L2TEXT_FONT_PATH);
                }
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(tmpIs, tmpBaos);
                tmpIs.close();
                tmpBaos.close();
//                MyHelperClass l2baseFont = new MyHelperClass();
                l2baseFont = BaseFont.createFont(fontName, fontEncoding, BaseFont.EMBEDDED, BaseFont.CACHED, tmpBaos.toByteArray(), null);
            } catch (Exception e) {
                e.printStackTrace();
                try {
//                    MyHelperClass l2baseFont = new MyHelperClass();
                    l2baseFont = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, BaseFont.EMBEDDED);
                } catch (Exception ex) {
                }
            }
        }
//        MyHelperClass l2baseFont = new MyHelperClass();
        return (BaseFont)(Object)l2baseFont;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass L2TEXT_FONT_PATH;
	public MyHelperClass IDENTITY_H;
	public MyHelperClass WINANSI;
	public MyHelperClass L2TEXT_FONT_NAME;
public MyHelperClass getInstance(){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class BaseFont {
public static MyHelperClass EMBEDDED;
	public static MyHelperClass WINANSI;
	public static MyHelperClass HELVETICA;
	public static MyHelperClass CACHED;
public static MyHelperClass createFont(String o0, String o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, Object o5){ return null; }
	public static MyHelperClass createFont(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class ConfigProvider {

public MyHelperClass getNotEmptyProperty(String o0, Object o1){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FontUtils {

}
