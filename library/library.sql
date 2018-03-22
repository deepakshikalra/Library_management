/*
SQLyog Community v12.4.2 (32 bit)
MySQL - 5.5.57-log : Database - library_management
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`library_management` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `library_management`;

/*Table structure for table `forgot` */

DROP TABLE IF EXISTS `forgot`;

CREATE TABLE `forgot` (
  `uname` varchar(30) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `forgot` */

insert  into `forgot`(`uname`,`password`) values 
('Admin','Admin'),
('Suraj','12345');

/*Table structure for table `issuebook` */

DROP TABLE IF EXISTS `issuebook`;

CREATE TABLE `issuebook` (
  `acc` varchar(10) DEFAULT NULL,
  `book_id` varchar(10) NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `title` varchar(10) DEFAULT NULL,
  `eddition` varchar(20) DEFAULT NULL,
  `no_of_pages` varchar(100) DEFAULT NULL,
  `issue_date` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `fine` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `issuebook` */

insert  into `issuebook`(`acc`,`book_id`,`type`,`title`,`eddition`,`no_of_pages`,`issue_date`,`email`,`contact`,`fine`) values 
('A','graphics','COMPUTER','3','34','1/2/13','dee','234','56','23'),
('266','networking','COMPUTER','3','456','1/2/14','g','34','454','123'),
('s','s',NULL,'s','s','s','d','dfc','ed','s');

/*Table structure for table `librarian` */

DROP TABLE IF EXISTS `librarian`;

CREATE TABLE `librarian` (
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `cno` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `librarian` */

insert  into `librarian`(`name`,`email`,`cno`,`address`,`gender`) values 
('g','g','3t3','rgbr','FEMALE'),
('','','','','MALE'),
('dee','fa','rher','hrtshrt','MALE');

/*Table structure for table `newbbook` */

DROP TABLE IF EXISTS `newbbook`;

CREATE TABLE `newbbook` (
  `name` varchar(50) DEFAULT NULL,
  `authorname` varchar(50) DEFAULT NULL,
  `eddition` varchar(20) DEFAULT NULL,
  `pname` varchar(50) DEFAULT NULL,
  `book_id` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `newbbook` */

insert  into `newbbook`(`name`,`authorname`,`eddition`,`pname`,`book_id`) values 
('cn','golui','1','genius','12'),
('cn','golui','1','genius','12'),
('c','golu','1','genius','12'),
('genius','diwakar','3','genius','23'),
('schaum','vk','5','ghl','207'),
('h','hh','h','h','h');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
