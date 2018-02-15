import java.util.*;

public class url{
	public static String extractIt(String url){
		char star = '*';

		String[] array = url.split("/");
		String file = array[array.length-1];
		char[] file_char = file.toCharArray();


		for (int i = 0;i < file_char.length;i++ ) {
			if (file_char[i] == star) {
				file_char[i] = '_';
			}
		}

		return file = String.valueOf(file_char);
	}

	public static void main(String[] args) {
		System.out.println(extractIt("www.abc.com/pub/*aaa.html"));
	}
}