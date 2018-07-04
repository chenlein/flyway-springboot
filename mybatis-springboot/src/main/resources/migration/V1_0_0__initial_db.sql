-- t_user: table
CREATE TABLE `t_user` (
  `id`      int(11)      NOT NULL,
  `name`    varchar(256) NOT NULL,
  `address` varchar(256) DEFAULT NULL,
  `email`   varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8;