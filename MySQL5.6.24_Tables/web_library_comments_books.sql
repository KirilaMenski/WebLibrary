-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: web_library
-- ------------------------------------------------------
-- Server version	5.6.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `comments_books`
--

DROP TABLE IF EXISTS `comments_books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comments_books` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `comments` text,
  `date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comments_books`
--

LOCK TABLES `comments_books` WRITE;
/*!40000 ALTER TABLE `comments_books` DISABLE KEYS */;
INSERT INTO `comments_books` VALUES (1,'Menski','Калі чытаў гэтую кнігу, было даволі нудна, бо першая частка ідзе як знаёмства чытача са светам, і паколькі не адбывалася аніякіх значных дзеяняў, то амаль засынаў. Але бліжэй пад канец кніга пачынае зацягваць і апасля ты з задавальненнем разумееш, што апасля яе цябе чвакае яшчэ тры кнігі. І вось наступныя кнігі гэта проста космас! Прачытаў на адным подыху. Усім раю ;)','18:4 1.7.2015'),(2,'Menski','класная кніга !','20:27 1.7.2015'),(3,'Menski','мне вельмі спадабалася ','20:28 1.7.2015'),(4,'Menski','+1','20:32 1.7.2015'),(5,'Menski','ну што, залік аўтару;)','20:33 1.7.2015'),(6,'Menski','лепшая навуковая фантастыка за апошнія 30 гадоў :)','20:35 1.7.2015'),(7,'Menski','Не чытаў, але падабайка !;)','11:54 3.7.2015'),(8,'Menski','We are the champions:)','15:0 5.7.2015'),(9,'Menski','Ага! Пераход па аўтарах гатовы ^^','9:44 7.7.2015'),(10,'Menski','Класная кніга, усім раю ','9:40 13.7.2015');
/*!40000 ALTER TABLE `comments_books` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-13 11:04:29
