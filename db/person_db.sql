-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: person_db
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_person`
--

DROP TABLE IF EXISTS `tbl_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_person` (
  `person_id` bigint NOT NULL AUTO_INCREMENT,
  `person_age` int DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `person_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`person_id`),
  FULLTEXT KEY `person_name` (`person_name`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_person`
--

LOCK TABLES `tbl_person` WRITE;
/*!40000 ALTER TABLE `tbl_person` DISABLE KEYS */;
INSERT INTO `tbl_person` VALUES (1,20,'MALE','Edward'),(2,20,'FEMALE','Amanda'),(3,22,'MALE','John'),(4,22,'FEMALE','Lorraine'),(5,22,'FEMALE','Leslie'),(6,23,'MALE','Daniel'),(7,21,'MALE','Mark'),(8,22,'MALE','Edward'),(9,23,'FEMALE','Hannah'),(10,20,'FEMALE','Jeanne'),(11,20,'MALE','Curtis'),(12,23,'FEMALE','Marie'),(13,23,'MALE','Frank'),(14,23,'FEMALE','Trinh'),(15,22,'FEMALE','Harriet'),(16,21,'MALE','Thomas'),(17,22,'MALE','Johnny'),(18,21,'FEMALE','Tempie'),(19,20,'MALE','Ricky'),(20,21,'FEMALE','Sharon'),(21,22,'FEMALE','Ida'),(22,23,'MALE','Eric'),(23,21,'MALE','Damian'),(24,21,'FEMALE','Pamela'),(25,23,'MALE','Brandon'),(26,20,'MALE','Phil'),(27,20,'MALE','Brian'),(28,23,'FEMALE','Altagracia'),(29,23,'FEMALE','Julia'),(30,22,'FEMALE','Bernice'),(31,22,'MALE','Bruno'),(32,23,'FEMALE','Alma'),(33,22,'MALE','Dale'),(34,23,'MALE','John'),(35,23,'MALE','Greg'),(36,22,'FEMALE','Marlene'),(37,20,'FEMALE','Kimi'),(38,21,'FEMALE','Wendi'),(39,22,'MALE','Todd'),(40,21,'FEMALE','Annette'),(41,20,'MALE','Roy'),(42,23,'MALE','Thomas'),(43,23,'MALE','Robert'),(44,20,'FEMALE','Chandra'),(45,20,'FEMALE','Kathi'),(46,20,'FEMALE','Priscilla'),(47,22,'FEMALE','Sharon'),(48,21,'MALE','Salvador'),(49,22,'FEMALE','Bobbie'),(50,20,'MALE','Richard'),(51,20,'FEMALE','Ann'),(52,22,'MALE','Bobbie'),(53,20,'MALE','Albert'),(54,22,'MALE','Ruben'),(55,22,'FEMALE','Patricia'),(56,21,'MALE','Johnny'),(57,20,'FEMALE','Eva'),(58,23,'FEMALE','Rebecca'),(59,22,'MALE','James'),(60,23,'MALE','Jim'),(61,22,'FEMALE','Gaylene'),(62,21,'MALE','Terry'),(63,21,'FEMALE','Alena'),(64,21,'FEMALE','Benita'),(65,21,'FEMALE','Vanessa'),(66,23,'FEMALE','Aisha'),(67,23,'MALE','Robert'),(68,23,'FEMALE','Renee'),(69,20,'MALE','Angelo'),(70,22,'MALE','William'),(71,23,'MALE','Clarence'),(72,23,'MALE','Samuel'),(73,22,'FEMALE','Marilyn'),(74,20,'FEMALE','Tammy'),(75,20,'MALE','Thomas'),(76,21,'MALE','Lucien'),(77,21,'FEMALE','Karen'),(78,20,'FEMALE','Tina'),(79,20,'FEMALE','Kimberly'),(80,22,'FEMALE','Sadie'),(81,22,'MALE','John'),(82,21,'FEMALE','Linda'),(83,22,'MALE','William'),(84,23,'MALE','David'),(85,23,'MALE','Joseph'),(86,20,'FEMALE','Cori'),(87,20,'MALE','Michael'),(88,22,'FEMALE','Jessica'),(89,23,'MALE','Nicholas'),(90,21,'MALE','Alfred'),(91,22,'FEMALE','Christine'),(92,22,'MALE','Nicholas'),(93,23,'MALE','Robert'),(94,20,'MALE','Steven'),(95,20,'MALE','Edward'),(96,23,'FEMALE','Linda'),(97,20,'FEMALE','Laura'),(98,21,'FEMALE','Mary'),(99,23,'MALE','Michael'),(100,20,'MALE','Mario');
/*!40000 ALTER TABLE `tbl_person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-10 17:47:59
