# Functional-and-Automation-Testing-of-an-E-commerce-Web-App
Implemented manual and automated QA testing for an e-commerce web platform (DemoBlaze). Automated login, cart, and checkout modules using Selenium WebDriver with PyTest, and generated detailed HTML reports to track execution results.
# 🛒 Functional and Automation Testing of an E-commerce Web App

## 🎯 Objective
To perform **manual and automated testing** on an e-commerce web application (DemoBlaze) to ensure functional correctness, smooth user experience, and regression stability.

## 🧰 Tools & Technologies
- Application Under Test:[DemoBlaze](https://www.demoblaze.com/)
- Manual Testing: Test Plan, Test Case, Bug Report (Excel)
- Automation Testing:Python, Selenium WebDriver, PyTest
- Reporting:HTMLTestRunner / Allure
- Version Control:Git & GitHub
- CI/CD:GitHub Actions
- Environment:ChromeDriver, Windows/Linux

---

## Test Scenarios Covered
### 🔹 Manual Testing
- User Registration & Login
- Product Search & Filter
- Add to Cart & Remove from Cart
- Checkout & Payment
- Logout functionality
- Negative Testing (invalid credentials, empty cart checkout)

### 🔹 Automation Testing
- `test_login.py` → Valid & Invalid Login
- `test_add_to_cart.py` → Adding multiple products
- `test_checkout.py` → End-to-end purchase flow
- `test_logout.py` → Verify logout redirects properly


