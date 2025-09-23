package com.educompass.model;

public class PdfResource extends Resource {
    Integer pdf_pages;
    public PdfResource(Integer id, String title, Semester semester, String course, ResLink resource_link, Integer pdf_pages) {
            super(id, title, semester, course, resource_link);
            this.pdf_pages = pdf_pages;
        }

    public PdfResource(Integer id, String title, int semester, String course, ResLink resource_link, Integer pdf_pages) {
            super(id, title, semester, course, resource_link);
            this.pdf_pages = pdf_pages;
        }

    @Override
    public ResType getType() {
        return ResType.PDF;
    }
}
