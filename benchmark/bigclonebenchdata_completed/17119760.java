


class c17119760 {

    public void testReaderWriterF2() throws Exception {
        String inFile = "test_data/mri.png";
        String outFile = "test_output/mri__smooth_testReaderWriter.mhd";
        MyHelperClass itkImageFileReaderF2 = new MyHelperClass();
        itkImageFileReaderF2_Pointer reader =(itkImageFileReaderF2_Pointer)(Object) itkImageFileReaderF2.itkImageFileReaderF2_New();
        MyHelperClass itkImageFileWriterF2 = new MyHelperClass();
        itkImageFileWriterF2_Pointer writer =(itkImageFileWriterF2_Pointer)(Object) itkImageFileWriterF2.itkImageFileWriterF2_New();
        reader.SetFileName(inFile);
        writer.SetFileName(outFile);
        writer.SetInput(reader.GetOutput());
        writer.Update();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass itkImageFileReaderF2_New(){ return null; }
	public MyHelperClass itkImageFileWriterF2_New(){ return null; }}

class itkImageFileReaderF2_Pointer {

public MyHelperClass SetFileName(String o0){ return null; }
	public MyHelperClass GetOutput(){ return null; }}

class itkImageFileWriterF2_Pointer {

public MyHelperClass SetInput(MyHelperClass o0){ return null; }
	public MyHelperClass Update(){ return null; }
	public MyHelperClass SetFileName(String o0){ return null; }}
