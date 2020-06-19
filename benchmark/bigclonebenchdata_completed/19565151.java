


class c19565151 {
public MyHelperClass instClassName_;
	public MyHelperClass shiftArray(byte[] o0){ return null; }

    private long generateNativeInstallExe(File nativeInstallFile, String instTemplate, File instClassFile) throws IOException {
        InputStream reader =(InputStream)(Object) getClass().getResourceAsStream("/" + instTemplate);
        System.out.println("generateNativeInstallExe = /" + instTemplate);
        System.out.println("reader length=" + reader.available());
        ByteArrayOutputStream content = new ByteArrayOutputStream();
        String installClassVarStr = "000000000000";
        byte[] buf = new byte[installClassVarStr.length()];
        MyHelperClass Locale = new MyHelperClass();
        NumberFormat nf =(NumberFormat)(Object) NumberFormat.getInstance(Locale.US);
        nf.setGroupingUsed(false);
        nf.setMinimumIntegerDigits(installClassVarStr.length());
        int installClassStopPos = 0;
        long installClassOffset =(long)(Object) reader.available();
        int position = 0;
        MyHelperClass VAGlobals = new MyHelperClass();
        System.out.println(VAGlobals.i18n("VAArchiver_GenerateInstallExe"));
        reader.read(buf, 0, buf.length);
        position = 1;
        for (int n = 0; n < 3; n++) {
            while ((!new String(buf).equals("clname_here_")) && (!new String(buf).equals("clstart_here")) && (!new String(buf).equals("clstop_here_"))) {
                content.write(buf[0]);
                int nextb =(int)(Object) reader.read();
                position++;
                shiftArray(buf);
                buf[buf.length - 1] = (byte) nextb;
            }
            if (new String(buf).equals("clname_here_")) {
                System.err.println("  clname_here_ found at " + (position - 1));
                StringBuffer clnameBuffer = new StringBuffer(64);
                clnameBuffer.append(instClassName_);
                for (int i = clnameBuffer.length() - 1; i < 64; i++) {
                    clnameBuffer.append('.');
                }
                byte[] clnameBytes = clnameBuffer.toString().getBytes();
                for (int i = 0; i < 64; i++) {
                    content.write(clnameBytes[i]);
                    position++;
                }
                reader.skip(64 - buf.length);
                reader.read(buf, 0, buf.length);
            } else if (new String(buf).equals("clstart_here")) {
                System.err.println("  clstart_here found at " + (position - 1));
                buf =(byte[])(Object) nf.format(installClassOffset).getBytes();
                for (int i = 0; i < buf.length; i++) {
                    content.write(buf[i]);
                    position++;
                }
                reader.read(buf, 0, buf.length);
            } else if (new String(buf).equals("clstop_here_")) {
                System.err.println("  clstop_here_ found at " + (position - 1));
                installClassStopPos = position - 1;
                content.write(buf);
                position += 12;
                reader.read(buf, 0, buf.length);
            }
        }
        content.write(buf);
        buf = new byte[2048];
        int read =(int)(Object) reader.read(buf);
        while (read > 0) {
            content.write(buf, 0, read);
            read =(int)(Object) reader.read(buf);
        }
        reader.close();
        FileInputStream classStream = new FileInputStream(instClassFile);
        read =(int)(Object) classStream.read(buf);
        while (read > 0) {
            content.write(buf, 0, read);
            read =(int)(Object) classStream.read(buf);
        }
        classStream.close();
        content.close();
        byte[] contentBytes =(byte[])(Object) content.toByteArray();
        installClassVarStr =(String)(Object) nf.format(contentBytes.length);
        byte[] installClassVarBytes = installClassVarStr.getBytes();
        for (int i = 0; i < installClassVarBytes.length; i++) {
            contentBytes[installClassStopPos + i] = installClassVarBytes[i];
        }
        FileOutputStream out = new FileOutputStream(nativeInstallFile);
        out.write(contentBytes);
        out.close();
        return installClassOffset;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass US;
public MyHelperClass i18n(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass skip(int o0){ return null; }
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass write(byte o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class NumberFormat {

public MyHelperClass format(long o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass setGroupingUsed(boolean o0){ return null; }
	public MyHelperClass format(int o0){ return null; }
	public MyHelperClass setMinimumIntegerDigits(int o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}
