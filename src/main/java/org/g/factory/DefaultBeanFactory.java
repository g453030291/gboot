package org.g.factory;

/**
 * @author g
 * @date 2021/1/12 10:08 下午
 */
public class DefaultBeanFactory implements BeanFactory {

	@Override
	public Object getBean(String name) {
		return null;
	}

	@Override
	public <T> T getBean(String name, Class<T> requiredType) {
		return null;
	}

	@Override
	public Object getBean(String name, Object... args) {
		return null;
	}

	@Override
	public <T> T getBean(Class<T> requiredType) {
		return null;
	}

	@Override
	public <T> T getBean(Class<T> requiredType, Object... args) {
		return null;
	}

	@Override
	public boolean containsBean(String name) {
		return false;
	}

	@Override
	public boolean isSingleton(String name) {
		return false;
	}

	@Override
	public boolean isPrototype(String name) {
		return false;
	}

	@Override
	public boolean isTypeMatch(String name, Class<?> typeToMatch) {
		return false;
	}

	@Override
	public Class<?> getType(String name) {
		return null;
	}

	@Override
	public String[] getAliases(String name) {
		return new String[0];
	}
}
