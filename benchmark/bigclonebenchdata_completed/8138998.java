import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8138998 {

    private void handleSSI(HttpData data) throws Throwable, HttpError, IOException {
        MyHelperClass TempFileHandler = new MyHelperClass();
        File tempFile = TempFileHandler.getTempFile();
        FileOutputStream out = new FileOutputStream(tempFile);
        BufferedReader in = new BufferedReader(new FileReader(data.realPath));
        String[] env = getEnvironmentVariables(data);
        MyHelperClass ssi = new MyHelperClass();
        if (ssi == null) {
            MyHelperClass ssi = new MyHelperClass();
            ssi = new BSssi();
        }
        MyHelperClass ssi = new MyHelperClass();
        ssi.addEnvironment(env);
        if (data.resp == null) {
            SimpleResponse resp = new SimpleResponse();
            resp.setHeader("Content-Type", "text/html");
            moreHeaders(resp);
            resp.setHeader("Connection", "close");
            data.resp = resp;
            resp.write(data.out);
        }
        String t;
        int start;
        Enumeration en;
        boolean anIfCondition = true;
        while ((t = in.readLine()) != null) {
            if ((start = t.indexOf("<!--#")) > -1) {
                if (anIfCondition) out.write(t.substring(0, start).getBytes());
                try {
                    MyHelperClass ssi = new MyHelperClass();
                    en = ssi.parse(t.substring(start)).elements();
                    SSICommand command;
                    while (en.hasMoreElements()) {
                        command = (SSICommand) en.nextElement();
                        MyHelperClass logger = new MyHelperClass();
                        logger.fine("Command=" + command);
                        switch(command.getCommand()) {
                            MyHelperClass BSssi = new MyHelperClass();
                            case BSssi.CMD_IF_TRUE:
                                anIfCondition = true;
                                break;
                            MyHelperClass BSssi = new MyHelperClass();
                            case BSssi.CMD_IF_FALSE:
                                anIfCondition = false;
                                break;
                            MyHelperClass BSssi = new MyHelperClass();
                            case BSssi.CMD_CGI:
                                out.flush();
                                if (command.getFileType() != null && command.getFileType().startsWith("shtm")) {
                                    HttpData d = newHttpData(data);
                                    d.out = out;
                                    MyHelperClass HttpThread = new MyHelperClass();
                                    d.realPath = HttpThread.getMappedFilename(command.getMessage(), data.req.getUrl());
                                    MyHelperClass ssi = new MyHelperClass();
                                    new SsiHandler(d, ssi).perform();
                                } else {
                                    String application = getExtension(command.getFileType());
                                    if (application == null) {
                                        MyHelperClass HttpThread = new MyHelperClass();
                                        writePaused(new FileInputStream(HttpThread.getMappedFilename(command.getMessage(), data.req.getUrl())), out, pause);
                                    } else {
                                        String parameter = "";
                                        if (command.getMessage().indexOf("php") >= 0) {
                                            parameter = "-f ";
                                        }
                                        MyHelperClass HttpThread = new MyHelperClass();
                                        Process p = Runtime.getRuntime().exec(application + " " + parameter + HttpThread.getMappedFilename(command.getMessage(), data.req.getUrl()));
                                        BufferedReader pIn = new BufferedReader(new InputStreamReader(p.getInputStream()));
                                        String aLine;
                                        while ((aLine = pIn.readLine()) != null) out.write((aLine + "\n").getBytes());
                                        pIn.close();
                                    }
                                }
                                break;
                            MyHelperClass BSssi = new MyHelperClass();
                            case BSssi.CMD_EXEC:
                                Process p = Runtime.getRuntime().exec(command.getMessage());
                                BufferedReader pIn = new BufferedReader(new InputStreamReader(p.getInputStream()));
                                String aLine;
                                while ((aLine = pIn.readLine()) != null) out.write((aLine + "\n").getBytes());
                                BufferedReader pErr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                                while ((aLine = pErr.readLine()) != null) out.write((aLine + "\n").getBytes());
                                pIn.close();
                                pErr.close();
                                p.destroy();
                                break;
                            MyHelperClass BSssi = new MyHelperClass();
                            case BSssi.CMD_INCLUDE:
                                MyHelperClass HttpThread = new MyHelperClass();
                                File incFile = HttpThread.getMappedFilename(command.getMessage());
                                if (incFile.exists() && incFile.canRead()) {
                                    MyHelperClass pause = new MyHelperClass();
                                    writePaused(new FileInputStream(incFile), out, pause);
                                }
                                break;
                            MyHelperClass BSssi = new MyHelperClass();
                            case BSssi.CMD_FILESIZE:
                                MyHelperClass HttpThread = new MyHelperClass();
                                long sizeBytes = HttpThread.getMappedFilename(command.getMessage(), data.req.getUrl()).length();
                                double smartSize;
                                String unit = "bytes";
                                if (command.getFileType().trim().equals("abbrev")) {
                                    if (sizeBytes > 1000000) {
                                        smartSize = sizeBytes / 1024000.0;
                                        unit = "M";
                                    } else if (sizeBytes > 1000) {
                                        smartSize = sizeBytes / 1024.0;
                                        unit = "K";
                                    } else {
                                        smartSize = sizeBytes;
                                        unit = "bytes";
                                    }
                                    NumberFormat numberFormat = new DecimalFormat("#,##0", new DecimalFormatSymbols(Locale.ENGLISH));
                                    out.write((numberFormat.format(smartSize) + "" + unit).getBytes());
                                } else {
                                    NumberFormat numberFormat = new DecimalFormat("#,###,##0", new DecimalFormatSymbols(Locale.ENGLISH));
                                    out.write((numberFormat.format(sizeBytes) + " " + unit).getBytes());
                                }
                                break;
                            MyHelperClass BSssi = new MyHelperClass();
                            case BSssi.CMD_FLASTMOD:
                                MyHelperClass HttpThread = new MyHelperClass();
                                out.write(ssi.format(new Date(HttpThread.getMappedFilename(command.getMessage(), data.req.getUrl()).lastModified()), TimeZone.getTimeZone("GMT")).getBytes());
                                break;
                            MyHelperClass BSssi = new MyHelperClass();
                            case BSssi.CMD_NOECHO:
                                break;
                            MyHelperClass BSssi = new MyHelperClass();
                            case BSssi.CMD_ECHO:
                            default:
                                out.write(command.getMessage().getBytes());
                                break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    MyHelperClass ssi = new MyHelperClass();
                    out.write((ssi.getErrorMessage() + " " + e.getMessage()).getBytes());
                }
                if (anIfCondition) out.write("\n".getBytes());
            } else {
                if (anIfCondition) out.write((t + "\n").getBytes());
            }
            out.flush();
        }
        in.close();
        out.close();
        data.fileData.setContentType("text/html");
        data.fileData.setFile(tempFile);
        MyHelperClass pause = new MyHelperClass();
        writePaused(new FileInputStream(tempFile), data.out, pause);
        MyHelperClass logger = new MyHelperClass();
        logger.fine("HandleSSI done for " + data.resp);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpData {

}

class HttpError {

}

class SimpleResponse {

}

class SSICommand {

}

class SsiHandler {

}

class NumberFormat {

}

class DecimalFormat {

}

class DecimalFormatSymbols {

}
