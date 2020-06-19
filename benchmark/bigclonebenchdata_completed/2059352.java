


class c2059352 {

    public static void main(String[] args) {
        String inFile = "test_data/blobs.png";
        String outFile = "ReadWriteTest.png";
        MyHelperClass itkImageFileReaderUC2 = new MyHelperClass();
        itkImageFileReaderUC2_Pointer reader =(itkImageFileReaderUC2_Pointer)(Object) itkImageFileReaderUC2.itkImageFileReaderUC2_New();
        MyHelperClass itkImageFileWriterUC2 = new MyHelperClass();
        itkImageFileWriterUC2_Pointer writer =(itkImageFileWriterUC2_Pointer)(Object) itkImageFileWriterUC2.itkImageFileWriterUC2_New();
        reader.SetFileName(inFile);
        writer.SetFileName(outFile);
        writer.SetInput(reader.GetOutput());
        writer.Update();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass itkImageFileReaderUC2_New(){ return null; }
	public MyHelperClass itkImageFileWriterUC2_New(){ return null; }}

class itkImageFileReaderUC2_Pointer {

public MyHelperClass SetFileName(String o0){ return null; }
	public MyHelperClass GetOutput(){ return null; }}

class itkImageFileWriterUC2_Pointer {

public MyHelperClass SetInput(MyHelperClass o0){ return null; }
	public MyHelperClass Update(){ return null; }
	public MyHelperClass SetFileName(String o0){ return null; }}
