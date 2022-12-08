/*
 * JobOrder.java
 *
 * Created on Dec 08, 2022, 20.20
 */
package com.irfin.domain;

/**
 * @author Irfin A.
 */
public class JobOrder
{
    private Long id;
    private String title;

    public Long getId()
    {
        return id;
    }

    public void setId(Long _id)
    {
        id = _id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String _title)
    {
        title = _title;
    }
}
