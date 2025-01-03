# Scala Type Mismatch Bug

This repository demonstrates a common type mismatch error in Scala when working with generic classes.  The `MyClass` example attempts to add two values of type `T` within the `myMethod`. However, this operation isn't implicitly defined for all types `T`.

The solution demonstrates how to address the type mismatch using appropriate type constraints or alternative approaches.