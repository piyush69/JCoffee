import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c481364 {
public MyHelperClass publish(RaphPhotoGalleryPhoto o0){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass getCodeBase(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }

    private void downloadFiles()  throws Throwable {
        SwingWorker downloadFilesWorker = new SwingWorker() {

            Date startDownloadDate;

//            @Override
            public Double doInBackground() {
                startDownloadDate = new Date();
                int refreshSpeed = NULL; //new int();
                refreshSpeed = 0;
                MyHelperClass lastDate = new MyHelperClass();
                lastDate = null;
                try {
                    int totalSizeRead = 0;
                    int totalNumberRead = 0;
                    MyHelperClass photoList = new MyHelperClass();
                    for (RaphPhotoGalleryPhoto photo : (Object[])(Object)photoList) {
                        URL url = new URL(getCodeBase().toString() + photo.getUrl());
                        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                        DataInputStream dis = new DataInputStream(connection.getInputStream());
                        MyHelperClass destinationDirectory = new MyHelperClass();
                        FileOutputStream fos = new FileOutputStream(destinationDirectory.toString() + "/" + photo.getFileName());
                        byte[] b = new byte[65536];
                        int sizeRead;
                        photo.setProcessedSize(0);
                        totalNumberRead++;
                        while ((sizeRead = dis.read(b)) > -1) {
                            fos.write(b, 0, sizeRead);
                            totalSizeRead += sizeRead;
                            photo.addToProcessedSize(sizeRead);
                            photo.setTotalProcessedSize(totalSizeRead);
                            photo.setTotalProcessedNumber(totalNumberRead);
                            publish(photo);
                            try {
                            } catch (Exception ignore) {
                            }
                        }
                        fos.close();
                    }
                } catch (MalformedURLException e1) {
                    System.err.println("MalformedURLException: " + e1);
                } catch (IOException e2) {
                    System.err.println("IOException: " + e2);
                }
                long totalDiffTime = (new Date()).getTime() - startDownloadDate.getTime();
                MyHelperClass photoListTotalSize = new MyHelperClass();
                double totalSpeed =(long)(Object) photoListTotalSize / (totalDiffTime / 1000);
                return new Double(totalSpeed);
            }

//            @Override
            protected void process(List<RaphPhotoGalleryPhoto> list) {
                RaphPhotoGalleryPhoto photo = list.get(list.size() - 1);
                MyHelperClass photoListTotalSize = new MyHelperClass();
                MyHelperClass progressBarTotal = new MyHelperClass();
                progressBarTotal.setMaximum(photoListTotalSize);
                MyHelperClass progressBarTotal = new MyHelperClass();
                progressBarTotal.setValue(photo.getTotalProcessedSize());
                MyHelperClass photoList = new MyHelperClass();
                setProgressBarTotalLabels(photo.getTotalProcessedNumber(), photoList.size(), photoListTotalSize - (int)(Object)photo.getTotalProcessedSize());
                MyHelperClass progressBarCurrent = new MyHelperClass();
                progressBarCurrent.setMaximum(photo.getFileSize());
//                MyHelperClass progressBarCurrent = new MyHelperClass();
                progressBarCurrent.setValue(photo.getProcessedSize());
                MyHelperClass progressBarCurrentLabel = new MyHelperClass();
                progressBarCurrentLabel.setText(photo.getFileName());
                long diffTime = 0;
                Date lastDate = NULL; //new Date();
                if (lastDate == null) lastDate = new Date();
//                MyHelperClass lastDate = new MyHelperClass();
                diffTime = (new Date()).getTime() - lastDate.getTime();
                if (diffTime > 1000) {
                    MyHelperClass lastTotalSize = new MyHelperClass();
                    double currentSpeed = (photo.getTotalProcessedSize() - (int)(Object)lastTotalSize) / (diffTime / 1000.0);
                    MyHelperClass lastSpeed = new MyHelperClass();
                    if (currentSpeed > 0) lastSpeed.add(new Double(currentSpeed));
//                    MyHelperClass lastSpeed = new MyHelperClass();
                    if (lastSpeed.size() == 10) lastSpeed.removeFirst();
                    double speed = 0;
//                    MyHelperClass lastSpeed = new MyHelperClass();
                    for (Double d : (Object[])(Object)lastSpeed) {
                        speed += d.doubleValue();
                    }
//                    MyHelperClass lastSpeed = new MyHelperClass();
                    speed = Math.round(speed / lastSpeed.size());
                    MyHelperClass refreshSpeed = new MyHelperClass();
                    if ((int)(Object)refreshSpeed == 0) {
                        long totalDiffTime = (new Date()).getTime() - startDownloadDate.getTime();
                        double totalSpeed =(double)(Object) (photo.getTotalProcessedSize()) / (totalDiffTime / 1000.0);
                        MyHelperClass remainingTime = new MyHelperClass();
                        remainingTime = (photoListTotalSize - (int)(Object)photo.getTotalProcessedSize()) / totalSpeed;
//                        MyHelperClass remainingTime = new MyHelperClass();
                        if ((int)(Object)remainingTime < 8) refreshSpeed = 0; else refreshSpeed = 3;
                    } else {
//                        MyHelperClass refreshSpeed = new MyHelperClass();
                        refreshSpeed--;
                        MyHelperClass remainingTime = new MyHelperClass();
                       (double)(Object) remainingTime -= diffTime / 1000.0;
                    }
                    MyHelperClass remainingTime = new MyHelperClass();
                    MyHelperClass speedLabel = new MyHelperClass();
                    speedLabel.setText(String.format("%.0f", speed / 1024) + " " + getParameter("i18n_speedUnit") + " :  " + String.format("%.0f", remainingTime) + " s");
//                    MyHelperClass lastDate = new MyHelperClass();
                    lastDate =(MyHelperClass)(Object) new Date();
//                    MyHelperClass lastTotalSize = new MyHelperClass();
                    lastTotalSize = photo.getTotalProcessedSize();
                }
            }

//            @Override
            protected void done() {
                try {
                    MyHelperClass speedLabel = new MyHelperClass();
                    speedLabel.setText(String.format("%.0f", get().doubleValue() / 1024) + " " + getParameter("i18n_speedUnit"));
                    MyHelperClass downloadButton = new MyHelperClass();
                    downloadButton.setText(getParameter("i18n_finished"));
                    int downloadState = NULL; //new int();
                    downloadState = 2;
                } catch (Exception ignore) {
                }
            }
        };
        downloadFilesWorker.execute();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int refreshSpeed;
public MyHelperClass size(){ return null; }
	public MyHelperClass add(Double o0){ return null; }
	public MyHelperClass setMaximum(MyHelperClass o0){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass setValue(MyHelperClass o0){ return null; }
	public MyHelperClass removeFirst(){ return null; }
	public MyHelperClass doubleValue(){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }}

class SwingWorker {

public MyHelperClass execute(){ return null; }}

class RaphPhotoGalleryPhoto {

public MyHelperClass getTotalProcessedNumber(){ return null; }
	public MyHelperClass setTotalProcessedSize(int o0){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass addToProcessedSize(int o0){ return null; }
	public MyHelperClass setTotalProcessedNumber(int o0){ return null; }
	public MyHelperClass getTotalProcessedSize(){ return null; }
	public MyHelperClass getProcessedSize(){ return null; }
	public MyHelperClass getFileSize(){ return null; }
	public MyHelperClass setProcessedSize(int o0){ return null; }}
