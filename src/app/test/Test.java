package app.test;

import app.resource.*;
// for Testing purposes
public class Test {
    public static void main(String[] args) {
        YoutubeLinkResource yt = new YoutubeLinkResource(Subject.Python, "https://youtu.be/rfscVS0vtbw?si=8JX2HBZRFR3RJIhF", Semester.S1);
        yt.open(); // opens the url in browser
    }
}
