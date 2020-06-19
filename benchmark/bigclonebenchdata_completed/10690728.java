


class c10690728 {
public MyHelperClass standardEntry(MyHelperClass o0, MyHelperClass o1, int o2){ return null; }

    private void addMaintainerScripts(TarOutputStream tar, PackageInfo info) throws IOException, ScriptDataTooLargeException {
        for (final MaintainerScript script :(MaintainerScript[])(Object) (Object[])(Object)info.getMaintainerScripts().values()) {
            if ((int)(Object)script.getSize() > Integer.MAX_VALUE) {
                throw new ScriptDataTooLargeException("The script data is too large for the tar file. script=[" + script.getType().getFilename() + "].");
            }
            MyHelperClass UnixStandardPermissions = new MyHelperClass();
            final TarEntry entry =(TarEntry)(Object) standardEntry(script.getType().getFilename(), UnixStandardPermissions.EXECUTABLE_FILE_MODE, (int)(int)(Object) script.getSize());
            tar.putNextEntry(entry);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(script.getStream(), tar);
            tar.closeEntry();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EXECUTABLE_FILE_MODE;
public MyHelperClass values(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, TarOutputStream o1){ return null; }
	public MyHelperClass getFilename(){ return null; }}

class TarOutputStream {

public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(TarEntry o0){ return null; }}

class PackageInfo {

public MyHelperClass getMaintainerScripts(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ScriptDataTooLargeException extends Exception{
	public ScriptDataTooLargeException(String errorMessage) { super(errorMessage); }
}

class MaintainerScript {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getStream(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class TarEntry {

}
