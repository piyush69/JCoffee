
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23564275 {

    public static void main(String[] args) {
        Option optHelp = new Option("h", "help", false, "print this message");
        Option optCerts = new Option("c", "cert", true, "use external semicolon separated X.509 certificate files");
        optCerts.setArgName("certificates");
        Option optPasswd = new Option("p", "password", true, "set password for opening PDF");
        optPasswd.setArgName("password");
        Option optExtract = new Option("e", "extract", true, "extract signed PDF revisions to given folder");
        optExtract.setArgName("folder");
        Option optListKs = new Option("lk", "list-keystore-types", false, "list keystore types provided by java");
        Option optListCert = new Option("lc", "list-certificates", false, "list certificate aliases in a KeyStore");
        Option optKsType = new Option("kt", "keystore-type", true, "use keystore type with given name");
        optKsType.setArgName("keystore_type");
        Option optKsFile = new Option("kf", "keystore-file", true, "use given keystore file");
        optKsFile.setArgName("file");
        Option optKsPass = new Option("kp", "keystore-password", true, "password for keystore file (look on -kf option)");
        optKsPass.setArgName("password");
        Option optFailFast = new Option("ff", "fail-fast", true, "flag which sets the Verifier to exit with error code on the first validation failure");
        final Options options = new Options();
        options.addOption(optHelp);
        options.addOption(optCerts);
        options.addOption(optPasswd);
        options.addOption(optExtract);
        options.addOption(optListKs);
        options.addOption(optListCert);
        options.addOption(optKsType);
        options.addOption(optKsFile);
        options.addOption(optKsPass);
        options.addOption(optFailFast);
        CommandLine line = null;
        try {
            CommandLineParser parser =(CommandLineParser)(Object) new PosixParser();
            line =(CommandLine)(Object) parser.parse(options, args);
        } catch (UncheckedIOException exp) {
            System.err.println("Illegal command used: " + exp.getMessage());
            System.exit(-1);
        }
        final boolean failFast =(boolean)(Object) line.hasOption("ff");
        final String[] tmpArgs =(String[])(Object) line.getArgs();
        if ((boolean)(Object)line.hasOption("h") || args == null || args.length == 0) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp(70, "java -jar Verifier.jar [file1.pdf [file2.pdf ...]]", "JSignPdf Verifier is a command line tool for verifying signed PDF documents.", options, null, true);
        } else if ((boolean)(Object)line.hasOption("lk")) {
            MyHelperClass KeyStoreUtils = new MyHelperClass();
            for (String tmpKsType :(String[])(Object) (Object[])(Object)KeyStoreUtils.getKeyStores()) {
                System.out.println(tmpKsType);
            }
        } else if ((boolean)(Object)line.hasOption("lc")) {
            MyHelperClass KeyStoreUtils = new MyHelperClass();
            for (String tmpCert :(String[])(Object) (Object[])(Object)KeyStoreUtils.getCertAliases(line.getOptionValue("kt"), line.getOptionValue("kf"), line.getOptionValue("kp"))) {
                System.out.println(tmpCert);
            }
        } else {
            final VerifierLogic tmpLogic = new VerifierLogic(line.getOptionValue("kt"), line.getOptionValue("kf"), line.getOptionValue("kp"));
            tmpLogic.setFailFast(failFast);
            if ((boolean)(Object)line.hasOption("c")) {
                String tmpCertFiles =(String)(Object) line.getOptionValue("c");
                for (String tmpCFile : tmpCertFiles.split(";")) {
                    tmpLogic.addX509CertFile(tmpCFile);
                }
            }
            byte[] tmpPasswd = null;
            if ((boolean)(Object)line.hasOption("p")) {
                tmpPasswd =(byte[])(Object) line.getOptionValue("p").getBytes();
            }
            String tmpExtractDir = null;
            if ((boolean)(Object)line.hasOption("e")) {
                tmpExtractDir =(String)(Object) (new File((String)(Object)line.getOptionValue("e")).getPath());
            }
            for (String tmpFilePath : tmpArgs) {
                System.out.println("Verifying " + tmpFilePath);
                final File tmpFile = new File(tmpFilePath);
                if (!(Boolean)(Object)tmpFile.canRead()) {
                    System.err.println("Couln't read the file. Check the path and permissions.");
                    if (failFast) {
                        System.exit(-1);
                    }
                    continue;
                }
                final VerificationResult tmpResult =(VerificationResult)(Object) tmpLogic.verify(tmpFilePath, tmpPasswd);
                if (tmpResult.getException() != null) {
                    tmpResult.getException().printStackTrace();
                    System.exit(-1);
                } else {
                    System.out.println("Total revisions: " + tmpResult.getTotalRevisions());
                    for (SignatureVerification tmpSigVer :(SignatureVerification[])(Object) (Object[])(Object)tmpResult.getVerifications()) {
                        System.out.println(tmpSigVer.toString());
                        if (tmpExtractDir != null) {
                            try {
                                File tmpExFile = new File(tmpExtractDir + "/" + tmpFile.getName() + "_" + tmpSigVer.getRevision() + ".pdf");
                                System.out.println("Extracting to " + tmpExFile.getCanonicalPath());
                                FileOutputStream tmpFOS = new FileOutputStream(tmpExFile.getCanonicalPath());
                                InputStream tmpIS =(InputStream)(Object) tmpLogic.extractRevision(tmpFilePath, tmpPasswd, tmpSigVer.getName());
                                MyHelperClass IOUtils = new MyHelperClass();
                                IOUtils.copy(tmpIS, tmpFOS);
                                tmpIS.close();
                                tmpFOS.close();
                            } catch (UncheckedIOException ioe) {
                                ioe.printStackTrace();
                            }
                        }
                    }
                    MyHelperClass SignatureVerification = new MyHelperClass();
                    if (failFast && (boolean)(Object)SignatureVerification.isError(tmpResult.getVerificationResultCode())) {
                        System.exit((int)(Object)tmpResult.getVerificationResultCode());
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass printStackTrace(){ return null; }
	public MyHelperClass getCertAliases(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass isError(MyHelperClass o0){ return null; }
	public MyHelperClass getKeyStores(){ return null; }}

class Option {

Option(String o0, String o1, boolean o2, String o3){}
	Option(){}
	public MyHelperClass setArgName(String o0){ return null; }}

class Options {

public MyHelperClass addOption(Option o0){ return null; }}

class CommandLine {

public MyHelperClass getOptionValue(String o0){ return null; }
	public MyHelperClass hasOption(String o0){ return null; }
	public MyHelperClass getArgs(){ return null; }}

class CommandLineParser {

public MyHelperClass parse(Options o0, String[] o1){ return null; }}

class PosixParser {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class HelpFormatter {

public MyHelperClass printHelp(int o0, String o1, String o2, Options o3, Object o4, boolean o5){ return null; }}

class VerifierLogic {

VerifierLogic(){}
	VerifierLogic(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	public MyHelperClass setFailFast(boolean o0){ return null; }
	public MyHelperClass extractRevision(String o0, byte[] o1, MyHelperClass o2){ return null; }
	public MyHelperClass addX509CertFile(String o0){ return null; }
	public MyHelperClass verify(String o0, byte[] o1){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class VerificationResult {

public MyHelperClass getVerifications(){ return null; }
	public MyHelperClass getException(){ return null; }
	public MyHelperClass getTotalRevisions(){ return null; }
	public MyHelperClass getVerificationResultCode(){ return null; }}

class SignatureVerification {

public MyHelperClass getRevision(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
