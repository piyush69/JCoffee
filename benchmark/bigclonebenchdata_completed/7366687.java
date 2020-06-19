


class c7366687 {

    public static void DecodeMapFile(String mapFile, String outputFile) throws Exception {
        byte magicKey = 0;
        byte[] buffer = new byte[2048];
        int nread;
        InputStream map;
        OutputStream output;
        try {
            map =(InputStream)(Object) new FileInputStream(mapFile);
        } catch (Exception e) {
            throw new Exception("Map file error", e);
        }
        try {
            output =(OutputStream)(Object) new FileOutputStream(outputFile);
        } catch (Exception e) {
            throw new Exception("Map file error", e);
        }
        while ((nread =(int)(Object) map.read(buffer, 0, 2048)) != 0) {
            for (int i = 0; i < nread; ++i) {
                buffer[i] ^= magicKey;
                magicKey += 43;
            }
            output.write(buffer, 0, nread);
        }
        map.close();
        output.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
