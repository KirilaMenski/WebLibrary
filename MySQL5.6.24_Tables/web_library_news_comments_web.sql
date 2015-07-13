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
-- Table structure for table `news_comments_web`
--

DROP TABLE IF EXISTS `news_comments_web`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news_comments_web` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `comment` text,
  `date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news_comments_web`
--

LOCK TABLES `news_comments_web` WRITE;
/*!40000 ALTER TABLE `news_comments_web` DISABLE KEYS */;
INSERT INTO `news_comments_web` VALUES (1,'Kirila','першы каментарый','21:11 24.6.2015'),(2,'Kirila','другі каментарый','21:13 24.6.2015'),(3,'Kirila','фвафв ааафафа фва','21:15 24.6.2015'),(4,'Kirila','йуа ауа уайа а','21:16 24.6.2015'),(5,'Kirila','ва фсф в в','21:17 24.6.2015'),(6,'Kirila','das s sdcv d','8:11 25.6.2015'),(7,'Kirila','edcf cfwscwsc','8:14 25.6.2015'),(8,'Kirila','нейкі там каментарый','9:12 25.6.2015'),(9,'Kirila','rth dfhndf fgnbf fnf n','15:25 25.6.2015'),(10,'Kirila','rth dfhndf fgnbf fnf n','15:25 25.6.2015'),(11,'Kirila','dfg dg dhdh','15:27 25.6.2015'),(12,'Kirila','dbd b df ','15:27 25.6.2015'),(13,'Kirila','sdvs dvs vsd','15:27 25.6.2015'),(14,'Kirila','qefqef qfq','15:34 25.6.2015'),(15,'Kirila','sdv sdvs vs','15:36 25.6.2015'),(16,'Kirila','sd vsdcv sdvcsd vdv','16:30 25.6.2015'),(17,'Kirila','dndgd dg d dg dg','16:33 25.6.2015'),(18,'Kirila','sfvsfv sfs vvsfvsvsv','16:44 25.6.2015'),(19,'Kirila','вфаф саф вафвафа фваф ваф','16:52 25.6.2015'),(20,'Kirila','фвас фа фафа фвафвафвафва','16:58 25.6.2015'),(21,'Kirila','фывфвф ывф выв фывфывфывфыв','16:58 25.6.2015'),(22,'Kirila','ыва ываы ававываыва','16:58 25.6.2015'),(23,'Kirila','ОООО! Віншую Хлопча!\r\nТы круты!\r\nДаўно чакалі калі ўжо можна троліць пад навінай пэўных людзей :D','22:3 26.6.2015'),(24,'Kirila','It\'s amazing man, it\'s realy cool +1 to previously coment ;)','22:3 26.6.2015'),(25,'Kirila','Ну што жа, я вельмі рады за цябе ;)','10:1 27.6.2015'),(26,'Kirila','Чакаем зробленную бібліатэку ;)\r\n','14:52 28.6.2015'),(27,'Kirila','Усё працуе!','10:10 30.6.2015'),(28,'Kirila','тэст','10:30 30.6.2015'),(29,'Kirila','ысф сфс фсф свс фсфвсф','20:39 1.7.2015'),(30,'Kirila','dsfgnsdrkgvs','18:21 9.7.2015');
/*!40000 ALTER TABLE `news_comments_web` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-13 11:04:30
