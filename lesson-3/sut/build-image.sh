#!/usr/bin/env bash
docker build --rm -f $1 --tag=compose-app:latest .
