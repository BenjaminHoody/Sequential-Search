import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SequentialSearch
	{

		public static void main(String[] args) throws IOException

			{
				Scanner myFile = new Scanner(new File("SearchForV"));
				

					String sentence = myFile.nextLine();
					
					System.out.println(sentence.length());
									
					int indexOfV = sentence.indexOf("v");
					
					System.out.println(indexOfV/2);
					
					
			}

	}
