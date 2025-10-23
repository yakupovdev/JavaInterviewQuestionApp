# 🧠 Java Interview Question App v1.0

#### Java Interview Question App is a simple console-based Java application for storing, adding, deleting, and listing Java interview questions.  

---

## 📁 Project Structure
```
src/
└── com.github.yakupovdev.javainterviewapp
├── cli/
│ ├── CommandsCli.java
│ └── InterviewQuestionCli.java
├── controller/
│ └── InterviewQuestionController.java
├── dao/
│ ├── IQuestionDao.java
│ └── inmemory/
│ └── InMemoryQuestionDaoImpl.java
├── dto/
│ └── InterviewQuestionDto.java
├── model/
│ └── InterviewQuestion.java
├── objects/
│ └── ObjectInitializer.java
├── service/
│ ├── InterviewQuestionService.java
│ └── mapper/
│ └── InterviewQuestionMapper.java
└── Main.java
```

---

## ⚙️ Features

✅ Add new interview questions  
✅ Delete questions by ID  
✅ List all saved questions  
✅ In-memory data storage (no database)  
✅ Clean, framework-independent architecture

---

## 🚀 How to Run

### 1️⃣ Clone the repository
```
git clone https://github.com/yakupovdev/JavaInterviewQuestionApp.git
cd JavaInterviewQuestionApp
```
### 2️⃣ Compile the project
```
javac -d out src/com/github/yakupovdev/javainterviewapp/**/*.java
```
### 3️⃣ Run the application
```
java -cp out com.github.yakupovdev.javainterviewapp.Main
```
### 🖥️ Example Console Session
```
======WELCOME TO JAVA INTERVIEW QUESTION======

Write the command like in brackets:
1. Add new interview question (add)
2. Delete interview question by Id (delete)
3. List of interview questions (list)
4. Exit from the App (exit)

Enter command:
add

======ADD QUESTION======
(to return, enter “menu”)

Enter question:
What is JVM?
Enter answer:
JVM is Java Virtual Machine.
Question added successfully!

Write the command like in brackets:
1. Add new interview question (add)
2. Delete interview question by Id (delete)
3. List of interview questions (list)
4. Exit from the App (exit)

Enter command:
list

======LIST QUESTION======
Count of questions: 1
Question{id=1, question='What is JVM?', answer='JVM is Java Virtual Machine.'}
```

---

## 👨‍💻 Author - Vyacheslav Yakupov

