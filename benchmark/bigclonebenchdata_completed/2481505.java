import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2481505 {
public MyHelperClass exportedWavFile;
	public MyHelperClass randomFolder;
	public MyHelperClass exportedMP3File;
	public MyHelperClass LOGGER;
	public MyHelperClass inputFile;
	public MyHelperClass previousFiles;
	public MyHelperClass IOUtils;
	public MyHelperClass encodeMonitor;
	public MyHelperClass Level;

//    @Override
    public void run()  throws Throwable {
        try {
            File[] inputFiles = new File[this.previousFiles != null ? this.previousFiles.length + 1 : 1];
            File copiedInput = new File(this.randomFolder, this.inputFile.getName());
            IOUtils.copyFile(this.inputFile, copiedInput);
            inputFiles[inputFiles.length - 1] = copiedInput;
            if (previousFiles != null) {
                for (int i = 0; i < this.previousFiles.length; i++) {
                    File prev = this.previousFiles[i];
                    File copiedPrev = new File(this.randomFolder, prev.getName());
                    IOUtils.copyFile(prev, copiedPrev);
                    inputFiles[i] = copiedPrev;
                }
            }
            Activator activator = Activator.getDefault();
            if (this.exportedMP3File != null) {
                EncodingUtils.encodeToWavAndThenMP3(inputFiles, this.exportedWavFile, this.exportedMP3File, this.deleteOnExit, this.randomFolder, activator.getCommandsMap());
            } else {
                EncodingUtils.encodeToWav(inputFiles, this.exportedWavFile, randomFolder, activator.getCommandsMap());
            }
            if (encodeMonitor != null) {
                encodeMonitor.setEncodingFinished(true);
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
