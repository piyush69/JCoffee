# JCoffee
Using Compiler Feedback to Make Partial Code Snippets Compilable

## Overview
Static program analysis tools are often required to work with only a small part of a program’s source code, either due to the unavailability of the entire program or the lack of need to analyze the complete code. This makes it challenging to use static analysis tools that require a complete and typed intermediate representation (IR). We present JCoffee, a tool that leverages compiler feedback to convert partial Java programs into their compilable counterparts by simulating the presence of missing surrounding code. It works with any well-typed code snippet (class, function, or even an unenclosed group of statements) while making minimal changes to the input code fragment.

---

## Setup
Clone this repo to your desired destination. Thats it! There are no other dependencies. ;)

---

## Usage

There are two modes to run JCoffee:
 - Command-line API
 - Python plugin

### Command-line API
```console
 foo@bar$./jcoffee.py -h
usage: jcoffee.py [-h] -f F [-o O] [-n N]

optional arguments:
  -h, --help  show this help message and exit
  -f F        path to input java code snippet
  -o O        path to output java file. default=fixed/output.java
  -n N        max number of times to try compile. default=10
```

Sample Invocation
```console
./jcoffee.py -f examples/e1.java -o output_e1.java
```

### Python plugin
```python
from jcoffee import jcoffee

# Usage A
# param 1: src file
jcoffee("examples/e1.java")

# Usage B
# param 1: src file
# param 2: dst file
jcoffee("examples/e2.java", "fixed/e2_fixed.java")

# Usage C
# param 1: src file
# param 2: dst file
# param 3: max times to compile
jcoffee("examples/e3.java", "fixed/e3_fixed.java", 5)
```

Refer [this](https://youtu.be/O4h2g_n2Qls) demo video for a short tutorial on usage.

---

## Benchmark
JCoffee was evaluated on 9133 code snippets from the BigCloneBench dataset. We provide the corresponding [input](https://github.com/piyush69/JCoffee/tree/master/benchmark/bigclonebenchdata_partial) and [output](https://github.com/piyush69/JCoffee/tree/master/benchmark/bigclonebenchdata_completed) folders in [benchmark/](https://github.com/piyush69/JCoffee/tree/master/benchmark) for reference.
