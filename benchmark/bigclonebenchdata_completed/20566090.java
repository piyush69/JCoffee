import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20566090 {
public MyHelperClass setReply(MyHelperClass o0){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
public MyHelperClass ReplyWorker;
	public MyHelperClass buffer;
	public MyHelperClass Command;
	public MyHelperClass RetrieveCommand;
	public MyHelperClass log;
	public MyHelperClass outputPipe;
	public MyHelperClass getDownloadMethod(){ return null; }
	public MyHelperClass setCaughtException(IOException o0){ return null; }
	public MyHelperClass getSocketProvider(){ return null; }
	public MyHelperClass getCommand(){ return null; }
	public MyHelperClass setCaughtException(FileNotFoundException o0){ return null; }

    public void run() {
        if (getCommand() == null) throw new IllegalArgumentException("Given command is null!");
        if (getSocketProvider() == null) throw new IllegalArgumentException("Given connection is not open!");
        if ((ListCommand)(Object)getCommand() instanceof ListCommand) {
            try {
                setReply(ReplyWorker.readReply(getSocketProvider(), true));
                setStatus(ReplyWorker.FINISHED);
            } catch (UncheckedIOException ioe) {
                setCaughtException((IOException)(Object)ioe);
                setStatus(ReplyWorker.ERROR_IO_EXCEPTION);
            }
            return;
        } else if ((RetrieveCommand)(Object)getCommand() instanceof RetrieveCommand) {
            RetrieveCommand retrieveCommand = (RetrieveCommand)(RetrieveCommand)(Object) getCommand();
            if (retrieveCommand.getFromFile().getTransferType().intern() == Command.TYPE_I || retrieveCommand.getFromFile().getTransferType().intern() == Command.TYPE_A) {
                try {
                    log.debug("Download file: " + retrieveCommand.getFromFile().toString());
                    FileOutputStream out = null;
                    FileChannel channel = null;
                    if (getDownloadMethod() == RetrieveCommand.FILE_BASED) {
                        out = new FileOutputStream((String)(Object)retrieveCommand.getToFile().getFile());
                        channel =(FileChannel)(Object) out.getChannel();
                        if ((int)(Object)retrieveCommand.getResumePosition() != -1) {
                            try {
                                channel.position(retrieveCommand.getResumePosition());
                            } catch (UncheckedIOException ioe) {
                                setCaughtException((IOException)(Object)ioe);
                                setStatus(ReplyWorker.ERROR_IO_EXCEPTION);
                                try {
                                    channel.close();
                                } catch (UncheckedIOException ioe2) {
                                }
                                return;
                            }
                        }
                    } else if (getDownloadMethod() == RetrieveCommand.BYTEBUFFER_BASED) {
                    }
                    int amount;
                    try {
                        while ((amount =(int)(Object) getSocketProvider().read(buffer)) != -1) {
                            if (amount == 0) {
                                try {
                                    Thread.sleep(4);
                                } catch (InterruptedException e) {
                                }
                            }
                            buffer.flip();
                            while ((boolean)(Object)buffer.hasRemaining()) {
                                if (getDownloadMethod() == RetrieveCommand.STREAM_BASED) {
                                    int rem =(int)(Object) buffer.remaining();
                                    byte[] buf = new byte[rem];
                                    buffer.get(buf, 0, rem);
                                    this.outputPipe.write(buf, 0, rem);
                                } else if (getDownloadMethod() == RetrieveCommand.BYTEBUFFER_BASED) {
                                } else {
                                    channel.write(buffer);
                                }
                            }
                            buffer.clear();
                        }
                        buffer.flip();
                        while ((boolean)(Object)buffer.hasRemaining()) {
                            if (getDownloadMethod() == RetrieveCommand.STREAM_BASED) {
                                int rem =(int)(Object) buffer.remaining();
                                byte[] buf = new byte[rem];
                                buffer.get(buf, 0, rem);
                                this.outputPipe.write(buf, 0, rem);
                            } else if (getDownloadMethod() == RetrieveCommand.BYTEBUFFER_BASED) {
                            } else {
                                channel.write(buffer);
                            }
                        }
                        buffer.clear();
                        setStatus(ReplyWorker.FINISHED);
                        if (channel != null) channel.close();
                        if (this.outputPipe != null) this.outputPipe.close();
                        getSocketProvider().close();
                    } catch (UncheckedIOException ioe) {
                        setCaughtException((IOException)(Object)ioe);
                        setStatus(ReplyWorker.ERROR_IO_EXCEPTION);
                    } finally {
                        try {
                            channel.close();
                            getSocketProvider().close();
                        } catch (Exception e) {
                        }
                    }
                } catch (FileNotFoundException fnfe) {
                    setCaughtException(fnfe);
                    setStatus(ReplyWorker.ERROR_FILE_NOT_FOUND);
                }
            } else throw new IllegalArgumentException("Unknown file transfer type for download!");
            return;
        } else if ((StoreCommand)(Object)getCommand() instanceof StoreCommand) {
            StoreCommand storeCommand = (StoreCommand)(StoreCommand)(Object) getCommand();
            if (storeCommand.getToFile().getTransferType().intern() == Command.TYPE_I || storeCommand.getToFile().getTransferType().intern() == Command.TYPE_A) {
                try {
                    log.debug("Upload file: " + storeCommand.getFromFile());
                    InputStream in =(InputStream)(Object) storeCommand.getStream();
                    int amount;
                    int socketWrite;
                    int socketAmount = 0;
                    if (in instanceof FileInputStream) {
                        FileChannel channel =(FileChannel)(Object) ((FileInputStream) in).getChannel();
                        if ((int)(Object)storeCommand.getResumePosition() != -1) {
                            try {
                                channel.position(storeCommand.getResumePosition());
                            } catch (UncheckedIOException ioe) {
                                setCaughtException((IOException)(Object)ioe);
                                setStatus(ReplyWorker.ERROR_IO_EXCEPTION);
                                try {
                                    channel.close();
                                } catch (UncheckedIOException ioe2) {
                                }
                                return;
                            }
                        }
                        try {
                            while ((amount =(int)(Object) channel.read(buffer)) != -1) {
                                buffer.flip();
                                socketWrite = 0;
                                while ((socketWrite =(int)(Object) getSocketProvider().write(buffer)) != -1) {
                                    socketAmount += socketWrite;
                                    if (amount <= socketAmount) {
                                        break;
                                    }
                                    if (socketWrite == 0) {
                                        try {
                                            Thread.sleep(4);
                                        } catch (InterruptedException e) {
                                        }
                                    }
                                }
                                if (socketWrite == -1) {
                                    break;
                                }
                                socketAmount = 0;
                                buffer.clear();
                            }
                            setStatus(ReplyWorker.FINISHED);
                            channel.close();
                            getSocketProvider().close();
                        } catch (UncheckedIOException ioe) {
                            setCaughtException((IOException)(Object)ioe);
                            setStatus(ReplyWorker.ERROR_IO_EXCEPTION);
                        } finally {
                            try {
                                channel.close();
                                getSocketProvider().close();
                            } catch (Exception e) {
                            }
                        }
                    } else {
                        try {
                            while ((amount = in.read((byte[])(Object)buffer.array())) != -1) {
                                buffer.flip();
                                buffer.limit(amount);
                                socketWrite = 0;
                                while ((socketWrite =(int)(Object) getSocketProvider().write(buffer)) != -1) {
                                    socketAmount = socketWrite;
                                    if (amount <= socketAmount) {
                                        break;
                                    }
                                    if (socketWrite == 0) {
                                        try {
                                            Thread.sleep(4);
                                        } catch (InterruptedException e) {
                                        }
                                    }
                                }
                                if (socketWrite == -1) {
                                    break;
                                }
                                socketAmount = 0;
                                buffer.clear();
                            }
                            setStatus(ReplyWorker.FINISHED);
                            in.close();
                            getSocketProvider().close();
                        } catch (IOException ioe) {
                            setCaughtException(ioe);
                            setStatus(ReplyWorker.ERROR_IO_EXCEPTION);
                        } finally {
                            try {
                                in.close();
                                getSocketProvider().close();
                            } catch (Exception e) {
                            }
                        }
                    }
                } catch (UncheckedIOException fnfe) {
                    setCaughtException((IOException)(Object)fnfe);
                    setStatus(ReplyWorker.ERROR_FILE_NOT_FOUND);
                }
            } else throw new IllegalArgumentException("Unknown file transfer type for upload!");
        } else throw new IllegalArgumentException("Given command is not supported!");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_I;
	public MyHelperClass TYPE_A;
	public MyHelperClass FILE_BASED;
	public MyHelperClass ERROR_FILE_NOT_FOUND;
	public MyHelperClass ERROR_IO_EXCEPTION;
	public MyHelperClass STREAM_BASED;
	public MyHelperClass FINISHED;
	public MyHelperClass BYTEBUFFER_BASED;
public MyHelperClass flip(){ return null; }
	public MyHelperClass getTransferType(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass readReply(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass remaining(){ return null; }
	public MyHelperClass array(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass intern(){ return null; }
	public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass limit(int o0){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass get(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class ListCommand {

}

class RetrieveCommand {

public MyHelperClass getResumePosition(){ return null; }
	public MyHelperClass getToFile(){ return null; }
	public MyHelperClass getFromFile(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass position(MyHelperClass o0){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass read(MyHelperClass o0){ return null; }}

class StoreCommand {

public MyHelperClass getResumePosition(){ return null; }
	public MyHelperClass getStream(){ return null; }
	public MyHelperClass getToFile(){ return null; }
	public MyHelperClass getFromFile(){ return null; }}
