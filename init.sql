-- SQLite insert script for 'resources' table, using actual links
CREATE TABLE IF NOT EXISTS resources (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    semester INTEGER CHECK (semester BETWEEN 1 AND 8),
    courseid TEXT,
    type TEXT NOT NULL CHECK (type IN ('publishedpaper','ytvideo','onlinecourse','mooc','book','popsci')),
    difficulty TEXT,
    url TEXT NOT NULL CHECK (url LIKE 'https://%.%')
);

INSERT INTO resources (title, semester, courseid, type, difficulty, url) VALUES
('Google''s Python Class', 1, 'PCCCS101', 'onlinecourse', 'beginner', 'https://developers.google.com/edu/python'),
('Discrete Mathematics: An Open Introduction', 1, 'BSMAT102', 'book', 'intermediate', 'https://open.umn.edu/opentextbooks/textbooks/394'),
('Computer Networking Full Course (YouTube)', 1, 'EST102', 'ytvideo', 'beginner', 'https://www.youtube.com/watch?v=IPvYjXCsTg8'),
('Logic Circuits - What Are They Used For?', 1, 'PCCEE103', 'popsci', 'beginner', 'https://botland.store/blog/logic-circuits-what-are-they-and-what-are-they-used-for/'),
('Journal of Advances in Mathematics and Computer Science', 1, 'BSMAT102', 'publishedpaper', 'advanced', 'https://journaljamcs.com'),

('Data Structures And Algorithms Visually Explained', 2, 'PCCCS201', 'ytvideo', 'beginner', 'https://www.youtube.com/watch?v=4FO9uVC2hbE'),
('Discrete Mathematical Structures (G. Shanker Rao PDF)', 2, 'BSPHY202', 'book', 'intermediate', 'https://dpvipracollege.ac.in/wp-content/uploads/2023/01/Discrete-Mathematical-Structures-2nd-Ed.pdf'),
('Free OOP using C++ Course - DataFlair', 2, 'PCCCS202', 'onlinecourse', 'beginner', 'https://data-flair.training/courses/free-oop-cpp-course-bca-hindi/'),
('Foundations of Electrical Engineering - EdX', 2, 'PCCEE204', 'mooc', 'intermediate', 'https://www.edx.org/learn/electrical-engineering'),
('Logic in Artificial Intelligence Research Paper', 2, 'PCCCS202', 'publishedpaper', 'advanced', 'https://ijmcr.in'),

('Digital Logic Design Book (Wikipedia)', 3, 'PCCCS303', 'book', 'intermediate', 'https://en.wikipedia.org/wiki/Logic_gate'),
('Database Systems: Complete Online Course', 3, 'PCCCS304', 'onlinecourse', 'intermediate', 'https://www.coursera.org/learn/database-systems'),
('Algorithms Visualization (YouTube)', 3, 'PCCCS305', 'mooc', 'intermediate', 'https://www.youtube.com/watch?v=6iCHf7OZn6c'),
('Cloud Computing YouTube Lecture', 3, 'PCCCS306', 'ytvideo', 'beginner', 'https://www.youtube.com/watch?v=WSAk89X9ofy'),
('Graph Theory with Applications', 3, 'BSMAT301', 'publishedpaper', 'advanced', 'https://journaljamcs.com'),

('Operating Systems Course - EdX', 4, 'PCCCS401', 'onlinecourse', 'intermediate', 'https://www.edx.org/learn/operating-systems'),
('Software Engineering - Open Book', 4, 'PCCCS402', 'book', 'beginner', 'https://www.sebook.com'),
('Computer Networks Lab (YouTube)', 4, 'PCCCS403', 'ytvideo', 'beginner', 'https://www.youtube.com/watch?v=O4r6E8U-d50'),
('Compiler Design MOOC (Coursera)', 4, 'PCCCS404', 'mooc', 'advanced', 'https://www.coursera.org/learn/compiler-design'),
('Systems Performance Optimization (Paper)', 4, 'PCCCS401', 'publishedpaper', 'advanced', 'https://journaljamcs.com'),

('Machine Learning Foundations (Coursera)', 5, 'PCCCS501', 'mooc', 'intermediate', 'https://www.coursera.org/learn/machine-learning'),
('Data Mining and Analytics Book', 5, 'PCCCS502', 'book', 'intermediate', 'https://www.springer.com/gp/book/9783319051108'),
('AI Explained (YouTube)', 5, 'PCCCS503', 'ytvideo', 'beginner', 'https://www.youtube.com/watch?v=JMUxmLyrhSk'),
('Cloud Platform Development Course', 5, 'PCCCS504', 'onlinecourse', 'advanced', 'https://www.edx.org/learn/cloud-computing'),
('Recent Trends in Machine Learning (Paper)', 5, 'PCCCS501', 'publishedpaper', 'advanced', 'https://journaljamcs.com'),

('Cyber Security Awareness (YouTube)', 6, 'PCCCS601', 'ytvideo', 'beginner', 'https://www.youtube.com/watch?v=inWWhr5tnEA'),
('Big Data Tools Book (Springer)', 6, 'PCCCS602', 'book', 'advanced', 'https://www.springer.com/gp/book/9783662549719'),
('IoT System Design MOOC', 6, 'PCCCS603', 'mooc', 'intermediate', 'https://www.coursera.org/learn/iot');
