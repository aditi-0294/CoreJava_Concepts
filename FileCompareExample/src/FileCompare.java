
public class FileCompare {

	private String originalFile; // file containing all data
	private String comparingFile; // file containing missing data
	
	// generating constructor using respective field
	public FileCompare() {
		
	}
	
	public FileCompare(String originalFile, String comparingFile) {
		super();
		this.originalFile = originalFile;
		this.comparingFile = comparingFile;
	}

	// generating getter-setter fields
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
