import java.io.*;
import java.lang.*;
import java.util.*;



class c14212606 {
public MyHelperClass addAlignmentWrapper(AlignmentWrapper o0){ return null; }
public MyHelperClass deepScan;
	public MyHelperClass parseAlignment(String o0){ return null; }

    private void processAlignmentsFromAlignmentSource(String name, Alignment reference, String alignmentSource) throws AlignmentParserException, IllegalArgumentException, KADMOSCMDException, IOException {
        if (alignmentSource == null) throw new IllegalArgumentException("alignmentSource is null");
        URL url;
        String st;
        BufferedReader reader;
        Alignment alignment;
        try {
            try {
                alignment =(Alignment)(Object) parseAlignment(alignmentSource);
                addAlignmentWrapper(new AlignmentWrapper(name, reference, alignmentSource, alignment));
            } catch (UncheckedIOException e1) {
                url = new URL(alignmentSource);
                reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                st = "";
                while (((st = reader.readLine()) != null)) {
                    alignment =(Alignment)(Object) parseAlignment(st);
                    addAlignmentWrapper(new AlignmentWrapper(name, reference, alignmentSource, alignment));
                }
            }
        } catch (Exception e1) {
            File itemFile = new File(alignmentSource);
            if (itemFile.exists()) {
                if (itemFile.isDirectory() && !itemFile.isHidden()) {
                    File[] files = itemFile.listFiles();
                    for (int i = 0; i < files.length; i++) {
                        if (files[i].isFile() && !files[i].isHidden()) {
                            processAlignmentsFromAlignmentSource(name, reference, files[i].getPath());
                        } else if (files[i].isDirectory() && !files[i].isHidden() && (boolean)(Object)deepScan) {
                            processAlignmentsFromAlignmentSource(name, reference, files[i].getPath());
                        }
                    }
                } else if (itemFile.isFile() && !itemFile.isHidden()) {
                    try {
                        alignment =(Alignment)(Object) parseAlignment(alignmentSource);
                        addAlignmentWrapper(new AlignmentWrapper(name, reference, alignmentSource, alignment));
                    } catch (Exception e2) {
                        reader = new BufferedReader(new FileReader(alignmentSource));
                        st = "";
                        while (((st = reader.readLine()) != null)) {
                            alignment =(Alignment)(Object) parseAlignment(st);
                            addAlignmentWrapper(new AlignmentWrapper(name, reference, st, alignment));
                        }
                    }
                } else {
                    throw new FileNotFoundException("File " + alignmentSource + " is neither directory nor file, or it is hidden.");
                }
            } else {
                throw new FileNotFoundException("File " + alignmentSource + " does not exists.");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Alignment {

}

class AlignmentParserException extends Exception{
	public AlignmentParserException(String errorMessage) { super(errorMessage); }
}

class KADMOSCMDException extends Exception{
	public KADMOSCMDException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class AlignmentWrapper {

AlignmentWrapper(){}
	AlignmentWrapper(String o0, Alignment o1, String o2, Alignment o3){}}
