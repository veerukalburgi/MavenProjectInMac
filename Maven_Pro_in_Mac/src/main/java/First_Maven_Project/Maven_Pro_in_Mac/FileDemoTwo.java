package First_Maven_Project.Maven_Pro_in_Mac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FileDemoTwo{
    private static BufferedReader in;

	public static void main(String args[])throws Exception{
        in = new BufferedReader(new FileReader("/Users/Veer/Desktop/Test_File/pom.csv"));
        String str;
        List<String> list = new ArrayList<String>();
        while((str =in.readLine()) != null ){
            list.add(str);
        }
        String[] stringArr = list.toArray(new String[0]);
        for (int i=0;i<stringArr.length;i++) {
        write(stringArr[i].split(";")[0]+".csv", stringArr[i]);
        }
    }

	public static void write (String filename, String stringArr) throws IOException{
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			File file = new File("/Users/Veer/Desktop/Test_File/"+filename);
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write(stringArr);
			bw.newLine();
			
			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
