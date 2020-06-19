import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6068118 {
public MyHelperClass exportCommunitySystemView(Community o0, String o1, FileOutputStream o2){ return null; }
public MyHelperClass log;
	public MyHelperClass JCRUtil;
	public MyHelperClass I18NUtils;
	public MyHelperClass TemporaryFilesHandler;
	public MyHelperClass getCommunityById(String o0){ return null; }

    public byte[] exportCommunityData(String communityId) throws Throwable, RepositoryException, IOException {
        Community community;
        try {
            community =(Community)(Object) getCommunityById(communityId);
        } catch (UncheckedIOException e1) {
            throw new GroupwareRuntimeException("Community to export not found");
        }
        String contentPath =(String)(Object) JCRUtil.getNodeById(communityId, community.getWorkspace()).getPath();
        try {
            File zipOutFilename = File.createTempFile("exported-community", ".zip.tmp");
            TemporaryFilesHandler.register(null, zipOutFilename);
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipOutFilename));
            File file = File.createTempFile("exported-community", null);
            TemporaryFilesHandler.register(null, file);
            FileOutputStream fos = new FileOutputStream(file);
            exportCommunitySystemView(community, contentPath, fos);
            fos.close();
            File propertiesFile = File.createTempFile("exported-community-properties", null);
            TemporaryFilesHandler.register(null, propertiesFile);
            FileOutputStream fosProperties = new FileOutputStream(propertiesFile);
            fosProperties.write(("communityId=" + communityId).getBytes());
            fosProperties.write(";".getBytes());
            fosProperties.write(("externalId=" + community.getExternalId()).getBytes());
            fosProperties.write(";".getBytes());
            fosProperties.write(("title=" + I18NUtils.localize(community.getTitle())).getBytes());
            fosProperties.write(";".getBytes());
            fosProperties.write(("communityType=" + community.getType()).getBytes());
            fosProperties.write(";".getBytes());
            fosProperties.write(("communityName=" + community.getName()).getBytes());
            fosProperties.close();
            FileInputStream finProperties = new FileInputStream(propertiesFile);
            byte[] bufferProperties = new byte[4096];
            out.putNextEntry(new ZipEntry("properties"));
            int readProperties = 0;
            while ((readProperties = finProperties.read(bufferProperties)) > 0) {
                out.write(bufferProperties, 0, readProperties);
            }
            finProperties.close();
            FileInputStream fin = new FileInputStream(file);
            byte[] buffer = new byte[4096];
            out.putNextEntry(new ZipEntry("xmlData"));
            int read = 0;
            while ((read = fin.read(buffer)) > 0) {
                out.write(buffer, 0, read);
            }
            fin.close();
            out.close();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            FileInputStream fisZipped = new FileInputStream(zipOutFilename);
            byte[] bufferOut = new byte[4096];
            int readOut = 0;
            while ((readOut = fisZipped.read(bufferOut)) > 0) {
                baos.write(bufferOut, 0, readOut);
            }
            return baos.toByteArray();
        } catch (Exception e) {
            String errorMessage = "Error exporting backup data, for comunnity with id " + communityId;
            log.error(errorMessage, e);
            throw new CMSRuntimeException(errorMessage, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass register(Object o0, File o1){ return null; }
	public MyHelperClass localize(MyHelperClass o0){ return null; }
	public MyHelperClass getNodeById(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }}

class RepositoryException extends Exception{
	public RepositoryException(String errorMessage) { super(errorMessage); }
}

class Community {

public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getExternalId(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getWorkspace(){ return null; }}

class CommunityNotFoundException extends Exception{
	public CommunityNotFoundException(String errorMessage) { super(errorMessage); }
}

class GroupwareRuntimeException extends Exception{
	public GroupwareRuntimeException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class CMSRuntimeException extends Exception{
	public CMSRuntimeException(String errorMessage) { super(errorMessage); }
	CMSRuntimeException(String o0, Exception o1){}
	CMSRuntimeException(){}
}
