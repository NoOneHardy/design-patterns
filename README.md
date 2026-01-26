# Design Patterns Learning Repository

Welcome to this comprehensive repository for learning design patterns through practical examples! 🎓

## What is This Repository?

This repository demonstrates various **design patterns** with hands-on example projects in popular programming languages (Java and TypeScript). Each design pattern is implemented as a complete, runnable project that you can study, modify, and learn from.

## Who is This For?

This repository is perfect for:
- **Developers** who want to learn design patterns from scratch
- **Students** studying software engineering and object-oriented design
- **Professionals** looking to refresh their knowledge or see practical implementations
- **Anyone** interested in writing better, more maintainable code

**No prior knowledge of design patterns is required!** Each example includes detailed explanations written for developers who are encountering these concepts for the first time.

## What are Design Patterns?

Design patterns are **proven solutions to common problems** in software design. They are like templates or blueprints that you can customize to solve recurring design problems in your code.

Think of them as best practices that experienced developers have discovered and refined over time. Instead of reinventing the wheel, you can use these established patterns to:
- Write more maintainable code
- Communicate design ideas more effectively with other developers
- Solve complex problems with tested solutions
- Make your code more flexible and reusable

### Pattern Categories

Design patterns are typically organized into three categories:

1. **Creational Patterns**: Deal with object creation mechanisms
   - Focus on how objects are created
   - Help make your system independent of how objects are composed and represented

2. **Structural Patterns**: Deal with object composition
   - Explain how to assemble objects and classes into larger structures
   - Keep these structures flexible and efficient

3. **Behavioral Patterns**: Deal with object collaboration and responsibility
   - Focus on communication between objects
   - Define how objects interact and distribute responsibility

## Available Design Patterns

### Creational Patterns

#### Factory Method
- **Java Implementation**: [factory-method/java/](factory-method/java/)
- **TypeScript Implementation**: [factory-method/typescript/](factory-method/typescript/)

The Factory Method pattern provides an interface for creating objects in a parent class, but allows subclasses to alter the type of objects that will be created. Perfect for when you don't know beforehand the exact types of objects your code needs to work with.

**Real-world analogy**: Different stores in a mall each create their own specific products, but all follow the same general process of creating and selling items.

### Structural Patterns

#### Adapter
- **Java Implementation**: [adapter/java/](adapter/java/)
- **TypeScript Implementation**: [adapter/typescript/](adapter/typescript/)

The Adapter pattern allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by wrapping one object and providing an interface that the client expects.

**Real-world analogy**: A travel adapter that lets you plug your device into different outlet types around the world, converting one plug shape to match the outlet.

#### Decorator
- **Java Implementation**: [decorator/java/](decorator/java/)

The Decorator pattern allows you to add new behaviors to objects dynamically by placing them inside special wrapper objects called decorators. It provides a flexible alternative to subclassing for extending functionality.

**Real-world analogy**: Adding toppings to a pizza - each topping wraps around the base pizza (or another decorated pizza) and adds its own flavor, without changing the pizza itself. You can stack multiple toppings to create exactly what you want.

## Repository Structure

```
design-patterns/
├── README.md                          # This file - repository overview
├── factory-method/                    # Factory Method pattern (Creational)
│   ├── java/                         # Java implementation
│   │   ├── README.md                 # Detailed Java-specific guide
│   │   └── src/                      # Java source code
│   └── typescript/                   # TypeScript implementation
│       ├── README.md                 # Detailed TypeScript-specific guide
│       └── src/                      # TypeScript source code
├── adapter/                          # Adapter pattern (Structural)
│   ├── java/                         # Java implementation
│   │   ├── README.md                 # Detailed Java-specific guide
│   │   └── src/                      # Java source code
│   └── typescript/                   # TypeScript implementation
│       ├── README.md                 # Detailed TypeScript-specific guide
│       └── src/                      # TypeScript source code
├── decorator/                        # Decorator pattern (Structural)
│   └── java/                         # Java implementation
│       ├── README.md                 # Detailed Java-specific guide
│       └── src/                      # Java source code
└── [more patterns coming soon...]
```

## How to Use This Repository

### For Learning:
1. **Start with the pattern description** in this README to understand what the pattern does
2. **Choose your preferred language** (Java or TypeScript)
3. **Read the pattern-specific README** in the language folder for detailed explanation
4. **Study the code** to see how the pattern is implemented
5. **Run the example** to see the pattern in action
6. **Modify the code** to experiment and deepen your understanding

### For Reference:
- Each pattern has its own directory with both Java and TypeScript implementations
- Each implementation includes a comprehensive README explaining:
  - What the pattern is and when to use it
  - How it works with clear explanations
  - The project structure
  - How to build and run the example
  - Key benefits and learning points
  
## Getting Started

### Prerequisites

**For Java examples:**
- Java 17 or higher
- Gradle (included via wrapper)

**For TypeScript examples:**
- Node.js 18 or higher
- npm or yarn

### Running an Example

Navigate to the specific pattern and language directory and follow the instructions in its README. For example:

```bash
# Java Factory Method example
cd factory-method/java
./gradlew run

# TypeScript Factory Method example
cd factory-method/typescript
npm install
npm start
```

## Contributing

This is a learning repository, and contributions are welcome! If you:
- Find errors or improvements in the explanations
- Want to add examples in other programming languages
- Have suggestions for new patterns to include

Please feel free to open an issue or submit a pull request.

## Learning Resources

### Recommended Reading:
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gang of Four
- "Head First Design Patterns" by Freeman & Robson
- [Refactoring.Guru Design Patterns](https://refactoring.guru/design-patterns)

### Why Learn Design Patterns?
- **Better Code**: Write cleaner, more maintainable code
- **Common Vocabulary**: Communicate more effectively with other developers
- **Problem Solving**: Recognize and solve recurring design problems quickly
- **Career Growth**: Design patterns are fundamental knowledge for senior developers
- **Framework Understanding**: Better understand popular frameworks and libraries

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

These implementations are created for educational purposes to help developers learn design patterns through practical, runnable examples. Each pattern is explained with beginners in mind, focusing on clarity and understanding over complexity.
