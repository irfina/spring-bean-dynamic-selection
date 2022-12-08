/*
 * JobOrderUseCase.java
 *
 * Created on Dec 08, 2022, 17.57
 */
package com.irfin.port.in;

import com.irfin.domain.JobOrder;

/**
 * @author Irfin A.
 */
public interface JobOrderUseCase
{
    JobOrder create(JobOrderCreateCommand _cmd);
    void update(JobOrderUpdateCommand _cmd);
}
