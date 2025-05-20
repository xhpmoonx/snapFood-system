# SnapFood System

SnapFood is a simple food ordering system built in Java. It allows clients and customers to interact with items, manage invoices, and simulate core operations of a digital food service backend.

## 📦 Project Structure

```
Food/
├── pom.xml                           # Maven project descriptor
├── src/
│   └── main/java/com/mycompany/Food/
│       ├── Client.java
│       ├── Customer.java
│       ├── HELP.java
│       ├── Invoice.java
│       ├── InvoiceLine.java
│       ├── Item.java
│       └── MainClass.java
└── target/                           # Compiled classes and Maven output
```

## 🚀 How to Run

### 1. Prerequisites
- Java JDK 11+
- Apache Maven

### 2. Build the Project
```bash
cd Food
mvn clean compile
```

### 3. Run the Application
```bash
mvn exec:java -Dexec.mainClass="com.mycompany.Food.MainClass"
```

> You may need to add the Maven Exec Plugin to your `pom.xml` if not already included.

## 👥 Roles and Responsibilities

- **Customer**: Search and view items, manage profile and address, and place orders.
- **Client**: Manage item inventory, user data, and assist customers.

## 📋 Use Case Overview (Textual)

```plaintext
START
│
├── Customer
│   ├── Verify password
│   │   ├── Incorrect password → retry
│   │   └── Correct password
│   ├── View profile
│   ├── Search items
│   ├── Get help
│   ├── View & Add item to bill
│   │   ├── If not enough → warn
│   │   └── If enough → add item
│   ├── Add new address
│   ├── See invoice
│   └── Exit
│
├── Client
│   ├── Verify password
│   │   ├── Incorrect password → retry
│   │   └── Correct password
│   ├── Add item’s quantity
│   ├── View available items
│   ├── Search items
│   ├── Get help
│   ├── View users
│   ├── View profile
│   └── Exit
```
