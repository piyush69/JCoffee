#!/usr/bin/python3
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
