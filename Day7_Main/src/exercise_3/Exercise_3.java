package exercise_3;

import java.io.File;

public class Exercise_3 {
	public static void printFileNames(File[] a, int lvl) {
		int i=0;
		while(i<a.length) {
			for (int j = 0; j < lvl; j++) {
				System.out.print("\t");
			}
			if (a[i].isFile()) {
				System.out.println(a[i].getName());
			
			
			} else if (a[i].isDirectory()) {
				System.out.println("[" + a[i].getName() + "]");
					System.out.println(a[i].getName()+" "+a.length);

				printFileNames(a[i].listFiles(), lvl + 1);

			}
			i++;
		}
	}

	public static void main(String[] args) {
		String path = "/Users/joelmoses/Documents";
		File fObj = new File(path);
		if (fObj.exists() && fObj.isDirectory()) {
			File a[] = fObj.listFiles();
			System.out.println("[" + a[0].getParent() + "]");
			System.out.println(a[0].getParent()+" "+a.length);
			printFileNames(a, 0);
			
		}

	}

}