import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileCompareLogic {

	public FileCompare testFiles(String originalPath , String newPath) {
		
		FileCompare fc = new FileCompare();
		
		// set file path
		fc.setOriginalFile(originalPath);
		fc.setComparingFile(newPath);
		
		// retrieve and display file path
		System.out.println("Original File path = " + fc.getOriginalFile());
		System.out.println("Test File path = " + fc.getComparingFile());
		
		BufferedReader br_original = null;
		BufferedReader br_comparing = null;
		
		try {
			
			br_original = new BufferedReader(new FileReader(fc.getOriginalFile()));
			br_comparing = new BufferedReader(new FileReader(fc.getComparingFile()));
			
			String line; // read file line-by-line
			
			List<String> originalList = new ArrayList<>(); // contains all required data
			List<String> missingList = new ArrayList(); // contains missing data
			
			// read line and add to list
			while((line = br_original.readLine()) != null) {
				originalList.add(line);				
			}
			
			while((line = br_comparing.readLine()) != null) {
				missingList.add(line);
			}
			
			List<String> tempList = new ArrayList<>(originalList); // creating a temporary list
			tempList.removeAll(missingList);
			
			System.out.println("Content from originalList file not present in missingList , i.e. , comparing file : ");
			
			for(int i = 0; i < tempList.size(); i++) {
				System.out.println(tempList.get(i));
			}
			
		} catch(Exception ex) {
			ex.getMessage();
		}
		
		return fc;
	}
}
