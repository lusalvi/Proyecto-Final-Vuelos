CREATE DATABASE  IF NOT EXISTS `db_vuelos` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;
USE `db_vuelos`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_vuelos
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `aerolinea`
--

DROP TABLE IF EXISTS `aerolinea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aerolinea` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aerolinea`
--

LOCK TABLES `aerolinea` WRITE;
/*!40000 ALTER TABLE `aerolinea` DISABLE KEYS */;
INSERT INTO `aerolinea` VALUES (1,'Aerolíneas Argentinas'),(2,'Flybondi'),(3,'JetSmart');
/*!40000 ALTER TABLE `aerolinea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aerolinea_aud`
--

DROP TABLE IF EXISTS `aerolinea_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aerolinea_aud` (
  `id` bigint(20) NOT NULL,
  `rev` int(11) NOT NULL,
  `revtype` tinyint(4) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rev`,`id`),
  CONSTRAINT `FKare3bxid6inj0map9pt3onu1g` FOREIGN KEY (`rev`) REFERENCES `revision_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aerolinea_aud`
--

LOCK TABLES `aerolinea_aud` WRITE;
/*!40000 ALTER TABLE `aerolinea_aud` DISABLE KEYS */;
/*!40000 ALTER TABLE `aerolinea_aud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aeropuerto`
--

DROP TABLE IF EXISTS `aeropuerto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aeropuerto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `id_ciudad` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKaw4khhvymut34w8wu9xgn655` (`id_ciudad`),
  CONSTRAINT `FKaw4khhvymut34w8wu9xgn655` FOREIGN KEY (`id_ciudad`) REFERENCES `ciudad` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aeropuerto`
--

LOCK TABLES `aeropuerto` WRITE;
/*!40000 ALTER TABLE `aeropuerto` DISABLE KEYS */;
INSERT INTO `aeropuerto` VALUES (1,'Aeropuerto Internacional Ezeiza',1),(2,'Aeropuerto Ingeniero Taravella',2),(3,'Aeropuerto Internacional El Plumerillo',3),(4,'Aeropuerto Internacional Martín Miguel de Güemes',4);
/*!40000 ALTER TABLE `aeropuerto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aeropuerto_aud`
--

DROP TABLE IF EXISTS `aeropuerto_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aeropuerto_aud` (
  `id` bigint(20) NOT NULL,
  `rev` int(11) NOT NULL,
  `revtype` tinyint(4) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `id_ciudad` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`rev`,`id`),
  CONSTRAINT `FK1cuu0dlpbfgnsvenklp5xeijs` FOREIGN KEY (`rev`) REFERENCES `revision_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aeropuerto_aud`
--

LOCK TABLES `aeropuerto_aud` WRITE;
/*!40000 ALTER TABLE `aeropuerto_aud` DISABLE KEYS */;
/*!40000 ALTER TABLE `aeropuerto_aud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ciudad`
--

DROP TABLE IF EXISTS `ciudad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciudad` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudad`
--

LOCK TABLES `ciudad` WRITE;
/*!40000 ALTER TABLE `ciudad` DISABLE KEYS */;
INSERT INTO `ciudad` VALUES (1,'Buenos Aires'),(2,'Córdoba'),(3,'Mendoza'),(4,'Salta');
/*!40000 ALTER TABLE `ciudad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ciudad_aud`
--

DROP TABLE IF EXISTS `ciudad_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciudad_aud` (
  `id` bigint(20) NOT NULL,
  `rev` int(11) NOT NULL,
  `revtype` tinyint(4) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rev`,`id`),
  CONSTRAINT `FKe127d9nqt803e0dador746d45` FOREIGN KEY (`rev`) REFERENCES `revision_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudad_aud`
--

LOCK TABLES `ciudad_aud` WRITE;
/*!40000 ALTER TABLE `ciudad_aud` DISABLE KEYS */;
/*!40000 ALTER TABLE `ciudad_aud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reserva` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_tarjeta` bigint(20) DEFAULT NULL,
  `id_vuelo` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKm78mhs4klnroevm5km6qaiw4s` (`id_tarjeta`),
  KEY `FK9f761ftgjyvq4n6xtamswsxiu` (`id_vuelo`),
  CONSTRAINT `FK9f761ftgjyvq4n6xtamswsxiu` FOREIGN KEY (`id_vuelo`) REFERENCES `vuelo` (`id`),
  CONSTRAINT `FKm78mhs4klnroevm5km6qaiw4s` FOREIGN KEY (`id_tarjeta`) REFERENCES `tarjeta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (1,1,1),(2,2,1),(3,3,1);
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva_aud`
--

DROP TABLE IF EXISTS `reserva_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reserva_aud` (
  `id` bigint(20) NOT NULL,
  `rev` int(11) NOT NULL,
  `revtype` tinyint(4) DEFAULT NULL,
  `id_tarjeta` bigint(20) DEFAULT NULL,
  `id_vuelo` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`rev`,`id`),
  CONSTRAINT `FK13mqfdkq4qtblio07dfoj4q6k` FOREIGN KEY (`rev`) REFERENCES `revision_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva_aud`
--

LOCK TABLES `reserva_aud` WRITE;
/*!40000 ALTER TABLE `reserva_aud` DISABLE KEYS */;
INSERT INTO `reserva_aud` VALUES (1,3,0,1,1),(2,54,0,2,1),(3,104,0,3,1);
/*!40000 ALTER TABLE `reserva_aud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `revision_info`
--

DROP TABLE IF EXISTS `revision_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `revision_info` (
  `id` int(11) NOT NULL,
  `revision_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `revision_info`
--

LOCK TABLES `revision_info` WRITE;
/*!40000 ALTER TABLE `revision_info` DISABLE KEYS */;
INSERT INTO `revision_info` VALUES (1,'2025-06-15 03:08:27.000000'),(2,'2025-06-15 03:08:27.000000'),(3,'2025-06-15 03:08:27.000000'),(52,'2025-06-15 03:12:50.000000'),(53,'2025-06-15 03:12:51.000000'),(54,'2025-06-15 03:12:51.000000'),(102,'2025-06-15 03:21:41.000000'),(103,'2025-06-15 03:21:41.000000'),(104,'2025-06-15 03:21:42.000000');
/*!40000 ALTER TABLE `revision_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seq_revision_id`
--

DROP TABLE IF EXISTS `seq_revision_id`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seq_revision_id` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seq_revision_id`
--

LOCK TABLES `seq_revision_id` WRITE;
/*!40000 ALTER TABLE `seq_revision_id` DISABLE KEYS */;
INSERT INTO `seq_revision_id` VALUES (201);
/*!40000 ALTER TABLE `seq_revision_id` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarifa`
--

DROP TABLE IF EXISTS `tarifa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarifa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `clase_tarifa` varchar(255) DEFAULT NULL,
  `impuesto_tarifa` int(11) DEFAULT NULL,
  `precio_tarifa` int(11) DEFAULT NULL,
  `id_vuelo` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKd5p38rr2tjl8rrjaxv4g9ne8p` (`id_vuelo`),
  CONSTRAINT `FKd5p38rr2tjl8rrjaxv4g9ne8p` FOREIGN KEY (`id_vuelo`) REFERENCES `vuelo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarifa`
--

LOCK TABLES `tarifa` WRITE;
/*!40000 ALTER TABLE `tarifa` DISABLE KEYS */;
INSERT INTO `tarifa` VALUES (1,'BUSINESS',1500,10000,1),(2,'TURISTA',1000,7000,1),(3,'ECONOMICA',500,5000,1),(4,'BUSINESS',1700,11000,2),(5,'TURISTA',1100,7500,2),(6,'ECONOMICA',600,5200,2),(7,'BUSINESS',1800,12000,3),(8,'TURISTA',1200,8000,3),(9,'ECONOMICA',700,5500,3);
/*!40000 ALTER TABLE `tarifa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarifa_aud`
--

DROP TABLE IF EXISTS `tarifa_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarifa_aud` (
  `id` bigint(20) NOT NULL,
  `rev` int(11) NOT NULL,
  `revtype` tinyint(4) DEFAULT NULL,
  `clase_tarifa` varchar(255) DEFAULT NULL,
  `impuesto_tarifa` int(11) DEFAULT NULL,
  `precio_tarifa` int(11) DEFAULT NULL,
  `id_vuelo` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`rev`,`id`),
  CONSTRAINT `FKisixppclmmwkk9d7ssrfiq928` FOREIGN KEY (`rev`) REFERENCES `revision_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarifa_aud`
--

LOCK TABLES `tarifa_aud` WRITE;
/*!40000 ALTER TABLE `tarifa_aud` DISABLE KEYS */;
/*!40000 ALTER TABLE `tarifa_aud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarjeta`
--

DROP TABLE IF EXISTS `tarjeta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarjeta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cantidad_pago` int(11) DEFAULT NULL,
  `numero_tarjeta` bigint(20) DEFAULT NULL,
  `tipo_tarjeta` varchar(255) DEFAULT NULL,
  `id_usuario` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKeotjren5ys0pqv54katiq8bo9` (`id_usuario`),
  CONSTRAINT `FKeotjren5ys0pqv54katiq8bo9` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarjeta`
--

LOCK TABLES `tarjeta` WRITE;
/*!40000 ALTER TABLE `tarjeta` DISABLE KEYS */;
INSERT INTO `tarjeta` VALUES (1,8000,12345678901,'DEBITO',1),(2,8000,76543217654,'DEBITO',2),(3,11500,1748252873,'CREDITO',3);
/*!40000 ALTER TABLE `tarjeta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarjeta_aud`
--

DROP TABLE IF EXISTS `tarjeta_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarjeta_aud` (
  `id` bigint(20) NOT NULL,
  `rev` int(11) NOT NULL,
  `revtype` tinyint(4) DEFAULT NULL,
  `cantidad_pago` int(11) DEFAULT NULL,
  `numero_tarjeta` bigint(20) DEFAULT NULL,
  `tipo_tarjeta` varchar(255) DEFAULT NULL,
  `id_usuario` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`rev`,`id`),
  CONSTRAINT `FKl20amwachhqfiu3an4xro9mxm` FOREIGN KEY (`rev`) REFERENCES `revision_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarjeta_aud`
--

LOCK TABLES `tarjeta_aud` WRITE;
/*!40000 ALTER TABLE `tarjeta_aud` DISABLE KEYS */;
INSERT INTO `tarjeta_aud` VALUES (1,2,0,8000,12345678901,'DEBITO',1),(2,53,0,8000,76543217654,'DEBITO',2),(3,103,0,11500,1748252873,'CREDITO',3);
/*!40000 ALTER TABLE `tarjeta_aud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `correo_electronico_usuario` varchar(255) DEFAULT NULL,
  `dni` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Salvi','1234','laysalvi@gmail.com',45718620,'Lucía'),(2,'Perez','12345','juanperez@gmail.com',12345678,'Juan'),(3,'Lopez','54321','roxilopez@gmail.com',32456789,'Roxana');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_aud`
--

DROP TABLE IF EXISTS `usuario_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario_aud` (
  `id` bigint(20) NOT NULL,
  `rev` int(11) NOT NULL,
  `revtype` tinyint(4) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `correo_electronico_usuario` varchar(255) DEFAULT NULL,
  `dni` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rev`,`id`),
  CONSTRAINT `FKbj3yn6frag5mpexsxplkregwf` FOREIGN KEY (`rev`) REFERENCES `revision_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_aud`
--

LOCK TABLES `usuario_aud` WRITE;
/*!40000 ALTER TABLE `usuario_aud` DISABLE KEYS */;
INSERT INTO `usuario_aud` VALUES (1,1,0,'Salvi','1234','laysalvi@gmail.com',45718620,'Lucía'),(1,2,1,'Salvi','1234','laysalvi@gmail.com',45718620,'Lucía'),(2,52,0,'Perez','12345','juanperez@gmail.com',12345678,'Juan'),(2,53,1,'Perez','12345','juanperez@gmail.com',12345678,'Juan'),(3,102,0,'Lopez','54321','roxilopez@gmail.com',32456789,'Roxana'),(3,103,1,'Lopez','54321','roxilopez@gmail.com',32456789,'Roxana');
/*!40000 ALTER TABLE `usuario_aud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vuelo`
--

DROP TABLE IF EXISTS `vuelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vuelo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fecha_vuelo` date DEFAULT NULL,
  `id_aerolinea` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6rcasheqx4kka5foymny6v5p0` (`id_aerolinea`),
  CONSTRAINT `FK6rcasheqx4kka5foymny6v5p0` FOREIGN KEY (`id_aerolinea`) REFERENCES `aerolinea` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vuelo`
--

LOCK TABLES `vuelo` WRITE;
/*!40000 ALTER TABLE `vuelo` DISABLE KEYS */;
INSERT INTO `vuelo` VALUES (1,'2025-06-20',1),(2,'2025-06-21',2),(3,'2025-06-22',3);
/*!40000 ALTER TABLE `vuelo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vuelo_aeropuerto`
--

DROP TABLE IF EXISTS `vuelo_aeropuerto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vuelo_aeropuerto` (
  `id_vuelo` bigint(20) NOT NULL,
  `id_aeropuerto` bigint(20) NOT NULL,
  KEY `FKoac6ppxy513sh0wx0jwy7a094` (`id_aeropuerto`),
  KEY `FKdjw5hciorqeax9s0ldstvyt9u` (`id_vuelo`),
  CONSTRAINT `FKdjw5hciorqeax9s0ldstvyt9u` FOREIGN KEY (`id_vuelo`) REFERENCES `vuelo` (`id`),
  CONSTRAINT `FKoac6ppxy513sh0wx0jwy7a094` FOREIGN KEY (`id_aeropuerto`) REFERENCES `aeropuerto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vuelo_aeropuerto`
--

LOCK TABLES `vuelo_aeropuerto` WRITE;
/*!40000 ALTER TABLE `vuelo_aeropuerto` DISABLE KEYS */;
INSERT INTO `vuelo_aeropuerto` VALUES (1,1),(1,2),(2,2),(2,3),(3,3),(3,4);
/*!40000 ALTER TABLE `vuelo_aeropuerto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vuelo_aeropuerto_aud`
--

DROP TABLE IF EXISTS `vuelo_aeropuerto_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vuelo_aeropuerto_aud` (
  `rev` int(11) NOT NULL,
  `id_vuelo` bigint(20) NOT NULL,
  `id_aeropuerto` bigint(20) NOT NULL,
  `revtype` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`rev`,`id_vuelo`,`id_aeropuerto`),
  CONSTRAINT `FKewtpk3dd6tb96rcan902dm9hh` FOREIGN KEY (`rev`) REFERENCES `revision_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vuelo_aeropuerto_aud`
--

LOCK TABLES `vuelo_aeropuerto_aud` WRITE;
/*!40000 ALTER TABLE `vuelo_aeropuerto_aud` DISABLE KEYS */;
/*!40000 ALTER TABLE `vuelo_aeropuerto_aud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vuelo_aud`
--

DROP TABLE IF EXISTS `vuelo_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vuelo_aud` (
  `id` bigint(20) NOT NULL,
  `rev` int(11) NOT NULL,
  `revtype` tinyint(4) DEFAULT NULL,
  `fecha_vuelo` date DEFAULT NULL,
  `id_aerolinea` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`rev`,`id`),
  CONSTRAINT `FKiqp0uroln8bl80fi972moedv1` FOREIGN KEY (`rev`) REFERENCES `revision_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vuelo_aud`
--

LOCK TABLES `vuelo_aud` WRITE;
/*!40000 ALTER TABLE `vuelo_aud` DISABLE KEYS */;
/*!40000 ALTER TABLE `vuelo_aud` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-15  0:27:04
