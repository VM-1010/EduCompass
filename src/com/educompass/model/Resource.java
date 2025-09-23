package com.educompass.model;

public abstract class Resource {
    Integer id;
    String title;
    Semester semester;
    String course;
    ResLink resource_link;

    public Resource(Integer id, String title, Semester semester, String course, ResLink resource_link) {
        this.id = id;
        this.title = title;
        this.semester = semester;
        this.course = course;
        this.resource_link = resource_link;
    }
     
    
    public Resource(Integer id, String title, int semester, String course, ResLink resource_link) {
        this.id = id;
        this.title = title;
        switch(semester) {
            case 1 ->{ 
                this.semester = Semester.S1;
            }
            case 2 ->{ 
                this.semester = Semester.S2;
            }
            case 3 ->{ 
                this.semester = Semester.S3;
            }
            case 4 ->{ 
                this.semester = Semester.S4;
            }
            case 5 ->{ 
                this.semester = Semester.S5;
            }
            case 6 ->{ 
                this.semester = Semester.S6;
            }
            case 7 ->{ 
                this.semester = Semester.S7;
            }
            case 8 ->{ 
                this.semester = Semester.S8;
            }
            default -> {
                this.semester = null;
            }
        };
        this.course = course;
        this.resource_link = resource_link;
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Semester getSemester() {
        return this.semester;
    }
    
    public void setSemester(Semester semester) {
        this.semester = semester;
    }
    
    public String getCourse() {
        return this.course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public ResLink getResource_link() {
        return this.resource_link;
    }
    
    public void setResource_link(ResLink resource_link) {
        this.resource_link = resource_link;
    }
    
    @Override public String toString() {
        return this.title+" ---  "+this.getType();
    }

    // TODO change type to ResType
    public abstract ResType getType();
    
}
