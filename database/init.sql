
delete from resources;
delete from sqlite_sequence where name='resources';

INSERT INTO resources (resource_title, resource_source, semester, course, resource_type, resource_link, course_price) VALUES
        ('Computer Science for Web Programming', 'edX', 4, 'Web Technologies', 'onlinecourse', 'https://www.edx.org/course/computer-science-for-web-programming', 24503),
        ('Fundamentals of Computer Science', 'edX', 1, 'Fundamentals', 'onlinecourse', 'https://www.edx.org/course/fundamentals-of-computer-science', 52456),
        ('C++ Programming: Basic Skills', 'edX', 2, 'C++ Programming', 'onlinecourse', 'https://www.edx.org/course/c-programming-basic-skills', 11657);

INSERT INTO resources (resource_title, resource_source, semester, course, resource_type, resource_link) VALUES
        ('freeCodeCamp', 'GitHub', 1, 'Full Stack', 'githubrepo', 'https://github.com/freeCodeCamp/freeCodeCamp'),
        ('EbookFoundation/free-programming-books', 'GitHub', 4, 'Learning Resources', 'githubrepo', 'https://github.com/EbookFoundation/free-programming-books'),
        ('Coding Interview University', 'GitHub', 7, 'Interview Preparation', 'githubrepo', 'https://github.com/jwasham/coding-interview-university');

INSERT INTO resources (resource_title, resource_source, semester, course, resource_type, resource_link, nptel_year) VALUES
        ('Theory of Computation', 'NPTEL', 4, 'Theory of Computation', 'nptel', 'https://onlinecourses.nptel.ac.in/noc25_cs119/preview', 2025),
        ('Programming in Modern C++', 'NPTEL', 2, 'C++ Programming', 'nptel', 'https://nptel.ac.in/courses/106106146', 2025),
        ('Introduction to Machine Learning', 'NPTEL', 8, 'Machine Learning', 'nptel', 'https://nptel.ac.in/courses/106106139', 2025);

insert into resources(resource_title, resource_source, semester, course, resource_type, resource_link, book_price) 
values 
        ('OSTEP', 'University of Winconsin-Madison', 4, 'Operating Systems' , 'book', 'https://ostep.org', 0.0),
        ('21st century C', 'O''REILLY PUBLISHING', 2, 'Progamming in C', 'book', 'https://www.amazon.in/21st-Century-Tips-New-School-ebook/dp/B00NYBRH30', 1500.0),
        ('Introduction to Algorithms', 'O''Reilly Publishing', 3, 'Data Structures and Algorithms', 'book', 'https://www.oreilly.com/library/view/introduction-to-algorithms', 950),
        ('Computer Systems: A Programmer’s Perspective', 'Pearson', 4, 'Computer Organization', 'book', 'https://www.pearson.com/computer-systems', 800),
        ('Database System Concepts', 'McGraw-Hill Education', 5, 'Database Management Systems', 'book', 'https://www.mheducation.com/database-systems', 700),
        ('Head First Java', 'O''Reilly Publishing', 3, 'Principles of Programming Languages', 'book', 'https://www.oreilly.com/library/view/head-first-java', 620),
        ('Clean Code', 'Pearson', 6, 'Software Engineering', 'book', 'https://www.pearson.com/clean-code', 750),
        ('The Pragmatic Programmer', 'Pearson', 4, 'Object-Oriented Programming', 'book', 'https://www.pearson.com/pragmatic-programmer', 670),
        ('Code Complete', 'Microsoft Press', 7, 'Software Engineering', 'book', 'https://www.microsoftpressstore.com/code-complete', 650),
        ('Cryptography Made Simple', 'Springer', 8, 'Cryptography & Network Security', 'book', 'https://www.springer.com/cryptography', 1200),
        ('Practical Programming: Python 3.6', 'O''Reilly Publishing', 3, 'Principles of Programming Languages', 'book', 'https://www.oreilly.com/library/view/practical-programming', 550),
        ('Operating System Concepts', 'John Wiley', 5, 'Operating Systems', 'book', 'https://www.wiley.com/operating-systems', 999),
        ('Discrete Mathematics', 'Pearson', 1, 'Discrete Structures', 'book', 'https://www.pearson.com/discrete-math', 450),
        ('Fundamentals of Data Structures in C++', 'McGraw-Hill Education', 2, 'Data Structures', 'book', 'https://www.mheducation.com/data-structures-cpp', 510),
        ('Digital Systems Design', 'Pearson', 2, 'Digital Electronics and Logic Design', 'book', 'https://www.pearson.com/digital-systems', 580),
        ('Compiler Design', 'O''Reilly Publishing', 7, 'Compiler Design', 'book', 'https://www.oreilly.com/library/view/compiler-design', 600),
        ('Introduction to AI', 'Packt Publishing', 8, 'Introduction to AI and Machine Learning', 'book', 'https://www.packtpub.com/introduction-ai', 1100),
        ('Mobile Computing', 'Pearson', 8, 'Mobile Computing', 'book', 'https://www.pearson.com/mobile-computing', 690),
        ('Cloud Computing', 'O''Reilly Publishing', 6, 'Cloud Computing', 'book', 'https://www.oreilly.com/library/view/cloud-computing', 860),
        ('Object-Oriented Programming with C++', 'McGraw-Hill Education', 4, 'Object-Oriented Programming', 'book', 'https://www.mheducation.com/oop-cpp', 540),
        ('Data Communication and Networking', 'McGraw-Hill Education', 5, 'Computer Networks', 'book', 'https://www.mheducation.com/data-communication', 700);
     -- ('Distributed Database', 'John Wiley', 6, 'Distributed Database', 'book', 'https://www.wiley.com/distributed-database', 900);


INSERT INTO resources (resource_title, resource_source, semester, course, resource_type, resource_link, pdf_pages) VALUES
        ('CPU and Memory Architecture', 'USENIX', 3, 'Computer Organization', 'pdf', 'https://www.usenix.org/system/files/1407_05-08-CPU_Memory.pdf', 25),
        ('A Case for Data Science', 'Journal of Machine Learning Research', 7, 'Machine Learning', 'pdf', 'https://jmlr.org/papers/volume17/15-237/15-237.pdf', 20),
        ('Software Engineering Papers', 'IEEE Access', 6, 'Software Engineering', 'pdf', 'https://ieeexplore.ieee.org/iel7/6287639/6514899/06519955.pdf', 32),
        ('Deep Learning Review', 'Journal of Artificial Intelligence Research', 8, 'Artificial Intelligence', 'pdf', 'https://www.jair.org/media/4992/live-4992-9763-jair.pdf', 44),
        ('Graph Drawing Algorithms', 'Journal of Graph Drawing Algorithms and Applications', 5, 'Graph Theory', 'pdf', 'https://jgaa.info/accepted/2022/Bekos2022.26.3.pdf', 18),
        ('Database Transactions', 'VLDB Endowment', 5, 'Database Management Systems', 'pdf', 'https://www.vldb.org/pvldb/vol15/p2458-saurabh.pdf', 16),
        ('Kernel Methods in Machine Learning', 'JAIR', 8, 'Machine Learning', 'pdf', 'https://www.jair.org/media/953/live-953-1845-jair.pdf', 35),
        ('Modern Compiler Development', 'EPTCS', 7, 'Compiler Design', 'pdf', 'https://arxiv.org/pdf/1907.01786.pdf', 27),
        ('Automata Theory Notes', 'Logical Methods in Computer Science', 4, 'Theory of Computation', 'pdf', 'https://lmcs.episciences.org/7266/pdf', 38),
        ('Network Security Essentials', 'IEEE Access', 8, 'Cyber Security', 'pdf', 'https://ieeexplore.ieee.org/stamp/stamp.jsp?tp=&arnumber=8425687', 22),
        ('Big Data Technologies', 'PeerJ Computer Science', 7, 'Big Data Analytics', 'pdf', 'https://peerj.com/articles/cs-312.pdf', 29),
        ('Design and Analysis of Algorithms', 'OASIcs', 3, 'Design and Analysis of Algorithms', 'pdf', 'https://drops.dagstuhl.de/opus/volltexte/2020/11731/pdf/LIPIcs-2020-11731.pdf', 17),
        ('Distributed Systems Research', 'LNCS', 6, 'Distributed Systems', 'pdf', 'https://link.springer.com/content/pdf/10.1007%2F978-3-030-29436-8_28.pdf', 23),
        ('Data Communication Fundamentals', 'Procedia Computer Science', 5, 'Computer Networks', 'pdf', 'https://www.sciencedirect.com/science/article/pii/S1877050920306174/pdf', 12),
        ('Introduction to Discrete Mathematics', 'JOSIS', 2, 'Discrete Structures', 'pdf', 'https://josis.org/index.php/josis/article/download/334/280', 21),
        ('Digital Logic Circuits', 'Open Access Series in Informatics', 2, 'Digital Electronics', 'pdf', 'https://drops.dagstuhl.de/opus/volltexte/2018/8590/pdf', 15),
        ('Fundamentals of Cryptography', 'Journal on Satisfiability, Boolean Modeling and Computation', 7, 'Cryptography and Network Security', 'pdf', 'https://satjournal.org/static/sat22/papers/sat22-paper24.pdf', 13),
        ('Object Oriented Principles', 'PMLR', 4, 'Object Oriented Programming', 'pdf', 'https://proceedings.mlr.press/v150/lange22a/lange22a.pdf', 11),
        ('Introduction to Operating Systems', 'Lecture Notes in Computer Science', 5, 'Operating Systems', 'pdf', 'https://link.springer.com/content/pdf/10.1007/978-3-030-45685-8.pdf', 37),
        ('Cloud Computing Concepts', 'Open Access Series in Informatics', 6, 'Cloud Computing', 'pdf', 'https://drops.dagstuhl.de/opus/volltexte/2017/7013/pdf', 19);

INSERT INTO resources (resource_title, resource_source, semester, course, resource_type, resource_link, video_hrs) VALUES
        ('Data Structures Full Course', 'freeCodeCamp.org', 3, 'Data Structures', 'ytvideo', 'https://www.youtube.com/watch?v=RBSGKlAvoiM', 8.3),
        ('Operating Systems Complete Playlist', 'Gate Smashers', 5, 'Operating Systems', 'ytvideo', 'https://www.youtube.com/watch?v=QpLT5rGcNeg', 10.5),
        ('Database Management Systems (DBMS) Full Course', 'Neso Academy', 5, 'Database Management Systems', 'ytvideo', 'https://www.youtube.com/watch?v=HXV3zeQKqGY', 11.2),
        ('Theory of Computation Course', 'Gate Smashers', 4, 'Theory of Computation', 'ytvideo', 'https://www.youtube.com/watch?v=Qa9WZxYczQE', 6.7),
        ('Computer Networks Full Course', 'Knowledge Gate', 5, 'Computer Networks', 'ytvideo', 'https://www.youtube.com/watch?v=3EStxvDYpIo', 14.1),
        ('Design and Analysis of Algorithms', 'NPTEL HRD', 4, 'Design and Analysis of Algorithms', 'ytvideo', 'https://www.youtube.com/watch?v=6Lix-Za6IKw', 9.6),
        ('Software Engineering Complete', 'Jenny''s Lectures CS/IT NET&JRF', 6, 'Software Engineering', 'ytvideo', 'https://www.youtube.com/watch?v=8yjkWGRlUmY', 7.0),
        ('Compiler Design Complete', 'Gate Smashers', 7, 'Compiler Design', 'ytvideo', 'https://www.youtube.com/watch?v=QWg6GJWDuLw', 8.8),
        ('Discrete Mathematics Complete Playlist', 'Gate Smashers', 3, 'Discrete Structures', 'ytvideo', 'https://www.youtube.com/watch?v=aqLmA388KsI', 7.9),
        ('Artificial Intelligence Full Course', 'Simplilearn', 8, 'Artificial Intelligence', 'ytvideo', 'https://www.youtube.com/watch?v=JMUxmLyrhSk', 10.3);


INSERT INTO resources (resource_title, resource_source, semester, course, resource_type, resource_link, vidcount) VALUES
        ('Harvard CS50 2025 Full Course', 'CS50 Harvard', 1, 'Introduction to Programming', 'ytplaylist', 'https://www.youtube.com/watch?v=8mAITcNt710', 13),
        ('C++ Programming Tutorials Playlist', 'thenewboston', 3, 'Programming', 'ytplaylist', 'https://www.youtube.com/playlist?list=PL6gx4Cwl9DGDQ5Drb_Ilm4xEytioTod3c', 73),
        ('Python Tutorials – Programming with Mosh', 'Programming with Mosh', 2, 'Python Programming', 'ytplaylist', 'https://www.youtube.com/playlist?list=PLTjRvDozrdlw5rPfZ_lnPmwG3YqioMqNu', 21);

