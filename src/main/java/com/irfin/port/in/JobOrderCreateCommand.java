/*
 * JobOrderCreateCommand.java
 *
 * Created on Dec 08, 2022, 18.03
 */
package com.irfin.port.in;

/**
 * @author Irfin A.
 */
public class JobOrderCreateCommand
{
    private String jobTitle;

    public JobOrderCreateCommand(String _jobTitle)
    {
        jobTitle = _jobTitle;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public void setJobTitle(String _jobTitle)
    {
        jobTitle = _jobTitle;
    }
}
