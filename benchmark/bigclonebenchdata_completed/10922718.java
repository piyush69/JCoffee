
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10922718 {
public static MyHelperClass jCon;
	public static MyHelperClass jTyp;
	public static MyHelperClass InstallName;
	public static MyHelperClass jAge;
	public static MyHelperClass WinName;
	public static MyHelperClass jSta;
	public static MyHelperClass jOcc;
	public static MyHelperClass WinCompany;
	public static MyHelperClass jInt;
	public static MyHelperClass jSex;
	public static MyHelperClass jSal;
	public static MyHelperClass jVer;
	public static MyHelperClass MAC;
	public static MyHelperClass InstallCompany;
	public static MyHelperClass checkEmptyString(MyHelperClass o0){ return null; }
//public MyHelperClass jVer;
//	public MyHelperClass InstallName;
//	public MyHelperClass jAge;
//	public MyHelperClass InstallCompany;
//	public MyHelperClass jSal;
//	public MyHelperClass jSex;
//	public MyHelperClass jCon;
//	public MyHelperClass WinName;
//	public MyHelperClass jSta;
//	public MyHelperClass jTyp;
//	public MyHelperClass WinCompany;
//	public MyHelperClass jOcc;
//	public MyHelperClass MAC;
//	public MyHelperClass jInt;
//	public MyHelperClass checkEmptyString(MyHelperClass o0){ return null; }

    public static boolean downloadRegPage() {
        MyHelperClass jDtr = new MyHelperClass();
        String filename = "register.php?csz=" + checkEmptyString(jDtr) + "&&mac=" + MAC + "&&uname=" + checkEmptyString(InstallName) + "&&cname=" + checkEmptyString(InstallCompany) + "&&winuname=" + checkEmptyString(WinName) + "&&wincname=" + checkEmptyString(WinCompany) + "&&age=" + checkEmptyString(jAge) + "&&sal=" + checkEmptyString(jSal) + "&&sta=" + checkEmptyString(jSta) + "&&sex=" + checkEmptyString(jSex) + "&&con=" + checkEmptyString(jCon) + "&&occ=" + checkEmptyString(jOcc) + "&&int=" + checkEmptyString(jInt) + "&&ver=" + checkEmptyString(jVer) + "&&mor=" + checkEmptyString(jTyp);
        URL url1 = null;
        try {
            MyHelperClass url = new MyHelperClass();
            url1 = new URL(url + filename);
        } catch (UncheckedIOException e1) {
        }
        int status = 0;
        try {
            status =(int)(Object) ((HttpURLConnection)(HttpURLConnection)(Object) url1.openConnection()).getResponseCode();
        } catch (UncheckedIOException e1) {
            System.out.println(e1);
        }
        if (status == 200) {
            return true;
        } else {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
