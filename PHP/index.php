<?php
require_once('car.php');
require_once('uberX.php');
require_once('account.php');
require_once('UberPool.php');

$uberX = new UberX('cvb123', new Account('angelo almeida', '123456ad'), 'chevrolet', 'spark');
$uberX->printDataCar();

$uberPool =
    new UberPool('QWER123', new Account('vera almeida', '123465'), 'nisan', 'rs');
$uberPool->printDataCar();
