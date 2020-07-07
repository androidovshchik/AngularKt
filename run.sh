#!/bin/bash

rm -rf build/js/packages
bash gradlew :compiler:install
bash gradlew build
