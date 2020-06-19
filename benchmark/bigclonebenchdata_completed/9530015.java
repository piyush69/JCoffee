import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9530015 {
public MyHelperClass MultipleDataStoreWrapper;

    public static void main(String[] args) throws Throwable {
        Options options = new Options();
        options.addOption(new CommandLineOptionBuilder("cas", "cas file").isRequired(true).build());
        options.addOption(new CommandLineOptionBuilder("o", "output directory").longName("outputDir").isRequired(true).build());
        options.addOption(new CommandLineOptionBuilder("tempDir", "temp directory").build());
        MyHelperClass DEFAULT_PREFIX = new MyHelperClass();
        options.addOption(new CommandLineOptionBuilder("prefix", "file prefix for all generated files ( default " + DEFAULT_PREFIX + " )").build());
        options.addOption(new CommandLineOptionBuilder("trim", "trim file in sfffile's tab delimmed trim format").build());
        options.addOption(new CommandLineOptionBuilder("trimMap", "trim map file containing tab delimited trimmed fastX file to untrimmed counterpart").build());
        options.addOption(new CommandLineOptionBuilder("chromat_dir", "directory of chromatograms to be converted into phd " + "(it is assumed the read data for these chromatograms are in a fasta file which the .cas file knows about").build());
        MyHelperClass DEFAULT_CACHE_SIZE = new MyHelperClass();
        options.addOption(new CommandLineOptionBuilder("s", "cache size ( default " + DEFAULT_CACHE_SIZE + " )").longName("cache_size").build());
        options.addOption(new CommandLineOptionBuilder("useIllumina", "any FASTQ files in this assembly are encoded in Illumina 1.3+ format (default is Sanger)").isFlag(true).build());
        options.addOption(new CommandLineOptionBuilder("useClosureTrimming", "apply additional contig trimming based on JCVI Closure rules").isFlag(true).build());
        CommandLine commandLine;
        try {
            MyHelperClass CommandLineUtils = new MyHelperClass();
            commandLine = CommandLineUtils.parseCommandLine(options, args);
//            MyHelperClass DEFAULT_CACHE_SIZE = new MyHelperClass();
            int cacheSize = commandLine.hasOption("s") ? Integer.parseInt(commandLine.getOptionValue("s")) : DEFAULT_CACHE_SIZE;
            File casFile = new File(commandLine.getOptionValue("cas"));
            File casWorkingDirectory = casFile.getParentFile();
            MyHelperClass DirectoryFileServer = new MyHelperClass();
            ReadWriteDirectoryFileServer outputDir = DirectoryFileServer.createReadWriteDirectoryFileServer(commandLine.getOptionValue("o"));
//            MyHelperClass DEFAULT_PREFIX = new MyHelperClass();
            String prefix = commandLine.hasOption("prefix") ? commandLine.getOptionValue("prefix") : DEFAULT_PREFIX;
            TrimDataStore trimDatastore;
            if (commandLine.hasOption("trim")) {
                List<TrimDataStore> dataStores = new ArrayList<TrimDataStore>();
                final String trimFiles = commandLine.getOptionValue("trim");
                for (String trimFile : trimFiles.split(",")) {
                    System.out.println("adding trim file " + trimFile);
                    dataStores.add(new DefaultTrimFileDataStore(new File(trimFile)));
                }
                MyHelperClass MultipleDataStoreWrapper = new MyHelperClass();
                trimDatastore = MultipleDataStoreWrapper.createMultipleDataStoreWrapper(TrimDataStore.class, dataStores);
            } else {
                MyHelperClass TrimDataStoreUtil = new MyHelperClass();
                trimDatastore = TrimDataStoreUtil.EMPTY_DATASTORE;
            }
            CasTrimMap trimToUntrimmedMap;
            if (commandLine.hasOption("trimMap")) {
                trimToUntrimmedMap = new DefaultTrimFileCasTrimMap(new File(commandLine.getOptionValue("trimMap")));
            } else {
                trimToUntrimmedMap =(CasTrimMap)(Object) new UnTrimmedExtensionTrimMap();
            }
            boolean useClosureTrimming = commandLine.hasOption("useClosureTrimming");
            TraceDataStore sangerTraceDataStore = null;
            Map<String, File> sangerFileMap = null;
            ReadOnlyDirectoryFileServer sourceChromatogramFileServer = null;
            if (commandLine.hasOption("chromat_dir")) {
//                MyHelperClass DirectoryFileServer = new MyHelperClass();
                sourceChromatogramFileServer = DirectoryFileServer.createReadOnlyDirectoryFileServer(new File(commandLine.getOptionValue("chromat_dir")));
                sangerTraceDataStore = new SingleSangerTraceDirectoryFileDataStore(sourceChromatogramFileServer, ".scf");
                sangerFileMap = new HashMap<String, File>();
                Iterator<String> iter = sangerTraceDataStore.getIds();
                while (iter.hasNext()) {
                    String id = iter.next();
                    sangerFileMap.put(id, sangerTraceDataStore.get(id).getFile());
                }
            }
            PrintWriter logOut = new PrintWriter(new FileOutputStream(outputDir.createNewFile(prefix + ".log")), true);
            PrintWriter consensusOut = new PrintWriter(new FileOutputStream(outputDir.createNewFile(prefix + ".consensus.fasta")), true);
            PrintWriter traceFilesOut = new PrintWriter(new FileOutputStream(outputDir.createNewFile(prefix + ".traceFiles.txt")), true);
            PrintWriter referenceFilesOut = new PrintWriter(new FileOutputStream(outputDir.createNewFile(prefix + ".referenceFiles.txt")), true);
            long startTime = System.currentTimeMillis();
            logOut.println(System.getProperty("user.dir"));
            final ReadWriteDirectoryFileServer tempDir;
            if (!commandLine.hasOption("tempDir")) {
                MyHelperClass DEFAULT_TEMP_DIR = new MyHelperClass();
                tempDir = DirectoryFileServer.createTemporaryDirectoryFileServer(DEFAULT_TEMP_DIR);
            } else {
                File t = new File(commandLine.getOptionValue("tempDir"));
                MyHelperClass IOUtil = new MyHelperClass();
                IOUtil.mkdirs(t);
//                MyHelperClass DirectoryFileServer = new MyHelperClass();
                tempDir = DirectoryFileServer.createTemporaryDirectoryFileServer(t);
            }
            try {
                if (!outputDir.contains("chromat_dir")) {
                    outputDir.createNewDir("chromat_dir");
                }
                if (sourceChromatogramFileServer != null) {
                    for (File f : (Object[])(Object)sourceChromatogramFileServer) {
                        String name = f.getName();
                        OutputStream out = new FileOutputStream(outputDir.createNewFile("chromat_dir/" + name));
                        final FileInputStream fileInputStream = new FileInputStream(f);
                        try {
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copy(fileInputStream, out);
                        } finally {
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.closeQuietly(out);
//                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.closeQuietly(fileInputStream);
                        }
                    }
                }
                MyHelperClass FastQQualityCodec = new MyHelperClass();
                FastQQualityCodec qualityCodec = commandLine.hasOption("useIllumina") ? FastQQualityCodec.ILLUMINA : FastQQualityCodec.SANGER;
                MyHelperClass EmptyDataStoreFilter = new MyHelperClass();
                CasDataStoreFactory casDataStoreFactory = new MultiCasDataStoreFactory(new H2SffCasDataStoreFactory(casWorkingDirectory, tempDir, EmptyDataStoreFilter.INSTANCE), new H2FastQCasDataStoreFactory(casWorkingDirectory, trimToUntrimmedMap, qualityCodec, tempDir.getRootDir()), new FastaCasDataStoreFactory(casWorkingDirectory, trimToUntrimmedMap, cacheSize));
                final SliceMapFactory sliceMapFactory =(SliceMapFactory)(Object) new LargeNoQualitySliceMapFactory();
                CasAssembly casAssembly = new Builder(casFile, casDataStoreFactory, trimDatastore, trimToUntrimmedMap, casWorkingDirectory).build();
                System.out.println("finished making casAssemblies");
                for (File traceFile : casAssembly.getNuceotideFiles()) {
                    traceFilesOut.println(traceFile.getAbsolutePath());
                    final String name = traceFile.getName();
                    MyHelperClass FilenameUtils = new MyHelperClass();
                    String extension = FilenameUtils.getExtension(name);
                    if (name.contains("fastq")) {
                        if (!outputDir.contains("solexa_dir")) {
                            outputDir.createNewDir("solexa_dir");
                        }
                        if (outputDir.contains("solexa_dir/" + name)) {
                            MyHelperClass IOUtil = new MyHelperClass();
                            IOUtil.delete(outputDir.getFile("solexa_dir/" + name));
                        }
                        outputDir.createNewSymLink(traceFile.getAbsolutePath(), "solexa_dir/" + name);
                    } else if ("sff".equals(extension)) {
                        if (!outputDir.contains("sff_dir")) {
                            outputDir.createNewDir("sff_dir");
                        }
                        if (outputDir.contains("sff_dir/" + name)) {
                            MyHelperClass IOUtil = new MyHelperClass();
                            IOUtil.delete(outputDir.getFile("sff_dir/" + name));
                        }
                        outputDir.createNewSymLink(traceFile.getAbsolutePath(), "sff_dir/" + name);
                    }
                }
                for (File traceFile : casAssembly.getReferenceFiles()) {
                    referenceFilesOut.println(traceFile.getAbsolutePath());
                }
                DataStore contigDatastore = casAssembly.getContigDataStore();
                Map<String, AceContig> aceContigs = new HashMap<String, AceContig>();
                CasIdLookup readIdLookup = sangerFileMap == null ? casAssembly.getReadIdLookup() : new DifferentFileCasIdLookupAdapter(casAssembly.getReadIdLookup(), sangerFileMap);
                Date phdDate = new Date(startTime);
                NextGenClosureAceContigTrimmer closureContigTrimmer = null;
                if (useClosureTrimming) {
                    closureContigTrimmer = new NextGenClosureAceContigTrimmer(2, 5, 10);
                }
                for (CasContig casContig : contigDatastore) {
                    final AceContigAdapter adpatedCasContig = new AceContigAdapter(casContig, phdDate, readIdLookup);
                    MyHelperClass DefaultCoverageMap = new MyHelperClass();
                    CoverageMap<CoverageRegion> coverageMap = DefaultCoverageMap.buildCoverageMap(adpatedCasContig);
                    MyHelperClass ConsedUtil = new MyHelperClass();
                    for (AceContig aceContig : ConsedUtil.split0xContig(adpatedCasContig, coverageMap)) {
                        if (useClosureTrimming) {
                            AceContig trimmedAceContig = closureContigTrimmer.trimContig(aceContig);
                            if (trimmedAceContig == null) {
                                System.out.printf("%s was completely trimmed... skipping%n", aceContig.getId());
                                continue;
                            }
                            aceContig = trimmedAceContig;
                        }
                        aceContigs.put(aceContig.getId(), aceContig);
                        MyHelperClass NucleotideGlyph = new MyHelperClass();
                        consensusOut.print(new DefaultNucleotideEncodedSequenceFastaRecord(aceContig.getId(), NucleotideGlyph.convertToString(NucleotideGlyph.convertToUngapped(aceContig.getConsensus().decode()))));
                    }
                }
                System.out.printf("finished adapting %d casAssemblies into %d ace contigs%n", contigDatastore.size(), aceContigs.size());
                MyHelperClass TraceQualityDataStoreAdapter = new MyHelperClass();
                QualityDataStore qualityDataStore = sangerTraceDataStore == null ? casAssembly.getQualityDataStore() : MultipleDataStoreWrapper.createMultipleDataStoreWrapper(QualityDataStore.class, TraceQualityDataStoreAdapter.adapt(sangerTraceDataStore), casAssembly.getQualityDataStore());
                final DateTime phdDateTime = new DateTime(phdDate);
                MyHelperClass CachedDataStore = new MyHelperClass();
                final PhdDataStore casPhdDataStore = CachedDataStore.createCachedDataStore(PhdDataStore.class, new ArtificalPhdDataStore(casAssembly.getNucleotideDataStore(), qualityDataStore, phdDateTime), cacheSize);
                MyHelperClass MultipleDataStoreWrapper = new MyHelperClass();
                final PhdDataStore phdDataStore = sangerTraceDataStore == null ? casPhdDataStore : MultipleDataStoreWrapper.createMultipleDataStoreWrapper(PhdDataStore.class, new PhdSangerTraceDataStoreAdapter(sangerTraceDataStore, phdDateTime), casPhdDataStore);
                MyHelperClass DateTimeUtils = new MyHelperClass();
                WholeAssemblyAceTag pathToPhd = new DefaultWholeAssemblyAceTag("phdball", "cas2consed", new Date(DateTimeUtils.currentTimeMillis()), "../phd_dir/" + prefix + ".phd.ball");
                AceAssembly aceAssembly = new DefaultAceAssembly(new SimpleDataStore(aceContigs), phdDataStore, Collections.emptyList(), new DefaultAceTagMap(Collections.emptyList(), Collections.emptyList(), Arrays.asList(pathToPhd)));
                System.out.println("writing consed package...");
                ConsedWriter.writeConsedPackage(aceAssembly, sliceMapFactory, outputDir.getRootDir(), prefix, false);
            } catch (Throwable t) {
                t.printStackTrace(logOut);
                throw t;
            } finally {
                long endTime = System.currentTimeMillis();
                logOut.printf("took %s%n", new Period(endTime - startTime));
                logOut.flush();
                logOut.close();
                outputDir.close();
                consensusOut.close();
                traceFilesOut.close();
                referenceFilesOut.close();
                trimDatastore.close();
            }
        } catch (ParseException e) {
            printHelp(options);
            System.exit(1);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ILLUMINA;
	public MyHelperClass EMPTY_DATASTORE;
	public MyHelperClass INSTANCE;
	public MyHelperClass SANGER;
public MyHelperClass getExtension(String o0){ return null; }
	public MyHelperClass createTemporaryDirectoryFileServer(MyHelperClass o0){ return null; }
	public MyHelperClass createReadOnlyDirectoryFileServer(File o0){ return null; }
	public MyHelperClass createMultipleDataStoreWrapper(Class<TrimDataStore,List<TrimDataStore o0){ return null; }
	public MyHelperClass mkdirs(File o0){ return null; }
	public MyHelperClass createTemporaryDirectoryFileServer(File o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass parseCommandLine(Options o0, String[] o1){ return null; }
	public MyHelperClass currentTimeMillis(){ return null; }}

class Options {

}

class CommandLineOptionBuilder {

CommandLineOptionBuilder(String o0, String o1){}
	CommandLineOptionBuilder(){}}

class CommandLine {

public MyHelperClass hasOption(String o0){ return null; }
	public MyHelperClass getOptionValue(String o0){ return null; }}

class ReadWriteDirectoryFileServer {

public MyHelperClass getRootDir(){ return null; }
	public MyHelperClass createNewFile(String o0){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass createNewDir(String o0){ return null; }
	public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass createNewSymLink(String o0, String o1){ return null; }}

class TrimDataStore {

}

class DefaultTrimFileDataStore {

DefaultTrimFileDataStore(){}
	DefaultTrimFileDataStore(File o0){}}

class CasTrimMap {

}

class DefaultTrimFileCasTrimMap {

DefaultTrimFileCasTrimMap(){}
	DefaultTrimFileCasTrimMap(File o0){}}

class UnTrimmedExtensionTrimMap {

}

class TraceDataStore {

}

class FileSangerTrace {

}

class ReadOnlyDirectoryFileServer {

}

class SingleSangerTraceDirectoryFileDataStore {

SingleSangerTraceDirectoryFileDataStore(){}
	SingleSangerTraceDirectoryFileDataStore(ReadOnlyDirectoryFileServer o0, String o1){}}

class FastQQualityCodec {

}

class CasDataStoreFactory {

}

class MultiCasDataStoreFactory {

}

class H2SffCasDataStoreFactory {

}

class SliceMapFactory {

}

class LargeNoQualitySliceMapFactory {

}

class CasAssembly {

public MyHelperClass getReadIdLookup(){ return null; }
	public MyHelperClass getReferenceFiles(){ return null; }
	public MyHelperClass getNuceotideFiles(){ return null; }
	public MyHelperClass getNucleotideDataStore(){ return null; }
	public MyHelperClass getQualityDataStore(){ return null; }}

class DataStore {

}

class CasContig {

}

class AceContig {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getConsensus(){ return null; }}

class CasIdLookup {

}

class DifferentFileCasIdLookupAdapter {

}

class NextGenClosureAceContigTrimmer {

NextGenClosureAceContigTrimmer(){}
	NextGenClosureAceContigTrimmer(int o0, int o1, int o2){}
	public MyHelperClass trimContig(AceContig o0){ return null; }}

class AceContigAdapter {

AceContigAdapter(CasContig o0, Date o1, CasIdLookup o2){}
	AceContigAdapter(){}}

class CoverageMap {

}

class CoverageRegion {

}

class AcePlacedRead {

}

class DefaultNucleotideEncodedSequenceFastaRecord {

}

class QualityDataStore {

}

class DateTime {

DateTime(){}
	DateTime(Date o0){}}

class PhdDataStore {

}

class ArtificalPhdDataStore {

}

class PhdSangerTraceDataStoreAdapter {

}

class WholeAssemblyAceTag {

}

class DefaultWholeAssemblyAceTag {

DefaultWholeAssemblyAceTag(){}
	DefaultWholeAssemblyAceTag(String o0, String o1, Date o2, String o3){}}

class AceAssembly {

}

class DefaultAceAssembly {

}

class H2FastQCasDataStoreFactory {

}

class FastaCasDataStoreFactory {

}

class Builder {

}
