# Decorator Pattern - Java Implementation

## What is the Decorator Pattern?

The Decorator pattern is a **structural design pattern** that allows you to add new behaviors to objects dynamically by placing them inside special wrapper objects called decorators. It provides a flexible alternative to subclassing for extending functionality.

Think of it like adding toppings to a pizza: each topping (decorator) wraps around the base pizza (or another decorated pizza) and adds its own behavior, without changing the pizza itself. You can stack multiple toppings in any combination to create exactly what you want.

## When to Use It?

Use the Decorator pattern when:
- You need to add responsibilities to individual objects dynamically and transparently, without affecting other objects
- Extension by subclassing is impractical (too many possible combinations would create an explosion of subclasses)
- You want to add or remove responsibilities from objects at runtime
- You need to combine several behaviors in various ways

## How Does It Work?

The pattern consists of four main components:

1. **Component** (`Eatable`): The interface that defines the common operations for both concrete components and decorators
2. **Concrete Components** (`Carrot`, `SpiderEye`, `PufferFish`): The basic objects that can be decorated
3. **Base Decorator** (`BaseEatableDecorator`): An abstract class that wraps a component and maintains a reference to it
4. **Concrete Decorators** (`PoisonEatableDecorator`, `NauseaEatableDecorator`): Classes that extend the base decorator to add specific behaviors

## This Example: Minecraft Food with Side Effects

In this implementation, we simulate eating food in a Minecraft-style game:

**The Problem:**
- Different foods can have different side effects (poison, nausea, etc.)
- We want to combine multiple effects on the same food item
- Creating a subclass for every possible combination would be impractical (PoisonedCarrot, NauseousCarrot, PoisonedNauseousCarrot, etc.)

**The Solution:**
- Each food item (`Carrot`, `SpiderEye`, `PufferFish`) implements the `Eatable` interface
- Decorators (`PoisonEatableDecorator`, `NauseaEatableDecorator`) also implement `Eatable`
- Decorators wrap food items (or other decorators) and add behavior before/after delegating to the wrapped object
- You can stack decorators to combine multiple effects in any order

## Project Structure

```
src/main/java/ch/no1hardy/
├── App.java                              # Main application demonstrating the pattern
├── food/
│   ├── Eatable.java                     # Component interface
│   ├── Carrot.java                      # Concrete component
│   ├── SpiderEye.java                   # Concrete component
│   └── PufferFish.java                  # Concrete component
└── decorator/
    ├── BaseEatableDecorator.java        # Base decorator class
    ├── PoisonEatableDecorator.java      # Concrete decorator adding poison effects
    └── NauseaEatableDecorator.java      # Concrete decorator adding nausea effects
```

## How to Run

### Prerequisites
- Java 17 or higher
- Gradle (or use the included Gradle wrapper)

### Build and Run

```bash
# Build the project
./gradlew :decorator:java:build

# Run the application (if you've added the run task to build.gradle.kts)
./gradlew :decorator:java:run

# Or run directly with Java
cd decorator/java
java -cp build/classes/java/main ch.no1hardy.App
```

### What to Expect

When you run the application, you'll see three scenarios:

1. **Plain food**: Eating a carrot without any decorators
2. **Single decorator**: Eating a spider eye with poison effects
3. **Stacked decorators**: Eating a puffer fish with both nausea and poison effects

**Output:**
```
Decorator Pattern Example

Eating a simple carrot:
You eat a carrot. Crunch!

Eating a decorated spider eye:
You don't feel any pain yet...
You eat a spider eye. Yuck!
You feel a sharp pain after eating this food.
You have been poisoned!!!!!

Eating a puffer fish with multiple decorators:
You don't feel any pain yet...
You don't feel nauseous yet...
You eat a puffer fish. Watch out for the spikes!
You feel nauseous after eating this food.
You feel a sharp pain after eating this food.
You have been poisoned!!!!!
```

## Key Benefits

✅ **More Flexible Than Inheritance**: Add or remove responsibilities at runtime

✅ **Avoids Feature-Laden Classes**: Keep base classes simple and add features through decorators

✅ **Single Responsibility Principle**: Divide functionality between classes with unique areas of concern

✅ **Composable**: Combine behaviors in various ways by stacking decorators

## Pattern Flow

```
Client (App)
    ↓ calls eat()
PoisonEatableDecorator
    ↓ adds "before" behavior, then calls eat()
NauseaEatableDecorator  
    ↓ adds "before" behavior, then calls eat()
PufferFish (Concrete Component)
    ↓ executes core behavior
    ↑ returns to NauseaEatableDecorator
NauseaEatableDecorator
    ↑ adds "after" behavior, returns to PoisonEatableDecorator
PoisonEatableDecorator
    ↑ adds "after" behavior, returns to client
```

1. The client creates a `PufferFish` object
2. It wraps it with `NauseaEatableDecorator`
3. Then wraps that with `PoisonEatableDecorator`
4. When `eat()` is called, the chain executes from outside to inside:
   - Poison decorator's "before" behavior
   - Nausea decorator's "before" behavior
   - PufferFish's core behavior
   - Nausea decorator's "after" behavior
   - Poison decorator's "after" behavior

## Learning Points

- **Transparent Wrapping**: Decorators implement the same interface as the objects they wrap, so they can be used interchangeably
- **Composition Over Inheritance**: Behavior is added through object composition rather than class inheritance
- **Runtime Flexibility**: You can add or remove decorators at runtime, unlike inheritance which is static
- **Stacking**: Multiple decorators can be stacked to combine behaviors
- **Order Matters**: The order in which decorators are applied affects the final behavior
- **Open/Closed Principle**: You can add new decorators without modifying existing code

## Real-World Use Cases

- **Java I/O Streams**: `BufferedInputStream`, `DataInputStream`, etc., are decorators that wrap basic streams
- **UI Components**: Adding scrollbars, borders, or shadows to GUI components
- **Web Applications**: Adding authentication, logging, or caching to request handlers
- **Text Processing**: Adding formatting, encryption, or compression to text operations
- **Game Development**: Adding buffs, debuffs, or power-ups to game characters

## Comparison with Other Patterns

**Decorator vs Adapter:**
- Decorator adds new behavior while maintaining the same interface
- Adapter changes an object's interface to match a different one

**Decorator vs Proxy:**
- Decorator adds behavior to an object
- Proxy controls access to an object

**Decorator vs Strategy:**
- Decorator changes an object's skin (adds behavior)
- Strategy changes an object's guts (changes algorithm/behavior from within)
