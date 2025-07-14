# 🛫 Dummy Ticket Booking Automation using Selenium

This project automates the complete ticket booking workflow on [DummyTicket.com](https://www.dummyticket.com/) using **Selenium WebDriver** and **Java**. The script simulates booking dummy flight tickets for **visa application** or **prank** purposes, including all form fields and dropdown selections for two passengers.

## 👩‍💻 About the Project

As an **aspiring Automation Tester (fresher)**, I built this real-world automation project to strengthen my Selenium skills and handle complex form interactions, such as:

- Multi-passenger data entry
- Dynamic calendar handling (DOB, travel dates)
- Select dropdowns with `Select` class
- Custom dropdowns with keyboard simulation
- Delivery options and billing form automation
- Form submission and clean browser exit

This project demonstrates how an end-to-end test can be built without any testing framework — purely using Selenium’s native methods.

---

## 🚀 Tools & Technologies Used

| Tool/Tech       | Description                                      |
|-----------------|--------------------------------------------------|
| Java            | Programming language                             |
| Selenium WebDriver | For browser automation                         |
| ChromeDriver    | WebDriver implementation for Chrome browser      |
| XPath           | Locators to access web elements                  |
| Select Class    | To handle dropdowns                              |
| Actions Class   | For keyboard simulation (ESC, Enter, etc.)       |

---

## 🧪 Test Plan

**Test Type**: Functional UI Automation  
**Target Site**: [DummyTicket.com](https://www.dummyticket.com/)  
**Test Objective**: Validate the ticket booking form with multi-passenger and billing information.

---

## ✅ Test Scenarios Covered

1. Navigate to the ticket booking page
2. Enter primary and secondary passenger details
3. Handle dropdowns and dynamic combo boxes
4. Select travel type, source, and destination cities
5. Enter departure and return dates using calendar picker
6. Fill billing details with address and contact info
7. Submit the form by clicking **Place Order**

---

## 📋 Sample Test Cases

| ID   | Description                                | Expected Result                             |
|------|--------------------------------------------|---------------------------------------------|
| TC01 | Navigate to booking form                   | Form loads without issues                   |
| TC02 | Fill DOB using dropdown                    | Correct DOB appears in the field            |
| TC03 | Select "Add Passenger" and fill details    | Secondary form appears and accepts inputs   |
| TC04 | Choose destination cities and dates        | Form accepts both values correctly          |
| TC05 | Click Place Order                          | Redirects to payment page                   |

---

## 📹 Demo Recording

> 🎥 Watch the full test execution  


