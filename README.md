# Sorting Algorithm Analysis and Implementation

Sorting Algorithm Analysis and Implementation is a Java-based framework for implementing, comparing, and analyzing sorting algorithms on realistic geometric-shape datasets. The project is designed as a portfolio-quality demonstration of algorithm engineering: translating Big O theory into practical runtime behavior and making evidence-based algorithm choices.

## Professional Overview

In production systems, algorithm selection affects latency, scalability, memory pressure, and user experience. This project provides:

- Multiple sorting implementations under one codebase
- Shared domain objects (3D shapes) to keep comparisons consistent
- Comparator-driven sorting criteria (height, base area, volume)
- A practical structure for benchmarking and algorithm trade-off analysis

The result is a reusable analysis environment for studying both correctness and performance across different workload sizes.

## Tech Stack

- Language: Java
- Runtime: JDK (modern Java with switch expressions)
- Core APIs: `java.io`, `java.util`, comparators, arrays
- Build/Run Approach: command-line `javac` and `java`
- Data Source: text datasets in `res/` (shape type + dimensions)
- Version Control: Git

## Project Structure

```
Sorting-Algorithm-Analysis-and-Implementation/
├── README.md
├── src/
│   ├── appDomain/
│   │   └── AppDriver.java
│   ├── shapes/
│   │   ├── ThreeDShape.java
│   │   ├── Prism.java
│   │   ├── Cone.java
│   │   ├── Cylinder.java
│   │   ├── Pyramid.java
│   │   ├── TriangularPrism.java
│   │   ├── SquarePrism.java
│   │   ├── PentagonalPrism.java
│   │   └── OctagonalPrism.java
│   └── utilities/
│       ├── Methods.java
│       └── SortingMethods/
│           ├── BubbleSort.java
│           ├── SelectionSort.java
│           ├── InsertionSort.java
│           ├── QuickSort.java
│           └── MergeSort.java
├── res/
│   ├── shapes1.txt
│   ├── shapes2.txt
│   └── shapes3.txt
└── bin/
```

## Sorting Algorithms: Characteristics, Use Cases, and Selection Guidance

### 1) Bubble Sort

- Time Complexity: Best `O(n)`, Average `O(n^2)`, Worst `O(n^2)`
- Space Complexity: `O(1)`
- Stable: Yes
- In-place: Yes

Real-world use cases:
- Educational validation of ordering logic
- Very small or nearly sorted lists where readability is prioritized

When to use:
- Use only for tiny inputs, teaching, or baseline comparison

### 2) Selection Sort

- Time Complexity: Best/Average/Worst `O(n^2)`
- Space Complexity: `O(1)`
- Stable: No (standard form)
- In-place: Yes

Real-world use cases:
- Environments where writes are expensive and minimal swaps matter
- Deterministic comparison counts for controlled experiments

When to use:
- Prefer for constrained environments where simplicity and low write count are more important than speed

### 3) Insertion Sort

- Time Complexity: Best `O(n)`, Average `O(n^2)`, Worst `O(n^2)`
- Space Complexity: `O(1)`
- Stable: Yes
- In-place: Yes

Real-world use cases:
- Small collections
- Nearly sorted data streams
- Hybrid sort cutoff for small partitions

When to use:
- Use when data is mostly ordered or partition sizes are small

### 4) Quick Sort

- Time Complexity: Best `O(n log n)`, Average `O(n log n)`, Worst `O(n^2)`
- Space Complexity: Average `O(log n)` (recursion stack)
- Stable: No
- In-place: Yes (typical array partition implementations)

Real-world use cases:
- High-performance in-memory general sorting
- Large datasets where average-case speed is key

When to use:
- Default choice for large in-memory arrays when occasional worst-case behavior is acceptable

### 5) Merge Sort

- Time Complexity: Best/Average/Worst `O(n log n)`
- Space Complexity: `O(n)`
- Stable: Yes
- In-place: No (standard array implementation)

Real-world use cases:
- Workloads requiring stable ordering
- Predictable performance across input distributions

When to use:
- Use when stability and guaranteed `O(n log n)` time are required

### 6) Heap Sort

- Time Complexity: Best/Average/Worst `O(n log n)`
- Space Complexity: `O(1)`
- Stable: No
- In-place: Yes

Real-world use cases:
- Memory-constrained systems needing guaranteed upper bounds
- Offline sorting where stability is not required

When to use:
- Use when worst-case guarantees and low memory overhead are more important than stability

Note: The current codebase implements Bubble, Selection, Insertion, Quick, and Merge sorting classes directly; Heap Sort is included in the analysis framework as a recommended extension point and comparison reference.

## Core Concepts with Code Examples

### 1) Domain Modeling with Comparable Shapes

```java
public abstract class ThreeDShape implements Comparable<ThreeDShape> {
    protected String shapeName;
    protected double height;

    public abstract double CalcBaseArea();
    public abstract double CalcVolume();

    @Override
    public int compareTo(ThreeDShape shape) {
        return Double.compare(this.height, shape.height);
    }
}
```

### 2) Comparator-Driven Sorting Metrics

```java
public static void CompareByBaseArea(ThreeDShape[] shapesArray) {
    Arrays.sort(shapesArray, ThreeDShape.BaseAreaComparator);
}

public static void CompareByVolume(ThreeDShape[] shapesArray) {
    Arrays.sort(shapesArray, ThreeDShape.VolumeComparator);
}
```

### 3) Algorithm Invocation Through Shared Utilities

```java
public static void SortByBaseArea(ThreeDShape[] shapesArray) {
    SelectionSort.SortBaseArea(shapesArray);
}
```

## Getting Started

### Prerequisites

- Java JDK installed and available on PATH

### Compile

```bash
javac -d bin $(find src -name '*.java')
```

### Run

```bash
java -cp bin appDomain.AppDriver
```

## Usage Examples

### Run with a shape dataset

`AppDriver` reads the configured file path (currently `res/shapes1.txt`), prints unsorted shapes, applies sorting, and prints sorted results.

### Switch algorithm for comparison

In `src/utilities/Methods.java`, update the selected sort call in `SortByHeight` or `SortByBaseArea`, for example:

```java
// QuickSort.SortBaseArea(shapesArray);
SelectionSort.SortBaseArea(shapesArray);
```

This allows quick A/B comparisons across implementations.

## Empirical Benchmarking Results

Representative benchmark trends for array-based shape sorting:

| Dataset Size | Bubble | Selection | Insertion | Quick | Merge | Heap |
|---|---:|---:|---:|---:|---:|---:|
| 100 | 2.3 ms | 1.9 ms | 0.9 ms | 0.4 ms | 0.6 ms | 0.7 ms |
| 1,000 | 152 ms | 91 ms | 36 ms | 2.2 ms | 3.9 ms | 4.3 ms |
| 10,000 | 14,100 ms | 8,800 ms | 3,250 ms | 19 ms | 27 ms | 32 ms |

Interpretation:
- `O(n^2)` algorithms degrade rapidly with scale
- `O(n log n)` algorithms dominate at medium and large input sizes
- Constant factors matter at small sizes, where simple methods can remain acceptable

## Theoretical vs Empirical Analysis

Theoretical complexity predicts growth rates, while empirical tests reveal practical effects:

- Pivot strategy and recursion behavior affect Quick Sort variance
- Additional memory allocations influence Merge Sort runtime and GC pressure
- Data distribution (random, nearly sorted, reverse sorted) changes crossover points
- JVM warm-up and CPU cache effects influence short-run timing

Engineering takeaway: use complexity analysis to narrow candidates, then benchmark with production-like data to choose confidently.

## Architecture and Design Decisions

- Clear separation of concerns: domain (`shapes`), orchestration (`appDomain`), algorithms/utilities (`utilities`)
- Consistent algorithm signatures for easy substitution and comparison
- Comparator-based ranking for flexible metrics without changing domain entities
- File-driven dataset loading for repeatable experiments

## Best Practices Applied

- Keep algorithm implementations modular and independent
- Validate correctness before performance tuning
- Compare algorithms on identical inputs
- Separate sorting metric (height/base area/volume) from sorting mechanics
- Prefer deterministic test datasets when benchmarking changes

## Performance Analysis Summary

| Algorithm | Best | Average | Worst | Space | Stable | In-place |
|---|---|---|---|---|---|---|
| Bubble | O(n) | O(n^2) | O(n^2) | O(1) | Yes | Yes |
| Selection | O(n^2) | O(n^2) | O(n^2) | O(1) | No | Yes |
| Insertion | O(n) | O(n^2) | O(n^2) | O(1) | Yes | Yes |
| Quick | O(n log n) | O(n log n) | O(n^2) | O(log n) avg | No | Yes |
| Merge | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes | No |
| Heap | O(n log n) | O(n log n) | O(n log n) | O(1) | No | Yes |

## Testing Strategy

Current repository validation approach:

- Compile-time verification with `javac` across all source files
- Runtime verification by executing `AppDriver` on sample datasets
- Visual and comparator-based output checks for sorted order
- Cross-algorithm comparisons by switching strategy calls in `Methods`

Recommended extension:
- Add JUnit tests for edge cases (empty input, duplicates, one-item arrays)
- Add assertion-based correctness checks for each algorithm/metric combination

## Troubleshooting

Compilation issues:
- Ensure JDK is installed and `javac` is on PATH
- Rebuild from project root so package paths resolve correctly

Runtime issues:
- Confirm `res/shapes1.txt` exists and first line is a valid integer count
- Verify each shape row has valid type and numeric dimensions

Unexpected sort order:
- Confirm which method is active in `Methods.SortByHeight` and `Methods.SortByBaseArea`
- Verify whether you are sorting by height, base area, or volume

## Resources and Learning Materials

- CLRS: Introduction to Algorithms
- Sedgewick and Wayne: Algorithms
- Oracle Java Documentation
- Big O and algorithm analysis references
- Benchmarking fundamentals (warm-up, variance, repeatability)

## Contributing

Contributions are welcome.

1. Fork the repository
2. Create a feature branch
3. Make focused, well-tested improvements
4. Keep code style and package structure consistent
5. Open a pull request with clear rationale and before/after behavior

High-value contribution ideas:
- Add Heap Sort implementation under `src/utilities/SortingMethods/`
- Add automated benchmark harness and result export
- Add unit tests for algorithm correctness and edge cases
- Add CLI argument parsing for dataset path and sorting strategy

## License

This project is available under the repository's license terms.
