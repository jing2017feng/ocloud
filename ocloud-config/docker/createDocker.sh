#!/bin/sh
DIR="$( cd "$( dirname "$0"  )" && pwd  )"
cd $DIR
cp ../target/ocloud-config-1.0.0.jar ./
sudo docker build -t ocloud/ocloud-config .
