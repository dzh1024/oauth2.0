package path;

import java.net.URISyntaxException;

public class PathUtils {

	/**
	 * 获取项目路径
	 */
	public static String getWebRootPath(String filePath) {
		try {
			String path = PathUtils.class.getClassLoader().getResource("").toURI().getPath();
			path = path.replace("/WEB-INF/classes/", "");
			path = path.replace("/target/classes/", "");
			path = path.replace("file:/", "");
			return path + "/" + filePath;
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}
}
