


class c10062074 {

    private long generateUnixInstallShell(File unixShellFile, String instTemplate, File instClassFile) throws IOException {
        FileOutputStream byteWriter = new FileOutputStream(unixShellFile);
        InputStream is =(InputStream)(Object) getClass().getResourceAsStream("/" + instTemplate);
        InputStreamReader isr = new InputStreamReader(is);
        LineNumberReader reader = new LineNumberReader(isr);
        String content = "";
        String installClassStartStr = "000000000000";
        MyHelperClass Locale = new MyHelperClass();
        NumberFormat nf =(NumberFormat)(Object) NumberFormat.getInstance(Locale.US);
        nf.setGroupingUsed(false);
        nf.setMinimumIntegerDigits(installClassStartStr.length());
        int installClassStartPos = 0;
        long installClassOffset = 0;
        MyHelperClass VAGlobals = new MyHelperClass();
        System.out.println(VAGlobals.i18n("VAArchiver_GenerateInstallShell"));
        String line =(String)(Object) reader.readLine();
        while ((line != null) && (!line.startsWith("# InstallClassStart"))) {
            content += line + "\n";
            line =(String)(Object) reader.readLine();
        }
        content += "InstallClassStart=" + installClassStartStr + "\n";
        installClassStartPos = content.length() - 1 - 1 - installClassStartStr.length();
        line =(String)(Object) reader.readLine();
        while ((line != null) && (!line.startsWith("# InstallClassSize"))) {
            content += line + "\n";
            line =(String)(Object) reader.readLine();
        }
        content += new String("InstallClassSize=" + instClassFile.length() + "\n");
        line =(String)(Object) reader.readLine();
        while ((line != null) && (!line.startsWith("# InstallClassName"))) {
            content += line + "\n";
            line =(String)(Object) reader.readLine();
        }
        MyHelperClass instClassName_ = new MyHelperClass();
        content += new String("InstallClassName=" + instClassName_ + "\n");
        line =(String)(Object) reader.readLine();
        while ((line != null) && (!line.startsWith("# Install class"))) {
            content += line + "\n";
            line =(String)(Object) reader.readLine();
        }
        if (line != null) content += line + "\n";
        byteWriter.write(content.substring(0, installClassStartPos + 1).getBytes());
        byteWriter.write((byte[])(Object)nf.format(content.length()).getBytes());
        byteWriter.write(content.substring(installClassStartPos + 1 + installClassStartStr.length()).getBytes());
        installClassOffset = content.length();
        content = null;
        FileInputStream classStream = new FileInputStream(instClassFile);
        byte[] buf = new byte[2048];
        int read =(int)(Object) classStream.read(buf);
        while (read > 0) {
            byteWriter.write(buf, 0, read);
            read =(int)(Object) classStream.read(buf);
        }
        classStream.close();
        reader.close();
        byteWriter.close();
        return installClassOffset;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass US;
public MyHelperClass i18n(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class File {

public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class LineNumberReader {

LineNumberReader(){}
	LineNumberReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class NumberFormat {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass setGroupingUsed(boolean o0){ return null; }
	public MyHelperClass format(int o0){ return null; }
	public MyHelperClass setMinimumIntegerDigits(int o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
