package cn.zhang;

import java.lang.reflect.Proxy;

public class TestProxy {
	public static void main(String[] args) {
		User user = new UserService();
		UserDynamicProxy dynamicProxy = new UserDynamicProxy(user);
		User proxy = (User)Proxy.newProxyInstance(User.class.getClassLoader(), user.getClass().getInterfaces(), dynamicProxy);
		proxy.talk("ÎÒÕæÐÐ!");
		proxy.maren("²ÝÄâÂð");
	}

}
