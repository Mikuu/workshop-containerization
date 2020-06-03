#!/usr/bin/env bash
docker container run -v "$(pwd)/tests":/home/tests -w /home/tests ui-env python3 test.py
