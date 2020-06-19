import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5231291 {
public MyHelperClass NULL;
public MyHelperClass Application;
	public MyHelperClass bundle;
	public MyHelperClass resetModel(boolean o0){ return null; }
	public MyHelperClass getTargetDirectory(){ return null; }
	public MyHelperClass mayOverwrite(File o0){ return null; }

//            @Override
            public void run()  throws Throwable {
                MyHelperClass Application = new MyHelperClass();
                Application.getController().notifyProgressStarted();
//                MyHelperClass Application = new MyHelperClass();
                Application.getController().notifyProgressUpdated(-1);
                MyHelperClass fileList = new MyHelperClass();
                for (int f = 0; f < (int)(Object)fileList.size(); f++) {
//                    MyHelperClass fileList = new MyHelperClass();
                    File archive =(File)(Object) fileList.get(f);
                    String arname = archive.getName();
                    String arsuf = arname.substring(arname.lastIndexOf('.'), arname.length());
                    Algorithm alg = null;
                    MyHelperClass algFactory = new MyHelperClass();
                    Algorithm algs[] =(Algorithm[])(Object) algFactory.getAlgorithms();
                    for (int i = 0; i < algs.length; i++) {
                        if ((boolean)(Object)algs[i].getSuffix().equalsIgnoreCase(arsuf)) {
                            alg = algs[i];
                            break;
                        }
                    }
                    if (alg == null) {
                        MyHelperClass bundle = new MyHelperClass();
                        Application.getController().displayError(bundle.getString("unknown_alg_title"), bundle.getString("unknown_alg_text"));
                        return;
                    }
                    Algorithm currentAlgorithm =(Algorithm)(Object) NULL; //new Algorithm();
                    currentAlgorithm = alg;
                    MyHelperClass password = new MyHelperClass();
                    if (!(Boolean)(Object)alg.initDecrypt(password)) {
                        MyHelperClass bundle = new MyHelperClass();
                        Application.getController().displayError(bundle.getString("dec_init_fail_title"), bundle.getString("dec_init_fail_text"));
                        return;
                    }
                    try {
                        ZipArchiveInputStream zis = null;
                        InputStream is = null;
                        MyHelperClass EncryptionMode = new MyHelperClass();
                        if (EncryptionMode.getBestEncryptionMode(alg.getEncryptionMode()) == EncryptionMode.MODE_STREAM) {
                            is =(InputStream)(Object) alg.getDecryptionStream(new FileInputStream(archive));
                            if (is == null) {
                                MyHelperClass bundle = new MyHelperClass();
                                Application.getController().displayError(bundle.getString("dec_init_fail_title"), bundle.getString("dec_init_fail_text"));
                                return;
                            }
//                        MyHelperClass EncryptionMode = new MyHelperClass();
                        } else if (EncryptionMode.getBestEncryptionMode(alg.getEncryptionMode()) == EncryptionMode.MODE_BLOCK) {
                            is =(InputStream)(Object) new BlockCipherInputStream(new FileInputStream(archive), alg);
                            if (is == null) {
                                MyHelperClass bundle = new MyHelperClass();
                                Application.getController().displayError(bundle.getString("dec_init_fail_title"), bundle.getString("dec_init_fail_text"));
                                return;
                            }
                        }
                        zis = new ZipArchiveInputStream(is);
                        if (zis == null) {
                            MyHelperClass bundle = new MyHelperClass();
                            Application.getController().displayError(bundle.getString("dec_init_fail_title"), bundle.getString("dec_init_fail_text"));
                            return;
                        }
                        File outputDir =(File)(Object) getTargetDirectory();
                        if (outputDir == null) {
                            return;
                        }
                        if (!outputDir.exists()) {
                            if (!outputDir.mkdir()) {
                                Application.getController().displayError(bundle.getString("output_dir_fail_title"), outputDir.getAbsolutePath() + " " + bundle.getString("output_dir_fail_text"));
                                return;
                            }
                        }
                        ZipArchiveEntry zae = null;
                        boolean gotEntries = false;
                        while ((zae =(ZipArchiveEntry)(Object) zis.getNextZipEntry()) != null) {
                            gotEntries = true;
                            File out = new File((String)(Object)outputDir,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) zae.getName());
                            if (out.exists()) {
                                if (!(Boolean)(Object)mayOverwrite(out)) {
                                    continue;
                                }
                            }
                            Application.getController().displayVerbose("writing to file: " + out.getAbsolutePath());
                            if (!out.getParentFile().exists()) {
                                out.getParentFile().mkdirs();
                            }
                            if ((boolean)(Object)zae.isDirectory()) {
                                out.mkdir();
                                continue;
                            }
                            FileOutputStream os = new FileOutputStream(out);
                            long length =(long)(Object) zae.getCompressedSize(), counter = 0;
                            Application.getController().displayVerbose("Length of zip entry " + zae.getName() + " is " + length + "b");
                            byte[] buffer = new byte[16384];
                            MessageDigest md = MessageDigest.getInstance("SHA-1");
                            DigestInputStream in = new DigestInputStream((InputStream)(Object)zis, md);
                            while ((counter = in.read(buffer)) > 0) {
                                if (Thread.currentThread().isInterrupted()) {
                                    os.close();
                                    zis.close();
                                    Application.getController().notifyProgressFinished();
                                    resetModel(true);
                                    return;
                                }
                                os.write(buffer, 0, (int) counter);
                            }
                            os.close();
                            if (zae.getComment() != null &&(int)(Object) zae.getComment().length() > 0) {
                                if (Arrays.equals((long[])(Object)md.digest(),(long[])(Object) new Base64().decode(zae.getComment()))) {
                                    Application.getController().displayVerbose("Hash of " + zae.getName() + ": " + new Base64().encodeToString(md.digest()));
                                    Application.getController().displayError("Hash Error", "The stored hash of the original file and the hash of the decrypted data do not match. Normally, this means that your data has been manipulated/damaged, but it can also happen if your Java Runtime has a bug in his hash functions.\nIT IS VERY IMPORTANT TO CHECK THE INTEGRITY OF YOUR DECRYPTED DATA!");
                                } else {
                                    Application.getController().displayVerbose("the hash of " + zae.getName() + " was verified succesfully");
                                }
                            }
                        }
                        if (!gotEntries) {
                            Application.getController().displayError(bundle.getString("error_no_entries_title"), bundle.getString("error_no_entries_text"));
                            outputDir.delete();
                        }
                        zis.close();
                        resetModel(false);
                    } catch (FileNotFoundException ex) {
                        Application.getController().displayError(bundle.getString("error_file_not_exist"), ex.getLocalizedMessage());
                    } catch (IOException ex) {
                        Application.getController().displayError(bundle.getString("error_generic_io"), ex.getLocalizedMessage());
                    } catch (NoSuchAlgorithmException ex) {
                        Application.getController().displayError(bundle.getString("unknown_alg_text"), ex.getLocalizedMessage());
                    }
                }
                Application.getController().notifyProgressFinished();
                resetModel(true);
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MODE_STREAM;
	public MyHelperClass MODE_BLOCK;
public MyHelperClass size(){ return null; }
	public MyHelperClass displayError(String o0, String o1){ return null; }
	public MyHelperClass notifyProgressFinished(){ return null; }
	public MyHelperClass notifyProgressUpdated(int o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass displayVerbose(String o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getController(){ return null; }
	public MyHelperClass getBestEncryptionMode(MyHelperClass o0){ return null; }
	public MyHelperClass displayError(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass displayError(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getAlgorithms(){ return null; }
	public MyHelperClass notifyProgressStarted(){ return null; }
	public MyHelperClass length(){ return null; }}

class Algorithm {

public MyHelperClass initDecrypt(MyHelperClass o0){ return null; }
	public MyHelperClass getDecryptionStream(FileInputStream o0){ return null; }
	public MyHelperClass getSuffix(){ return null; }
	public MyHelperClass getEncryptionMode(){ return null; }}

class ZipArchiveInputStream {

ZipArchiveInputStream(InputStream o0){}
	ZipArchiveInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextZipEntry(){ return null; }}

class BlockCipherInputStream {

BlockCipherInputStream(){}
	BlockCipherInputStream(FileInputStream o0, Algorithm o1){}}

class ZipArchiveEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getComment(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getCompressedSize(){ return null; }}

class Base64 {

public MyHelperClass encodeToString(byte[] o0){ return null; }
	public MyHelperClass decode(MyHelperClass o0){ return null; }}
