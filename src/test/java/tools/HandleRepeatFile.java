package tools;

import java.io.File;

public class HandleRepeatFile {
	public static void main(String[] args) {

		// String path = "C:\\Users\\11706\\Desktop\\babawork"; // 要遍历的路径
		// File file = new File(path); // 获取其file对象
		// File[] fs = file.listFiles(); // 遍历path下的文件和目录，放在File数组中
		// for (File f : fs) { // 遍历File[]数组
		// if (!f.isDirectory()) // 若非目录(即文件)，则打印
		// System.out.println(f);
		// }
		String path = "C:\\Users\\11706\\Desktop\\babawork\\shop1"; // 要遍历的路径
		File file = new File(path); // 获取其file对象
		func(file);
	}

	private static void func(File file) {
		File[] fs = file.listFiles();
		for (File f : fs) {
			if (f.isDirectory()) // 若是目录，则递归打印该目录下的文件
				func(f);
			if (f.isFile()) // 若是文件，直接打印
				if(f.getName().contains("(1)")){
					System.out.println(f);
					f.delete();
				}
		}
	}
}
