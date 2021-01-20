package org.g.factory;

/**
 * bean 工厂
 * @author g
 * @date 2021/1/3 9:52 上午
 */
public interface BeanFactory {

	String FACTORY_BEAN_PREFIX = "&";


	Object getBean(String name);

	<T> T getBean(String name, Class<T> requiredType);

	Object getBean(String name, Object... args);

	<T> T getBean(Class<T> requiredType);

	<T> T getBean(Class<T> requiredType, Object... args);

	boolean containsBean(String name);


	boolean isSingleton(String name);


	boolean isPrototype(String name);

	boolean isTypeMatch(String name, Class<?> typeToMatch);


	Class<?> getType(String name);


	String[] getAliases(String name);

}
