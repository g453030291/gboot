package org.g.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.core.ResolvableType;
import org.springframework.lang.Nullable;

/**
 * bean 工厂
 * @author g
 * @date 2021/1/3 9:52 上午
 */
public interface BeanFactory {

	/**
	 * Used to dereference a {@link FactoryBean} instance and distinguish it from
	 * beans <i>created</i> by the FactoryBean. For example, if the bean named
	 * {@code myJndiObject} is a FactoryBean, getting {@code &myJndiObject}
	 * will return the factory, not the instance returned by the factory.
	 */
	String FACTORY_BEAN_PREFIX = "&";


	Object getBean(String name) throws BeansException;

	<T> T getBean(String name, @Nullable Class<T> requiredType) throws BeansException;

	Object getBean(String name, Object... args) throws BeansException;

	<T> T getBean(Class<T> requiredType) throws BeansException;

	<T> T getBean(Class<T> requiredType, Object... args) throws BeansException;

	boolean containsBean(String name);


	boolean isSingleton(String name) throws NoSuchBeanDefinitionException;


	boolean isPrototype(String name) throws NoSuchBeanDefinitionException;


	boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException;


	boolean isTypeMatch(String name, @Nullable Class<?> typeToMatch) throws NoSuchBeanDefinitionException;


	Class<?> getType(String name) throws NoSuchBeanDefinitionException;


	String[] getAliases(String name);

}
