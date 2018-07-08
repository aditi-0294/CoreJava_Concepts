
public class FileCompareApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalFilePath = ""; // path of original file containing all data
		String comparingFilePath = ""; // path of comparing file containing missing data 
		
		FileCompareLogic fcl = new FileCompareLogic();
		fcl.testFiles(originalFilePath, comparingFilePath);
		
	}

}
