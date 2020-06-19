import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18574455 {
public MyHelperClass NULL;
public MyHelperClass removeListener(TranscodeQueueListener o0){ return null; }
	public MyHelperClass addListener(TranscodeQueueListener o0){ return null; }
	public MyHelperClass analyse(TranscodeJobImpl o0){ return null; }
public MyHelperClass current_job;
	public MyHelperClass queue_sem;
	public MyHelperClass log(String o0){ return null; }

    protected boolean process(final TranscodeJobImpl job)  throws Throwable {
        TranscodePipe pipe = null;
        TranscodeJobImpl current_job = NULL; //new TranscodeJobImpl();
        current_job = job;
        DeviceImpl device =(DeviceImpl)(Object) job.getDevice();
        device.setTranscoding(true);
        try {
            job.starts();
            TranscodeProvider provider = job.getProfile().getProvider();
            final TranscodeException[] error = { null };
            TranscodeProfile profile =(TranscodeProfile)(Object) job.getProfile();
            final TranscodeFileImpl transcode_file =(TranscodeFileImpl)(Object) job.getTranscodeFile();
            TranscodeProviderAnalysis provider_analysis;
            boolean xcode_required;
            if (provider == null) {
                xcode_required = false;
                provider_analysis = null;
            } else {
                provider_analysis =(TranscodeProviderAnalysis)(Object) analyse(job);
                MyHelperClass TranscodeProviderAnalysis = new MyHelperClass();
                xcode_required = provider_analysis.getBooleanProperty(TranscodeProviderAnalysis.PT_TRANSCODE_REQUIRED);
                int tt_req;
                if ((boolean)(Object)job.isStream()) {
                    MyHelperClass TranscodeTarget = new MyHelperClass();
                    tt_req =(int)(Object) TranscodeTarget.TRANSCODE_ALWAYS;
                } else {
                    tt_req =(int)(Object) job.getTranscodeRequirement();
                    if ((TranscodeTarget)(Object)device instanceof TranscodeTarget) {
//                        MyHelperClass TranscodeProviderAnalysis = new MyHelperClass();
                        if (provider_analysis.getLongProperty(TranscodeProviderAnalysis.PT_VIDEO_HEIGHT) == 0) {
                            if (((TranscodeTarget)(TranscodeTarget)(Object) device).isAudioCompatible(transcode_file)) {
                                MyHelperClass TranscodeTarget = new MyHelperClass();
                                tt_req =(int)(Object) TranscodeTarget.TRANSCODE_NEVER;
                            }
                        }
                    }
                }
                MyHelperClass TranscodeTarget = new MyHelperClass();
                if (tt_req == (int)(Object)TranscodeTarget.TRANSCODE_NEVER) {
                    xcode_required = false;
//                MyHelperClass TranscodeTarget = new MyHelperClass();
                } else if (tt_req == (int)(Object)TranscodeTarget.TRANSCODE_ALWAYS) {
                    xcode_required = true;
//                    MyHelperClass TranscodeProviderAnalysis = new MyHelperClass();
                    provider_analysis.setBooleanProperty(TranscodeProviderAnalysis.PT_FORCE_TRANSCODE, true);
                }
            }
            if (xcode_required) {
                final AESemaphore xcode_sem = new AESemaphore("xcode:proc");
                final TranscodeProviderJob[] provider_job = { null };
                TranscodeProviderAdapter xcode_adapter = new TranscodeProviderAdapter() {

                    private boolean resolution_updated;

                    private final int ETA_AVERAGE_SIZE = 10;

                    private int last_eta;

                    private int eta_samples;

                    MyHelperClass AverageFactory = new MyHelperClass();
                    private Average eta_average = AverageFactory.MovingAverage(ETA_AVERAGE_SIZE);

                    private int last_percent;

                    public void updateProgress(int percent, int eta_secs, int new_width, int new_height) {
                        last_eta = eta_secs;
                        last_percent = percent;
                        TranscodeProviderJob prov_job = provider_job[0];
                        if (prov_job == null) {
                            return;
                        }
                        int job_state =(int)(Object) job.getState();
                        MyHelperClass TranscodeJob = new MyHelperClass();
                        if (job_state == TranscodeJob.ST_CANCELLED || job_state == TranscodeJob.ST_REMOVED) {
                            prov_job.cancel();
                        MyHelperClass paused = new MyHelperClass();
                        MyHelperClass paused = new MyHelperClass();
                        } else if (paused || job_state == TranscodeJob.ST_PAUSED) {
                            prov_job.pause();
                        } else {
//                            MyHelperClass TranscodeJob = new MyHelperClass();
                            if (job_state == TranscodeJob.ST_RUNNING) {
                                prov_job.resume();
                            }
                            job.updateProgress(percent, eta_secs);
                            MyHelperClass max_bytes_per_sec = new MyHelperClass();
                            prov_job.setMaxBytesPerSecond(max_bytes_per_sec);
                            if (!resolution_updated) {
                                if (new_width > 0 && new_height > 0) {
                                    transcode_file.setResolution(new_width, new_height);
                                    resolution_updated = true;
                                }
                            }
                        }
                    }

                    public void streamStats(long connect_rate, long write_speed) {
                        MyHelperClass Constants = new MyHelperClass();
                        if (Constants.isOSX && job.getEnableAutoRetry() && job.canUseDirectInput() && job.getAutoRetryCount() == 0) {
                            if (connect_rate > 5 && last_percent < 100) {
                                long eta = (long) eta_average.update(last_eta);
                                eta_samples++;
                                if (eta_samples >= ETA_AVERAGE_SIZE) {
                                    long total_time = (eta * 100) / (100 - last_percent);
                                    long total_write = total_time * write_speed;
                                    DiskManagerFileInfo file =(DiskManagerFileInfo)(Object) job.getFile();
                                    long length =(long)(Object) file.getLength();
                                    if (length > 0) {
                                        double over_write = ((double) total_write) / length;
                                        if (over_write > 5.0) {
                                            failed(new TranscodeException("Overwrite limit exceeded, abandoning transcode"));
                                            provider_job[0].cancel();
                                        }
                                    }
                                }
                            } else {
                                eta_samples = 0;
                            }
                        }
                    }

                    public void failed(TranscodeException e) {
                        if (error[0] == null) {
                            error[0] = e;
                        }
                        xcode_sem.release();
                    }

                    public void complete() {
                        xcode_sem.release();
                    }
                };
                boolean direct_input =(boolean)(Object) job.useDirectInput();
                if ((boolean)(Object)job.isStream()) {
                    pipe = new TranscodePipeStreamSource2(new streamListener() {

                        public void gotStream(InputStream is) {
                            job.setStream(is);
                        }
                    });
                    provider_job[0] = provider.transcode(xcode_adapter, provider_analysis, direct_input, job.getFile(), profile, new URL("tcp://127.0.0.1:" + pipe.getPort()));
                } else {
                    File output_file =(File)(Object) transcode_file.getCacheFile();
                    provider_job[0] = provider.transcode(xcode_adapter, provider_analysis, direct_input, job.getFile(), profile, output_file.toURI().toURL());
                }
                MyHelperClass max_bytes_per_sec = new MyHelperClass();
                provider_job[0].setMaxBytesPerSecond(max_bytes_per_sec);
                TranscodeQueueListener listener = new TranscodeQueueListener() {

                    public void jobAdded(TranscodeJob job) {
                    }

                    public void jobChanged(TranscodeJob changed_job) {
                        if (changed_job == (TranscodeJob)(Object)job) {
                            int state =(int)(Object) job.getState();
                            MyHelperClass TranscodeJob = new MyHelperClass();
                            if (state == TranscodeJob.ST_PAUSED) {
                                provider_job[0].pause();
//                            MyHelperClass TranscodeJob = new MyHelperClass();
                            } else if (state == TranscodeJob.ST_RUNNING) {
                                provider_job[0].resume();
//                            MyHelperClass TranscodeJob = new MyHelperClass();
                            } else if (state == TranscodeJob.ST_CANCELLED || state == TranscodeJob.ST_STOPPED) {
                                provider_job[0].cancel();
                            }
                        }
                    }

                    public void jobRemoved(TranscodeJob removed_job) {
                        if (removed_job == (TranscodeJob)(Object)job) {
                            provider_job[0].cancel();
                        }
                    }
                };
                try {
                    addListener(listener);
                    xcode_sem.reserve();
                } finally {
                    removeListener(listener);
                }
                if (error[0] != null) {
                    throw (error[0]);
                }
            } else {
                DiskManagerFileInfo source =(DiskManagerFileInfo)(Object) job.getFile();
                transcode_file.setTranscodeRequired(false);
                if ((boolean)(Object)job.isStream()) {
                    MyHelperClass PluginInitializer = new MyHelperClass();
                    PluginInterface av_pi = PluginInitializer.getDefaultInterface().getPluginManager().getPluginInterfaceByID("azupnpav");
                    if (av_pi == null) {
                        throw (new TranscodeException("Media Server plugin not found"));
                    }
                    IPCInterface av_ipc =(IPCInterface)(Object) av_pi.getIPC();
                    String url_str = (String)(String)(Object) av_ipc.invoke("getContentURL", new Object[] { source });
                    if (url_str == null || url_str.length() == 0) {
                        File source_file =(File)(Object) source.getFile();
                        if (source_file.exists()) {
                            job.setStream(new BufferedInputStream(new FileInputStream(source_file)));
                        } else {
                            throw (new TranscodeException("No UPnPAV URL and file doesn't exist"));
                        }
                    } else {
                        URL source_url = new URL(url_str);
                        job.setStream(source_url.openConnection().getInputStream());
                    }
                } else {
                    if ((boolean)(Object)device.getAlwaysCacheFiles()) {
                        MyHelperClass PluginInitializer = new MyHelperClass();
                        PluginInterface av_pi = PluginInitializer.getDefaultInterface().getPluginManager().getPluginInterfaceByID("azupnpav");
                        if (av_pi == null) {
                            throw (new TranscodeException("Media Server plugin not found"));
                        }
                        IPCInterface av_ipc =(IPCInterface)(Object) av_pi.getIPC();
                        String url_str = (String)(String)(Object) av_ipc.invoke("getContentURL", new Object[] { source });
                        InputStream is;
                        long length;
                        if (url_str == null || url_str.length() == 0) {
                            File source_file =(File)(Object) source.getFile();
                            if (source_file.exists()) {
                                is = new BufferedInputStream(new FileInputStream(source_file));
                                length = source_file.length();
                            } else {
                                throw (new TranscodeException("No UPnPAV URL and file doesn't exist"));
                            }
                        } else {
                            URL source_url = new URL(url_str);
                            URLConnection connection = source_url.openConnection();
                            is = source_url.openConnection().getInputStream();
                            String s = connection.getHeaderField("content-length");
                            if (s != null) {
                                length = Long.parseLong(s);
                            } else {
                                length = -1;
                            }
                        }
                        OutputStream os = null;
                        final boolean[] cancel_copy = { false };
                        TranscodeQueueListener copy_listener = new TranscodeQueueListener() {

                            public void jobAdded(TranscodeJob job) {
                            }

                            public void jobChanged(TranscodeJob changed_job) {
                                if (changed_job == (TranscodeJob)(Object)job) {
                                    int state =(int)(Object) job.getState();
                                    MyHelperClass TranscodeJob = new MyHelperClass();
                                    if (state == TranscodeJob.ST_PAUSED) {
//                                    MyHelperClass TranscodeJob = new MyHelperClass();
                                    } else if (state == TranscodeJob.ST_RUNNING) {
//                                    MyHelperClass TranscodeJob = new MyHelperClass();
                                    } else if (state == TranscodeJob.ST_CANCELLED || state == TranscodeJob.ST_STOPPED) {
                                        cancel_copy[0] = true;
                                    }
                                }
                            }

                            public void jobRemoved(TranscodeJob removed_job) {
                                if (removed_job == (TranscodeJob)(Object)job) {
                                    cancel_copy[0] = true;
                                }
                            }
                        };
                        try {
                            addListener(copy_listener);
                            os = new FileOutputStream((String)(Object)transcode_file.getCacheFile());
                            long total_copied = 0;
                            byte[] buffer = new byte[128 * 1024];
                            while (true) {
                                if (cancel_copy[0]) {
                                    throw (new TranscodeException("Copy cancelled"));
                                }
                                int len = is.read(buffer);
                                if (len <= 0) {
                                    break;
                                }
                                os.write(buffer, 0, len);
                                total_copied += len;
                                if (length > 0) {
                                    job.updateProgress((int) (total_copied * 100 / length), -1);
                                }
                                total_copied += len;
                            }
                        } finally {
                            try {
                                is.close();
                            } catch (Throwable e) {
                                MyHelperClass Debug = new MyHelperClass();
                                Debug.out(e);
                            }
                            try {
                                if (os != null) {
                                    os.close();
                                }
                            } catch (Throwable e) {
                                MyHelperClass Debug = new MyHelperClass();
                                Debug.out(e);
                            }
                            removeListener(copy_listener);
                        }
                    }
                }
            }
            job.complete();
            return (true);
        } catch (Throwable e) {
            job.failed(e);
            e.printStackTrace();
            if (!(Boolean)(Object)job.isStream() && job.getEnableAutoRetry() && job.getAutoRetryCount() == 0 && job.canUseDirectInput() && !job.useDirectInput()) {
                log("Auto-retrying transcode with direct input");
                job.setUseDirectInput();
                job.setAutoRetry(true);
                queue_sem.release();
            }
            return (false);
        } finally {
            if (pipe != null) {
                pipe.destroy();
            }
            device.setTranscoding(false);
            current_job = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ST_STOPPED;
	public MyHelperClass PT_VIDEO_HEIGHT;
	public MyHelperClass PT_FORCE_TRANSCODE;
	public MyHelperClass TRANSCODE_NEVER;
	public MyHelperClass isOSX;
	public MyHelperClass ST_RUNNING;
	public MyHelperClass PT_TRANSCODE_REQUIRED;
	public MyHelperClass TRANSCODE_ALWAYS;
	public MyHelperClass ST_CANCELLED;
	public MyHelperClass ST_PAUSED;
	public MyHelperClass ST_REMOVED;
public MyHelperClass getProvider(){ return null; }
	public MyHelperClass MovingAverage(int o0){ return null; }
	public MyHelperClass getDefaultInterface(){ return null; }
	public MyHelperClass out(Throwable o0){ return null; }
	public MyHelperClass getPluginManager(){ return null; }
	public MyHelperClass release(){ return null; }}

class TranscodeJobImpl {

public MyHelperClass setStream(InputStream o0){ return null; }
	public MyHelperClass getTranscodeRequirement(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass useDirectInput(){ return null; }
	public MyHelperClass getProfile(){ return null; }
	public MyHelperClass isStream(){ return null; }
	public MyHelperClass setUseDirectInput(){ return null; }
	public MyHelperClass getDevice(){ return null; }
	public MyHelperClass getEnableAutoRetry(){ return null; }
	public MyHelperClass getTranscodeFile(){ return null; }
	public MyHelperClass getState(){ return null; }
	public MyHelperClass setStream(BufferedInputStream o0){ return null; }
	public MyHelperClass failed(Throwable o0){ return null; }
	public MyHelperClass starts(){ return null; }
	public MyHelperClass complete(){ return null; }
	public MyHelperClass getAutoRetryCount(){ return null; }
	public MyHelperClass canUseDirectInput(){ return null; }
	public MyHelperClass setAutoRetry(boolean o0){ return null; }
	public MyHelperClass updateProgress(int o0, int o1){ return null; }}

class TranscodePipe {

public MyHelperClass destroy(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class DeviceImpl {

public MyHelperClass setTranscoding(boolean o0){ return null; }
	public MyHelperClass getAlwaysCacheFiles(){ return null; }}

class TranscodeProvider {

public MyHelperClass transcode(TranscodeProviderAdapter o0, TranscodeProviderAnalysis o1, boolean o2, MyHelperClass o3, TranscodeProfile o4, URL o5){ return null; }}

class TranscodeException extends Exception{
	public TranscodeException(String errorMessage) { super(errorMessage); }
}

class TranscodeProfile {

}

class TranscodeFileImpl {

public MyHelperClass getCacheFile(){ return null; }
	public MyHelperClass setResolution(int o0, int o1){ return null; }
	public MyHelperClass setTranscodeRequired(boolean o0){ return null; }}

class TranscodeProviderAnalysis {

public MyHelperClass getLongProperty(MyHelperClass o0){ return null; }
	public MyHelperClass getBooleanProperty(MyHelperClass o0){ return null; }
	public MyHelperClass setBooleanProperty(MyHelperClass o0, boolean o1){ return null; }}

class TranscodeTarget {

public MyHelperClass isAudioCompatible(TranscodeFileImpl o0){ return null; }}

class AESemaphore {

AESemaphore(String o0){}
	AESemaphore(){}
	public MyHelperClass reserve(){ return null; }
	public MyHelperClass release(){ return null; }}

class TranscodeProviderJob {

public MyHelperClass pause(){ return null; }
	public MyHelperClass setMaxBytesPerSecond(MyHelperClass o0){ return null; }
	public MyHelperClass resume(){ return null; }
	public MyHelperClass cancel(){ return null; }}

class TranscodeProviderAdapter {

}

class TranscodePipeStreamSource2 {

TranscodePipeStreamSource2(<anonymous streamListener> o0){}
	TranscodePipeStreamSource2(){}}

class TranscodeQueueListener {

}

class DiskManagerFileInfo {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass getLength(){ return null; }}

class PluginInterface {

public MyHelperClass getIPC(){ return null; }}

class IPCInterface {

public MyHelperClass invoke(String o0, Object[] o1){ return null; }}

class Average {

public MyHelperClass update(int o0){ return null; }}

class streamListener {

}

class TranscodeJob {

}
