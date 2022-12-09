/*
 * JobOrderController.java
 *
 * Created on Dec 08, 2022, 20.16
 */
package com.irfin.adapter.in.web;

import com.irfin.port.in.JobOrderCreateCommand;
import com.irfin.port.in.JobOrderUpdateCommand;
import com.irfin.port.in.JobOrderUseCase;
import com.irfin.service.JobOrderService;
import com.irfin.utility.MyBeanResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Irfin A.
 */
@RestController
@RequestMapping("/job-order")
public class JobOrderController
{
    private JobOrderUseCase jobOrderUseCase;
    private final MyBeanResolver beanResolver;

    public JobOrderController(ApplicationContext _context, MyBeanResolver _beanResolver)
    {
        beanResolver = _beanResolver;
        jobOrderUseCase = beanResolver.getOrElse(JobOrderUseCase.class, "JobOrderUseCaseImpl", JobOrderService.class);

//        var beanName = _context.getEnvironment().getProperty("JobOrderUseCaseImpl");
//        System.out.println("${JobOrderUseCaseImpl} -> " + beanName);
//        if (beanName != null)
//            jobOrderUseCase = (JobOrderUseCase) _context.getBean(beanName);
//        else
//            jobOrderUseCase = _context.getBean(JobOrderService.class);
    }

    @GetMapping("/create")
    public ResponseEntity<String> create()
    {
        var ret = jobOrderUseCase.create(new JobOrderCreateCommand("New Job Title"));

        return ResponseEntity.ok("Ok, entity " + ret.getId() + " created.");
    }

    @GetMapping("/update")
    public ResponseEntity<String> update()
    {
        jobOrderUseCase.update(new JobOrderUpdateCommand(100));

        return ResponseEntity.ok("Update succeed.");
    }
}
