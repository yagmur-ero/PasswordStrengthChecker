# 🔐 Password Strength Checker (Java)

This is a simple Java console application that checks the validity and strength of a user-entered password. It evaluates the password based on multiple criteria and provides feedback accordingly.

---

## 🚀 Features

- Accepts password input from the user (up to 3 attempts)
- Validates the password against the following rules:
  - Minimum length of 8 characters
  - At least one uppercase letter
  - At least one lowercase letter
  - At least one digit
  - At least one special character
- Displays specific feedback for missing criteria
- Evaluates overall password strength:
  - Strong
  - Average
  - Weak

---

## 📦 File Structure
PasswordStrengthChecker/ ├── opensource2.java ├── README.md ├── .gitignore └── LICENSE

---

## 🛠️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/PasswordStrengthChecker.git

2. Make sure Java 11 or higher is installed
3. Compile and run the program:
javac opensource2.java
java opensource2


4. Enter a password when prompted and view the feedback

## 📌 Sample Output
Enter the password: abc123
Your password should have at least one Uppercase Letter.
Your password should have at least 1 special character.
Password Not Accepted!
Remaining attempts: 2


Enter the password: Abc123!
Password Accepted!
Your password is strength enough!


## 📄 License
This project is licensed under the MIT License. Feel free to use, modify, and distribute it.

## 🤝 Contributing
Pull requests and issues are welcome! Please keep your code clean and well-commented.

## 👩‍💻 Author
Created by Yağmur – a beginner Java developer exploring open source and backend fundamentals.

---





