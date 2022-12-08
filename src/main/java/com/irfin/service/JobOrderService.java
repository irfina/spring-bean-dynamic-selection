/*
 * JobOrderService.java
 *
 * Created on Dec 08, 2022, 18.08
 */
package com.irfin.service;

import com.irfin.domain.JobOrder;
import com.irfin.port.in.JobOrderCreateCommand;
import com.irfin.port.in.JobOrderUpdateCommand;
import com.irfin.port.in.JobOrderUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Our intention is to make this class as the default JobOrderUseCase implementation.
 *
 * @author Irfin A.
 */
@Service
public class JobOrderService implements JobOrderUseCase
{
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public JobOrder create(JobOrderCreateCommand _cmd)
    {
        LOGGER.info("create() called from " + this.getClass().getName());

        var retval = new JobOrder();

        retval.setId(new Random().nextLong());
        return retval;
    }

    @Override
    public void update(JobOrderUpdateCommand _cmd)
    {
        LOGGER.info("update() called from " + this.getClass().getName());
    }
}
