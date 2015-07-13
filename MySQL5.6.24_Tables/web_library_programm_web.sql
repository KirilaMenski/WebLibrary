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
-- Table structure for table `programm_web`
--

DROP TABLE IF EXISTS `programm_web`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `programm_web` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `picture` varchar(255) DEFAULT NULL,
  `developer` varchar(255) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `platorm` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programm_web`
--

LOCK TABLES `programm_web` WRITE;
/*!40000 ALTER TABLE `programm_web` DISABLE KEYS */;
INSERT INTO `programm_web` VALUES (1,'image/programm/alreader.png','Alan NeverLand Inc','http://www.alreader.com/','Русский, Английский ','Windows 2000, Windows XP, Windows Vista, Windows 7','HTML, TXT, RTF, FB2, EPUB, PDB/PRC (PalmDOC, zTXT mode 1), TCR, DOC, DOCX, ODT, SXW, ABW, ZABW, RB, TCR, CHM ','Alreader'),(2,'image/programm/crbook.png','Vadim Lopatin','http://coolreader.org/',' Русский, Английский, Украинский, Татарский, Болгарский','Windows 98 / ME / 2000 / XP / 2003 / Vista','TXT, HTML, RTF, MS Word, FB2','CoolReader'),(3,'image/programm/bseer.png','Mark Solt','http://www.msolt.chat.ru/','Русский','Windows All','TXT, HTML, RTF, DOC, FB2','BookSeer'),(4,'image/programm/fbreader.png',' группа FBReader','http://www.fbreader.org','Русский','Windows 98/ ME/ 2000/ XP/ 2003/ Vista','TXT, HTML, Palmdoc, RTF, MS Word, CHM, zTxt, OEB, FB2, OpenReader','FBReader'),(5,'image/programm/hali.png','Mike Matsnev','http://haali.cs.msu.ru/','Английский ','Windows','FB2, TXT','Haali Reader'),(6,'image/programm/ice_logo.png','ICE Graphics','http://www.ice-graphics.com/','Русский','Windows 98/ME/2000/XP/2003/Vista/7','TXT, HTML, XML, RTF, MS Word, PDB, PRC, TCR, LIT, CHM, FB2 ','Ice Book Reader Professional'),(7,'image/programm/bookshelf_logo.png','Text-Reader Software','http://www.text-reader.com','Русский','Windows 98/ ME/ 2000/ XP','TXT','WinDjView'),(8,'image/programm/djview.png',' Andrew Zhezherun','http://windjview.sourceforge.net/','Русский','Windows 98/ ME/ 2000/ XP/ Vista','DjVu ','BookShelf'),(9,'image/programm/adobe.png',' Adobe','http://www.adobe.com/','Русский','Windows All','PDF','Adobe Reader'),(10,'image/programm/brava.png','Informative Graphics Corporation (IGC)','http://www.bravaviewer.com','Русский','Windows','PDF, CSF, TIFF','BravaReader'),(11,'image/programm/expert.png',' VisageSoftr','http://www.visagesoft.com','Русский','Windows','PDF, CSF, TIFF','Expert PDF Reader'),(12,'image/programm/foxit.png','	Foxit Software Company, LLC','http://www.foxitsoftware.com','Русский','Windows','PDF','FoxitReader'),(13,'image/programm/sumatra_logo.png',' Krzysztof Kowalczyk','http://blog.kowalczyk.info/software/sumatrapdf','Русский ','Windows 2000 or newer (XP, Vista)','PDF','Sumatra PDF'),(14,'image/programm/xchange.png','Tracker Software Products','http://www.docu-track.com','Русский','Windows 2000 & Later','PDF','PDF-XChange Viewer'),(15,'image/programm/exre.png','dc','http://textory.ru/node/28','Русский','Windows XP','HTML, FB2, TXT, RTF','ExRe'),(16,'image/programm/tomreader.png','PeTRoViCH txtSoft Ltd.','http://tomreader.chat.ru/','Русский','Win 95/98/ME/2000/NT/XP','RTF, HTML, DOC, TXT','TomReader'),(17,'image/programm/bookreader_01.png',' Мыкола Руденко, Дмитрий Сильченко','http://www.ice-graphics.com/ICEReader/IndexR.html','Русский','Windows 95/95/ME/2000/XP','TXT','BookReader'),(18,'image/programm/bv_logo.png','Зайдуллин Сергей Сагитович','http://freesoft.ru/bookview','Русский','Windows All','HTML, FB2, TXT, RTF, DOC','BookView');
/*!40000 ALTER TABLE `programm_web` ENABLE KEYS */;
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
