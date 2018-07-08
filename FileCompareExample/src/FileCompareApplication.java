
public class FileCompareApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalFilePath = ""; // path of file containing all required data
		String comparingFilePath = ""; // path of file containing missing data
		
		FileCompareLogic fcl = new FileCompareLogic();
		fcl.testFiles(originalFilePath, comparingFilePath);
		
	}

}
