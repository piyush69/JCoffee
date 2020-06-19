
import java.io.UncheckedIOException;


class c6914912 {

    public static void main(String[] a) throws Exception {
        HashMap numberOfOccurencesOfThisComboe = new HashMap();
        HashMap fileToCATHMapping = new HashMap();
        ArrayList allFilesToBeCopied = new ArrayList();
        MyHelperClass outputDir = new MyHelperClass();
        new File(outputDir).mkdirs();
        MyHelperClass completeFileWithDirToCathFileList = new MyHelperClass();
        FileReader fis = new FileReader(completeFileWithDirToCathFileList);
        BufferedReader bis = new BufferedReader(fis);
        String line = "";
        String currentCombo = "";
        while ((line =(String)(Object) bis.readLine()) != null) {
            String[] allEntries = line.split("\\s+");
            String fileName = allEntries[0];
            String thisCombo = allEntries[1] + allEntries[2] + allEntries[3] + allEntries[4];
            String reducedComboForFilteringOut = allEntries[1] + allEntries[2] + allEntries[3];
            fileToCATHMapping.put(fileName, reducedComboForFilteringOut);
            if (currentCombo.equals(thisCombo)) {
            } else {
                System.out.println("merke: " + fileName);
                allFilesToBeCopied.add(fileName);
                currentCombo = thisCombo;
            }
        }
        for (String fileName :(String[])(Object) (Object[])(Object)allFilesToBeCopied) {
            String reducedComboForFilteringOut =(String)(Object) fileToCATHMapping.get(fileName);
            if (!(Boolean)(Object)numberOfOccurencesOfThisComboe.containsKey(reducedComboForFilteringOut)) {
                numberOfOccurencesOfThisComboe.put(reducedComboForFilteringOut, 1);
            } else {
                Integer thisCounter =(Integer)(Object) numberOfOccurencesOfThisComboe.get(reducedComboForFilteringOut);
                thisCounter = thisCounter + 1;
                numberOfOccurencesOfThisComboe.put(reducedComboForFilteringOut, thisCounter);
            }
        }
        HashSet isSingleElement = new HashSet();
        for (Entry thisEntry :(Entry[])(Object) (Object[])(Object)numberOfOccurencesOfThisComboe.entrySet()) {
            if ((int)(Object)thisEntry.getValue() == 1) {
                System.out.println("single: " + thisEntry.getKey());
                isSingleElement.add(thisEntry.getKey());
            } else {
                System.out.println("not single: " + thisEntry.getKey());
            }
        }
        System.out.println(allFilesToBeCopied.size());
        for (String file :(String[])(Object) (Object[])(Object)allFilesToBeCopied) {
            if (!(Boolean)(Object)isSingleElement.contains(fileToCATHMapping.get(file))) {
                try {
                    MyHelperClass CathDir = new MyHelperClass();
                    FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(CathDir + file).getChannel());
//                    MyHelperClass outputDir = new MyHelperClass();
                    FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(outputDir + file).getChannel());
                    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                    srcChannel.close();
                    dstChannel.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HashMap {

public MyHelperClass put(String o0, Integer o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class ArrayList {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass size(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass mkdirs(){ return null; }}

class FileReader {

FileReader(){}
	FileReader(MyHelperClass o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass readLine(){ return null; }}

class HashSet {

public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }}

class Entry {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getKey(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
