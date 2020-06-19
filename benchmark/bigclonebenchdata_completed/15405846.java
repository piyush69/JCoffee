


class c15405846 {
public MyHelperClass processDatum(String o0, TasselFileType o1){ return null; }

    public DataSet guessAtUnknowns(String filename) {
        MyHelperClass TasselFileType = new MyHelperClass();
        TasselFileType guess =(TasselFileType)(Object) TasselFileType.Sequence;
        DataSet tds = null;
        try {
            BufferedReader br = null;
            if (filename.startsWith("http")) {
                URL url = new URL(filename);
                br = new BufferedReader((FileReader)(Object)new InputStreamReader(url.openStream()));
            } else {
                br = new BufferedReader(new FileReader(filename));
            }
            String line1 =(String)(Object) br.readLine().trim();
            String[] sval1 = line1.split("\\s");
            String line2 =(String)(Object) br.readLine().trim();
            String[] sval2 = line2.split("\\s");
            boolean lociMatchNumber = false;
            if (!sval1[0].startsWith("<") && (sval1.length == 2) && (line1.indexOf(':') < 0)) {
                int countLoci = Integer.parseInt(sval1[1]);
                if (countLoci == sval2.length) {
                    lociMatchNumber = true;
                }
            }
            if (sval1[0].equalsIgnoreCase("<Annotated>")) {
//                MyHelperClass TasselFileType = new MyHelperClass();
                guess =(TasselFileType)(Object) TasselFileType.Annotated;
            } else if (line1.startsWith("<") || line1.startsWith("#")) {
                boolean isTrait = false;
                boolean isMarker = false;
                boolean isNumeric = false;
                boolean isMap = false;
                MyHelperClass Pattern = new MyHelperClass();
                Pattern tagPattern =(Pattern)(Object) Pattern.compile("[<>\\s]+");
                String[] info1 =(String[])(Object) tagPattern.split(line1);
                String[] info2 =(String[])(Object) tagPattern.split(line2);
                if (info1.length > 1) {
                    if (info1[1].toUpperCase().startsWith("MARKER")) {
                        isMarker = true;
                    } else if (info1[1].toUpperCase().startsWith("TRAIT")) {
                        isTrait = true;
                    } else if (info1[1].toUpperCase().startsWith("NUMER")) {
                        isNumeric = true;
                    } else if (info1[1].toUpperCase().startsWith("MAP")) {
                        isMap = true;
                    }
                }
                if (info2.length > 1) {
                    if (info2[1].toUpperCase().startsWith("MARKER")) {
                        isMarker = true;
                    } else if (info2[1].toUpperCase().startsWith("TRAIT")) {
                        isTrait = true;
                    } else if (info2[1].toUpperCase().startsWith("NUMER")) {
                        isNumeric = true;
                    } else if (info2[1].toUpperCase().startsWith("MAP")) {
                        isMap = true;
                    }
                } else {
                    guess = null;
                    String inline =(String)(Object) br.readLine();
                    while (guess == null && inline != null && (inline.startsWith("#") || inline.startsWith("<"))) {
                        if (inline.startsWith("<")) {
                            String[] info =(String[])(Object) tagPattern.split(inline);
                            if (info[1].toUpperCase().startsWith("MARKER")) {
                                isMarker = true;
                            } else if (info[1].toUpperCase().startsWith("TRAIT")) {
                                isTrait = true;
                            } else if (info[1].toUpperCase().startsWith("NUMER")) {
                                isNumeric = true;
                            } else if (info[1].toUpperCase().startsWith("MAP")) {
                                isMap = true;
                            }
                        }
                    }
                }
                if (isTrait || (isMarker && isNumeric)) {
//                    MyHelperClass TasselFileType = new MyHelperClass();
                    guess =(TasselFileType)(Object) TasselFileType.Phenotype;
                } else if (isMarker) {
//                    MyHelperClass TasselFileType = new MyHelperClass();
                    guess =(TasselFileType)(Object) TasselFileType.Polymorphism;
                } else if (isMap) {
//                    MyHelperClass TasselFileType = new MyHelperClass();
                    guess =(TasselFileType)(Object) TasselFileType.GeneticMap;
                } else {
                    throw new IOException("Improperly formatted header. Data will not be imported.");
                }
            } else if ((line1.startsWith(">")) || (line1.startsWith(";"))) {
//                MyHelperClass TasselFileType = new MyHelperClass();
                guess =(TasselFileType)(Object) TasselFileType.Fasta;
            } else if (sval1.length == 1) {
//                MyHelperClass TasselFileType = new MyHelperClass();
                guess =(TasselFileType)(Object) TasselFileType.SqrMatrix;
            } else if (line1.indexOf(':') > 0) {
//                MyHelperClass TasselFileType = new MyHelperClass();
                guess =(TasselFileType)(Object) TasselFileType.Polymorphism;
            } else if ((sval1.length == 2) && (lociMatchNumber)) {
//                MyHelperClass TasselFileType = new MyHelperClass();
                guess =(TasselFileType)(Object) TasselFileType.Polymorphism;
            } else if ((line1.startsWith("#Nexus")) || (line1.startsWith("#NEXUS")) || (line1.startsWith("CLUSTAL")) || ((sval1.length == 2) && (sval2.length == 2))) {
//                MyHelperClass TasselFileType = new MyHelperClass();
                guess =(TasselFileType)(Object) TasselFileType.Sequence;
            } else if (sval1.length == 3) {
//                MyHelperClass TasselFileType = new MyHelperClass();
                guess =(TasselFileType)(Object) TasselFileType.Numerical;
            }
            MyHelperClass myLogger = new MyHelperClass();
            myLogger.info("guessAtUnknowns: type: " + guess);
            tds =(DataSet)(Object) processDatum(filename, guess);
            br.close();
        } catch (Exception e) {
        }
        return tds;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GeneticMap;
	public MyHelperClass Sequence;
	public MyHelperClass SqrMatrix;
	public MyHelperClass Phenotype;
	public MyHelperClass Fasta;
	public MyHelperClass Numerical;
	public MyHelperClass Annotated;
	public MyHelperClass Polymorphism;
public MyHelperClass trim(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }}

class DataSet {

}

class TasselFileType {

}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class Pattern {

public MyHelperClass split(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
