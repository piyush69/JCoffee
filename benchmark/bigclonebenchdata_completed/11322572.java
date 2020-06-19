import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11322572 {
public MyHelperClass loadImage(MyHelperClass o0){ return null; }
public MyHelperClass freeImage(BufferedImage o0){ return null; }
public MyHelperClass staticDebugOn;
	public MyHelperClass tokenizer;
	public MyHelperClass line;
	public MyHelperClass XPlat;
	public MyHelperClass destinationDirectory;
	public MyHelperClass debug(String o0){ return null; }

    private void preprocessImages(GeoImage[] detailedImages) throws Throwable, IOException {
        for (int i = 0; i < detailedImages.length; i++) {
            BufferedImage img =(BufferedImage)(Object) loadImage(detailedImages[i].getPath());
            detailedImages[i].setLatDim(img.getHeight());
            detailedImages[i].setLonDim(img.getWidth());
            freeImage(img);
            String fileName =(String)(Object) detailedImages[i].getPath();
            int dotindex = fileName.lastIndexOf(".");
            dotindex = dotindex < 0 ? 0 : dotindex;
            String tmp = dotindex < 1 ? fileName : fileName.substring(0, dotindex + 3) + "w";
            System.out.println("filename " + tmp);
            File worldFile = new File(tmp);
            if (!worldFile.exists()) {
                System.out.println("Rez: Could not find file: " + tmp);
                debug("Rez: Could not find directory: " + tmp);
                throw new IOException("File not Found");
            }
            BufferedReader worldFileReader = new BufferedReader(new InputStreamReader(new FileInputStream(worldFile)));
            if ((boolean)(Object)staticDebugOn) debug("b4nextline: ");
            line =(MyHelperClass)(Object) worldFileReader.readLine();
            if ((boolean)(Object)staticDebugOn) debug("line: " + line);
            if (line != null) {
                tokenizer =(MyHelperClass)(Object) new StringTokenizer((String)(Object)line, " \n\t\r\"", false);
                detailedImages[i].setLonSpacing(Double.valueOf((String)(Object)tokenizer.nextToken()).doubleValue());
                detailedImages[i].setLonExtent((double)(Object)detailedImages[i].getLonSpacing() * ((double)(double)(Object) detailedImages[i].getLonDim() - 1d));
                System.out.println("setLonExtent " + detailedImages[i].getLonExtent());
                line =(MyHelperClass)(Object) worldFileReader.readLine();
                if ((boolean)(Object)staticDebugOn) debug("skip line: " + line);
                line =(MyHelperClass)(Object) worldFileReader.readLine();
                if ((boolean)(Object)staticDebugOn) debug("skip line: " + line);
                line =(MyHelperClass)(Object) worldFileReader.readLine();
                if ((boolean)(Object)staticDebugOn) debug("line: " + line);
                tokenizer =(MyHelperClass)(Object) new StringTokenizer((String)(Object)line, " \n\t\r\"", false);
                detailedImages[i].setLatSpacing(Double.valueOf((String)(Object)tokenizer.nextToken()).doubleValue());
                detailedImages[i].setLatExtent((double)(Object)detailedImages[i].getLatSpacing() * ((double)(double)(Object) detailedImages[i].getLatDim() - 1d));
                line =(MyHelperClass)(Object) worldFileReader.readLine();
                if ((boolean)(Object)staticDebugOn) debug("line: " + line);
                tokenizer =(MyHelperClass)(Object) new StringTokenizer((String)(Object)line, " \n\t\r\"", false);
                detailedImages[i].setLon(Double.valueOf((String)(Object)tokenizer.nextToken()).doubleValue());
                line =(MyHelperClass)(Object) worldFileReader.readLine();
                if ((boolean)(Object)staticDebugOn) debug("line: " + line);
                tokenizer =(MyHelperClass)(Object) new StringTokenizer((String)(Object)line, " \n\t\r\"", false);
                detailedImages[i].setLat(Double.valueOf((String)(Object)tokenizer.nextToken()).doubleValue());
                int slashindex = fileName.lastIndexOf(java.io.File.separator);
                slashindex = slashindex < 0 ? 0 : slashindex;
                if (slashindex == 0) {
                    slashindex = fileName.lastIndexOf("/");
                    slashindex = slashindex < 0 ? 0 : slashindex;
                }
                tmp = slashindex < 1 ? fileName : fileName.substring(slashindex + 1, fileName.length());
                System.out.println("filename " + destinationDirectory + XPlat.fileSep + tmp);
                detailedImages[i].setPath(tmp);
                DataInputStream dataIn = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
                DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream((int)(Object)destinationDirectory + (int)(Object)XPlat.fileSep + tmp)));
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
            } else {
                System.out.println("Rez: ERROR: World file for image is null");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass fileSep;
public MyHelperClass nextToken(){ return null; }}

class GeoImage {

public MyHelperClass setLatDim(MyHelperClass o0){ return null; }
	public MyHelperClass setLatSpacing(double o0){ return null; }
	public MyHelperClass setLonSpacing(double o0){ return null; }
	public MyHelperClass setLonExtent(double o0){ return null; }
	public MyHelperClass getLonExtent(){ return null; }
	public MyHelperClass setLonDim(MyHelperClass o0){ return null; }
	public MyHelperClass getLonSpacing(){ return null; }
	public MyHelperClass getLonDim(){ return null; }
	public MyHelperClass setLatExtent(double o0){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getLatSpacing(){ return null; }
	public MyHelperClass getLatDim(){ return null; }
	public MyHelperClass setPath(String o0){ return null; }
	public MyHelperClass setLon(double o0){ return null; }
	public MyHelperClass setLat(double o0){ return null; }}

class BufferedImage {

public MyHelperClass getWidth(){ return null; }
	public MyHelperClass getHeight(){ return null; }}
