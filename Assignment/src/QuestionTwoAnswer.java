import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class QuestionTwoAnswer {

	public static void main(String[] args) { 
		
		File file;
		
		file = new File("C:\\Users\\admin\\Downloads\\");
		
		File [] flArr = file.listFiles();
		
		for(File f : flArr) {
			//System.out.println("=>"+f.getName());
		}
//		flArr[0].isFile
		
	
		System.out.println(flArr.length);
		Map<Object, List<File>> myAnswer  = Arrays.asList(flArr).stream().collect(Collectors.groupingBy(x1 -> x1.isFile()));
	 myAnswer  = Arrays.asList(flArr).stream().collect(Collectors.groupingBy(x1 -> new Date(x1.lastModified()).getMonth()));
		System.out.println(myAnswer.size());
		for (Entry<Object, List<File>> entry : myAnswer.entrySet() ) {
			System.out.println(entry.getKey()+"-k");
			System.out.println(entry.getValue().size());

			
		}

	}

}
