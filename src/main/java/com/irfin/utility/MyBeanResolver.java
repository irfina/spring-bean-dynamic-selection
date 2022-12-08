/*
 * MyBeanResolver.java
 *
 * Created on Dec 08, 2022, 22.15
 */
package com.irfin.utility;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Irfin A.
 */
@Component
public class MyBeanResolver
{
    private final ApplicationContext context;

    public MyBeanResolver(ApplicationContext _context)
    {
        context = _context;
    }

    public <T> T getOrElse(String _propertyName, Class<T> _class)
    {
        var beanName = context.getEnvironment().getProperty(_propertyName);
        if (beanName == null)
            return context.getBean(_class);
        else
            return (T) context.getBean(beanName);
    }
}
