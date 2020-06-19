
import java.io.UncheckedIOException;


class c7109222 {

    public static void zipMapBos(DitaBoundedObjectSet mapBos, File outputZipFile, MapBosProcessorOptions options) throws Exception {
        MyHelperClass log = new MyHelperClass();
        log.debug("Determining zip file organization...");
        BosVisitor visitor =(BosVisitor)(Object) new DxpFileOrganizingBosVisitor();
        visitor.visit(mapBos);
//        MyHelperClass log = new MyHelperClass();
        if (!(Boolean)(Object)options.isQuiet()) log.info("Creating DXP package \"" + outputZipFile.getAbsolutePath() + "\"...");
        OutputStream outStream =(OutputStream)(Object) new FileOutputStream(outputZipFile);
        ZipOutputStream zipOutStream = new ZipOutputStream(outStream);
        ZipEntry entry = null;
        URI rootMapUri =(URI)(Object) mapBos.getRoot().getEffectiveUri();
        URI baseUri = null;
        try {
            MyHelperClass AddressingUtil = new MyHelperClass();
            baseUri =(URI)(Object) AddressingUtil.getParent(rootMapUri);
        } catch (UncheckedIOException e) {
            throw new BosException("URI syntax exception getting parent URI: " + e.getMessage());
        }
        Set dirs =(Set)(Object) new HashSet();
//        MyHelperClass log = new MyHelperClass();
        if (!(Boolean)(Object)options.isQuiet()) log.info("Constructing DXP package...");
        for (BosMember member :(BosMember[])(Object) (Object[])(Object)mapBos.getMembers()) {
//            MyHelperClass log = new MyHelperClass();
            if (!(Boolean)(Object)options.isQuiet()) log.info("Adding member " + member + " to zip...");
            URI relativeUri =(URI)(Object) baseUri.relativize(member.getEffectiveUri());
            File temp = new File(relativeUri.getPath());
            String parentPath =(String)(Object) temp.getParent();
            if (parentPath != null && !"".equals(parentPath) && !parentPath.endsWith("/")) {
                parentPath += "/";
            }
//            MyHelperClass log = new MyHelperClass();
            log.debug("parentPath=\"" + parentPath + "\"");
            if (!"".equals(parentPath) && parentPath != null && !(Boolean)(Object)dirs.contains(parentPath)) {
                entry = new ZipEntry(parentPath);
                zipOutStream.putNextEntry(entry);
                zipOutStream.closeEntry();
                dirs.add(parentPath);
            }
            entry = new ZipEntry((String)(Object)relativeUri.getPath());
            zipOutStream.putNextEntry(entry);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(member.getInputStream(), zipOutStream);
            zipOutStream.closeEntry();
        }
        zipOutStream.close();
//        MyHelperClass log = new MyHelperClass();
        if (!(Boolean)(Object)options.isQuiet()) log.info("DXP package \"" + outputZipFile.getAbsolutePath() + "\" created.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, ZipOutputStream o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getParent(URI o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getEffectiveUri(){ return null; }}

class DitaBoundedObjectSet {

public MyHelperClass getRoot(){ return null; }
	public MyHelperClass getMembers(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParent(){ return null; }}

class MapBosProcessorOptions {

public MyHelperClass isQuiet(){ return null; }}

class BosVisitor {

public MyHelperClass visit(DitaBoundedObjectSet o0){ return null; }}

class DxpFileOrganizingBosVisitor {

}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(OutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class URI {

public MyHelperClass relativize(MyHelperClass o0){ return null; }
	public MyHelperClass getPath(){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class BosException extends Exception{
	public BosException(String errorMessage) { super(errorMessage); }
}

class Set {

public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class HashSet {

}

class BosMember {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getEffectiveUri(){ return null; }}
