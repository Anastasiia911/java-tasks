# Java Tasks Repository
This repo represents java tasks.  
`master` branch contains tasks.  
`answers` branch contains tasks answers.

## How to build
To Build the project run from terminal:
```bash
./gradlew build
```

## How To Complete a Task
- Create new branch for each task in format `answer/task1`
- Push the code (with tests if required) into the repo
- Create PR from your branch to `answers`

# Tasks:

## Task 1:
Consider the code in [task1](src/main/java/com/example/tasks/task1) package.  
It breaks the design principle [Open to extension, closed to modification](https://en.wikipedia.org/wiki/Open%E2%80%93closed_principle).

**Create a new design that does not violate this principle and allows for the addition of any arbitrary weapon type in the future.** 

## Task 2:
Design a Polyline class to represent a geometric polyline. A polyline is made up of a sequence of line segments laid end to end on a plane.  
![polyline](https://t4g-c4bf.kxcdn.com/blog/wp-content/uploads/2017/03/java-interview-question-polyline.png)  
The Polyline class will be used in a concurrent environment and as such the decision was taken to make it immutable.
- Design and implement a Polyline class ensuring that Polylines are immutable.  
- Provide a method to add new Points to a Polyline.  
- Cover public methods by tests.
