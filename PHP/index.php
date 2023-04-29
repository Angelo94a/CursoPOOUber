<?php
requiere_once('Car.php');
requier_once('Account.php');

$car = new Car("ASD1234", new Account("Angelo Almeida", "ASD1234"));
$car->PrintDataCar();