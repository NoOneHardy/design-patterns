# Factory Method Pattern - TypeScript Implementation

## What is the Factory Method Pattern?

The Factory Method pattern is a **creational design pattern** that provides an interface for creating objects in a parent class, but allows subclasses to alter the type of objects that will be created.

Imagine you're playing a video game where different spawners create different types of mobs (creatures). Each spawner (subclass) knows how to create its specific mob type, but they all follow the same spawning process (the factory method).

## When to Use It?

Use the Factory Method pattern when:
- You don't know beforehand the exact types and dependencies of the objects your code should work with
- You want to provide users of your library or framework with a way to extend its internal components
- You want to centralize object creation logic while allowing flexibility in what gets created

## How Does It Work?

The pattern consists of four main components:

1. **Product Interface** (`Mob`): Defines the common interface for all objects that can be created
2. **Concrete Products** (`Zombie`, `Pig`): Specific implementations of the Product interface
3. **Creator Class** (`Spawner`): Declares the factory method that returns new product objects
4. **Concrete Creators** (`ZombieSpawner`, `PigSpawner`): Override the factory method to return different types of products

## This Example: Minecraft-Style Mob Spawners

In this implementation, we simulate a game with different mob spawners:

- **Spawner (Abstract Creator)**: The parent class that defines the `spawnMob()` method and declares the abstract `createMob()` factory method
- **ZombieSpawner (Concrete Creator)**: Creates `Zombie` mobs
- **PigSpawner (Concrete Creator)**: Creates `Pig` mobs
- **Mob (Product Interface)**: Common interface for all mobs with methods like `spawn()` and `walk()`
- **Zombie & Pig (Concrete Products)**: Specific types of mobs with their own behaviors

## Project Structure

```
src/
├── main.ts                    # Main application entry point
├── spawner/                   # Creator classes (spawners)
│   ├── spawner.ts            # Abstract creator with factory method
│   ├── zombie.spawner.ts     # Concrete creator for zombie mobs
│   └── pig.spawner.ts        # Concrete creator for pig mobs
├── mobs/                      # Product classes
│   ├── mob.ts                # Product interface
│   ├── zombie.ts             # Concrete product: Zombie
│   └── pig.ts                # Concrete product: Pig
├── items/                     # Supporting classes
│   └── material.ts           # Enum for armor materials
└── armor/                     # Supporting classes
    └── armor-inventory.ts    # Armor inventory for mobs
```

## How to Run

### Prerequisites
- Node.js 18 or higher
- npm or yarn

### Install Dependencies

```bash
cd factory-method/typescript
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

When you run the application:
1. A random spawner (either ZombieSpawner or PigSpawner) is selected
2. The spawner creates its specific mob using the factory method
3. The mob spawns and walks, displaying appropriate messages

This demonstrates how different spawners can create different types of mobs using the same interface.

## Key Benefits

✅ **Single Responsibility Principle**: The code that creates mobs is separated from the code that uses them

✅ **Open/Closed Principle**: You can introduce new types of mobs without breaking existing code

✅ **Type Safety**: TypeScript's type system ensures type safety throughout the creation process

✅ **Loose Coupling**: The client code works with mobs through their common interface, not their concrete classes

## Learning Points

- The `Spawner` class defines a template method (`spawnMob()`) that calls the factory method (`createMob()`)
- Each concrete spawner (e.g., `ZombieSpawner`) implements the factory method to create its specific mob type
- The client code (`main.ts`) doesn't need to know which specific mob class it's working with
- New mob types can be added by creating new concrete spawners and mob classes without modifying existing code
- The factory method pattern is particularly useful in game development for creating different types of entities

## Code Example

```typescript
// Using the pattern
const spawner: Spawner = new ZombieSpawner();
const mob: Mob = spawner.spawnMob(); // Returns a Zombie
mob.walk(); // Zombie-specific walking behavior

// The beauty: same interface, different implementation
const anotherSpawner: Spawner = new PigSpawner();
const anotherMob: Mob = anotherSpawner.spawnMob(); // Returns a Pig
anotherMob.walk(); // Pig-specific walking behavior
```
