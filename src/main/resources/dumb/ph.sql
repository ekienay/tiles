-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: photo
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gal`
--

DROP TABLE IF EXISTS `gal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gal` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  `cost` double NOT NULL,
  `active` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gal`
--

LOCK TABLES `gal` WRITE;
/*!40000 ALTER TABLE `gal` DISABLE KEYS */;
INSERT INTO `gal` VALUES (1,'Постельное белье Модное CL120','images\\1.jpg',2800,'1'),(2,'Покрывало однотонное двустороннее и две наволочки ODP005','images\\2.jpg',2300,'1'),(3,'Комплект постельного белья Делюкс Сатин L235','images\\3.jpg',1300,''),(4,'Покрывало стеганое однотонное и две наволочки OP022','images\\4.jpg',2130,''),(5,'Комплект постельного белья Сатин Премиум CPA027','images\\5.jpg',1834,'1'),(6,'Комплект постельного белья Сатин Вышивка CN021','images\\6.jpg',2131,'1'),(7,'Комплект постельного белья Делюкс Сатин на резинке LR247','images\\7.jpg',8900,''),(8,'Комплект постельного белья Делюкс Сатин L119','images\\8.jpg',7800,'1'),(9,'Комплект постельного белья Жаккард с Вышивкой H045','images\\9.jpg',1230,''),(10,'Комплект постельного белья Сатин Экстра на резинке CPTR020','images\\10.jpg',900,''),(11,'Декоративное покрывало и две наволочки DP001','images\\11.jpg',4498,'1'),(12,'Постельное белье Страйп Сатин Однотонный CT006','images\\12.jpg',5943,'');
/*!40000 ALTER TABLE `gal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-07 21:31:48
