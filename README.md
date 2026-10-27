# Customer Receipt Generator (Slip.java)

A simple, command-line Java application that captures transaction details, including customer information, cashier details, items purchased, and individual item prices and calculates discounts, VAT, and the final payable amount before outputting a formatted receipt.

---

## Features

* **Interactive User Input**: Prompts the user to enter customer and cashier names, 3 purchased items, and individual item prices via standard input (`Scanner`).
* **Automated Calculations**:
  * Calculates the total base cost of items.
  * Applies a fixed **25% discount** (`DISC_AMOUNT = 0.25`).
  * Calculates **15% VAT** (`VAT = 0.15`) based on the discounted subtotal.
  * Computes the final total payable amount.
* **Formatted Receipt Output**: Displays a clean, readable receipt layout directly in the terminal console.

---

## Project Structure

```text
MyJavaProgrammes/
├── Slip.java       # Main Java source code containing receipt generation logic
├── README.md       # Project documentation
└── .gitignore      # Git ignore rules for Java compiled files
