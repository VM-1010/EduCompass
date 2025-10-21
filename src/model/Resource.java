package model;

public class Resource {
    Integer id;
    Integer semester;
    String title;
    String type;
    String url;


    public Resource(Integer id, Integer semester, String title, String type, String url) {
        this.id = id;
        this.semester = semester;
        this.title = title;
        this.type = type;
        this.url = url;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSemester() {
        return this.semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new String("""
                    ID = %d
                    SEM = %d
                    TITLE = %s
                    TYPE = %s
                    URL = %s
                """.formatted(id, semester, title, type, url));
    }


}