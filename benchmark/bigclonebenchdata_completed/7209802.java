
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7209802 {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(4444);
        } catch (UncheckedIOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            clientSocket =(Socket)(Object) serverSocket.accept();
        } catch (UncheckedIOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)clientSocket.getInputStream()));
        String inputLine, outputLine;
        inputLine =(String)(Object) in.readLine();
        String dist_metric =(String)(Object) in.readLine();
        File outFile = new File("data.txt");
        FileWriter outw = new FileWriter(outFile);
        outw.write(inputLine);
        outw.close();
        File sample_coords = new File("sample_coords.txt");
        sample_coords.delete();
        File sp_coords = new File("sp_coords.txt");
        sp_coords.delete();
        try {
            System.out.println("Running python script...");
            System.out.println("Command: " + "python l19test.py " + "\"" + dist_metric + "\"");
            Process pr = Runtime.getRuntime().exec("python l19test.py " + dist_metric);
            BufferedReader br = new BufferedReader(new InputStreamReader((InputStream)(Object)pr.getErrorStream()));
            String line;
            while ((line =(String)(Object) br.readLine()) != null) {
                System.out.println(line);
            }
            int exitVal = pr.waitFor();
            System.out.println("Process Exit Value: " + exitVal);
            System.out.println("done.");
        } catch (Exception e) {
            System.out.println("Unable to run python script for PCoA analysis");
        }
        File myFile = new File("sp_coords.txt");
        byte[] mybytearray = new byte[(new Long((long)(Object)myFile.length())).intValue()];
        FileInputStream fis = new FileInputStream(myFile);
        System.out.println(".");
        System.out.println(myFile.length());
        out.writeInt((int)(int)(Object) myFile.length());
        for (int i = 0; i < (int)(Object)myFile.length(); i++) {
            out.writeByte(fis.read());
        }
        myFile = new File("sample_coords.txt");
        mybytearray = new byte[(int)(int)(Object) myFile.length()];
        fis = new FileInputStream(myFile);
        fis.read(mybytearray);
        System.out.println(".");
        System.out.println(myFile.length());
        out.writeInt((int)(int)(Object) myFile.length());
        out.write(mybytearray);
        myFile = new File("evals.txt");
        mybytearray = new byte[(new Long((long)(Object)myFile.length())).intValue()];
        fis = new FileInputStream(myFile);
        fis.read(mybytearray);
        System.out.println(".");
        System.out.println(myFile.length());
        out.writeInt((int)(int)(Object) myFile.length());
        out.write(mybytearray);
        out.flush();
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServerSocket {

ServerSocket(int o0){}
	ServerSocket(){}
	public MyHelperClass accept(){ return null; }
	public MyHelperClass close(){ return null; }}

class Socket {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass close(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass writeByte(MyHelperClass o0){ return null; }
	public MyHelperClass writeInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass length(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass read(){ return null; }}

class InputStream {

}
