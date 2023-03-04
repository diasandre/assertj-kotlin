# assertj-kotlin
This is a Kotlin wrapper for AssertJ, a fluent and easy-to-use Java library for writing assertions. It provides a more natural and readable way of writing assertions in Kotlin, taking advantage of Kotlin's language features such as extension/infix functions and type inference.

## Disclaimer
Varargs and the majority of functions with 2 or more parameters are not included.

## Installation
To use the Kotlin wrapper for AssertJ in your project, add the following dependency to your build.gradle file:

```
dependencies {
    implementation "UPDATE_LATER:<version>"
}
```
Replace <version> with the latest version number available. You can find the latest version number in the releases page.

## Usage
The Kotlin wrapper for AssertJ provides a set of extension functions that allow you to write assertions in a more concise and readable way.

Here is an example of using the assertThat function to write an assertion:

```
val actual = "hello"
assertThat(actual) isEqualTo "hello"
```

## Contribution
If you'd like to contribute to the development of the Kotlin wrapper for AssertJ, please feel free to fork the repository and create a pull request. We welcome all contributions, big or small!