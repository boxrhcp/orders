#!/usr/bin/env bash

sh scripts/build.sh

docker tag weaveworksdemos/orders:test eu.gcr.io/optimum-mode-272714/orders

docker push eu.gcr.io/optimum-mode-272714/orders