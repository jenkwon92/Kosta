package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputStream_1 {
	private String filepath;

	public OutputStream_1(String filepath) {
		super();
		this.filepath = filepath;
	}

	public void outputData(String data) throws IOException {
		// FileWriter fw = new FileWriter(filepath, true);
		// PrintWriter pw = new PrintWriter(fw);

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(filepath, true));
			pw.print(data);
		} finally {
			if(pw != null) {
				pw.close();
			}
		}

	}

}
