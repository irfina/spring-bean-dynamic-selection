/*
 * AnotherJobOrderService.java
 *
 * Created on Dec 08, 2022, 21.10
 */
package com.irfin.service;

import com.irfin.domain.JobOrder;
import com.irfin.port.in.JobOrderCreateCommand;
import com.irfin.port.in.JobOrderUpdateCommand;
import com.irfin.port.in.JobOrderUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * This class is to demonstrate an alternative JobOrderUseCase implementation.
 *
 * @author Irfin A.
 */
@Service("anotherJobOrderService")
public class AnotherJobOrderService implements JobOrderUseCase
{
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public JobOrder create(JobOrderCreateCommand _cmd)
    {
        LOGGER.info("create() called from " + this.getClass().getName());

        return new JobOrder();
    }

    @Override
    public void update(JobOrderUpdateCommand _cmd)
    {
        LOGGER.info("update() called from " + this.getClass().getName());
    }
}
