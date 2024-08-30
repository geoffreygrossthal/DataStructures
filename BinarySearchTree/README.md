# Binary Search Tree with Keyed Interface

## Overview

This project implements a binary search tree (BST) in Java through the `BinarySearchTree` class. The BST is designed to manage and organize objects that implement the `Keyed` interface, supporting operations such as insertion, searching, and visualization. The code includes specific implementations of the `Keyed` interface, demonstrating how different types of objects can be used as keys in the tree.

## Project Structure

The project consists of several key classes and interfaces:

- **`BinarySearchTree` Class**: Implements the binary search tree and provides methods for inserting, searching, and managing nodes.
- **`Node` Class**: Represents a node in the BST, containing a `Keyed` object and references to left and right child nodes.
- **`Keyed` Interface**: Defines a contract for objects that can be stored in the BST, including methods for comparing keys and identifying objects.
- **`NBAPlayerKey` Class**: Implements the `Keyed` interface for NBA players, allowing for custom comparison based on jersey number and team name.
- **`NBAPlayer` Class**: Extends `NBAPlayerKey` to include additional player details such as scoring average and player name.
- **`KeyableNumber` Class**: Implements the `Keyed` interface for numeric keys, providing basic key comparison functionality.

## Usage

### 1. Creating a Binary Search Tree
To create and use a BinarySearchTree, follow these steps:

java
Copy code
BinarySearchTree tree = new BinarySearchTree();
2. Inserting Data
Insert Keyed objects into the tree:

java
Copy code
NBAPlayer player = new NBAPlayer(23, "Lakers", 25.3, "LeBron James");
tree.insert(player);
3. Searching for Data
Search for a Keyed object in the tree:

java
Copy code
NBAPlayerKey key = new NBAPlayerKey(23, "Lakers");
Keyed result = tree.search(key);
4. Getting Tree Information
Retrieve information about the tree:

java
Copy code
int height = tree.getHeight();
int size = tree.getSize();
5. Displaying the Tree
Visualize the tree structure:

java
Copy code
tree.showTree();
Classes and Interfaces
BinarySearchTree Class
Manages the binary search tree and provides methods for:

insert(Keyed data): Insert a Keyed object into the tree.
search(Keyed data): Search for a Keyed object in the tree.
getHeight(): Get the height of the tree.
getSize(): Get the number of nodes in the tree.
toString(): Get a string representation of the tree.
showTree(): Print the tree structure to the console.
Node Class
Represents a node in the BST with:

Keyed data: The data stored in the node.
Node left: Reference to the left child node.
Node right: Reference to the right child node.
Keyed Interface
Defines methods for Keyed objects:

int keyComp(Keyed other): Compare this object with another Keyed object.
String toKey(): Return a unique key string for the object.
NBAPlayerKey Class
Implements the Keyed interface for NBA players with attributes:

int jersey_number
String team_name
Methods include:

int keyComp(Keyed object): Compare NBA player keys based on team name and jersey number.
String toKey(): Return a key string based on jersey number and team name.
NBAPlayer Class
Extends NBAPlayerKey with additional attributes:

double scoring_average
String player_name
KeyableNumber Class
Implements the Keyed interface for numeric keys with:

int key
Methods include:

int keyComp(Keyed other): Compare numeric keys.
String toKey(): Return the numeric key as a string.
Keyed Objects Example: NBAPlayer
The NBAPlayer class demonstrates how objects can be keyed. Here's how it works:

Keyed Interface Implementation: NBAPlayerKey implements the Keyed interface, defining how NBA players can be compared based on their team and jersey number. This allows NBAPlayerKey objects to be used as keys in the binary search tree.

Custom Comparison: The keyComp method in NBAPlayerKey compares two NBA players first by their team name and then by their jersey number if the team names are the same. This custom comparison logic ensures that NBA players are uniquely identified and can be efficiently managed within the tree.

Extended Functionality: NBAPlayer extends NBAPlayerKey to include additional details such as scoring average and player name, demonstrating how a Keyed object can also carry additional data beyond the key itself.

Examples
Here are some examples of how to use the provided classes and methods:

java
Copy code
// Create a binary search tree
BinarySearchTree tree = new BinarySearchTree();

// Insert NBA players
NBAPlayer player1 = new NBAPlayer(23, "Lakers", 25.3, "LeBron James");
NBAPlayer player2 = new NBAPlayer(6, "Bulls", 24.0, "Michael Jordan");
tree.insert(player1);
tree.insert(player2);

// Search for a player
NBAPlayerKey searchKey = new NBAPlayerKey(23, "Lakers");
Keyed foundPlayer = tree.search(searchKey);
System.out.println(foundPlayer);

// Get tree information
int height = tree.getHeight();
int size = tree.getSize();
System.out.println("Tree Height: " + height);
System.out.println("Tree Size: " + size);

// Show the tree
tree.showTree();
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contributing
If you wish to contribute to this project, please fork the repository and submit a pull request. Ensure that your code adheres to the existing style and includes appropriate tests.

Feel free to adjust or expand this README based on additional features or specific details relevant to your project.
