pushd src
ada2java q9.ads -b quiz -o ada2java\ada -c ada2java\java -L quiz
gprclean -Pada2java\ada\quiz.gpr
gprbuild -p -Pada2java\ada\quiz.gpr
set CLASSPATH=%CD%;%CD%\ada2java\java;%CD%\..\..\GNATGPL2014\lib\ajis.jar;%CLASSPATH%
set PATH=%CD%\ada2java\ada\lib;%PATH%
javac Q9.java
java Q9
popd