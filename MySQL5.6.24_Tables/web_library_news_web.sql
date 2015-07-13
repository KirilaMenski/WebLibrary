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
-- Table structure for table `news_web`
--

DROP TABLE IF EXISTS `news_web`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news_web` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `title` text,
  `description` text,
  `news` text,
  `date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news_web`
--

LOCK TABLES `news_web` WRITE;
/*!40000 ALTER TABLE `news_web` DISABLE KEYS */;
INSERT INTO `news_web` VALUES (1,'Першая навіна!','Апасля двух дзён няспынных мучэнняў, была вырашана праблема запісу даных у БД MySQL праз Spring ','Сёння радасная навіна!!!! Сёння ў мяне атрымалася запісаць навіну ў БД!!!! УРААААААА!!!','21:29 25.6.2015'),(2,'Перанос праэкту на GitHub','Перанос праэкту на GitHub, каб не згубіць','Апасля выкананых тэхнічных працаў, праэкт быў перанесены на GitHub','10:15 25.6.2015'),(3,'Вывад навінаў на старонцы','Вывад навінаў на старонцы.','Спрабую вывесці навіны на старонцы','14:8 22.6.2015'),(19,'Дададзена магчымасць выдалення навінаў. ','Выдаленне навінаў па ID','Сёння была дададзена магчымасць выдалення навінаў па ID.\r\nЧамусьці ў БД MySQL адбываецца запіс новай навіны з ID роўным колькасці мінулых навінаў, а не з нумарам роўным ID апошняй навіны + 1','10:46 24.6.2015'),(22,'Выпраўленне навінаў. Даданне на GiHub','Дададзена магчымасць выпраўдення навінаў','Дададзена магчымасць выпраўлення навінаў.\r\nЦяпер можна дадаваць, праглядаць, выпраўляць і выдаляць навіны.\r\nЗасталося толькі разабрацца з каментарыямі.\r\n\r\nПраэкт быў перанесены на GitHub ','14:11 22.6.2015'),(23,'Сувязь навінаў з каментарыямі','Сувязь навінаў з каментарыямі з дапамогай анатацый @ManytoOne i @OnetoMany\r\n','Сувязь навінаў з каментарыямі з дапамогай анатацый @ManytoOne i @OnetoMany. Першая спроба была няўдалай. Вылятаў эксэпшэн, што не можа ўсталяваць кантролер. Памылка была ў анатацыях @ManytoOne i @OnetoMany.<br />\r\n--------------------------------------------------------------------------------------<br />\r\nБыла вырашана праблема. Рашаецца наступным чынам: <br />\r\n@ManyToOne<br />\r\n	@JoinColumn(name = \"com_id\", referencedColumnName = \"id\")<br />\r\n	private News news;<br />\r\n	@OneToMany<br />\r\n	@JoinColumn(name = \"news_id\", referencedColumnName = \"id\")<br />\r\n	private List<NewsComments> newsCom;<br />\r\n<br />\r\nДля анатацыі @ManyToOne неабходна выкарыстоўваць звычайную пераменную, а для анатацыі \r\n@OneToMany неабходна выкарыстоўваць List','19:0 24.6.2015'),(24,'Даданне каментарыяў да навіны','Тэставая работа па даданні каментарыяў да навінаў, з вывадам іх пад навінай\r\nняняняняняня','Напісаны DAO, DAOImpl, Service i ServiceImpl для табліцаў news_comments_web i link_news_com_web. Пакуль што ўсё працуе добра, эксэпшэнаў не вылятае. Буду спрабаваць дадаваць: <br />\r\n<ul>\r\n<li>Дадаваць каментарыі;</li>\r\nДадданне каментарыяў працуе, але без прысвойвання да навіны. З прысвойваннем да навіны ўзнікаюць пэўныя памылкі.<br />\r\nУзнікла праблема запісу ў табліцу LinkNewsComments, не генерыраваўся ID. Як вызначылася я проста стварыў табліцу не правільна, не пазначыў на супраць ID - not null auto icnrement primary_key\r\n<li>Вывадзіць каментарыі.</li>\r\nСпрабую выводзіць каментарыі пад навінай, пакуль што не атрымліваецца, выдае наступную памылку:<br />\r\nERROR: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near \'INNER JOIN news_comments_web ON news_comments_web.id = link_news_com_web.com_id \' at line 1<br />\r\norg.hibernate.exception.SQLGrammarException: could not extract ResultSet\r\nБыло знойдзена частковае рашэнне. Замест Object[] я паставіў аб\'ект свайго класу, апасля чаго паўстала праблема таго, што Spring не можа знайсці шлях да слупкоў праз SQL запыт, які я выкарыстоўваю. Неабходна перапісаць яго на HQL тады павінна працаваць.<br />\r\n<STRONG>TROUBLE HERE !!!!!!! BE CAREFUL;) <br />\r\nI KNOW YOU CAN SOLVE THIS PROBLEM :D I BIELIVE IN YOU. YOU CAN DO IT ;)))</STRONG>\r\n<br />\r\n<br />\r\nВывесці каментарыі з entity NewsComments апынулася не так складана, для гэта неабходна выкарыстоўваць не SQL запыт а HQL. Праблема ўзнікла з вывадам пад навінай сваіх каментарыяў, бо пакуль што я не ведаю як перапісаць вядомы мне SQL запыт на HQL\r\n<br />\r\n<br />\r\n\r\n</ul>\r\n<STRONG>OH YEEEEEEEE, BITCH !!!<br />\r\nI SOLVE THIS PROBLEM!<br />\r\nAND I HAPPY!<br />\r\nAND I SMILING !<br />\r\nAND I LOVING!<br /> </strong>','10:1 27.6.2015'),(25,'Блок \'\'бібліатэка\'\'','Пачынаю займацца блокам \'\'бібліатэка\'\'','1. Неабходна накідаць UI: знайсці карцінкі, зрабіць старонкі, аформіць.<br />\r\n2. Зрабіць вывад жанраў і кнігаў з дапамогай Sрring i Hibernate<br />\r\n3. Неабходна прадумаць узаемадзеянне з табліцамі, каб было мінімум jsp старонак для гэтага блоку<br />\r\n<br />\r\n<br />\r\nБылі напісаны entity для ўсіх патрэбных табліцаў з блоку \'\'бібліатэка\'\'. Прапісаны класы DAO i DAOImpl.<br />\r\nПамылак пакуль няма.<br />\r\n<br />\r\nЗасталося напісаць Service, ServiceImpl, Controller i JSP старонкі.<br />\r\n<br />\r\nService, ServiceImpl - напісаны. Заўтра буду займацца Controller i JSP<br />\r\n<br />\r\nДададзены запіс кніг, вывад па жанрах<br />\r\nЗ малюнкамі ;))<br />\r\nЗараз буду рабіць прагляд кнігі па id','10:10 30.6.2015'),(26,'Прагляд кнігаў','Дададзена магчымасць прагляду інфармацыі кнігі','Дададзена магчымасць прагляду інфармацыі кнігі. Скончана серверная частка для гэтай часткі, засталося толькі дадаць каментарыі пад кнігай і зрабіць прыгожым стылі.\r\n<br />\r\n<br />\r\nПеранесена на GitHub','11:44 30.6.2015'),(27,'Вывад навінаў з апошняй даданай','Вывад навінаў з апошняй даданай','Вывад навінаў з апошняй даданай. Перавеў з дапамогай цыкла for адзін list, што захоўваў навіны із бд у іншы list, каб атрымаць магчымасць вывадзіць спіс з канца. \r\n<br /><br />\r\n<img src=\"image/coverBooks/giperion.jpg\">\r\n<img src=\"image/programm/crbook.png\">','21:5 4.7.2015'),(28,'Дададзена сувязь паміж аўтарамі і кнігамі','Сёння была дададзена сувязь паміж аўтарамі і кнігамі','Была дададзена сувязь аўтараў і кнігаў. Для гэтага прыйшлося ставіць \'\'мыліцу\'\', бо з дапамогай дапаможнай табліцы не атрымалася. На што неабходна звярнуць увагу ў будучыні. Замест гэтага я дадаў новую калонку да табліцы books_web, адкуль і бяру ID аўтара для пераходу.','9:44 7.7.2015');
/*!40000 ALTER TABLE `news_web` ENABLE KEYS */;
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
