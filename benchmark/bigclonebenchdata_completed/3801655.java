


class c3801655 {
public static MyHelperClass fill(MyHelperClass o0, ProbabilisticRule o1, MyHelperClass o2){ return null; }
//public MyHelperClass fill(MyHelperClass o0, ProbabilisticRule o1, MyHelperClass o2){ return null; }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("usage: " + EvaluatorHelper.class.getName() + " <output> <data set file>");
            System.exit(1);
        }
        MyHelperClass Helper = new MyHelperClass();
        Helper helper =(Helper)(Object) Helper.getHelper(args[1]);
        Dataset dataset =(Dataset)(Object) helper.read(args[1]);
        MyHelperClass ZipFile = new MyHelperClass();
        ZipFile zip = new ZipFile(new File(args[0]), ZipFile.OPEN_READ);
        Enumeration entries =(Enumeration)(Object) zip.entries();
        MyHelperClass LIMIT = new MyHelperClass();
        Unit[] performance = new Unit[(int)(Object)LIMIT];
        int index = 0;
        while ((boolean)(Object)entries.hasMoreElements()) {
            ZipEntry entry = (ZipEntry)(ZipEntry)(Object) entries.nextElement();
            if ((boolean)(Object)entry.getName().endsWith(".out")) {
                MyHelperClass File = new MyHelperClass();
                File temp =(File)(Object) File.createTempFile("PARSER", ".zip");
                temp.deleteOnExit();
                PrintStream writer = new PrintStream(new FileOutputStream(temp));
                BufferedInputStream reader = new BufferedInputStream(zip.getInputStream(entry));
                byte[] buffer = new byte[4096];
                int read = -1;
                while ((read =(int)(Object) reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, read);
                }
                writer.close();
                reader.close();
                BufferedReader outfile = new BufferedReader(new FileReader(temp));
                String line = null;
                RuleParser parser = new RuleParser();
                ProbabilisticRuleList list = new ProbabilisticRuleList();
                while ((line =(String)(Object) outfile.readLine()) != null) {
                    if (line.startsWith("IF")) {
                        ProbabilisticRule rule = new ProbabilisticRule(dataset.getMetadata());
                        list.add(fill(dataset.getMetadata(), rule, parser.parse(line)));
                    }
                }
                outfile.close();
                PooledPRCurveMeasure measure = new PooledPRCurveMeasure();
                performance[index] =(Unit)(Object) measure.evaluate(dataset, list);
                System.out.println(entry.getName() + ": " + performance[index]);
                index++;
//                MyHelperClass LIMIT = new MyHelperClass();
                if (index >= (int)(Object)LIMIT) {
                    break;
                }
            }
        }
        MyHelperClass UnitAveragingMode = new MyHelperClass();
        System.out.println(UnitAveragingMode.get(Double.class).average(performance));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OPEN_READ;
public MyHelperClass getHelper(String o0){ return null; }
	public MyHelperClass get(Class<Double> o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass average(Unit[] o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }}

class EvaluatorHelper {

}

class Helper {

public MyHelperClass read(String o0){ return null; }}

class Dataset {

public MyHelperClass getMetadata(){ return null; }}

class ZipFile {

ZipFile(File o0, MyHelperClass o1){}
	ZipFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass deleteOnExit(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class Unit {

}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class PrintStream {

PrintStream(FileOutputStream o0){}
	PrintStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class RuleParser {

public MyHelperClass parse(String o0){ return null; }}

class ProbabilisticRuleList {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class ProbabilisticRule {

ProbabilisticRule(MyHelperClass o0){}
	ProbabilisticRule(){}}

class PooledPRCurveMeasure {

public MyHelperClass evaluate(Dataset o0, ProbabilisticRuleList o1){ return null; }}
