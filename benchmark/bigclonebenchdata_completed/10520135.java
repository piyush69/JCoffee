import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10520135 {
public MyHelperClass databaseID;
	public MyHelperClass units;
	public MyHelperClass yMax;
	public MyHelperClass xMin;
	public MyHelperClass zMax;
	public MyHelperClass ImageIO;
	public MyHelperClass mapImage;
	public MyHelperClass name;
	public MyHelperClass yMin;
	public MyHelperClass xMax;
	public MyHelperClass zMin;
	public MyHelperClass hashcode;

    public  void RegionInfo(String name, int databaseID, int units, float xMin, float xMax, float yMin, float yMax, float zMin, float zMax, String imageURL)  throws Throwable {
        this.name =(MyHelperClass)(Object) name;
        this.databaseID =(MyHelperClass)(Object) databaseID;
        this.units =(MyHelperClass)(Object) units;
        this.xMin =(MyHelperClass)(Object) xMin;
        this.xMax =(MyHelperClass)(Object) xMax;
        this.yMin =(MyHelperClass)(Object) yMin;
        this.yMax =(MyHelperClass)(Object) yMax;
        this.zMin =(MyHelperClass)(Object) zMin;
        this.zMax =(MyHelperClass)(Object) zMax;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update((byte)(Object)this.name.getBytes());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream daos = new DataOutputStream(baos);
            daos.writeInt((int)(Object)this.databaseID);
            daos.writeInt((int)(Object)this.units);
            daos.writeDouble((double)(Object)this.xMin);
            daos.writeDouble((double)(Object)this.xMax);
            daos.writeDouble((double)(Object)this.yMin);
            daos.writeDouble((double)(Object)this.yMax);
            daos.writeDouble((double)(Object)this.zMin);
            daos.writeDouble((double)(Object)this.zMax);
            daos.flush();
            byte[] hashValue = digest.digest(baos.toByteArray());
            int hashCode = 0;
            for (int i = 0; i < hashValue.length; i++) {
                hashCode += (int) hashValue[i] << (i % 4);
            }
            this.hashcode =(MyHelperClass)(Object) hashCode;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error occurred while generating hashcode for region " + this.name);
        }
        if (imageURL != null) {
            URL url = null;
            try {
                url = new URL(imageURL);
            } catch (MalformedURLException murle) {
            }
            if (url != null) {
                BufferedImage tmpImage = null;
                try {
                    tmpImage =(BufferedImage)(Object) ImageIO.read(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mapImage =(MyHelperClass)(Object) tmpImage;
            } else this.mapImage = null;
        } else this.mapImage = null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(URL o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class BufferedImage {

}
