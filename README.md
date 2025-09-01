# EduCompass

EduCompass is a conceptual project aimed at helping Computer Science students **navigate their learning resources** more efficiently.  
Instead of manually digging through scattered notes, YouTube playlists, PDF dumps, and random links, EduCompass organizes them by **subject** and **semester**, providing a structured, centralized navigation tool.

---

## Project Vision
- Provide a **single platform** for CS students to find relevant study resources.
- Organize resources by **semester** and **subject**, reducing search time.
- Support multiple resource types (videos, PDFs, links, external materials).
- Offer a clean **desktop application** experience with Java Swing.
- Back resources with an **H2 database** for lightweight persistence.

---

## Planned Features
- **Resource Management**
  - Add, update, delete, and categorize learning resources.
  - Abstract design so new resource types (Drive links, external tools) can be added easily.
  
- **Search & Navigation**
  - Search by subject, semester, or resource type.
  - Provide quick links to open resources directly.

- **Error Handling**
  - Detect invalid or inaccessible resources gracefully.
  
- **Extensible Design**
  - Base `Resource` abstraction ensures code is modular and maintainable.
  
- **UI/UX**
  - Swing-based GUI for browsing and managing resources.
  - Clean, minimal, student-friendly layout.

- **Database**
  - H2 in-memory database for development and testing.
  - Potential to extend to persistent storage later.

---

## High-Level Architecture
- **Model Layer**: Represents core entities (Resource, Subject, Semester, ResourceType).  
- **Service Layer**: Manages operations like adding/finding resources, subject mappings, etc.  
- **Exception Layer**: Handles invalid or corrupted resource inputs.  
- **UI Layer** (planned): Swing-based desktop interface.  
- **Database Layer** (planned): H2 integration for lightweight persistence.  

---

## Future Scope
- Export/import resource collections for sharing between students.
- Tagging system for finer categorization (e.g., “DSA basics”, “OS lab”).
- Potential web or mobile extension.
- Collaborative features (ratings, comments, recommendations).

---

## Status
Currently under **design phase**: building class APIs and architecture.  
Next stages:  
1. Database integration with H2  
2. Swing GUI development  
3. Connecting UI with backend services  

---

## Academic Note
This project demonstrates **Object-Oriented Programming concepts** in Java:
- Abstraction, inheritance, and polymorphism (through the `Resource` hierarchy).
- Enums for structured domain definitions.
- Custom exceptions for validation.
- Modular package organization.
