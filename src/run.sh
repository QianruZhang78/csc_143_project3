#!/bin/bash
set -e

find . -type f -name '*.class' -delete
javac -cp *:lib/*:. -sourcepath . test/Project3Evaluation.java -Xlint:unchecked
java -cp *:lib/*:. test.Project3Evaluation
