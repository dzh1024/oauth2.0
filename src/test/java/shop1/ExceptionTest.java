package shop1;

import net.sf.ehcache.distribution.RemoteCacheException;

public class ExceptionTest {
	public static void main(String[] args) {
//		try {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("第" + i + "次，aaaaaaaaaaaa");
//				int a = 1 / 0;
//				System.out.println("第" + i + "次，bbbbbbb");
//			}
//		} catch (Exception e) {
//			System.out.println("wwwwwwwwww");
//		}

//			for (int i = 0; i < 10; i++) {
//				System.out.println("第" + i + "次，aaaaaaaaaaaa");
//				System.out.println("第" + i + "次，bbbbbbb");
//				throw new RuntimeException("错误类型");
//			}

//		for (int i = 0; i < 10; i++) {
//			try {
//				System.out.println("第" + i + "次，aaaaaaaaaaaa");
//				int a = 1 / 0;
//				System.out.println("第" + i + "次，bbbbbbb");
//			} catch (Exception e) {
//				System.out.println("wwwwwwwwww");
//			}
//		}
		
//		若是不处理，则抛出异常直接中断
		for (int i = 0; i < 10; i++) {
				System.out.println("第" + i + "次，aaaaaaaaaaaa");
				int a = 1 / 0;
				System.out.println("第" + i + "次，bbbbbbb");
//				throw new RuntimeException("错误类型");
//				throw new RemoteCacheException();
		}
	}
}
