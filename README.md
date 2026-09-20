# Sprint 1 — Exceptions

## What is this project about?

This project is part of Sprint 1 and focuses on **exception handling in Java**. The main goal is to make applications more robust by avoiding crashes when the user introduces wrong data or when the program tries to access something that does not exist.

The sprint is divided into different levels, and each one introduces new concepts step by step.

## Level 1 — Custom exceptions and error control

In this level I worked with **custom exceptions** and **collections**.

I created a `Product` class with a `name` and a `price`, and a `Sale` class that stores a list of products and calculates the total price. If the sale has no products, the program throws a custom exception called `EmptySaleException` with a clear message instead of crashing.

I also practised with `IndexOutOfBoundsException` by trying to access a position that does not exist in a list, and I captured it to show a friendly message.

Finally, I changed `EmptySaleException` so that it extends `RuntimeException` instead of `Exception`. This helped me understand the difference between **checked** and **unchecked** exceptions:

- **Checked exceptions** are verified at compile time. The programmer is forced to handle them with `try/catch` or to declare them with `throws`. They usually represent situations that can be recovered from, like reading a file.
- **Unchecked exceptions** (children of `RuntimeException`) are not verified at compile time. They usually represent programming errors, like accessing an invalid index or dividing by zero.

## Level 2 — Safe reading from the keyboard

In this level I created a utility class called `ConsoleReader` that reads data from the keyboard in a safe way.

The class uses a single `Scanner` object and provides several **static methods**, one for each data type:

- `readByte`, `readInt`, `readFloat` and `readDouble` — these handle `InputMismatchException` when the user writes something that is not a valid number.
- `readChar` — only accepts a single character, and throws a custom exception if the user writes more than one.
- `readString` — reads a full line and can validate a minimum length.
- `readYesNo` — returns `true` if the user writes `"s"` and `false` if they write `"n"`. Any other input throws a custom exception.

All methods show a custom message, validate the input and keep asking until the value is correct.

## Main ideas I learned

- How to create and use **custom exceptions**.
- The difference between **checked** and **unchecked** exceptions.
- How to avoid crashes when the user introduces wrong data.
- How to design **reusable static methods** with a clear structure.
- The importance of separating responsibilities: input reading, validation and business logic.


