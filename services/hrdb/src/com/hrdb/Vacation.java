package com.hrdb;
// Generated 16 Sep, 2014 12:14:07 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import javax.persistence.Transient;
import javax.persistence.CascadeType;


/**
 * Vacation generated by hbm2java
 */
@Entity
@Table(name="VACATION"
    ,schema="PUBLIC"
    ,catalog="PUBLIC"
)
public class Vacation  implements java.io.Serializable {


     private Integer id;
     private Employee employee;
     private Date startdate;
     private Date enddate;
     private Integer tenantid;

    public Vacation() {
    }

	
    public Vacation(Employee employee) {
        this.employee = employee;
    }
    public Vacation(Employee employee, Date startdate, Date enddate, Integer tenantid) {
       this.employee = employee;
       this.startdate = startdate;
       this.enddate = enddate;
       this.tenantid = tenantid;
    }

     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EMPID", nullable=false)
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="STARTDATE", length=10)
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ENDDATE", length=10)
    public Date getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    
    @Column(name="TENANTID")
    public Integer getTenantid() {
        return this.tenantid;
    }
    
    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }




}

