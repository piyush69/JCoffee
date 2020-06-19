import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8364547 {
public MyHelperClass NULL;
public MyHelperClass Settings;
	public MyHelperClass encodeFileCard;
	public MyHelperClass actualFileLabel;
	public MyHelperClass LOG;
	public MyHelperClass encodingProcess;
	public MyHelperClass encodingTerminated;
	public MyHelperClass actualFileModel;
	public MyHelperClass Util;
	public MyHelperClass IOUtils;
	public MyHelperClass MainWindowInterface;
	public MyHelperClass bitratePattern;
	public MyHelperClass Messages;
	public MyHelperClass lastPosition;
	public MyHelperClass encoderFile;
	public MyHelperClass getNextFileElement(){ return null; }

//        @Override
        public void executeInterruptible()  throws Throwable {
            boolean encodingTerminated =(boolean)(Object) NULL; //new boolean();
            encodingTerminated = false;
            File destinationFile = null;
            try {
                Runtime runtime = Runtime.getRuntime();
                IconAndFileListElement element;
                while ((element =(IconAndFileListElement)(Object) getNextFileElement()) != null) {
                    File origFile =(File)(Object) element.getFile();
                    destinationFile = new File((String)(Object)encodeFileCard.getDestinationFolder().getValue(), origFile.getName());
                    if (!destinationFile.getParentFile().exists()) {
                        destinationFile.getParentFile().mkdirs();
                    }
                    actualFileLabel.setText(origFile.getName());
                    actualFileModel.setMaximum((int) origFile.length());
                    actualFileModel.setValue(0);
                    int bitrate;
                    synchronized (bitratePattern) {
                        Matcher bitrateMatcher =(Matcher)(Object) bitratePattern.matcher(encodeFileCard.getBitrate().getValue());
                        bitrateMatcher.find();
                        bitrate = Integer.parseInt((String)(Object)bitrateMatcher.group(1));
                    }
                    List<String> command = new LinkedList<String>();
                    command.add((String)(Object)encoderFile.getCanonicalPath());
                    command.add("--mp3input");
                    command.add("-m");
                    command.add("j");
                    String sampleFreq =(String)(Object) Settings.getSetting("encode.sample.freq");
                    if ((boolean)(Object)Util.isNotEmpty(sampleFreq)) {
                        command.add("--resample");
                        command.add(sampleFreq);
                    }
                    QualityElement quality = (QualityElement)(QualityElement)(Object) ((JComboBox)(JComboBox)(Object) encodeFileCard.getQuality().getValueComponent()).getSelectedItem();
                    command.add("-q");
                    command.add(Integer.toString((int)(Object)quality.getValue()));
                    command.add("-b");
                    command.add(Integer.toString(bitrate));
                    command.add("--cbr");
                    command.add("-");
                    command.add(destinationFile.getCanonicalPath());
                    if ((boolean)(Object)LOG.isDebugEnabled()) {
                        StringBuilder commandLine = new StringBuilder();
                        boolean first = true;
                        for (String part : command) {
                            if (!first) commandLine.append(" ");
                            commandLine.append(part);
                            first = false;
                        }
                        LOG.debug("Command line: " + commandLine.toString());
                    }
                    encodingProcess =(MyHelperClass)(Object) runtime.exec(command.toArray(new String[0]));
                    lastPosition =(MyHelperClass)(Object) 0l;
                    InputStream fileStream = null;
                    try {
                        fileStream =(InputStream)(Object) new PositionNotifierInputStream(new FileInputStream(origFile), origFile.length(), 2048, this);
                        IOUtils.copy(fileStream,(StringWriter)(Object) encodingProcess.getOutputStream());
                        encodingProcess.getOutputStream().close();
                    } finally {
                        IOUtils.closeQuietly(fileStream);
                        if ((boolean)(Object)LOG.isDebugEnabled()) {
                            InputStream processOut = null;
                            try {
                                processOut =(InputStream)(Object) encodingProcess.getInputStream();
                                StringWriter sw = new StringWriter();
                                IOUtils.copy(processOut, sw);
                                LOG.debug("Process output stream:\n" + sw);
                                IOUtils.closeQuietly(processOut);
                                processOut =(InputStream)(Object) encodingProcess.getErrorStream();
                                sw = new StringWriter();
                                IOUtils.copy(processOut, sw);
                                LOG.debug("Process error stream:\n" + sw);
                            } finally {
                                IOUtils.closeQuietly(processOut);
                            }
                        }
                    }
                    int result =(int)(Object) encodingProcess.waitFor();
                    encodingProcess = null;
                    if (result != 0) {
                        LOG.warn("Encoder process returned error code " + result);
                    }
                    if (Boolean.parseBoolean((String)(Object)encodeFileCard.getCopyTag().getValue())) {
                        MP3File mp3Input = new MP3File(origFile);
                        MP3File mp3Output = new MP3File(destinationFile);
                        boolean write = false;
                        if ((boolean)(Object)mp3Input.hasID3v2tag()) {
                            ID3v2Tag id3v2Tag = new ID3v2Tag();
                            for (ID3v2Frame frame :(ID3v2Frame[])(Object) (Object[])(Object)mp3Input.getID3v2tag().getAllframes()) {
                                id3v2Tag.addFrame(frame);
                            }
                            mp3Output.setID3v2tag(id3v2Tag);
                            write = true;
                        }
                        if ((boolean)(Object)mp3Input.hasID3v11tag()) {
                            mp3Output.setID3v11tag(mp3Input.getID3v11tag());
                            write = true;
                        }
                        if (write) mp3Output.write();
                    }
                }
                actualFileLabel.setText((String)(Object)Messages.getString("operations.file.encode.execute.actualfile.terminated"));
                actualFileModel.setValue((int)(Object)actualFileModel.getMaximum());
            } catch (Exception e) {
                LOG.error("Cannot encode files", e);
                if (!(e instanceof IOException && (boolean)(Object)encodingTerminated)) MainWindowInterface.showError(e);
                if (destinationFile != null) destinationFile.delete();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showError(Exception o0){ return null; }
	public MyHelperClass isNotEmpty(String o0){ return null; }
	public MyHelperClass getAllframes(){ return null; }
	public MyHelperClass getValueComponent(){ return null; }
	public MyHelperClass matcher(MyHelperClass o0){ return null; }
	public MyHelperClass getBitrate(){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getQuality(){ return null; }
	public MyHelperClass getDestinationFolder(){ return null; }
	public MyHelperClass getCopyTag(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setMaximum(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass waitFor(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getSetting(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getMaximum(){ return null; }}

class IconAndFileListElement {

public MyHelperClass getFile(){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class QualityElement {

public MyHelperClass getValue(){ return null; }}

class JComboBox {

public MyHelperClass getSelectedItem(){ return null; }}

class PositionNotifierInputStream {

PositionNotifierInputStream(FileInputStream o0, long o1, int o2, c8364547 o3){}
	PositionNotifierInputStream(){}}

class MP3File {

MP3File(){}
	MP3File(File o0){}
	public MyHelperClass setID3v2tag(ID3v2Tag o0){ return null; }
	public MyHelperClass getID3v11tag(){ return null; }
	public MyHelperClass getID3v2tag(){ return null; }
	public MyHelperClass hasID3v11tag(){ return null; }
	public MyHelperClass hasID3v2tag(){ return null; }
	public MyHelperClass setID3v11tag(MyHelperClass o0){ return null; }
	public MyHelperClass write(){ return null; }}

class ID3v2Tag {

public MyHelperClass addFrame(ID3v2Frame o0){ return null; }}

class ID3v2Frame {

}
