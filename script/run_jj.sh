#!/usr/bin/env bash

WORK_DIR="src/main/resource/javacc"

echo "Change working directory to $WORK_DIR"
cd $WORK_DIR

FILE_PATH=$1
FILE_NAME=$(basename $FILE_PATH)
NAME_WITHOUT_EXT=${FILE_NAME%.*}
FILE_EXT=${FILE_NAME##*.}

echo "try to compile java files"
javac "$NAME_WITHOUT_EXT.java"

echo "try to run java file"
java "$NAME_WITHOUT_EXT"
