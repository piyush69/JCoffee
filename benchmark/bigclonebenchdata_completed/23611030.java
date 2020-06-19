import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23611030 {
public MyHelperClass submitSingleCasAssemblyConversion(Command o0){ return null; }
public MyHelperClass commandLine;
	public MyHelperClass IOUtil;
	public MyHelperClass CasParser;
	public MyHelperClass casFile;
	public MyHelperClass DEFAULT_PREFIX;
	public MyHelperClass FilenameUtils;
	public MyHelperClass DirectoryFileServer;
	public MyHelperClass IOUtils;
	public MyHelperClass DateTimeUtils;
	public MyHelperClass tempDir;
	public MyHelperClass MultipleWrapper;
	public MyHelperClass prepareForBuild(){ return null; }
	public MyHelperClass handleException(Exception o0){ return null; }
	public MyHelperClass waitForAllAssembliesToFinish(){ return null; }
	public MyHelperClass cleanup(){ return null; }

//    @Override
    public CasAssembly build()  throws Throwable {
        try {
            prepareForBuild();
            File casWorkingDirectory = casFile.getParentFile();
            DefaultCasFileReadIndexToContigLookup read2contigMap = new DefaultCasFileReadIndexToContigLookup();
            AbstractDefaultCasFileLookup readIdLookup = new DefaultReadCasFileLookup(casWorkingDirectory);
            CasParser.parseOnlyMetaData(casFile, MultipleWrapper.createMultipleWrapper(CasFileVisitor.class, read2contigMap, readIdLookup));
            ReadWriteDirectoryFileServer consedOut = DirectoryFileServer.createReadWriteDirectoryFileServer(commandLine.getOptionValue("o"));
            long startTime = DateTimeUtils.currentTimeMillis();
            int numberOfCasContigs = read2contigMap.getNumberOfContigs();
            for (long i = 0; i < numberOfCasContigs; i++) {
                File outputDir = consedOut.createNewDir("" + i);
                Command aCommand = new Command(new File("fakeCommand"));
                aCommand.setOption("-casId", "" + i);
                aCommand.setOption("-cas", commandLine.getOptionValue("cas"));
                aCommand.setOption("-o", outputDir.getAbsolutePath());
                aCommand.setOption("-tempDir", tempDir.getAbsolutePath());
                aCommand.setOption("-prefix", "temp");
                if (commandLine.hasOption("useIllumina")) {
                    aCommand.addFlag("-useIllumina");
                }
                if (commandLine.hasOption("useClosureTrimming")) {
                    aCommand.addFlag("-useClosureTrimming");
                }
                if (commandLine.hasOption("trim")) {
                    aCommand.setOption("-trim", commandLine.getOptionValue("trim"));
                }
                if (commandLine.hasOption("trimMap")) {
                    aCommand.setOption("-trimMap", commandLine.getOptionValue("trimMap"));
                }
                if (commandLine.hasOption("chromat_dir")) {
                    aCommand.setOption("-chromat_dir", commandLine.getOptionValue("chromat_dir"));
                }
                submitSingleCasAssemblyConversion(aCommand);
            }
            waitForAllAssembliesToFinish();
            int numContigs = 0;
            int numReads = 0;
            for (int i = 0; i < numberOfCasContigs; i++) {
                File countMap = consedOut.getFile(i + "/temp.counts");
                Scanner scanner = new Scanner(countMap);
                if (!scanner.hasNextInt()) {
                    throw new IllegalStateException("single assembly conversion # " + i + " did not complete");
                }
                numContigs += scanner.nextInt();
                numReads += scanner.nextInt();
                scanner.close();
            }
            System.out.println("num contigs =" + numContigs);
            System.out.println("num reads =" + numReads);
            consedOut.createNewDir("edit_dir");
            consedOut.createNewDir("phd_dir");
            String prefix = commandLine.hasOption("prefix") ? commandLine.getOptionValue("prefix") : DEFAULT_PREFIX;
            OutputStream masterAceOut = new FileOutputStream(consedOut.createNewFile("edit_dir/" + prefix + ".ace.1"));
            OutputStream masterPhdOut = new FileOutputStream(consedOut.createNewFile("phd_dir/" + prefix + ".phd.ball"));
            OutputStream masterConsensusOut = new FileOutputStream(consedOut.createNewFile(prefix + ".consensus.fasta"));
            OutputStream logOut = new FileOutputStream(consedOut.createNewFile(prefix + ".log"));
            try {
                masterAceOut.write(String.format("AS %d %d%n", numContigs, numReads).getBytes());
                for (int i = 0; i < numberOfCasContigs; i++) {
                    InputStream aceIn = consedOut.getFileAsStream(i + "/temp.ace");
                    IOUtils.copy(aceIn, masterAceOut);
                    InputStream phdIn = consedOut.getFileAsStream(i + "/temp.phd");
                    IOUtils.copy(phdIn, masterPhdOut);
                    InputStream consensusIn = consedOut.getFileAsStream(i + "/temp.consensus.fasta");
                    IOUtils.copy(consensusIn, masterConsensusOut);
                    IOUtil.closeAndIgnoreErrors(aceIn, phdIn, consensusIn);
                    File tempDir = consedOut.getFile(i + "");
                    IOUtil.recursiveDelete(tempDir);
                }
                consedOut.createNewSymLink("../phd_dir/" + prefix + ".phd.ball", "edit_dir/phd.ball");
                if (commandLine.hasOption("chromat_dir")) {
                    consedOut.createNewDir("chromat_dir");
                    File originalChromatDir = new File(commandLine.getOptionValue("chromat_dir"));
                    for (File chromat : originalChromatDir.listFiles(new FilenameFilter() {

//                        @Override
                        public boolean accept(File dir, String name) {
                            return name.endsWith(".scf");
                        }
                    })) {
                        File newChromatFile = consedOut.createNewFile("chromat_dir/" + FilenameUtils.getBaseName(chromat.getName()));
                        FileOutputStream newChromat = new FileOutputStream(newChromatFile);
                        InputStream in = new FileInputStream(chromat);
                        IOUtils.copy(in, newChromat);
                        IOUtil.closeAndIgnoreErrors(in, newChromat);
                    }
                }
                System.out.println("finished making casAssemblies");
                for (File traceFile : readIdLookup.getFiles()) {
                    final String name = traceFile.getName();
                    String extension = FilenameUtils.getExtension(name);
                    if (name.contains("fastq")) {
                        if (!consedOut.contains("solexa_dir")) {
                            consedOut.createNewDir("solexa_dir");
                        }
                        if (consedOut.contains("solexa_dir/" + name)) {
                            IOUtil.delete(consedOut.getFile("solexa_dir/" + name));
                        }
                        consedOut.createNewSymLink(traceFile.getAbsolutePath(), "solexa_dir/" + name);
                    } else if ("sff".equals(extension)) {
                        if (!consedOut.contains("sff_dir")) {
                            consedOut.createNewDir("sff_dir");
                        }
                        if (consedOut.contains("sff_dir/" + name)) {
                            IOUtil.delete(consedOut.getFile("sff_dir/" + name));
                        }
                        consedOut.createNewSymLink(traceFile.getAbsolutePath(), "sff_dir/" + name);
                    }
                }
                long endTime = DateTimeUtils.currentTimeMillis();
                logOut.write(String.format("took %s%n", new Period(endTime - startTime)).getBytes());
            } finally {
                IOUtil.closeAndIgnoreErrors(masterAceOut, masterPhdOut, masterConsensusOut, logOut);
            }
        } catch (Exception e) {
            handleException(e);
        } finally {
            cleanup();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBaseName(String o0){ return null; }
	public MyHelperClass getOptionValue(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass hasOption(String o0){ return null; }
	public MyHelperClass closeAndIgnoreErrors(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getExtension(String o0){ return null; }
	public MyHelperClass closeAndIgnoreErrors(InputStream o0, InputStream o1, InputStream o2){ return null; }
	public MyHelperClass recursiveDelete(File o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass createMultipleWrapper(Class<CasFileVisitor o0, DefaultCasFileReadIndexToContigLookup o1, AbstractDefaultCasFileLookup o2){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass closeAndIgnoreErrors(OutputStream o0, OutputStream o1, OutputStream o2, OutputStream o3){ return null; }
	public MyHelperClass currentTimeMillis(){ return null; }}

class CasAssembly {

}

class DefaultCasFileReadIndexToContigLookup {

public MyHelperClass getNumberOfContigs(){ return null; }}

class AbstractDefaultCasFileLookup {

public MyHelperClass getFiles(){ return null; }}

class DefaultReadCasFileLookup {

DefaultReadCasFileLookup(){}
	DefaultReadCasFileLookup(File o0){}}

class CasFileVisitor {

}

class ReadWriteDirectoryFileServer {

public MyHelperClass createNewFile(String o0){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass createNewDir(String o0){ return null; }
	public MyHelperClass getFileAsStream(String o0){ return null; }
	public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass createNewSymLink(String o0, String o1){ return null; }}

class Command {

Command(){}
	Command(File o0){}
	public MyHelperClass setOption(String o0, String o1){ return null; }
	public MyHelperClass addFlag(String o0){ return null; }}

class Period {

Period(long o0){}
	Period(){}}
