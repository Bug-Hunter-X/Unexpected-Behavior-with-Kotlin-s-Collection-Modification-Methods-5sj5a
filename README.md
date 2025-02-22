# Kotlin Collection Modification Gotchas

This repository demonstrates some potential pitfalls when using Kotlin's `removeIf`, `removeAll`, and `retainAll` methods on mutable collections (like `MutableList`).  These functions offer convenient ways to filter collections but can be surprising if their behavior isn't fully understood.

The `bug.kt` file showcases an example where the difference between these functions may lead to logical errors. The `bugSolution.kt` file offers clarifying comments and potentially safer alternatives.

## How to Reproduce

1. Clone the repository.
2. Run `bug.kt`.
3. Observe the output and compare it to your expectations. 