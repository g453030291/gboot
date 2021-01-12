//package org.g.spring;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//
///**
// * @author g
// * @date 2021/1/5 8:44 上午
// */
//public class ExtendFactory implements BeanFactoryPostProcessor {
//
//	@Override
//	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		beanFactory.addBeanPostProcessor(new ExtendFactory2());
//		System.out.println("调用postProcessBeanFactory");
//	}
//
//}
