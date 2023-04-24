package archivosflujos;

import java.io.File;

public class Tree {

	private static void print(File[] files, String tabs) {
		String spaces = tabs.concat("-");
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					System.out.printf("%s %s \n", spaces, file.getName());
				} else {
					System.out.printf("%s %s \n", spaces, file.getName());
					print(file.listFiles(), spaces);
				}
			}
		}

	}

	public static void main(String[] args) {
		File f = new File("/home/marco/Downloads");
		System.out.println(f.getName());
		print(f.listFiles(), "-");
	}

}
