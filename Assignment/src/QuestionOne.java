

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import  a.b.*;
import  c.b.*;

public class QuestionOne {
	
	public static <E> void main(String[] args) {
		
		System.out.println("a.");
		 File file;
		a.b.c = c.b.a;
		
			 file = new File("F:\\SpringBoot\\SpringHibernate\\14. Spring MVC - Form Tags and Data Binding");
			 
			for ( File f :file.listFiles()) {
				Date d =new Date(f.lastModified());
				
				
			}
			
			
			File [] flArr = (file.listFiles());
			
//			flArr[0].isFile
			
			List <File> flList = Arrays.asList(flArr).stream().collect(Collectors.filtering(x1 -> x1.isFile(), Collectors.toList()));
			
			Map<Object, List<File>> myAnswer  = flList.stream().collect(Collectors.groupingBy(x1 -> new Date(x1.lastModified()).getMonth()));
			
			System.out.println("Second Question Answer");
			
			for (Entry<Object, List<File>> entry : myAnswer.entrySet() ) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());				
			}
			
			Set<Object>  k = myAnswer.keySet();
			
			
			
			
			
				
			}
				 
			 
			 
		
	}


