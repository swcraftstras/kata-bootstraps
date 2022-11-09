phpunit setup
==========

This is a simple bootstrap project for PHP with phpunit

For PHP 8 or above just run:

```
./composer install

```

To run the tests just run:

```
phpunit --bootstrap vendor/autoload.php tests --filter testNotFailing
```
You need PHP 8 or above.

# run from docker

```
'./test.sh'
```
