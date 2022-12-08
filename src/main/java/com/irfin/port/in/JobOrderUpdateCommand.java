/*
 * JobOrderUpdateCommand.java
 *
 * Created on Dec 08, 2022, 18.05
 */
package com.irfin.port.in;

/**
 * @author Irfin A.
 */
public class JobOrderUpdateCommand
{
    private long id;
    private String jobTitle;

    public JobOrderUpdateCommand(long _id)
    {
        id = _id;
    }

    public long getId()
    {
        return id;
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
