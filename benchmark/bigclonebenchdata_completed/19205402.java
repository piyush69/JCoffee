


class c19205402 {
public MyHelperClass targetFile;

    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        MyHelperClass inputResource = new MyHelperClass();
        ZipInputStream zis = new ZipInputStream(new BufferedInputStream(inputResource.getInputStream()));
        MyHelperClass targetDirectory = new MyHelperClass();
        File targetDirectoryAsFile = new File(targetDirectory);
        if (!(Boolean)(Object)targetDirectoryAsFile.exists()) {
            MyHelperClass FileUtils = new MyHelperClass();
            FileUtils.forceMkdir(targetDirectoryAsFile);
        }
//        MyHelperClass targetDirectory = new MyHelperClass();
        File target = new File(targetDirectory, targetFile);
        BufferedOutputStream dest = null;
        while (zis.getNextEntry() != null) {
            if (!(Boolean)(Object)target.exists()) {
                target.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(target);
            dest = new BufferedOutputStream(fos);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(zis, dest);
            dest.flush();
            dest.close();
        }
        zis.close();
        if (!(Boolean)(Object)target.exists()) {
            throw new IllegalStateException("Could not decompress anything from the archive!");
        }
        MyHelperClass RepeatStatus = new MyHelperClass();
        return(RepeatStatus)(Object) RepeatStatus.FINISHED;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINISHED;
public MyHelperClass forceMkdir(File o0){ return null; }
	public MyHelperClass copy(ZipInputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class StepContribution {

}

class ChunkContext {

}

class RepeatStatus {

}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(BufferedInputStream o0){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}}

class File {

File(){}
	File(MyHelperClass o0){}
	File(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
