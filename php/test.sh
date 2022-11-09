#!/bin/bash

docker run \
    -v $(pwd):/data \
    -w /data \
    -i -t composer:2 \
    php ./vendor/phpunit/phpunit/phpunit --no-configuration \
           --test-suffix Test.php \
           ./tests