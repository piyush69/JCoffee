import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8267306 {
public MyHelperClass PROFILE;
public MyHelperClass LOG;
	public MyHelperClass baseDir;
	public MyHelperClass IOUtils;
	public MyHelperClass FileUtils;
	public MyHelperClass Executors;
	public MyHelperClass assertNotNull(File[] o0){ return null; }
	public MyHelperClass createInput(File o0, int o1, int o2){ return null; }

    public void testWriteThreadsNoCompression() throws Throwable, Exception {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.loadProfiles(PROFILE.DB, PROFILE.REST_CLIENT, PROFILE.COLLECTOR);
        final LocalLogFileWriter writer = (LocalLogFileWriter) bootstrap.getBean(LogFileWriter.class);
        writer.init();
        writer.setCompressionCodec(null);
        MyHelperClass baseDir = new MyHelperClass();
        File fileInput = new File((String)(Object)baseDir, "testWriteOneFile/input");
        fileInput.mkdirs();
//        MyHelperClass baseDir = new MyHelperClass();
        File fileOutput = new File((String)(Object)baseDir, "testWriteOneFile/output");
        fileOutput.mkdirs();
        writer.setBaseDir(fileOutput);
        int fileCount = 100;
        int lineCount = 100;
        File[] inputFiles =(File[])(Object) createInput(fileInput, fileCount, lineCount);
        ExecutorService exec = Executors.newFixedThreadPool(fileCount);
        final CountDownLatch latch = new CountDownLatch(fileCount);
        for (int i = 0; i < fileCount; i++) {
            final File file = inputFiles[i];
            final int count = i;
            exec.submit(new Callable() {

//                @Override
                public Boolean call() throws Exception {
                    FileStatus.FileTrackingStatus status = FileStatus.FileTrackingStatus.newBuilder().setFileDate(System.currentTimeMillis()).setDate(System.currentTimeMillis()).setAgentName("agent1").setFileName(file.getName()).setFileSize(file.length()).setLogType("type1").build();
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    try {
                        String line = null;
                        while ((line = reader.readLine()) != null) {
                            writer.write(status, new ByteArrayInputStream((line + "\n").getBytes()));
                        }
                    } finally {
                        IOUtils.closeQuietly(reader);
                    }
                    LOG.info("Thread[" + count + "] completed ");
                    latch.countDown();
                    return true;
                }
            });
        }
        latch.await();
        exec.shutdown();
        LOG.info("Shutdown thread service");
        writer.close();
        File[] outputFiles = fileOutput.listFiles();
        assertNotNull(outputFiles);
        File testCombinedInput = new File((String)(Object)baseDir, "combinedInfile.txt");
        testCombinedInput.createNewFile();
        FileOutputStream testCombinedInputOutStream = new FileOutputStream(testCombinedInput);
        try {
            for (File file : inputFiles) {
                FileInputStream f1In = new FileInputStream(file);
                IOUtils.copy(f1In, testCombinedInputOutStream);
            }
        } finally {
            testCombinedInputOutStream.close();
        }
        File testCombinedOutput = new File((String)(Object)baseDir, "combinedOutfile.txt");
        testCombinedOutput.createNewFile();
        FileOutputStream testCombinedOutOutStream = new FileOutputStream(testCombinedOutput);
        try {
            System.out.println("----------------- " + testCombinedOutput.getAbsolutePath());
            for (File file : outputFiles) {
                FileInputStream f1In = new FileInputStream(file);
                IOUtils.copy(f1In, testCombinedOutOutStream);
            }
        } finally {
            testCombinedOutOutStream.close();
        }
        FileUtils.contentEquals(testCombinedInput, testCombinedOutput);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newFixedThreadPool(int o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass contentEquals(File o0, File o1){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class Bootstrap {

public MyHelperClass getBean(Class<LogFileWriter o0){ return null; }}

class LocalLogFileWriter {

public MyHelperClass setBaseDir(File o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setCompressionCodec(Object o0){ return null; }
	public MyHelperClass init(){ return null; }}

class LogFileWriter {

}

class ExecutorService {

public MyHelperClass shutdown(){ return null; }}

class CountDownLatch {

CountDownLatch(int o0){}
	CountDownLatch(){}
	public MyHelperClass await(){ return null; }}

class Callable {

}
