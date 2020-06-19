


class c20303339 {
public MyHelperClass s_featureXml;
	public MyHelperClass s_format;
	public MyHelperClass IOUtils;
	public MyHelperClass s_depParser;
	public MyHelperClass t_xml;
	public MyHelperClass t_map;
	public MyHelperClass ENTRY_LEXICA;
	public MyHelperClass s_trainFile;

    private void trainDepParser(byte flag, JarArchiveOutputStream zout) throws Exception {
        AbstractDepParser parser = null;
        OneVsAllDecoder decoder = null;
        MyHelperClass ShiftPopParser = new MyHelperClass();
        if (flag == (byte)(Object)ShiftPopParser.FLAG_TRAIN_LEXICON) {
            System.out.println("\n* Save lexica");
            MyHelperClass AbstractDepParser = new MyHelperClass();
            if (s_depParser.equals(AbstractDepParser.ALG_SHIFT_EAGER)) parser =(AbstractDepParser)(Object) new ShiftEagerParser(flag, s_featureXml); else if (s_depParser.equals(AbstractDepParser.ALG_SHIFT_POP)) parser =(AbstractDepParser)(Object) new ShiftPopParser(flag, s_featureXml);
//        MyHelperClass ShiftPopParser = new MyHelperClass();
        } else if (flag == (byte)(Object)ShiftPopParser.FLAG_TRAIN_INSTANCE) {
            System.out.println("\n* Print training instances");
            System.out.println("- loading lexica");
            MyHelperClass AbstractDepParser = new MyHelperClass();
            if (s_depParser.equals(AbstractDepParser.ALG_SHIFT_EAGER)) parser =(AbstractDepParser)(Object) new ShiftEagerParser(flag, t_xml, ENTRY_LEXICA); else if (s_depParser.equals(AbstractDepParser.ALG_SHIFT_POP)) parser =(AbstractDepParser)(Object) new ShiftPopParser(flag, t_xml, ENTRY_LEXICA);
//        MyHelperClass ShiftPopParser = new MyHelperClass();
        } else if (flag == (byte)(Object)ShiftPopParser.FLAG_TRAIN_BOOST) {
            System.out.println("\n* Train conditional");
            MyHelperClass m_model = new MyHelperClass();
            decoder = new OneVsAllDecoder(m_model);
            MyHelperClass AbstractDepParser = new MyHelperClass();
            if (s_depParser.equals(AbstractDepParser.ALG_SHIFT_EAGER)) parser =(AbstractDepParser)(Object) new ShiftEagerParser(flag, t_xml, t_map, decoder); else if (s_depParser.equals(AbstractDepParser.ALG_SHIFT_POP)) parser =(AbstractDepParser)(Object) new ShiftPopParser(flag, t_xml, t_map, decoder);
        }
        AbstractReader reader = null;
        DepTree tree;
        int n;
        MyHelperClass AbstractReader = new MyHelperClass();
        if (s_format.equals(AbstractReader.FORMAT_DEP)) reader =(AbstractReader)(Object) new DepReader(s_trainFile, true); else if (s_format.equals(AbstractReader.FORMAT_CONLLX)) reader =(AbstractReader)(Object) new CoNLLXReader(s_trainFile, true);
        MyHelperClass s_language = new MyHelperClass();
        parser.setLanguage(s_language);
//        MyHelperClass s_language = new MyHelperClass();
        reader.setLanguage(s_language);
        for (n = 0; (tree =(DepTree)(Object) reader.nextTree()) != null; n++) {
            parser.parse(tree);
            if (n % 1000 == 0) System.out.printf("\r- parsing: %dK", n / 1000);
        }
        System.out.println("\r- parsing: " + n);
//        MyHelperClass ShiftPopParser = new MyHelperClass();
        if (flag == (byte)(Object)ShiftPopParser.FLAG_TRAIN_LEXICON) {
            System.out.println("- saving");
            MyHelperClass ENTRY_LEXICA = new MyHelperClass();
            parser.saveTags(ENTRY_LEXICA);
            MyHelperClass t_xml = new MyHelperClass();
            t_xml = parser.getDepFtrXml();
//        MyHelperClass ShiftPopParser = new MyHelperClass();
        } else if (flag == (byte)(Object)ShiftPopParser.FLAG_TRAIN_INSTANCE || flag == (byte)(Object)ShiftPopParser.FLAG_TRAIN_BOOST) {
            MyHelperClass a_yx = new MyHelperClass();
            a_yx = parser.a_trans;
            MyHelperClass ENTRY_PARSER = new MyHelperClass();
            zout.putArchiveEntry(new JarArchiveEntry(ENTRY_PARSER));
            PrintStream fout = new PrintStream(zout);
            MyHelperClass s_depParser = new MyHelperClass();
            fout.print(s_depParser);
            fout.flush();
            zout.closeArchiveEntry();
            MyHelperClass ENTRY_FEATURE = new MyHelperClass();
            zout.putArchiveEntry(new JarArchiveEntry(ENTRY_FEATURE));
            MyHelperClass s_featureXml = new MyHelperClass();
            IOUtils.copy(new FileInputStream(s_featureXml), zout);
            zout.closeArchiveEntry();
            MyHelperClass ENTRY_LEXICA = new MyHelperClass();
            zout.putArchiveEntry(new JarArchiveEntry(ENTRY_LEXICA));
//            MyHelperClass ENTRY_LEXICA = new MyHelperClass();
            IOUtils.copy(new FileInputStream(ENTRY_LEXICA), zout);
            zout.closeArchiveEntry();
//            MyHelperClass ShiftPopParser = new MyHelperClass();
            if (flag == (byte)(Object)ShiftPopParser.FLAG_TRAIN_INSTANCE) t_map = parser.getDepFtrMap();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FLAG_TRAIN_INSTANCE;
	public MyHelperClass ALG_SHIFT_POP;
	public MyHelperClass ALG_SHIFT_EAGER;
	public MyHelperClass FORMAT_DEP;
	public MyHelperClass FLAG_TRAIN_BOOST;
	public MyHelperClass FORMAT_CONLLX;
	public MyHelperClass FLAG_TRAIN_LEXICON;
public MyHelperClass copy(FileInputStream o0, JarArchiveOutputStream o1){ return null; }}

class JarArchiveOutputStream {

public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass putArchiveEntry(JarArchiveEntry o0){ return null; }}

class AbstractDepParser {
public MyHelperClass a_trans;
public MyHelperClass setLanguage(MyHelperClass o0){ return null; }
	public MyHelperClass saveTags(MyHelperClass o0){ return null; }
	public MyHelperClass getDepFtrXml(){ return null; }
	public MyHelperClass getDepFtrMap(){ return null; }
	public MyHelperClass parse(DepTree o0){ return null; }}

class OneVsAllDecoder {

OneVsAllDecoder(MyHelperClass o0){}
	OneVsAllDecoder(){}}

class AbstractReader {

public MyHelperClass nextTree(){ return null; }
	public MyHelperClass setLanguage(MyHelperClass o0){ return null; }}

class DepNode {

}

class DepTree {

}

class JarArchiveEntry {

JarArchiveEntry(MyHelperClass o0){}
	JarArchiveEntry(){}}

class PrintStream {

PrintStream(JarArchiveOutputStream o0){}
	PrintStream(){}
	public MyHelperClass print(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class ShiftEagerParser {

ShiftEagerParser(byte o0, MyHelperClass o1, MyHelperClass o2, OneVsAllDecoder o3){}
	ShiftEagerParser(byte o0, MyHelperClass o1){}
	ShiftEagerParser(){}
	ShiftEagerParser(byte o0, MyHelperClass o1, MyHelperClass o2){}}

class ShiftPopParser {

ShiftPopParser(byte o0, MyHelperClass o1, MyHelperClass o2, OneVsAllDecoder o3){}
	ShiftPopParser(byte o0, MyHelperClass o1){}
	ShiftPopParser(){}
	ShiftPopParser(byte o0, MyHelperClass o1, MyHelperClass o2){}}

class DepReader {

DepReader(MyHelperClass o0, boolean o1){}
	DepReader(){}}

class CoNLLXReader {

CoNLLXReader(MyHelperClass o0, boolean o1){}
	CoNLLXReader(){}}
