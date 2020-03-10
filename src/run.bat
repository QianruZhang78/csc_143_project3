del /s *.class
javac -cp ".;lib\*" -sourcepath . test/Project3Evaluation.java -Xlint:unchecked
if ERRORLEVEL 1 goto End

java -cp ".;lib\*" test.Project3Evaluation
:End
