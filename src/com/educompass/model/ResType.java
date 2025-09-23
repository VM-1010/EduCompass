package com.educompass.model;

public enum ResType {
    PDF("pdf"),VIDEO("ytvideo"),PLAYLIST("ytplaylist"),COURSE("onlinecourse"),
        TUTORIAL("onlinetutorial"),REPO("githubrepo"),BOOK("book"),NPTEL("nptel");

    private final String typename;

    private ResType(String typename) {
        this.typename = typename;
    }
    @Override public String toString() {
        return this.typename;
    }
}
