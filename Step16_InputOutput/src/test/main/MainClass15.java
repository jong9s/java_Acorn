package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass15 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:/playground/SouthKorea.png");
			fos = new FileOutputStream("c:/playground/copied2.png");

			byte[] buffer = new byte[1024];
			int readedCount;
			while ((readedCount = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, readedCount);
			}
			System.out.println("파일을 copy 했습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
				if (fis != null)
					fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}