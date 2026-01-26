# Factory Method Pattern - Java Implementation

## What is the Factory Method Pattern?

The Factory Method pattern is a **creational design pattern** that provides an interface for creating objects in a parent class, but allows subclasses to alter the type of objects that will be created.

Think of it like different stores in a mall: each store (subclass) knows how to create its own specific products, but they all follow the same general process of "creating an item" (the factory method).

## When to Use It?

Use the Factory Method pattern when:
- You don't know beforehand the exact types and dependencies of the objects your code should work with
- You want to provide users of your library or framework with a way to extend its internal components
- You want to save system resources by reusing existing objects instead of rebuilding them each time

## How Does It Work?

The pattern consists of four main components:

1. **Product Interface** (`Item`): Defines the common interface for all objects that can be created
2. **Concrete Products** (`Apple`, `Jewellery`): Specific implementations of the Product interface
3. **Creator Class** (`Store`): Declares the factory method that returns new product objects
4. **Concrete Creators** (`FruitStore`, `Jeweler`): Override the factory method to return different types of products

## This Example: Mall Stores

In this implementation, we simulate a mall with different stores:

- **Store (Abstract Creator)**: The parent class that declares the `createItem()` factory method
- **FruitStore (Concrete Creator)**: Creates `Apple` items
- **Jeweler (Concrete Creator)**: Creates `Jewellery` items
- **Item (Product Interface)**: Common interface for all items
- **Apple & Jewellery (Concrete Products)**: Specific types of items

## Project Structure

```
src/main/java/ch/no1hardy/
├── App.java                    # Main application entry point
├── interior/                   # Creator classes (stores)
│   ├── Store.java             # Abstract creator with factory method
│   ├── FruitStore.java        # Concrete creator for fruit items
│   └── Jeweler.java           # Concrete creator for jewellery items
└── item/                      # Product classes
    ├── Item.java              # Product interface
    ├── Apple.java             # Concrete product: Apple
    └── Jewellery.java         # Concrete product: Jewellery
```

## How to Run

### Prerequisites
- Java 17 or higher
- Gradle (or use the included Gradle wrapper)

### Build and Run

```bash
# Build the project
./gradlew :factory-method:java:build

# Run the application
./gradlew :factory-method:java:run
```

### What to Expect

When you run the application:
1. You'll be prompted to choose between a Fruit Store or a Jeweler
2. Based on your choice, the appropriate store will create its specific item
3. The item will be used and its price will be displayed

This demonstrates how the same interface (`createItem()`) can produce different products depending on which store (concrete creator) is used.

## Key Benefits

✅ **Single Responsibility Principle**: The code that creates products is separated from the code that uses them

✅ **Open/Closed Principle**: You can introduce new types of products without breaking existing code

✅ **Loose Coupling**: The client code works with products through their common interface, not their concrete classes

## Learning Points

- The client code (`App.java`) doesn't need to know the specific class of the item it's working with
- Each store (creator) is responsible for instantiating its own type of item
- New product types can be added by creating new concrete creators without modifying existing code
- The factory method pattern delegates the instantiation logic to subclasses
