# 🛒 SmartMart — Automated Supermarket System (Java Collection Framework Project)

A complete real-world supermarket simulation built using **Java Collection Framework**, **Generics**, **File Handling**, and various Java utility classes.  

--

## ⭐ Project Overview

SmartMart is India’s first AI-powered mini-supermarket simulation.  
The entire backend is built using Java Collections — representing customers, inventory, shopping cart, billing system, coupons, and file storage.

This project covers:

- ✔ ArrayList  
- ✔ HashSet  
- ✔ Vector  
- ✔ Hashtable  
- ✔ Stack  
- ✔ Enumeration  
- ✔ Iterator  
- ✔ StringTokenizer  
- ✔ Random / OTP  
- ✔ Scanner  
- ✔ FileWriter / FileReader / BufferedReader  
- ✔ Generics (Custom Product class)

---

## 🎯 Features

### **1. Customer Registration System**
- Accepts customer names through Scanner  
- Stores them in an ArrayList  
- Removes duplicates using HashSet  
- Displays the final unique customer list  

---

### **2. Product Inventory (Generics + Hashtable)**
- Products stored using a custom **Generic Product Class**  
- Inventory uses a **thread-safe Hashtable**  

---

### **3. Shopping Cart (Vector + Enumeration)**
- Cart uses Vector for synchronized operations  
- Items displayed using Enumeration  

---

### **4. Billing System (Stack + Iterator)**
- Items pushed into a billing stack  
- Corrections made using pop()  
- Final print using Iterator  

---

### **5. Coupon Parsing (StringTokenizer)**
- Coupons provided as CSV text  
- Parsed using StringTokenizer  

---

### **6. Secure Payment OTP**
- 6-digit OTP generated using Math.random()  

---

### **7. File Management**
- Final bill saved in `bill.txt` using FileWriter  
- Read from file using FileReader + BufferedReader  

---


---

## 🚀 How to Run

### **1. Compile**
javac SmartMartSystem.java

2. Run 
java SmartMartSystem

## 📝 Sample bill.txt Output

## SMARTMART FINAL BILL
## ---------------------
## Milk
## Bread
## Butter
