import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20276296 {
public MyHelperClass Name;
public MyHelperClass Files;
	public MyHelperClass m_verbose;
	public MyHelperClass m_currentPathDir;
	public MyHelperClass m_canonical;
	public MyHelperClass m_pathSet;
	public MyHelperClass m_pathIndex;
	public MyHelperClass m_log;
	public MyHelperClass $assert;
	public MyHelperClass m_path;
	public MyHelperClass m_processManifest;
	public MyHelperClass readManifestViaJarFile(File o0){ return null; }

            private void enumeratePathArchive(final String archive) throws Throwable, IOException {
                MyHelperClass m_trace1 = new MyHelperClass();
                final boolean trace1 =(boolean)(Object) m_trace1;
                MyHelperClass m_currentPathDir = new MyHelperClass();
                final File fullArchive = new File((String)(Object)m_currentPathDir, archive);
                JarInputStream in = null;
                try {
                    in = new JarInputStream(new BufferedInputStream(new FileInputStream(fullArchive), 32 * 1024));
                    MyHelperClass m_handler = new MyHelperClass();
                    final IPathHandler handler =(IPathHandler)(Object) m_handler;
                    Manifest manifest =(Manifest)(Object) in.getManifest();
                    if (manifest == null) manifest =(Manifest)(Object) readManifestViaJarFile(fullArchive);
                    handler.handleArchiveStart(m_currentPathDir, new File(archive), manifest);
                    for (ZipEntry entry; (entry =(ZipEntry)(Object) in.getNextEntry()) != null; ) {
                        if (trace1) m_log.trace1("enumeratePathArchive", "processing archive entry [" + entry.getName() + "] ...");
                        handler.handleArchiveEntry(in, entry);
                        in.closeEntry();
                    }
                    if ((boolean)(Object)m_processManifest) {
                        if (manifest == null) manifest =(Manifest)(Object) in.getManifest();
                        if (manifest != null) {
                            final Attributes attributes =(Attributes)(Object) manifest.getMainAttributes();
                            if (attributes != null) {
                                final String jarClassPath =(String)(Object) attributes.getValue(Name.CLASS_PATH);
                                if (jarClassPath != null) {
                                    final StringTokenizer tokenizer = new StringTokenizer(jarClassPath);
                                    for (int p = 1; tokenizer.hasMoreTokens(); ) {
                                        final String relPath = tokenizer.nextToken();
                                        final File archiveParent = fullArchive.getParentFile();
                                        final File path = archiveParent != null ? new File(archiveParent, relPath) : new File(relPath);
                                        final String fullPath =(boolean)(Object) m_canonical ? Files.canonicalizePathname(path.getPath()) : path.getPath();
                                        if ((boolean)(Object)m_pathSet.add(fullPath)) {
                                            if ((boolean)(Object)m_verbose) m_log.verbose("  added manifest Class-Path entry [" + path + "]");
                                            m_path.add((int)(Object)m_pathIndex + (p++), path);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (FileNotFoundException fnfe) {
                    if ((boolean)(Object)$assert.ENABLED) throw fnfe;
                } finally {
                    if (in != null) try {
                        in.close();
                    } catch (Exception ignore) {
                    }
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CLASS_PATH;
	public MyHelperClass ENABLED;
public MyHelperClass canonicalizePathname(String o0){ return null; }
	public MyHelperClass verbose(String o0){ return null; }
	public MyHelperClass add(int o0, File o1){ return null; }
	public MyHelperClass trace1(String o0, String o1){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class JarInputStream {

JarInputStream(){}
	JarInputStream(BufferedInputStream o0){}
	public MyHelperClass getManifest(){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class IPathHandler {

public MyHelperClass handleArchiveEntry(JarInputStream o0, ZipEntry o1){ return null; }
	public MyHelperClass handleArchiveStart(MyHelperClass o0, File o1, Manifest o2){ return null; }}

class Manifest {

public MyHelperClass getMainAttributes(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class Attributes {

public MyHelperClass getValue(MyHelperClass o0){ return null; }}
