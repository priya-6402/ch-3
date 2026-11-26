package com.lab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class BeanFactoryInspector implements BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        if (beanFactory instanceof DefaultListableBeanFactory) {
            DefaultListableBeanFactory dlbf = (DefaultListableBeanFactory) beanFactory;
            System.out.println("==================================================");
            System.out.println("Total Bean Definitions in Factory: " + dlbf.getBeanDefinitionCount());
            System.out.println("Registered Bean Names:");
            for (String beanName : dlbf.getBeanDefinitionNames()) {
                System.out.println(" - " + beanName);
            }
            System.out.println("==================================================");
        }
    }
}
