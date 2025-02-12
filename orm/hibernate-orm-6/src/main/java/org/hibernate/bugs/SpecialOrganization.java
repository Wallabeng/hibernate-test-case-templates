package org.hibernate.bugs;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "SpecialOrganization")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
public class SpecialOrganization extends Organization
{
    private String someValue;

    public String getSomeValue()
    {
        return someValue;
    }

    public void setSomeValue(String someValue)
    {
        this.someValue = someValue;
    }
}
