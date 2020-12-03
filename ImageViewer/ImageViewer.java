
public class ImageViewer {

	private static final int MAX_PLUGINS = 5;
	private int k=0;
	private ImageViewerInterface[] arrayIV;
	
	JPGModule jpgO =new JPGModule();
	PNGModule pngO =new PNGModule();

	public ImageViewer(){
		arrayIV=new ImageViewerInterface[MAX_PLUGINS];
	}
	
	public void addPlugIn(ImageViewerInterface ivi) {
		 arrayIV[k]=ivi;
		 k++;
	}
	
	public void show(String fileName, String ext) {
		int i=0;
		int key=0;
		for(i=0;arrayIV[i]!=null;i++) {
			if(ext==arrayIV[i].getExtension()) { 
				key=1; break;
			}else key=0;
		}

		if(key==1) {
			System.out.println("Using "+arrayIV[i].getName());
			arrayIV[i].show(fileName);
		}
		if(key==0) {
			System.out.println("Image viewer plugin for the extension, "+ ext+", is not registered");
		}
		
	}
}
