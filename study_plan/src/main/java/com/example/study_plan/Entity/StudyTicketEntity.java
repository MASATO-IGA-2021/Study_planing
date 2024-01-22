package com.example.study_plan.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_study_tickets")
public class StudyTicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer syudyTicketID;

    @Column(length=30, nullable = false)
    private String title;

    @Column(length=100, nullable = false)
    private String content;

    @Column
    private Date createdDate;

    @Column
    private Date completedDate;

    @Column(nullable = false)
    private Date completeLimitDate;

    @Column(nullable = false)
    private Boolean deleteFlag;

    @Column
    private Integer status;
    
    @Column
    private Integer category;

    //=====getter, setter==========

    public Integer getSyudyTicketID(){
        return syudyTicketID;
    }
    public void setSyudyTicketID(Integer syudyTicketID){
        this.syudyTicketID = syudyTicketID;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getContet(){
        return content;
    }
    public void setContet(String content){
        this.content = content;
    }

    public Date getCreatedDate(){
        return createdDate;
    }
    public void setCreatedDate(Date createdDate){
        this.createdDate = createdDate;
    }

    public Date getCompletedDate(){
        return completedDate;
    }
    public void setCompletedDate(Date completedDate){
        this.completedDate = completedDate;
    }

    public Date getCompleteLimitDate(){
        return completeLimitDate;
    }
    public void setCompleteLimitDate(Date completeLimitDate){
        this.completeLimitDate = completeLimitDate;
    }

    public Boolean getDeleteFlag(){
        return deleteFlag;
    }
    public void setDeleteFlag(Boolean deleteFlag){
        this.deleteFlag = deleteFlag;
    }
    
    public Integer getStatus(){
        return status;
    }
    public void setStatus(Integer status){
        this.status = status;
    }

    public Integer getCateory(){
        return category;
    }
    public void setCategory(Integer category){
        this.category = category;
    }

}
