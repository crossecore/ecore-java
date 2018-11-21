# ecore-java

CrossEcore is a framework for model-based software engineering targeting multiple platforms.
From a platform-independent class model (i.e. an Ecore model), source code for multiple platforms like C#, TypeScript, JavaScript and Swift is generated.
Derived attributes, constraints for model validation and operation bodies can be expressed in the [Object Constraint Language (OCL)](http://www.omg.org/spec/OCL/About-OCL/).
CrossEcore comes with a runtime library for every target platform that implements the Ecore and OCL API.
The Ecore API provides many of the features that are known from the [Eclipse Modeling Framework](https://www.eclipse.org/modeling/emf/), e.g., persistence, reflection, notifications, switches, factories, referential integrity and validation.
With the aid of an OCL Compiler, OCL expressions are translated to equivalent expressions of the target programming language.
CrossEcore’s APIs can be used across platforms almost consistently.

## Why?
You might be wondering why CrossEcore has an Ecore and OCL Java API, while EMF itself already provides such APIs.
By default, EMF's code generator delegates the evaluation of OCL expressions to the OCL interpreter, which evaluates OCL expressions from strings at runtime. Alternatively, you can change behavior of EMF's code generator for the realisation of OCL embedded in Ecore models setting it to [Generate Java code in Impl classes](http://help.eclipse.org/oxygen/index.jsp?topic=/org.eclipse.ocl.doc/help/CodeGenerationTutorial.html). In this case, the OCL expressions are translated into Java code that is compiled ahead-of-time.
CrossEcore's approach is similar to the latter method, except that CrossEcore's code is more human-readable. You can choose any method you like. The different methods are used for a performance comparison.

## Publications
S. Schwichtenberg, I. Jovanovikj, C. Gerth, and G. Engels, "Poster: CrossEcore: An Extendible Framework to Use Ecore and OCL across Platforms," in Proceedings of the 40th International Conference on Software Engineering, ICSE 2018 - Companion Volume, Gothenburg, Sweden.

Accepted Talk "CrossEcore: The best parts of the Eclipe Modeling Framework for C#, TypeScript and Swift" at the EclipseCon Europe 2018 in terms of the Modeling Symposium. Available on [YouTube](https://www.youtube.com/watch?v=T7-ExsSzSWw).
