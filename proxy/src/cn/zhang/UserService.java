package cn.zhang;

public class UserService implements User{

	@Override
	public void talk(String content) {
		System.out.println(content);
	}

	@Override
	public void maren(String content) {
		System.out.println(content);
		
	}

}
