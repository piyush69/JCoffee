import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3792789 {
public MyHelperClass versions;
	public MyHelperClass groupID;
	public MyHelperClass regions;
	public MyHelperClass rules;

    private  void ResourceZoneRulesDataProvider(URL url) throws Throwable, ClassNotFoundException, IOException {
        boolean throwing = false;
        InputStream in = null;
        try {
            in = url.openStream();
            DataInputStream dis = new DataInputStream(in);
            if (dis.readByte() != 1) {
                throw new StreamCorruptedException("File format not recognised");
            }
            this.groupID =(MyHelperClass)(Object) dis.readUTF();
            int versionCount = dis.readShort();
            String[] versionArray = new String[versionCount];
            for (int i = 0; i < versionCount; i++) {
                versionArray[i] = dis.readUTF();
            }
            int regionCount = dis.readShort();
            String[] regionArray = new String[regionCount];
            for (int i = 0; i < regionCount; i++) {
                regionArray[i] = dis.readUTF();
            }
            this.regions =(MyHelperClass)(Object) new HashSet<String>(Arrays.asList(regionArray));
            Set<ZoneRulesVersion> versionSet = new HashSet<ZoneRulesVersion>(versionCount);
            for (int i = 0; i < versionCount; i++) {
                int versionRegionCount = dis.readShort();
                String[] versionRegionArray = new String[versionRegionCount];
                short[] versionRulesArray = new short[versionRegionCount];
                for (int j = 0; j < versionRegionCount; j++) {
                    versionRegionArray[j] = regionArray[dis.readShort()];
                    versionRulesArray[j] = dis.readShort();
                }
                versionSet.add((ZoneRulesVersion)(Object)new ResourceZoneRulesVersion(this, versionArray[i], versionRegionArray, versionRulesArray));
            }
            this.versions =(MyHelperClass)(Object) versionSet;
            int ruleCount = dis.readShort();
            this.rules =(MyHelperClass)(Object) new AtomicReferenceArray(ruleCount);
            for (int i = 0; i < ruleCount; i++) {
                byte[] bytes = new byte[dis.readShort()];
                dis.readFully(bytes);
                rules.set(i, bytes);
            }
        } catch (IOException ex) {
            throwing = true;
            throw ex;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    if (throwing == false) {
                        throw ex;
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass set(int o0, byte[] o1){ return null; }}

class ZoneRulesVersion {

}

class ResourceZoneRulesVersion {

ResourceZoneRulesVersion(c3792789 o0, String o1, String[] o2, short[] o3){}
	ResourceZoneRulesVersion(){}}

class AtomicReferenceArray {

AtomicReferenceArray(int o0){}
	AtomicReferenceArray(){}}
