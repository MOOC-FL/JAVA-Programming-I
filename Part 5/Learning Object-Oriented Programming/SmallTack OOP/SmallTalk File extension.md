# Smalltalk File Extensions

Unlike most programming languages, traditional Smalltalk environments do not use individual source code files for each class. Instead, code is stored in a centralized database known as the **Image**. The primary file extensions associated with Smalltalk are:
| Extension       | Purpose                                                                                              |
| :-------------- | :--------------------------------------------------------------------------------------------------- |
| **.image / .im** | The primary state file. Contains the entire live state of the environment: all objects, compiled code, and the IDE itself. |
| **.changes**    | A log file. Records every source code change you make in a human-readable format. Serves as a historical record.            |
| **.st**         | A source code export file. Created by "filing out" a package or class to exchange code or use with version control.         |
| **.s**          | *(Less common)* Sometimes used similarly to `.st`.                                                   |
## Primary File Extensions

### .image (or .im)
- **Purpose:** The main state file containing the entire live environment
- **Contents:** 
  - All compiled code
  - All objects and their current state
  - The complete development environment (IDE, debuggers, open windows)
  - Execution context and memory state

### .changes
- **Purpose:** A companion log file that records historical changes
- **Contents:**
  - Every source code modification made by the developer
  - Human-readable record of all method and class definitions
  - Chronological history of development changes

## Code Exchange Format

### .st
- **Purpose:** Source code export file for code exchange and version control
- **Contents:** Text-based representation of classes and methods created by "filing out" code from the image
- **Usage:** Used to transfer code between different Smalltalk images or store code in version control systems like Git

### .s (less common)
- Sometimes used as an alternative to `.st` for source code files

## How It Works: The Image-Based Environment

1. **Development occurs inside the image** - you work within a live environment
2. **Code modifications are immediate** - changes are compiled and stored in the running image
3. **The .changes file logs all modifications** automatically
4. **Saving preserves the entire state** in the .image file
5. **Restarting resumes exactly where you left off** - all objects and execution context are restored

## Modern Practices
While the image/changes model is fundamental to Smalltalk, modern practices also use:
- `.st` files for version control integration
- Package management systems that can export/import code as text files
- Tools that interface with Git and other version control systems using filed-out source code
