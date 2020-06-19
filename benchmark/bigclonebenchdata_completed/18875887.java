import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18875887 {
public MyHelperClass Utils;
	public MyHelperClass IOUtils;
	public MyHelperClass FileOutputFormat;
	public MyHelperClass SortOutputFormat;
	public MyHelperClass BlockCompressedStreamConstants;
	public MyHelperClass INPUT_PATHS_PROP;
	public MyHelperClass FileInputFormat;
	public MyHelperClass getConf(){ return null; }

//    @Override
    protected int run(CmdLineParser parser)  throws Throwable {
        final List<String> args = parser.getRemainingArgs();
        if (args.isEmpty()) {
            System.err.println("sort :: WORKDIR not given.");
            return 3;
        }
        if (args.size() == 1) {
            System.err.println("sort :: INPATH not given.");
            return 3;
        }
        MyHelperClass outputFileOpt = new MyHelperClass();
        final String wrkDir = args.get(0), out = (String) parser.getOptionValue(outputFileOpt);
        final List<String> strInputs = args.subList(1, args.size());
        final List<Path> inputs = new ArrayList<Path>(strInputs.size());
        for (final String in : strInputs) inputs.add(new Path(in));
        MyHelperClass verboseOpt = new MyHelperClass();
        final boolean verbose = parser.getBoolean(verboseOpt);
        final String intermediateOutName = out == null ? inputs.get(0).getName() : out;
        final Configuration conf = getConf();
        conf.setStrings(INPUT_PATHS_PROP, strInputs.toArray(new String[0]));
        conf.set(SortOutputFormat.OUTPUT_NAME_PROP, intermediateOutName);
        final Path wrkDirPath = new Path(wrkDir);
        final Timer t = new Timer();
        try {
            for (final Path in : inputs) Utils.configureSampling(in, conf);
//            @SuppressWarnings("deprecation") final int maxReduceTasks = new JobClient(new JobConf(conf)).getClusterStatus().getMaxReduceTasks();
            conf.setInt("mapred.reduce.tasks", Math.max(1, maxReduceTasks * 9 / 10));
            final Job job = new Job(conf);
            job.setJarByClass(Sort.class);
            job.setMapperClass(Mapper.class);
            job.setReducerClass(SortReducer.class);
            job.setMapOutputKeyClass(LongWritable.class);
            job.setOutputKeyClass(NullWritable.class);
            job.setOutputValueClass(SAMRecordWritable.class);
            job.setInputFormatClass(BAMInputFormat.class);
            job.setOutputFormatClass(SortOutputFormat.class);
            for (final Path in : inputs) FileInputFormat.addInputPath(job, in);
            FileOutputFormat.setOutputPath(job, wrkDirPath);
            job.setPartitionerClass(TotalOrderPartitioner.class);
            System.out.println("sort :: Sampling...");
            t.start();
            <LongWritable, SAMRecordWritable>writePartitionFile(job, new IntervalSampler<LongWritable, SAMRecordWritable>(0.01, 100));
            System.out.printf("sort :: Sampling complete in %d.%03d s.\n", t.stopS(), t.fms());
            job.submit();
            System.out.println("sort :: Waiting for job completion...");
            t.start();
            if (!job.waitForCompletion(verbose)) {
                System.err.println("sort :: Job failed.");
                return 4;
            }
            System.out.printf("sort :: Job complete in %d.%03d s.\n", t.stopS(), t.fms());
        } catch (IOException e) {
            System.err.printf("sort :: Hadoop error: %s\n", e);
            return 4;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (out != null) try {
            System.out.println("sort :: Merging output...");
            t.start();
            final Path outPath = new Path(out);
            final FileSystem srcFS = wrkDirPath.getFileSystem(conf);
            FileSystem dstFS = outPath.getFileSystem(conf);
            if (dstFS instanceof LocalFileSystem && dstFS instanceof ChecksumFileSystem) dstFS = ((LocalFileSystem) dstFS).getRaw();
            final BAMFileWriter w = new BAMFileWriter(dstFS.create(outPath), new File(""));
            w.setSortOrder(SortOrder.coordinate, true);
            w.setHeader(getHeaderMerger(conf).getMergedHeader());
            w.close();
            final OutputStream outs = dstFS.append(outPath);
            final FileStatus[] parts = srcFS.globStatus(new Path(wrkDir, conf.get(SortOutputFormat.OUTPUT_NAME_PROP) + "-[0-9][0-9][0-9][0-9][0-9][0-9]*"));
            {
                int i = 0;
                final Timer t2 = new Timer();
                for (final FileStatus part : parts) {
                    t2.start();
                    final InputStream ins = srcFS.open(part.getPath());
                    IOUtils.copyBytes(ins, outs, conf, false);
                    ins.close();
                    System.out.printf("sort :: Merged part %d in %d.%03d s.\n", ++i, t2.stopS(), t2.fms());
                }
            }
            for (final FileStatus part : parts) srcFS.delete(part.getPath(), false);
            outs.write(BlockCompressedStreamConstants.EMPTY_GZIP_BLOCK);
            outs.close();
            System.out.printf("sort :: Merging complete in %d.%03d s.\n", t.stopS(), t.fms());
        } catch (IOException e) {
            System.err.printf("sort :: Output merging failed: %s\n", e);
            return 5;
        }
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CmdLineParser {

}

class Path {

}

class Configuration {

}

class JobClient {

}

class JobConf {

}

class Job {

}

class Sort {

}

class Mapper {

}

class SortReducer {

}

class LongWritable {

}

class NullWritable {

}

class SAMRecordWritable {

}

class BAMInputFormat {

}

class SortOutputFormat {

}

class TotalOrderPartitioner {

}

class Timer {

public MyHelperClass fms(){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass stopS(){ return null; }}

class LocalFileSystem {

}

class ChecksumFileSystem {

}

class BAMFileWriter {

}

class FileStatus {

}
