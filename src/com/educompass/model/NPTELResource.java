package com.educompass.model;

public class NPTELResource extends Resource {
    int nptel_year;

    public NPTELResource(Integer id, String title, Semester semester, String course, ResLink resource_link, int nptel_year) {
        super(id, title, semester, course, resource_link);
        this.nptel_year = nptel_year;
    }

public NPTELResource(Integer id, String title, int semester, String course, ResLink resource_link, int nptel_year) {
        super(id, title, semester, course, resource_link);
        this.nptel_year = nptel_year;
    }

    @Override
    public ResType getType() {
        return ResType.NPTEL;
    }

}