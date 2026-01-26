# Adapter Pattern - Java Implementation

## What is the Adapter Pattern?

The Adapter pattern is a **structural design pattern** that allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by wrapping one object and providing an interface that the client expects.

Think of it like a travel adapter for electrical outlets: different countries have different outlet shapes, but a travel adapter allows you to plug your device into any outlet by converting the plug shape to match the outlet.

## When to Use It?

Use the Adapter pattern when:
- You want to use an existing class, but its interface doesn't match what you need
- You need to create a reusable class that cooperates with classes that don't have compatible interfaces
- You want to use several existing subclasses, but it's impractical to adapt their interface by subclassing each one
- You need to integrate a third-party library or legacy code with your application

## How Does It Work?

The pattern consists of four main components:

1. **Target** (`Block`): The interface that the client expects to work with
2. **Client** (`World`): The class that uses the target interface
3. **Adaptee** (`ArmorStand`): The existing class with an incompatible interface
4. **Adapter** (`ArmorStandBlockAdapter`): Converts the adaptee's interface to the target interface

## This Example: Minecraft Blocks and Entities

In this implementation, we simulate placing objects in a Minecraft-style world:

**The Problem:**
- The `World` class can only place `Block` objects using the `place()` method
- We have `Entity` objects (like `ArmorStand`) that use a `spawn()` method instead
- We can't directly use entities where blocks are expected - the interfaces are incompatible!

**The Solution:**
- The `ArmorStandBlockAdapter` wraps an `ArmorStand` entity
- It extends `Block`, so the `World` accepts it
- When `place()` is called on the adapter, it translates this to `spawn()` on the wrapped entity

## Project Structure

```
src/main/java/ch/no1hardy/
├── App.java                              # Main application demonstrating the pattern
├── World.java                            # Client class that uses Block objects
├── block/
│   └── Block.java                       # Target interface with place() method
├── entity/
│   ├── Entity.java                      # Adaptee base class with spawn() method
│   └── ArmorStand.java                  # Concrete adaptee to be adapted
└── adapter/
    └── ArmorStandBlockAdapter.java      # Adapter that makes ArmorStand look like Block
```

## How to Run

### Prerequisites
- Java 17 or higher
- Gradle (or use the included Gradle wrapper)

### Build and Run

```bash
# Build the project
./gradlew :adapter:java:build

# Run the application
./gradlew :adapter:java:run
```

### What to Expect

When you run the application, you'll see three scenarios:

1. **Normal Usage**: Placing a regular `Block` in the world (no adapter needed)
2. **The Problem**: Why we can't directly place an `ArmorStand` (incompatible interface)
3. **The Solution**: Using the adapter to place an `ArmorStand` as if it were a `Block`

**Output:**
```
=== Scenario 1: Placing a regular Block ===
You have placed a block!

=== Scenario 2: Why we need an adapter ===
Cannot call world.place(armorStand) - ArmorStand is not a Block!
ArmorStand has spawn() but World expects place()

=== Scenario 3: Using the Adapter Pattern ===
You have spawned an entity!

Success! The adapter allowed us to place an ArmorStand
in the World without modifying World, Block, or ArmorStand classes.
```

## Key Benefits

✅ **Reusability**: Use existing classes even when their interfaces don't match

✅ **Open/Closed Principle**: Add new adapters without modifying existing code

✅ **Single Responsibility Principle**: Interface conversion is separated into its own class

✅ **Flexibility**: Can create multiple adapters for different adaptees

## Pattern Flow

```
Client (World)
    ↓ calls place()
Adapter (ArmorStandBlockAdapter)
    ↓ translates to spawn()
Adaptee (ArmorStand)
```

1. The `World` (client) calls `place()` on what it thinks is a `Block`
2. The `ArmorStandBlockAdapter` (adapter) receives this call
3. The adapter translates `place()` into `spawn()`
4. The `ArmorStand` (adaptee) executes its `spawn()` method
5. The result appears to the client as if a block was placed

## Learning Points

- **Interface Compatibility**: The adapter makes incompatible interfaces work together without modifying the original classes
- **Composition Over Inheritance**: The adapter wraps the adaptee using composition (has-a relationship)
- **Transparent to Client**: The `World` class doesn't know it's working with an adapter - it just sees a `Block`
- **No Modification Required**: Neither `World`, `Block`, nor `ArmorStand` need to be changed
- **Method Translation**: The adapter's key role is translating method calls from one interface to another

## Real-World Use Cases

- **Legacy System Integration**: Adapting old code to work with new systems
- **Third-Party Libraries**: Making external libraries work with your application's interfaces
- **API Versioning**: Supporting multiple versions of an API
- **Cross-Platform Development**: Adapting platform-specific code to a common interface
- **Database Drivers**: JDBC adapters that make different databases work with Java applications
