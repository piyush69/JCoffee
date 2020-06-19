
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13760846 {

    private void pack() {
        MyHelperClass m_szBasePath = new MyHelperClass();
        String szImageDir = m_szBasePath + "Images";
        File fImageDir = new File(szImageDir);
        fImageDir.mkdirs();
        String ljIcon = System.getProperty("user.home");
        MyHelperClass m_szUsername = new MyHelperClass();
        ljIcon += System.getProperty("file.separator") + "MochaJournal" + System.getProperty("file.separator") + m_szUsername + System.getProperty("file.separator") + "Cache";
        File fUserDir = new File(ljIcon);
        File[] fIcons =(File[])(Object) fUserDir.listFiles();
        int iSize = fIcons.length;
        for (int i = 0; i < iSize; i++) {
            try {
                File fOutput = new File(fImageDir,(String)(Object) fIcons[i].getName());
                if (!(Boolean)(Object)fOutput.exists()) {
                    fOutput.createNewFile();
                    FileOutputStream fOut = new FileOutputStream(fOutput);
                    FileInputStream fIn = new FileInputStream(fIcons[i]);
                    while ((int)(Object)fIn.available() > 0) fOut.write(fIn.read());
                }
            } catch (UncheckedIOException e) {
                System.err.println(e);
            }
        }
        try {
            FileOutputStream fOut;
            InputStream fLJIcon =(InputStream)(Object) getClass().getResourceAsStream("/org/homedns/krolain/MochaJournal/Images/userinfo.gif");
            File fLJOut = new File(fImageDir, "user.gif");
            if (!(Boolean)(Object)fLJOut.exists()) {
                fOut = new FileOutputStream(fLJOut);
                while ((int)(Object)fLJIcon.available() > 0) fOut.write(fLJIcon.read());
            }
            fLJIcon =(InputStream)(Object) getClass().getResourceAsStream("/org/homedns/krolain/MochaJournal/Images/communitynfo.gif");
            fLJOut = new File(fImageDir, "comm.gif");
            if (!(Boolean)(Object)fLJOut.exists()) {
                fOut = new FileOutputStream(fLJOut);
                while ((int)(Object)fLJIcon.available() > 0) fOut.write(fLJIcon.read());
            }
            fLJIcon =(InputStream)(Object) getClass().getResourceAsStream("/org/homedns/krolain/MochaJournal/Images/icon_private.gif");
            fLJOut = new File(fImageDir, "icon_private.gif");
            if (!(Boolean)(Object)fLJOut.exists()) {
                fOut = new FileOutputStream(fLJOut);
                while ((int)(Object)fLJIcon.available() > 0) fOut.write(fLJIcon.read());
            }
            fLJIcon =(InputStream)(Object) getClass().getResourceAsStream("/org/homedns/krolain/MochaJournal/Images/icon_protected.gif");
            fLJOut = new File(fImageDir, "icon_protected.gif");
            if (!(Boolean)(Object)fLJOut.exists()) {
                fOut = new FileOutputStream(fLJOut);
                while ((int)(Object)fLJIcon.available() > 0) fOut.write(fLJIcon.read());
            }
        } catch (UncheckedIOException e) {
            System.err.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	File(File o0, String o1){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass available(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass available(){ return null; }}
