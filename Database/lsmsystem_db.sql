--
-- Tabla de administradores

CREATE TABLE `administrator` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`username` varchar(30) NOT NULL,
	`email` varchar(30) NOT NULL,
	`password` varchar(100) NOT NULL,
	`companycode` varchar(100) NOT NULL,
	`reg_date` datetime,
	`organizationid` int unsigned NOT NULL,
	PRIMARY KEY (`id`)
);

--
-- Tabla de empleados

CREATE TABLE `employee` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`username` varchar(30) NOT NULL,
	`email` varchar(30) NOT NULL,
	`password` varchar(100) NOT NULL,
	`companycode` varchar(100) NOT NULL,
	`reg_date` datetime,
	`organizationid` int unsigned NOT NULL,
	PRIMARY KEY (`id`)
);

--
-- Tabla de organizaciones

CREATE TABLE `organization` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`name` varchar(50) NOT NULL,
	`companycode` varchar(100) NOT NULL,
	`reg_date` datetime,
	PRIMARY KEY (`id`)
);

--
-- Tabla de progreso

CREATE TABLE `progress` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`level1` float NOT NULL,
	`level2` float NOT NULL,
	`level3` float NOT NULL,
	`employeeid` int unsigned NOT NULL,
	PRIMARY KEY (`id`)
);