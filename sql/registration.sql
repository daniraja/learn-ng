use registration;
drop table reg;
CREATE TABLE `reg`(
 `id` int NOT NULL AUTO_INCREMENT,
 `firstname` varchar(100) NULL,
 `lastname` varchar(100)NULL,
 `email` varchar(100) NULL,
 `phone` varchar(15) NOT NULL,
 `password` varchar(100) NULL,
 `pic_id` varchar(100) NULL, 
 `pic_name` varchar(100) NULL,
 `pic_data` blob NULL, 
 `pic_type` varchar(100) NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone_UNIQUE` (`phone`)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
