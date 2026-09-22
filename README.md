# Tasca S1.02 - Exceptions

## Description

Java project focused on exception handling. The main goal is to build robust applications that don't crash when facing common errors such as invalid user input or access to non-existent data.

The project follows a guided progression of three levels. Each level consolidates different concepts:

- Capturing and handling standard exceptions (`InputMismatchException`, `IndexOutOfBoundsException`).
- Creating custom exceptions for domain-specific errors.
- Validating user input to build safer and more user-friendly interfaces.
- Separating responsibilities by dividing code into classes with distinct behaviors.
- Applying best practices: clear naming, reusable methods, and proper error handling.

> **Note:** Only **Levels 1 and 2** have been implemented. Level 3 was not developed due to time constraints.

## Project Structure

src/
├── Nivel1/
│   └── Excepcions/
│       └── Personalitzades/
│           ├── Main.java
│           ├── Product.java
│           ├── Sale.java
│           └── EmptySaleException.java
│
└── Nivel2/
└── LecturaSegura/
├── Main.java
├── ConsoleReader.java
├── InvalidYesNoException.java
├── SingleCharacterException.java
└── StringTooShortException.java

## Level 1 - Custom Exceptions and Error Control

### Objective

Create a custom exception, learn how to throw and catch it, work with collections (`ArrayList<Product>`), and handle common errors like `IndexOutOfBoundsException`.

### Implementation

- **`Product`**: Represents an individual product with `name` and `price`.
- **`Sale`**: Contains a `List<Product>` and a `totalPrice`. The `calculateTotal()` method:
   - Checks if the product list is empty.
   - If empty, throws `EmptySaleException` with the message *"To make a sale you must add products first"*.
   - If not, sums the prices and stores the total.
- **`EmptySaleException`**: Extends `RuntimeException`, including the message in its constructor.
- **`Main`**: Runs three tests:
   1. Empty sale → catches `EmptySaleException`.
   2. Access to a non-existent index → catches `IndexOutOfBoundsException`.
   3. Successful sale → prints the total price.

### Checked vs Unchecked Exceptions

- **Checked exceptions** (extend `Exception`): Must be declared or caught at compile time. The compiler forces you to handle them.
- **Unchecked exceptions** (extend `RuntimeException`): Not required to be declared or caught. They usually indicate programming errors.

By making `EmptySaleException` extend `RuntimeException`, we avoid forcing the caller to handle it explicitly, which is more convenient for a domain-specific business rule.

## Level 2 - Safe Keyboard Reading

### Objective

Learn to capture and handle exceptions when reading user input, preventing the application from crashing due to incorrect entries. Practice with standard exceptions (`InputMismatchException`) and custom ones. Consolidate the use of static methods for reusable code.

### Implementation

- **`ConsoleReader`**: Utility class with a single static `Scanner` and static methods that:
   - Display a custom message.
   - Read and validate the input.
   - Show an error message and retry until valid.

| Method | Description |
|--------|-------------|
| `readByte(String)` | Reads a `byte`, handles `InputMismatchException`. |
| `readInt(String)` | Reads an `int`, handles `InputMismatchException`. |
| `readFloat(String)` | Reads a `float`, handles `InputMismatchException`. |
| `readDouble(String)` | Reads a `double`, handles `InputMismatchException`. |
| `readChar(String)` | Reads a single char; throws `SingleCharacterException` if more than one is entered. |
| `readString(String)` | Reads a string of at least 4 characters; throws `StringTooShortException`. |
| `readYesNo(String)` | Accepts only `"s"` (true) or `"n"` (false); throws `InvalidYesNoException` otherwise. |

- **Custom exceptions**: `SingleCharacterException`, `StringTooShortException`, `InvalidYesNoException` (all extend `Exception`).
- **`Main`**: Tests all seven methods interactively.
