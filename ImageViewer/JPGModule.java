
public class JPGModule implements ImageViewerInterface{
	
	private String extensionName="JPG";
	
	@Override
	public String getName() {
		return extensionName+" Module";
	}
		
	@Override
	public void show(String fileName) {
		System.out.println(extensionName+" image loading: "+fileName);
	}
		
	@Override
	public String getExtension() {
		return extensionName;
	}
}