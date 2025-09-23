CREATE TABLE IF NOT EXISTS resources (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    resource_title TEXT NOT NULL,
    resource_source TEXT NOT NULL,
    semester int check(semester between 1 and 8),
    course text,
    resource_type TEXT NOT NULL CHECK(resource_type IN (
        'pdf','videolink','playlistlink','onlinecourselink',
        'onlinetutorial','githubrepo','ebook','physicalbook','nptel')),
    resource_link TEXT NOT NULL CHECK(resource_link LIKE 'https://%.%'),
    pdf_pages INTEGER CHECK(resource_type = 'pdf' OR pdf_pages IS NULL OR pdf_pages >= 0),
    video_hrs REAL CHECK(resource_type = 'videolink' OR video_hrs IS NULL OR (video_hrs >= 0 AND video_hrs = ROUND(video_hrs,1))),
    vidcount INTEGER CHECK(resource_type = 'playlistlink' OR vidcount IS NULL OR vidcount >= 0),
    course_price REAL CHECK(resource_type IN ('onlinecourselink','onlinetutorial') OR course_price IS NULL OR course_price >= 0),
    book_price REAL CHECK(resource_type IN ('ebook','physicalbook') OR book_price IS NULL OR book_price >= 0),
    nptel_year INTEGER CHECK(resource_type = 'nptel' OR nptel_year IS NULL OR nptel_year >= 2000)
);



delete from resources;
delete from sqlite_sequence where name='resources';

