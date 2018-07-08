
public class FileCompare {

	private String originalFile; // contains all required data
	private String comparingFile; // contains missing data
	
	// generate constructor using respective fields
	public FileCompare() {
		
	}
	
	public FileCompare(String originalFile, String comparingFile) {
		super();
		this.originalFile = originalFile;
		this.comparingFile = comparingFile;
	}

	// generate getter-setter for respective fields
	public String getOriginalFile() {
		return originalFile;
	}

	public void setOriginalFile(String originalFile) {
		this.originalFile = originalFile;
	}

	public String getComparingFile() {
		return comparingFile;
	}

	public void setComparingFile(String comparingFile) {
		this.comparingFile = comparingFile;
	}
	
	
}
