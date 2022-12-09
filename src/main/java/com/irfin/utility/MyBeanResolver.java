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

    /**
     * Find spring bean implementation of {@code _contract}, with name {@code _propertyName}. If not found, then the
     * {@code _defaultImpl} bean will be returned. Both beans must implement the S interface.
     *
     * @param _contract
     * @param _propertyName
     * @param _defaultImpl
     * @return <S>
     */
    public <S, T extends S> S getOrElse(Class<S> _contract, String _propertyName, Class<T> _defaultImpl)
    {
        var beanName = context.getEnvironment().getProperty(_propertyName);
        if (beanName == null)
            return context.getBean(_defaultImpl);
        else
            return context.getBean(beanName, _contract);
    }
}
