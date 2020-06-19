import java.io.*;
import java.lang.*;
import java.util.*;



class c11322573 {
public MyHelperClass NULL;
	public MyHelperClass debug(String o0){ return null; }
public MyHelperClass XPlat;

    private void preprocessObjects(GeoObject[] objects) throws IOException {
        System.out.println("objects.length " + objects.length);
        for (int i = 0; i < objects.length; i++) {
            String fileName =(String)(Object) objects[i].getPath();
            int dotindex = fileName.lastIndexOf(".");
            dotindex = dotindex < 0 ? 0 : dotindex;
            String tmp = dotindex < 1 ? fileName : fileName.substring(0, dotindex + 3) + "w";
            System.out.println("i: " + " world filename " + tmp);
            File worldFile = new File(tmp);
            if (worldFile.exists()) {
                BufferedReader worldFileReader = new BufferedReader(new InputStreamReader(new FileInputStream(worldFile)));
                MyHelperClass staticDebugOn = new MyHelperClass();
                if ((boolean)(Object)staticDebugOn) debug("b4nextline: ");
                String line =(String)(Object) NULL; //new String();
                line = worldFileReader.readLine();
//                MyHelperClass staticDebugOn = new MyHelperClass();
                if ((boolean)(Object)staticDebugOn) debug("line: " + line);
//                MyHelperClass line = new MyHelperClass();
                if (line != null) {
//                    MyHelperClass line = new MyHelperClass();
                    line =(String)(Object)(MyHelperClass)(Object) worldFileReader.readLine();
//                    MyHelperClass staticDebugOn = new MyHelperClass();
                    if ((boolean)(Object)staticDebugOn) debug("line: " + line);
                    StringTokenizer tokenizer =(StringTokenizer)(Object) NULL; //new StringTokenizer();
                    tokenizer = new StringTokenizer((String)(Object)line, " \n\t\r\"", false);
//                    MyHelperClass tokenizer = new MyHelperClass();
                    objects[i].setLon(Double.valueOf((String)(Object)tokenizer.nextToken()).doubleValue());
//                    MyHelperClass line = new MyHelperClass();
                    line =(String)(Object)(MyHelperClass)(Object) worldFileReader.readLine();
//                    MyHelperClass staticDebugOn = new MyHelperClass();
                    if ((boolean)(Object)staticDebugOn) debug("line: " + line);
//                    MyHelperClass tokenizer = new MyHelperClass();
                    tokenizer =(StringTokenizer)(Object)(MyHelperClass)(Object) new StringTokenizer((String)(Object)line, " \n\t\r\"", false);
//                    MyHelperClass tokenizer = new MyHelperClass();
                    objects[i].setLat(Double.valueOf((String)(Object)tokenizer.nextToken()).doubleValue());
                }
            }
            File file = new File((String)(Object)objects[i].getPath());
            if (file.exists()) {
                System.out.println("object src file found ");
                int slashindex = fileName.lastIndexOf(java.io.File.separator);
                slashindex = slashindex < 0 ? 0 : slashindex;
                if (slashindex == 0) {
                    slashindex = fileName.lastIndexOf("/");
                    slashindex = slashindex < 0 ? 0 : slashindex;
                }
                tmp = slashindex < 1 ? fileName : fileName.substring(slashindex + 1, fileName.length());
                MyHelperClass destinationDirectory = new MyHelperClass();
                System.out.println("filename " + destinationDirectory + XPlat.fileSep + tmp);
                objects[i].setPath(tmp);
                file = new File(fileName);
                if (file.exists()) {
                    DataInputStream dataIn = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
//                    MyHelperClass destinationDirectory = new MyHelperClass();
                    DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream((int)(Object)destinationDirectory + (int)(Object)XPlat.fileSep + tmp)));
//                    MyHelperClass destinationDirectory = new MyHelperClass();
                    System.out.println("copying to " + destinationDirectory + XPlat.fileSep + tmp);
                    for (; ; ) {
                        try {
                            dataOut.writeShort(dataIn.readShort());
                        } catch (EOFException e) {
                            break;
                        } catch (IOException e) {
                            break;
                        }
                    }
                    dataOut.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass fileSep;
public MyHelperClass nextToken(){ return null; }}

class GeoObject {

public MyHelperClass setPath(String o0){ return null; }
	public MyHelperClass setLat(double o0){ return null; }
	public MyHelperClass setLon(double o0){ return null; }
	public MyHelperClass getPath(){ return null; }}
