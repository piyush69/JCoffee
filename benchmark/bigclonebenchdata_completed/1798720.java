import java.io.*;
import java.lang.*;
import java.util.*;



class c1798720 {

    public static void save(String packageName, ArrayList<byte[]> fileContents, ArrayList<String> fileNames) throws Exception {
        MyHelperClass Util = new MyHelperClass();
        String dirBase = Util.JAVA_DIR + File.separator + packageName;
        File packageDir = new File(dirBase);
        if (!packageDir.exists()) {
            boolean created = packageDir.mkdir();
            if (!created) {
                File currentPath = new File(".");
                throw new Exception("Directory " + packageName + " could not be created. Current directory: " + currentPath.getAbsolutePath());
            }
        }
        for (int i = 0; i < fileContents.size(); i++) {
//            MyHelperClass Util = new MyHelperClass();
            File file = new File(Util.JAVA_DIR + File.separator + fileNames.get(i));
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(fileContents.get(i));
            fos.flush();
            fos.close();
        }
        for (int i = 0; i < fileNames.size(); i++) {
//            MyHelperClass Util = new MyHelperClass();
            File fileSrc = new File(Util.JAVA_DIR + File.separator + fileNames.get(i));
            File fileDst = new File(dirBase + File.separator + fileNames.get(i));
            BufferedReader reader = new BufferedReader(new FileReader(fileSrc));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileDst));
            writer.append("package " + packageName + ";\n");
            String line = "";
            while ((line = reader.readLine()) != null) writer.append(line + "\n");
            writer.flush();
            writer.close();
            reader.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JAVA_DIR;
}
