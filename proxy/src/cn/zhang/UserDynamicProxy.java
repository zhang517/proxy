package cn.zhang;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserDynamicProxy implements InvocationHandler{

	private User user;
	public UserDynamicProxy(User user){
		this.user = user;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		String name = method.getName();
		if(name == "maren"){
			System.out.print(".....����ǰ��......\n");
			method.invoke(user, args);
			System.out.print(".....���ں���......\n");
		}
		
		return null;
	}

}
