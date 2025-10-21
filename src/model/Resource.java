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