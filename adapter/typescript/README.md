# Adapter Pattern - TypeScript Implementation

## What is the Adapter Pattern?

The Adapter pattern is a **structural design pattern** that allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by wrapping one object and providing an interface that the client expects.

Imagine you have a European phone charger but you're in the US - you need a plug adapter to convert the plug shape. The adapter pattern works the same way in code: it converts one interface into another that the client expects.

## When to Use It?

Use the Adapter pattern when:
- You want to use an existing class, but its interface doesn't match what you need
- You need to create a reusable class that cooperates with classes that don't have compatible interfaces
- You want to use several existing subclasses, but it's impractical to adapt their interface by subclassing each one
- You're integrating third-party libraries or legacy code with incompatible interfaces

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
- We can't directly use entities where blocks are expected - TypeScript's type system prevents it!

**The Solution:**
- The `ArmorStandBlockAdapter` wraps an `ArmorStand` entity
- It extends `Block`, so the `World` accepts it
- When `place()` is called on the adapter, it translates this to `spawn()` on the wrapped entity

## Project Structure

```
src/
├── main.ts                              # Main application demonstrating the pattern
├── world.ts                             # Client class that uses Block objects
├── block/
│   └── block.ts                        # Target interface with place() method
├── entity/
│   ├── entity.ts                       # Adaptee base class with spawn() method
│   └── armor-stand.ts                  # Concrete adaptee to be adapted
└── adapter/
    └── armor-stand-block.adapter.ts    # Adapter that makes ArmorStand look like Block
```

## How to Run

### Prerequisites
- Node.js 18 or higher
- npm or yarn

### Install Dependencies

```bash
cd adapter/typescript
npm install
```

### Build and Run

```bash
# Build the project
npm run build

# Run the application
npm start

# Or run directly with ts-node
npm run dev
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

✅ **Type Safety**: TypeScript's type system ensures the adapter properly implements the expected interface

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

## Code Example

```typescript
// The client expects Block objects
const world: World = new World();

// This entity can't be used directly
const armorStand: ArmorStand = new ArmorStand();
// world.place(armorStand); // ❌ Type error!

// Create an adapter to make it compatible
const adapter: ArmorStandBlockAdapter = new ArmorStandBlockAdapter(armorStand);
world.place(adapter); // ✅ Works! The adapter makes it compatible
```

## Learning Points

- **Interface Compatibility**: The adapter makes incompatible interfaces work together without modifying the original classes
- **Composition Over Inheritance**: The adapter wraps the adaptee using composition (has-a relationship)
- **Type Safety**: TypeScript ensures the adapter correctly implements the target interface
- **Transparent to Client**: The `World` class doesn't know it's working with an adapter - it just sees a `Block`
- **No Modification Required**: Neither `World`, `Block`, nor `ArmorStand` need to be changed
- **Method Translation**: The adapter's key role is translating method calls from one interface to another

## Real-World Use Cases

- **API Integration**: Adapting third-party API responses to your application's data models
- **Legacy Code**: Making old code work with new systems
- **Library Compatibility**: Wrapping external libraries to match your application's interface
- **Database ORMs**: Adapting different database drivers to a common interface
- **UI Frameworks**: Adapting different component libraries to work with your framework
- **Testing**: Creating test adapters to simulate external dependencies

## Adapter vs. Other Patterns

**Adapter vs. Decorator:**
- **Adapter**: Changes the interface of an object
- **Decorator**: Adds new functionality without changing the interface

**Adapter vs. Facade:**
- **Adapter**: Makes one interface compatible with another
- **Facade**: Provides a simplified interface to a complex subsystem

**Adapter vs. Proxy:**
- **Adapter**: Converts interfaces to make incompatible classes work together
- **Proxy**: Provides a surrogate with the same interface for access control or lazy initialization
