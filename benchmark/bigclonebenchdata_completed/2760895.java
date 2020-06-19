import java.io.*;
import java.lang.*;
import java.util.*;



class c2760895 {
public MyHelperClass ftpPassword;
	public MyHelperClass ftpPort;

    private void uploadFileToWebSite(String siteDir, String channelAsciiName, Map synFileList) throws Exception {
        if (siteDir == null) {
            siteDir = "";
        }
        MyHelperClass log = new MyHelperClass();
        log.debug("uploadFileToWebSite begin! siteDir:= " + siteDir + "  currDate:= " + new Date().toString());
        siteDir = new File(siteDir).getPath() + File.separator;
        FTPClient client = new FTPClient();
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    MyHelperClass ftpServerIp = new MyHelperClass();
                    client.connect(ftpServerIp, ftpPort);
                    break;
                } catch (UncheckedIOException ex2) {
                    if (i == 2) {
//                        MyHelperClass log = new MyHelperClass();
                        log.error("ftp����������ʧ��,�Ѿ�����3��!", ex2);
                        throw new IOException("ftp����������ʧ��,�Ѿ�����3��!" + ex2.toString());
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                try {
                    MyHelperClass ftpLoginUser = new MyHelperClass();
                    client.login(ftpLoginUser, ftpPassword);
                    break;
                } catch (UncheckedIOException ex3) {
                    if (i == 2) {
//                        MyHelperClass log = new MyHelperClass();
                        log.error("��¼ftp������ʧ��,�Ѿ�����3��!", ex3);
                        throw new IOException("��¼ftp������ʧ��,�Ѿ�����3��!" + ex3.toString());
                    }
                }
            }
//            MyHelperClass log = new MyHelperClass();
            log.debug("Ftp login is over !");
            client.syst();
            String ftpWD =(String)(Object) client.printWorkingDirectory();
//            MyHelperClass log = new MyHelperClass();
            log.debug("client.initiateListParsing() is over !");
            MyHelperClass FTPClient = new MyHelperClass();
            client.setFileType(FTPClient.BINARY_FILE_TYPE);
            client.enterLocalPassiveMode();
            Iterator iterator = synFileList.keySet().iterator();
            ArrayList alKey = new ArrayList();
            while (iterator.hasNext()) {
                alKey.add((String) iterator.next());
            }
//            MyHelperClass log = new MyHelperClass();
            log.debug("FTP Files size:= " + alKey.size());
            MyHelperClass ftpRootPath = new MyHelperClass();
            String basePath = ftpRootPath + (channelAsciiName == null || channelAsciiName.trim().equals("") ? "" : File.separator + channelAsciiName);
            MyHelperClass localRootPath = new MyHelperClass();
            log.debug("localRootPath:= " + localRootPath + " basePath:= " + basePath);
            String path;
            boolean isSuc;
            String sFileSep = File.separator;
            String sRep = "";
            if (basePath.startsWith("/")) {
                sFileSep = "/";
                sRep = "\\";
            } else if (basePath.startsWith("\\")) {
                sFileSep = "\\";
                sRep = "/";
            }
            if (!"".equals(sRep)) {
                MyHelperClass StringUtil = new MyHelperClass();
                basePath =(String)(Object) StringUtil.replaceAll(basePath, sRep, sFileSep);
                while (basePath.startsWith(sFileSep)) basePath = basePath.substring(1);
            }
            for (int j = 0; j < alKey.size(); j++) {
                String key = (String) alKey.get(j);
                File file = new File(siteDir + key);
                String filePath = file.getParent();
                String fileName = file.getName();
//                MyHelperClass localRootPath = new MyHelperClass();
                if (fileName == null || filePath == null || !file.exists() || filePath.length() < (int)(Object)localRootPath.length()) {
                    continue;
                }
//                MyHelperClass localRootPath = new MyHelperClass();
                filePath = filePath.substring((int)(Object)localRootPath.length());
                FileInputStream fis = null;
                String temp1;
                ArrayList alTemp;
                int iInd;
                try {
                    path = basePath + (filePath == null || filePath.trim().equals("") || filePath.equals(File.separator) ? "" : File.separator + filePath);
                    if (!"".equals(sRep)) {
                        MyHelperClass StringUtil = new MyHelperClass();
                        path =(String)(Object) StringUtil.replaceAll(path, sRep, sFileSep);
                    }
                    if (!(Boolean)(Object)client.changeWorkingDirectory(path)) {
                        isSuc =(boolean)(Object) client.makeDirectory(path);
                        if (isSuc) {
//                            MyHelperClass log = new MyHelperClass();
                            log.debug(" **** makeDirectory1(" + path + "): " + isSuc);
                        } else {
                            temp1 = path;
                            alTemp = new ArrayList();
                            iInd = temp1.lastIndexOf(sFileSep);
                            alTemp.add(temp1.substring(iInd));
                            temp1 = temp1.substring(0, iInd);
                            isSuc =(boolean)(Object) client.makeDirectory(temp1);
                            if (isSuc) {
//                                MyHelperClass log = new MyHelperClass();
                                log.debug(" **** makeDirectory2(" + temp1 + "): " + isSuc);
                            }
                            while (!"".equals(temp1) && !isSuc) {
                                iInd = temp1.lastIndexOf(sFileSep);
                                alTemp.add(temp1.substring(iInd));
                                temp1 = temp1.substring(0, iInd);
                                isSuc =(boolean)(Object) client.makeDirectory(temp1);
                                if (isSuc) {
//                                    MyHelperClass log = new MyHelperClass();
                                    log.debug(" **** makeDirectory3(" + temp1 + "): " + isSuc);
                                }
                            }
                            for (int i = alTemp.size(); i > 0; i--) {
                                temp1 += alTemp.get(i - 1);
                                isSuc =(boolean)(Object) client.makeDirectory(temp1);
//                                MyHelperClass log = new MyHelperClass();
                                log.debug(" **** makeDirectory4(" + temp1 + "): " + isSuc);
                            }
                        }
                        client.changeWorkingDirectory(path);
                    }
                    fis = new FileInputStream(file);
                    client.storeFile(fileName, fis);
                    client.changeWorkingDirectory(ftpWD);
                } catch (Throwable ex1) {
//                    MyHelperClass log = new MyHelperClass();
                    log.error("ͬ���ļ�����:������ļ�Ϊ:" + file.getPath());
                    ex1.printStackTrace();
                } finally {
                    try {
                        fis.close();
                    } catch (RuntimeException e1) {
//                        MyHelperClass log = new MyHelperClass();
                        log.error("close()����!");
                        e1.printStackTrace();
                    }
                    file = null;
                }
            }
        } catch (Throwable ex) {
//            MyHelperClass log = new MyHelperClass();
            log.error("ͬ��ʧ��--1202!", ex);
            ex.printStackTrace();
        } finally {
            if (client != null && (boolean)(Object)client.isConnected()) {
                client.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass replaceAll(String o0, String o1, String o2){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class FTPClient {

public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass makeDirectory(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass syst(){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}
