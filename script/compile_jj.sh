#!/usr/bin/env bash

JAVACC_PATH=$(find ~/.m2/repository/net -name "javacc-7.0.5.jar")
FILE_PATH=$1
FILE_NAME=$(basename $FILE_PATH)

echo "Change working directory to $(pwd)"
cd src/main/resource/javacc

echo "Location of javacc path is $JAVACC_PATH"
echo "File name is $FILE_NAME"

echo "Start to compile"
java -classpath $JAVACC_PATH javacc $FILE_NAME
