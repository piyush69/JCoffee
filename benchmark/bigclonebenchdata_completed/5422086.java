


class c5422086 {
public MyHelperClass getProjectFilePath(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getAssetsFilePath(MyHelperClass o0){ return null; }
	public MyHelperClass getManifestFilePath(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getScreenFilePath(MyHelperClass o0, AppInventorScreen o1){ return null; }

    public void writeOutput(String directory) throws IOException {
        File f = new File(directory);
        int i = 0;
        if ((boolean)(Object)f.isDirectory()) {
            MyHelperClass screens = new MyHelperClass();
            for (AppInventorScreen screen :(AppInventorScreen[])(Object) (Object[])(Object)screens.values()) {
                File screenFile = new File((String)(Object)getScreenFilePath(f.getAbsolutePath(), screen));
                screenFile.getParentFile().mkdirs();
                screenFile.createNewFile();
                FileWriter out = new FileWriter(screenFile);
                MyHelperClass files = new MyHelperClass();
                String initial = files.get(i).toString();
                Map types =(Map)(Object) screen.getTypes();
                String[] lines = initial.split("\n");
                for (String key :(String[])(Object) (Object[])(Object)types.keySet()) {
                    if (!key.trim().equals(screen.getName().trim())) {
                        String value =(String)(Object) types.get(key);
                        boolean varFound = false;
                        boolean importFound = false;
                        for (String line : lines) {
                            if (line.matches("^\\s*(public|private)\\s+" + value + "\\s+" + key + "\\s*=.*;$")) varFound = true;
                            if (line.matches("^\\s*(public|private)\\s+" + value + "\\s+" + key + "\\s*;$")) varFound = true;
                            if (line.matches("^\\s*import\\s+.*" + value + "\\s*;$")) importFound = true;
                        }
                        if (!varFound) initial = initial.replaceFirst("(?s)(?<=\\{\n)", "\tprivate " + value + " " + key + ";\n");
                        if (!importFound) initial = initial.replaceFirst("(?=import)", "import com.google.devtools.simple.runtime.components.android." + value + ";\n");
                    }
                }
                out.write(initial);
                out.close();
                i++;
            }
            MyHelperClass manifest = new MyHelperClass();
            File manifestFile = new File((String)(Object)getManifestFilePath(f.getAbsolutePath(), manifest));
            manifestFile.getParentFile().mkdirs();
            manifestFile.createNewFile();
            FileWriter out = new FileWriter(manifestFile);
//            MyHelperClass manifest = new MyHelperClass();
            out.write(manifest.toString());
            out.close();
            MyHelperClass project = new MyHelperClass();
            File projectFile = new File((String)(Object)getProjectFilePath(f.getAbsolutePath(), project));
            projectFile.getParentFile().mkdirs();
            projectFile.createNewFile();
            out = new FileWriter(projectFile);
//            MyHelperClass project = new MyHelperClass();
            out.write(project.toString());
            out.close();
            String[] copyResourceFilenames = { "proguard.cfg", "project.properties", "libSimpleAndroidRuntime.jar", "\\.classpath", "res/drawable/icon.png", "\\.settings/org.eclipse.jdt.core.prefs" };
            for (String copyResourceFilename : copyResourceFilenames) {
                InputStream is =(InputStream)(Object) getClass().getResourceAsStream("/resources/" + copyResourceFilename.replace("\\.", ""));
                MyHelperClass File = new MyHelperClass();
                File outputFile = new File((int)(Object)f.getAbsoluteFile() + (int)(Object)File.separator + copyResourceFilename.replace("\\.", "."));
                outputFile.getParentFile().mkdirs();
                OutputStream os =(OutputStream)(Object) new FileOutputStream(outputFile);
                byte[] buf = new byte[1024];
                int readBytes;
                if (is == null) System.out.println("/resources/" + copyResourceFilename.replace("\\.", ""));
//                MyHelperClass File = new MyHelperClass();
                if (os == null) System.out.println((int)(Object)f.getAbsolutePath() + (int)(Object)File.separator + copyResourceFilename.replace("\\.", "."));
                while ((readBytes =(int)(Object) is.read(buf)) > 0) {
                    os.write(buf, 0, readBytes);
                }
            }
            MyHelperClass assets = new MyHelperClass();
            for (String assetName :(String[])(Object) (Object[])(Object)assets) {
                MyHelperClass assetsDir = new MyHelperClass();
                InputStream is =(InputStream)(Object) new FileInputStream(new File((int)(Object)assetsDir.getAbsolutePath() + (int)(Object)File.separator + assetName));
                MyHelperClass File = new MyHelperClass();
                File outputFile = new File((int)(Object)f.getAbsoluteFile() + (int)(Object)File.separator + assetName);
                outputFile.getParentFile().mkdirs();
                OutputStream os =(OutputStream)(Object) new FileOutputStream(outputFile);
                byte[] buf = new byte[1024];
                int readBytes;
                while ((readBytes =(int)(Object) is.read(buf)) > 0) {
                    os.write(buf, 0, readBytes);
                }
            }
            File assetsOutput = new File((String)(Object)getAssetsFilePath(f.getAbsolutePath()));
            MyHelperClass assetsDir = new MyHelperClass();
            new File((int)(Object)assetsDir.getAbsoluteFile() + (int)(Object)File.separator + "assets").renameTo(assetsOutput);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass getAbsoluteFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass values(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {
public static MyHelperClass separator;
File(){}
	File(String o0){}
	public MyHelperClass getAbsoluteFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class AppInventorScreen {

public MyHelperClass getTypes(){ return null; }
	public MyHelperClass getName(){ return null; }}
