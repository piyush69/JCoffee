import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11277690 {
public MyHelperClass MANUAL_EXPORTED_COMMUNITY_PREFIX;
	public MyHelperClass PERSONAL_COMMUNITY_TYPE;

    File exportCommunityData(Community community) throws CommunityNotActiveException, FileNotFoundException, IOException, CommunityNotFoundException {
        try {
            String communityId =(String)(Object) community.getId();
            if (!(Boolean)(Object)community.isActive()) {
                MyHelperClass log = new MyHelperClass();
                log.error("The community with id " + communityId + " is inactive");
                throw new CommunityNotActiveException("The community with id " + communityId + " is inactive");
            }
            MyHelperClass CommunityManagerImpl = new MyHelperClass();
            new File((String)(Object)CommunityManagerImpl.EXPORTED_COMMUNITIES_PATH).mkdirs();
            String communityName =(String)(Object) community.getName();
            String communityType =(String)(Object) community.getType();
            MyHelperClass I18NUtils = new MyHelperClass();
            String communityTitle =(String)(Object) I18NUtils.localize(community.getTitle());
            File zipOutFilename;
            if ((boolean)(Object)community.isPersonalCommunity()) {
//                MyHelperClass CommunityManagerImpl = new MyHelperClass();
                zipOutFilename = new File(CommunityManagerImpl.EXPORTED_COMMUNITIES_PATH + communityName + ".zip");
            } else {
//                MyHelperClass CommunityManagerImpl = new MyHelperClass();
                zipOutFilename = new File((int)(Object)CommunityManagerImpl.EXPORTED_COMMUNITIES_PATH + (int)(Object)MANUAL_EXPORTED_COMMUNITY_PREFIX + communityTitle + ".zip");
            }
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipOutFilename));
            File file = File.createTempFile("exported-community", null);
            MyHelperClass TemporaryFilesHandler = new MyHelperClass();
            TemporaryFilesHandler.register(null, file);
            FileOutputStream fos = new FileOutputStream(file);
            MyHelperClass JCRUtil = new MyHelperClass();
            String contentPath =(String)(Object) JCRUtil.getNodeById(communityId).getPath();
//            MyHelperClass JCRUtil = new MyHelperClass();
            JCRUtil.currentSession().exportSystemView(contentPath, fos, false, false);
            fos.close();
            File propertiesFile = File.createTempFile("exported-community-properties", null);
//            MyHelperClass TemporaryFilesHandler = new MyHelperClass();
            TemporaryFilesHandler.register(null, propertiesFile);
            FileOutputStream fosProperties = new FileOutputStream(propertiesFile);
            fosProperties.write(("communityId=" + communityId).getBytes());
            fosProperties.write(";".getBytes());
            fosProperties.write(("externalId=" + community.getExternalId()).getBytes());
            fosProperties.write(";".getBytes());
            fosProperties.write(("title=" + communityTitle).getBytes());
            fosProperties.write(";".getBytes());
            fosProperties.write(("communityType=" + communityType).getBytes());
            fosProperties.write(";".getBytes());
            fosProperties.write(("communityName=" + communityName).getBytes());
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
            community.setActive(Boolean.FALSE);
            MyHelperClass communityPersister = new MyHelperClass();
            communityPersister.saveCommunity(community);
//            MyHelperClass communityPersister = new MyHelperClass();
            Collection<Community> duplicatedPersonalCommunities =(Collection<Community>)(Object) communityPersister.searchCommunitiesByName(communityName);
            if (PERSONAL_COMMUNITY_TYPE.equals(communityType)) {
                for (Community currentCommunity : duplicatedPersonalCommunities) {
                    if ((boolean)(Object)currentCommunity.isActive()) {
                        currentCommunity.setActive(Boolean.FALSE);
//                        MyHelperClass communityPersister = new MyHelperClass();
                        communityPersister.saveCommunity(currentCommunity);
                    }
                }
            }
            return zipOutFilename;
        } catch (ArithmeticException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Error getting community with id " + community.getId());
            throw new GroupwareRuntimeException("Error getting community with id " + community.getId(), e.getCause());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EXPORTED_COMMUNITIES_PATH;
public MyHelperClass localize(MyHelperClass o0){ return null; }
	public MyHelperClass saveCommunity(Community o0){ return null; }
	public MyHelperClass getNodeById(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass currentSession(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass exportSystemView(String o0, FileOutputStream o1, boolean o2, boolean o3){ return null; }
	public MyHelperClass searchCommunitiesByName(String o0){ return null; }
	public MyHelperClass register(Object o0, File o1){ return null; }}

class Community {

public MyHelperClass isPersonalCommunity(){ return null; }
	public MyHelperClass isActive(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass setActive(Boolean o0){ return null; }
	public MyHelperClass getExternalId(){ return null; }}

class CommunityNotActiveException extends Exception{
	public CommunityNotActiveException(String errorMessage) { super(errorMessage); }
}

class CommunityNotFoundException extends Exception{
	public CommunityNotFoundException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class RepositoryException extends Exception{
	public RepositoryException(String errorMessage) { super(errorMessage); }
}

class GroupwareRuntimeException extends Exception{
	public GroupwareRuntimeException(String errorMessage) { super(errorMessage); }
	GroupwareRuntimeException(String o0, Throwable o1){}
	GroupwareRuntimeException(){}
}
