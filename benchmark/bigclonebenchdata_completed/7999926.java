import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7999926 {
public MyHelperClass IOUtils;
	public MyHelperClass Names;
	public MyHelperClass Values;
	public MyHelperClass Play;
public MyHelperClass Channels;
	public MyHelperClass maxContentLength;
	public MyHelperClass currentMessage;
	public MyHelperClass file;
	public MyHelperClass out;

//    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Throwable, Exception {
        Object msg = e.getMessage();
        if (!(msg instanceof HttpMessage) && !(msg instanceof HttpChunk)) {
            ctx.sendUpstream(e);
            return;
        }
        HttpMessage currentMessage =(HttpMessage)(Object) this.currentMessage;
        File localFile =(File)(Object) this.file;
        if (currentMessage == null) {
            HttpMessage m = (HttpMessage) msg;
            if ((boolean)(Object)m.isChunked()) {
                final String localName = UUID.randomUUID().toString();
                List<String> encodings =(List<String>)(Object) m.getHeaders(Names.TRANSFER_ENCODING);
                encodings.remove(Values.CHUNKED);
                if (encodings.isEmpty()) {
                    m.removeHeader(Names.TRANSFER_ENCODING);
                }
                this.currentMessage =(MyHelperClass)(Object) m;
                this.file =(MyHelperClass)(Object) new File((String)(Object)Play.tmpDir, localName);
                this.out =(MyHelperClass)(Object) new FileOutputStream((String)(Object)file, true);
            } else {
                ctx.sendUpstream(e);
            }
        } else {
            final HttpChunk chunk = (HttpChunk) msg;
            if ((int)(Object)maxContentLength != -1 && (localFile.length() > ((int)(Object)maxContentLength - (int)(Object)chunk.getContent().readableBytes()))) {
                currentMessage.setHeader(Names.WARNING, "play.netty.content.length.exceeded");
            } else {
                IOUtils.copyLarge(new ChannelBufferInputStream(chunk.getContent()), this.out);
                if ((boolean)(Object)chunk.isLast()) {
                    this.out.flush();
                    this.out.close();
                    currentMessage.setHeader(Names.CONTENT_LENGTH, String.valueOf(localFile.length()));
                    currentMessage.setContent(new FileChannelBuffer(localFile));
                    this.out = null;
                    this.currentMessage = null;
                    this.file = null;
                    Channels.fireMessageReceived(ctx, currentMessage, e.getRemoteAddress());
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CHUNKED;
	public MyHelperClass WARNING;
	public MyHelperClass tmpDir;
	public MyHelperClass TRANSFER_ENCODING;
	public MyHelperClass CONTENT_LENGTH;
public MyHelperClass fireMessageReceived(ChannelHandlerContext o0, HttpMessage o1, MyHelperClass o2){ return null; }
	public MyHelperClass copyLarge(ChannelBufferInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass readableBytes(){ return null; }}

class ChannelHandlerContext {

public MyHelperClass sendUpstream(MessageEvent o0){ return null; }}

class MessageEvent {

public MyHelperClass getMessage(){ return null; }
	public MyHelperClass getRemoteAddress(){ return null; }}

class HttpMessage {

public MyHelperClass removeHeader(MyHelperClass o0){ return null; }
	public MyHelperClass isChunked(){ return null; }
	public MyHelperClass getHeaders(MyHelperClass o0){ return null; }
	public MyHelperClass setContent(FileChannelBuffer o0){ return null; }
	public MyHelperClass setHeader(MyHelperClass o0, String o1){ return null; }}

class HttpChunk {

public MyHelperClass isLast(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class ChannelBufferInputStream {

ChannelBufferInputStream(MyHelperClass o0){}
	ChannelBufferInputStream(){}}

class FileChannelBuffer {

FileChannelBuffer(){}
	FileChannelBuffer(File o0){}}
