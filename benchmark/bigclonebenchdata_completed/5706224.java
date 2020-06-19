import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5706224 {
public MyHelperClass SwingUtilities;
	public MyHelperClass setEnabled(boolean o0){ return null; }

        public void run()  throws Throwable {
            try {
                MyHelperClass outDirTextField = new MyHelperClass();
                File outDir = new File((String)(Object)outDirTextField.getText());
                if (!outDir.exists()) {
                    MyHelperClass SwingUtilities = new MyHelperClass();
                    SwingUtilities.invokeLater(new Runnable() {

                        public void run() {
                            MyHelperClass JOptionPane = new MyHelperClass();
                            JOptionPane.showMessageDialog(UnpackWizard.this, "The chosen directory does not exist!", "Directory Not Found Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });
                    return;
                }
                if (!outDir.isDirectory()) {
                    MyHelperClass SwingUtilities = new MyHelperClass();
                    SwingUtilities.invokeLater(new Runnable() {

                        public void run() {
                            MyHelperClass JOptionPane = new MyHelperClass();
                            JOptionPane.showMessageDialog(UnpackWizard.this, "The chosen file is not a directory!", "Not a Directory Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });
                    return;
                }
                if (!outDir.canWrite()) {
                    MyHelperClass SwingUtilities = new MyHelperClass();
                    SwingUtilities.invokeLater(new Runnable() {

                        public void run() {
                            MyHelperClass JOptionPane = new MyHelperClass();
                            JOptionPane.showMessageDialog(UnpackWizard.this, "Cannot write to the chosen directory!", "Directory Not Writeable Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });
                    return;
                }
                File archiveDir = new File("foo.bar").getAbsoluteFile().getParentFile();
                URL baseUrl = UnpackWizard.class.getClassLoader().getResource(UnpackWizard.class.getName().replaceAll("\\.", "/") + ".class");
                if (baseUrl.getProtocol().equals("jar")) {
                    String jarPath = baseUrl.getPath();
                    jarPath = jarPath.substring(0, jarPath.indexOf('!'));
                    if (jarPath.startsWith("file:")) {
                        try {
                            archiveDir = new File(new URI(jarPath)).getAbsoluteFile().getParentFile();
                        } catch (URISyntaxException e1) {
                            e1.printStackTrace(System.err);
                        }
                    }
                }
                SortedMap<Integer, String> inputFileNames = new TreeMap<Integer, String>();
                MyHelperClass indexProperties = new MyHelperClass();
                for (Entry anEntry : indexProperties.entrySet()) {
                    String key = anEntry.getKey().toString();
                    if (key.startsWith("archive file ")) {
                        inputFileNames.put(Integer.parseInt(key.substring("archive file ".length())), anEntry.getValue().toString());
                    }
                }
                byte[] buff = new byte[64 * 1024];
                try {
                    long bytesToWrite = 0;
                    long bytesReported = 0;
                    long bytesWritten = 0;
                    for (String aFileName : inputFileNames.values()) {
                        File aFile = new File(archiveDir, aFileName);
                        if (aFile.exists()) {
                            if (aFile.isFile()) {
                                bytesToWrite += aFile.length();
                            } else {
                                final File wrongFile = aFile;
                                MyHelperClass SwingUtilities = new MyHelperClass();
                                SwingUtilities.invokeLater(new Runnable() {

                                    public void run() {
                                        MyHelperClass JOptionPane = new MyHelperClass();
                                        JOptionPane.showMessageDialog(UnpackWizard.this, "File \"" + wrongFile.getAbsolutePath() + "\" is not a standard file!", "Non Standard File Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                });
                                return;
                            }
                        } else {
                            final File wrongFile = aFile;
                            MyHelperClass SwingUtilities = new MyHelperClass();
                            SwingUtilities.invokeLater(new Runnable() {

                                public void run() {
                                    MyHelperClass JOptionPane = new MyHelperClass();
                                    JOptionPane.showMessageDialog(UnpackWizard.this, "File \"" + wrongFile.getAbsolutePath() + "\" does not exist!", "File Not Found Error", JOptionPane.ERROR_MESSAGE);
                                }
                            });
                            return;
                        }
                    }
                    MultiFileInputStream mfis = new MultiFileInputStream(archiveDir, inputFileNames.values().toArray(new String[inputFileNames.size()]));
                    TarArchiveInputStream tis = new TarArchiveInputStream(new BufferedInputStream((InputStream)(Object)mfis));
                    TarArchiveEntry tarEntry =(TarArchiveEntry)(Object) tis.getNextTarEntry();
                    while (tarEntry != null) {
                        File outFile = new File(outDir.getAbsolutePath() + "/" + tarEntry.getName());
                        if (outFile.exists()) {
                            final File wrongFile = outFile;
                            MyHelperClass SwingUtilities = new MyHelperClass();
                            SwingUtilities.invokeLater(new Runnable() {

                                public void run() {
                                    MyHelperClass JOptionPane = new MyHelperClass();
                                    JOptionPane.showMessageDialog(UnpackWizard.this, "Was about to write out file \"" + wrongFile.getAbsolutePath() + "\" but it already " + "exists.\nPlease [re]move existing files out of the way " + "and try again.", "File Not Found Error", JOptionPane.ERROR_MESSAGE);
                                }
                            });
                            return;
                        }
                        if ((boolean)(Object)tarEntry.isDirectory()) {
                            outFile.getAbsoluteFile().mkdirs();
                        } else {
                            outFile.getAbsoluteFile().getParentFile().mkdirs();
                            OutputStream os = new BufferedOutputStream(new FileOutputStream(outFile));
                            int len =(int)(Object) tis.read(buff, 0, buff.length);
                            while (len != -1) {
                                os.write(buff, 0, len);
                                bytesWritten += len;
                                if (bytesWritten - bytesReported > (10 * 1024 * 1024)) {
                                    bytesReported = bytesWritten;
                                    final int progress = (int) (bytesReported * 100 / bytesToWrite);
                                    MyHelperClass SwingUtilities = new MyHelperClass();
                                    SwingUtilities.invokeLater(new Runnable() {

//                                        @Override
                                        public void run() {
                                            MyHelperClass progressBar = new MyHelperClass();
                                            progressBar.setValue(progress);
                                        }
                                    });
                                }
                                len =(int)(Object) tis.read(buff, 0, buff.length);
                            }
                            os.close();
                        }
                        tarEntry =(TarArchiveEntry)(Object) tis.getNextTarEntry();
                    }
                    long expectedCrc = 0;
                    try {
//                        MyHelperClass indexProperties = new MyHelperClass();
                        expectedCrc = Long.parseLong((String)(Object)indexProperties.getProperty("CRC32", "0"));
                    } catch (NumberFormatException e) {
                        System.err.println("Error while obtaining the expected CRC");
                        e.printStackTrace(System.err);
                    }
                    if ((long)(Object)mfis.getCRC() == expectedCrc) {
                        MyHelperClass SwingUtilities = new MyHelperClass();
                        SwingUtilities.invokeLater(new Runnable() {

//                            @Override
                            public void run() {
                                MyHelperClass progressBar = new MyHelperClass();
                                progressBar.setValue(0);
                                MyHelperClass JOptionPane = new MyHelperClass();
                                JOptionPane.showMessageDialog(UnpackWizard.this, "Extraction completed successfully!", "Done!", JOptionPane.INFORMATION_MESSAGE);
                            }
                        });
                        return;
                    } else {
                        System.err.println("CRC Error: was expecting " + expectedCrc + " but got " + mfis.getCRC());
                        MyHelperClass SwingUtilities = new MyHelperClass();
                        SwingUtilities.invokeLater(new Runnable() {

                            public void run() {
                                MyHelperClass progressBar = new MyHelperClass();
                                progressBar.setValue(0);
                                MyHelperClass JOptionPane = new MyHelperClass();
                                JOptionPane.showMessageDialog(UnpackWizard.this, "CRC Error: the data extracted does not have the expected CRC!\n" + "You should probably delete the extracted files, as they are " + "likely to be invalid.", "CRC Error", JOptionPane.ERROR_MESSAGE);
                            }
                        });
                        return;
                    }
                } catch (final IOException e) {
                    e.printStackTrace(System.err);
                    MyHelperClass SwingUtilities = new MyHelperClass();
                    SwingUtilities.invokeLater(new Runnable() {

                        public void run() {
                            MyHelperClass progressBar = new MyHelperClass();
                            progressBar.setValue(0);
                            MyHelperClass JOptionPane = new MyHelperClass();
                            JOptionPane.showMessageDialog(UnpackWizard.this, "Input/Output Error: " + e.getLocalizedMessage(), "Input/Output Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });
                    return;
                }
            } finally {
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        MyHelperClass progressBar = new MyHelperClass();
                        progressBar.setValue(0);
                        setEnabled(true);
                    }
                });
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFORMATION_MESSAGE;
	public MyHelperClass ERROR_MESSAGE;
public MyHelperClass getProperty(String o0, String o1){ return null; }
	public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass invokeLater(){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass invokeLater(<anonymous Runnable> o0){ return null; }}

class UnpackWizard {

}

class MultiFileInputStream {

MultiFileInputStream(){}
	MultiFileInputStream(File o0, String[] o1){}
	public MyHelperClass getCRC(){ return null; }}

class TarArchiveInputStream {

TarArchiveInputStream(){}
	TarArchiveInputStream(BufferedInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getNextTarEntry(){ return null; }}

class TarArchiveEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class Entry {

}
