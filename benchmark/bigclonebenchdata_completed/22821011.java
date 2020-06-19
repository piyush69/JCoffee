import java.io.*;
import java.lang.*;
import java.util.*;



class c22821011 {

    public static void main(String[] args) {
        String command = "java -jar  ";
        String linkerJarPath = "";
        String path = "";
        String osName = System.getProperty("os.name");
        String temp = Launcher.class.getResource("").toString();
        int index = temp.indexOf(".jar");
        int start = index - 1;
        while (Character.isLetter(temp.charAt(start))) {
            start--;
        }
        String jarName = temp.substring(start + 1, index + 4);
        System.out.println(jarName);
        if (osName.startsWith("Linux")) {
            temp = temp.substring(temp.indexOf("/"), temp.indexOf(jarName));
        } else if (osName.startsWith("Windows")) {
            temp = temp.substring(temp.indexOf("file:") + 5, temp.indexOf(jarName));
        } else {
            System.exit(0);
        }
        path = path + temp;
        try {
            path = java.net.URLDecoder.decode(path, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        File dir = new File(path);
        File[] files = dir.listFiles();
        String exeJarName = null;
        for (File f : files) {
            if (f.getName().endsWith(".jar") && !f.getName().startsWith(jarName)) {
                exeJarName = f.getName();
                break;
            }
        }
        if (exeJarName == null) {
            System.out.println("no exefile");
            System.exit(0);
        }
        linkerJarPath = path + exeJarName;
        String pluginDirPath = path + "plugin" + File.separator;
        File[] plugins = new File(pluginDirPath).listFiles();
        StringBuffer pluginNames = new StringBuffer("");
        for (File plugin : plugins) {
            if (plugin.getAbsolutePath().endsWith(".jar")) {
                pluginNames.append("plugin/" + plugin.getName() + " ");
            }
        }
        String libDirPath = path + "lib" + File.separator;
        File[] libs = new File(libDirPath).listFiles();
        StringBuffer libNames = new StringBuffer("");
        for (File lib : libs) {
            if (lib.getAbsolutePath().endsWith(".jar")) {
                libNames.append("lib/" + lib.getName() + " ");
            }
        }
        try {
            JarFile jarFile = new JarFile(linkerJarPath);
            Manifest manifest =(Manifest)(Object) jarFile.getManifest();
            if (manifest == null) {
                manifest = new Manifest();
            }
            Attributes attributes =(Attributes)(Object) manifest.getMainAttributes();
            attributes.putValue("Class-Path", pluginNames.toString() + libNames.toString());
            String backupFile = linkerJarPath + "back";
            FileInputStream copyInput = new FileInputStream(linkerJarPath);
            FileOutputStream copyOutput = new FileOutputStream(backupFile);
            byte[] buffer = new byte[4096];
            int s;
            while ((s = copyInput.read(buffer)) > -1) {
                copyOutput.write(buffer, 0, s);
            }
            copyOutput.flush();
            copyOutput.close();
            copyInput.close();
            JarOutputStream jarOut = new JarOutputStream(new FileOutputStream(linkerJarPath), manifest);
            JarInputStream jarIn = new JarInputStream(new FileInputStream(backupFile));
            byte[] buf = new byte[4096];
            JarEntry entry;
            while ((entry =(JarEntry)(Object) jarIn.getNextJarEntry()) != null) {
                if ("META-INF/MANIFEST.MF".equals(entry.getName())) continue;
                jarOut.putNextEntry(entry);
                int read;
                while ((read =(int)(Object) jarIn.read(buf)) != -1) {
                    jarOut.write(buf, 0, read);
                }
                jarOut.closeEntry();
            }
            jarOut.flush();
            jarOut.close();
            jarIn.close();
            File file = new File(backupFile);
            if (file.exists()) {
                file.delete();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            if (System.getProperty("os.name").startsWith("Linux")) {
                Runtime runtime = Runtime.getRuntime();
                String[] commands = new String[] { "java", "-jar", path + exeJarName };
                runtime.exec(commands);
            } else {
                path = path.substring(1);
                command = command + "\"" + path + exeJarName + "\"";
                System.out.println(command);
                Runtime.getRuntime().exec(command);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Launcher {

}

class JarFile {

JarFile(){}
	JarFile(String o0){}
	public MyHelperClass getManifest(){ return null; }}

class Manifest {

public MyHelperClass getMainAttributes(){ return null; }}

class Attributes {

public MyHelperClass putValue(String o0, String o1){ return null; }}

class JarOutputStream {

JarOutputStream(FileOutputStream o0, Manifest o1){}
	JarOutputStream(){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class JarInputStream {

JarInputStream(FileInputStream o0){}
	JarInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass getNextJarEntry(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}
