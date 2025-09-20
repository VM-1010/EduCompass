CREATE TABLE if not exists res(  
    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    semester TEXT,
    course TEXT,
    pages INTEGER,
    link TEXT NOT NULL,
    vidlen REAL,
    bookprice REAL
);