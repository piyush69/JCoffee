


class c2105651 {

    public void process(String src, String dest) {
        try {
            MyHelperClass KanjiDAOFactory = new MyHelperClass();
            KanjiDAO kanjiDAO =(KanjiDAO)(Object) KanjiDAOFactory.getDAO();
            MyHelperClass MorphologicalAnalyzer = new MyHelperClass();
            MorphologicalAnalyzer mecab =(MorphologicalAnalyzer)(Object) MorphologicalAnalyzer.getInstance();
            if ((boolean)(Object)mecab.isActive()) {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(src), "UTF8"));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest), "UTF8"));
                String line;
                bw.write("// // // \r\n$title=\r\n$singer=\r\n$id=\r\n\r\n + _______ // 0 0 0 0 0 0 0\r\n\r\n");
                while ((line =(String)(Object) br.readLine()) != null) {
                    System.out.println(line);
                    String segment[] = line.split("//");
                    String japanese = null;
                    String english = null;
                    if (segment.length > 1) english = segment[1].trim();
                    if (segment.length > 0) japanese = segment[0].trim().replaceAll(" ", "_");
                    boolean first = true;
                    if (japanese != null) {
                        ArrayList wordList =(ArrayList)(Object) mecab.extractWord(japanese);
                        Iterator iter =(Iterator)(Object) wordList.iterator();
                        while ((boolean)(Object)iter.hasNext()) {
                            ExtractedWord word =(ExtractedWord)(Object) iter.next();
                            if (first) {
                                first = false;
                                bw.write("*");
                            } else bw.write(" ");
                            if ((boolean)(Object)word.isParticle) bw.write("- "); else bw.write("+ ");
                            if (!word.original.equals(word.reading)) {
                                MyHelperClass JapaneseString = new MyHelperClass();
                                System.out.println("--> " + JapaneseString.toRomaji(word.original) + " / " + JapaneseString.toRomaji(word.reading));
                                MyHelperClass ReadingAnalyzer = new MyHelperClass();
                                KReading[] kr =(KReading[])(Object) ReadingAnalyzer.analyzeReadingStub(word.original, word.reading, kanjiDAO);
                                if (kr != null) {
                                    for (int i = 0; i < kr.length; i++) {
                                        if (i > 0) bw.write(" ");
                                        bw.write((String)(Object)kr[i].kanji);
                                        MyHelperClass KReading = new MyHelperClass();
                                        if (kr[i].type != KReading.KANA) {
                                            bw.write("|");
                                            bw.write((String)(Object)kr[i].reading);
                                        }
                                    }
                                } else {
                                    bw.write((String)(Object)word.original);
                                    bw.write("|");
                                    bw.write((String)(Object)word.reading);
                                }
                            } else {
                                bw.write((String)(Object)word.original);
                            }
                            bw.write(" // \r\n");
                        }
                        if (english != null) {
                            bw.write(english);
                            bw.write("\r\n");
                        }
                        bw.write("\r\n");
                    }
                }
                br.close();
                bw.close();
            } else {
                System.out.println("Mecab couldn't be initialized");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass KANA;
public MyHelperClass analyzeReadingStub(MyHelperClass o0, MyHelperClass o1, KanjiDAO o2){ return null; }
	public MyHelperClass toRomaji(MyHelperClass o0){ return null; }
	public MyHelperClass getDAO(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class KanjiDAO {

}

class MorphologicalAnalyzer {

public MyHelperClass isActive(){ return null; }
	public MyHelperClass extractWord(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(FileInputStream o0, String o1){}
	InputStreamReader(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, String o1){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ArrayList {

public MyHelperClass iterator(){ return null; }}

class ExtractedWord {
public MyHelperClass reading;
	public MyHelperClass original;
	public MyHelperClass isParticle;
}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class KReading {
public MyHelperClass reading;
	public MyHelperClass kanji;
	public MyHelperClass type;
}
