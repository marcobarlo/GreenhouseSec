-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versione server:              10.5.8-MariaDB-1:10.5.8+maria~focal - mariadb.org binary distribution
-- S.O. server:                  debian-linux-gnu
-- HeidiSQL Versione:            11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dump della struttura del database greenhouse
CREATE DATABASE IF NOT EXISTS `greenhouse` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `greenhouse`;

-- Dump della struttura di tabella greenhouse.Ambiente
CREATE TABLE IF NOT EXISTS `Ambiente` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `TemperaturaTarget` float DEFAULT NULL,
  `IrradianzaTarget` float DEFAULT NULL,
  `UmiditaSuoloTarget` float DEFAULT NULL,
  `SogliaTemp` float NOT NULL,
  `SogliaIrr` float NOT NULL,
  `SogliaUmi` float NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4;

-- Dump dei dati della tabella greenhouse.Ambiente: ~30 rows (circa)
DELETE FROM `Ambiente`;
/*!40000 ALTER TABLE `Ambiente` DISABLE KEYS */;
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(1, 4.66, 1.56, 15, 0.375, 375.8, 1.025);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(2, 6.02, 1.9, 0, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(3, 9.32, 3.12, 31, 0.75, 751.6, 2.05);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(4, 12.04, 3.8, 12, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(5, 13.98, 4.68, 46, 1.125, 1127.4, 3.075);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(6, 18.06, 5.7, 24, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(7, 18.64, 6.24, 62, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(8, 24.08, 7.6, 36, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(9, 23.3, 7.8, 78, 1.875, 1879, 5.125);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(10, 30.1, 9.5, 48, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(11, 27.96, 9.36, 93, 2.25, 2254.8, 6.15);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(12, 36.12, 11.4, 60, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(13, 32.62, 10.92, 109, 2.625, 2630.6, 7.175);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(14, 42.14, 13.3, 72, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(15, 37.28, 12.48, 124, 3, 3006.4, 8.2);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(16, 48.16, 15.2, 84, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(17, 41.94, 14.04, 140, 3.375, 3382.2, 9.225);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(18, 54.18, 17.1, 96, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(19, 46.6, 15.6, 156, 3.75, 3758, 10.25);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(20, 60.2, 19, 108, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(21, 51.26, 17.16, 171, 4.125, 4133.8, 11.275);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(22, 66.22, 20.9, 120, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(23, 55.92, 18.72, 187, 4.5, 4509.6, 12.3);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(24, 72.24, 22.8, 132, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(25, 60.58, 20.28, 202, 4.875, 4885.4, 13.325);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(26, 78.26, 24.7, 144, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(27, 65.24, 21.84, 218, 5.25, 5261.2, 14.35);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(28, 84.28, 26.6, 156, 1.5, 1503.2, 4.1);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(29, 69.9, 23.4, 234, 5.625, 5637, 15.375);
INSERT INTO `Ambiente` (`ID`, `TemperaturaTarget`, `IrradianzaTarget`, `UmiditaSuoloTarget`, `SogliaTemp`, `SogliaIrr`, `SogliaUmi`) VALUES
	(30, 90.3, 28.5, 168, 1.5, 1503.2, 4.1);
/*!40000 ALTER TABLE `Ambiente` ENABLE KEYS */;

-- Dump della struttura di tabella greenhouse.AreaColtivata
CREATE TABLE IF NOT EXISTS `AreaColtivata` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `ColtivazioneID` int(10) DEFAULT NULL,
  `SezioneID` int(10) NOT NULL,
  `Fila` int(10) NOT NULL,
  `Posizione` int(10) NOT NULL,
  `Estensione` float NOT NULL,
  `Tipo_di_terreno` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `composta da` (`SezioneID`),
  KEY `Si trova  in` (`ColtivazioneID`),
  CONSTRAINT `Si trova  in` FOREIGN KEY (`ColtivazioneID`) REFERENCES `Coltivazione` (`ID`),
  CONSTRAINT `composta da` FOREIGN KEY (`SezioneID`) REFERENCES `Sezione` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4;

-- Dump dei dati della tabella greenhouse.AreaColtivata: ~30 rows (circa)
DELETE FROM `AreaColtivata`;
/*!40000 ALTER TABLE `AreaColtivata` DISABLE KEYS */;
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(1, 1, 1, 1, 0, 6.48, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(2, 2, 1, 2, 0, 11.475, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(3, 4, 2, 2, 1, 22.95, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(4, 3, 2, 1, 1, 12.96, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(5, 6, 3, 2, 2, 34.425, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(6, 5, 3, 1, 2, 19.44, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(7, 7, 4, 1, 3, 25.92, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(8, 8, 4, 2, 3, 45.9, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(9, 9, 5, 1, 4, 32.4, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(10, 10, 5, 2, 4, 57.375, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(11, 11, 1, 1, 5, 38.88, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(12, 12, 1, 2, 5, 68.85, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(13, 13, 2, 1, 6, 45.36, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(14, 14, 2, 2, 6, 80.325, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(15, 15, 3, 1, 7, 51.84, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(16, 16, 3, 2, 7, 91.8, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(17, 17, 4, 1, 8, 58.32, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(18, 18, 4, 2, 8, 103.275, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(19, 19, 5, 1, 9, 64.8, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(20, 20, 5, 2, 9, 114.75, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(21, 21, 1, 1, 10, 71.28, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(22, 22, 1, 2, 10, 126.225, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(23, 23, 2, 1, 11, 77.76, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(24, 24, 2, 2, 11, 137.7, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(25, 25, 3, 1, 12, 84.24, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(26, 26, 3, 2, 12, 149.175, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(27, 27, 4, 1, 13, 90.72, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(28, 28, 4, 2, 13, 160.65, 'poco fertile, buono per i cactus');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(29, 29, 5, 1, 14, 97.2, 'abbastanza fertile');
INSERT INTO `AreaColtivata` (`ID`, `ColtivazioneID`, `SezioneID`, `Fila`, `Posizione`, `Estensione`, `Tipo_di_terreno`) VALUES
	(30, 30, 5, 2, 14, 172.125, 'poco fertile, buono per i cactus');
/*!40000 ALTER TABLE `AreaColtivata` ENABLE KEYS */;

-- Dump della struttura di tabella greenhouse.Coltivazione
CREATE TABLE IF NOT EXISTS `Coltivazione` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `AmbienteID` int(10) NOT NULL,
  `DescrizioneColtivazioneID` int(10) NOT NULL,
  `Stato` varchar(255) DEFAULT NULL,
  `Data_prossima_operazione` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKColtivazio308562` (`DescrizioneColtivazioneID`),
  KEY `FKColtivazio660064` (`AmbienteID`),
  CONSTRAINT `FKColtivazio308562` FOREIGN KEY (`DescrizioneColtivazioneID`) REFERENCES `DescrizioneColtivazione` (`ID`),
  CONSTRAINT `FKColtivazio660064` FOREIGN KEY (`AmbienteID`) REFERENCES `Ambiente` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4;

-- Dump dei dati della tabella greenhouse.Coltivazione: ~30 rows (circa)
DELETE FROM `Coltivazione`;
/*!40000 ALTER TABLE `Coltivazione` DISABLE KEYS */;
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(1, 1, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(2, 2, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(3, 3, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(4, 4, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(5, 5, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(6, 6, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(7, 7, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(8, 8, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(9, 9, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(10, 10, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(11, 11, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(12, 12, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(13, 13, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(14, 14, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(15, 15, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(16, 16, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(17, 17, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(18, 18, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(19, 19, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(20, 20, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(21, 21, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(22, 22, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(23, 23, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(24, 24, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(25, 25, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(26, 26, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(27, 27, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(28, 28, 2, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(29, 29, 1, NULL, '2020-12-03');
INSERT INTO `Coltivazione` (`ID`, `AmbienteID`, `DescrizioneColtivazioneID`, `Stato`, `Data_prossima_operazione`) VALUES
	(30, 30, 2, NULL, '2020-12-03');
/*!40000 ALTER TABLE `Coltivazione` ENABLE KEYS */;

-- Dump della struttura di tabella greenhouse.Coltivazione_Impiegato
CREATE TABLE IF NOT EXISTS `Coltivazione_Impiegato` (
  `ColtivazioneID` int(10) NOT NULL,
  `ImpiegatoID` int(10) NOT NULL,
  PRIMARY KEY (`ColtivazioneID`,`ImpiegatoID`),
  KEY `FKColtivazio285166` (`ImpiegatoID`),
  CONSTRAINT `FKColtivazio285166` FOREIGN KEY (`ImpiegatoID`) REFERENCES `Impiegato` (`ID`),
  CONSTRAINT `FKColtivazio887115` FOREIGN KEY (`ColtivazioneID`) REFERENCES `Coltivazione` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dump dei dati della tabella greenhouse.Coltivazione_Impiegato: ~0 rows (circa)
DELETE FROM `Coltivazione_Impiegato`;
/*!40000 ALTER TABLE `Coltivazione_Impiegato` DISABLE KEYS */;
/*!40000 ALTER TABLE `Coltivazione_Impiegato` ENABLE KEYS */;

-- Dump della struttura di tabella greenhouse.DescrizioneColtivazione
CREATE TABLE IF NOT EXISTS `DescrizioneColtivazione` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(255) DEFAULT NULL,
  `Descrizione` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Dump dei dati della tabella greenhouse.DescrizioneColtivazione: ~2 rows (circa)
DELETE FROM `DescrizioneColtivazione`;
/*!40000 ALTER TABLE `DescrizioneColtivazione` DISABLE KEYS */;
INSERT INTO `DescrizioneColtivazione` (`ID`, `Tipo`, `Descrizione`) VALUES
	(1, 'pomodori', 'ci sono dei bei pomodori succosi, qua si fa una grande passata');
INSERT INTO `DescrizioneColtivazione` (`ID`, `Tipo`, `Descrizione`) VALUES
	(2, 'fichi', 'che fico, ho piantato dei fichi');
/*!40000 ALTER TABLE `DescrizioneColtivazione` ENABLE KEYS */;

-- Dump della struttura di tabella greenhouse.Impiegato
CREATE TABLE IF NOT EXISTS `Impiegato` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `Email` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Ruolo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- Dump dei dati della tabella greenhouse.Impiegato: ~4 rows (circa)
DELETE FROM `Impiegato`;
/*!40000 ALTER TABLE `Impiegato` DISABLE KEYS */;
INSERT INTO `Impiegato` (`ID`, `Email`, `Password`, `Ruolo`) VALUES
	(1, 'mariorossi@unina.it', '5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8', 'direttore');
INSERT INTO `Impiegato` (`ID`, `Email`, `Password`, `Ruolo`) VALUES
	(2, 'marcobarlo@hotmail.it', '5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8', 'agronomo');
INSERT INTO `Impiegato` (`ID`, `Email`, `Password`, `Ruolo`) VALUES
	(3, 'ravens@unina.it', '5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8', 'responsabile_software');
INSERT INTO `Impiegato` (`ID`, `Email`, `Password`, `Ruolo`) VALUES
	(4, 'amarchetta@hotmail.it', '5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8', 'operaio');
/*!40000 ALTER TABLE `Impiegato` ENABLE KEYS */;

-- Dump della struttura di tabella greenhouse.Sezione
CREATE TABLE IF NOT EXISTS `Sezione` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Dump dei dati della tabella greenhouse.Sezione: ~5 rows (circa)
DELETE FROM `Sezione`;
/*!40000 ALTER TABLE `Sezione` DISABLE KEYS */;
INSERT INTO `Sezione` (`ID`) VALUES
	(1);
INSERT INTO `Sezione` (`ID`) VALUES
	(2);
INSERT INTO `Sezione` (`ID`) VALUES
	(3);
INSERT INTO `Sezione` (`ID`) VALUES
	(4);
INSERT INTO `Sezione` (`ID`) VALUES
	(5);
/*!40000 ALTER TABLE `Sezione` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

CREATE USER IF NOT EXISTS 'ServerGH'@'%' IDENTIFIED BY 'password';
GRANT SELECT, SHOW DATABASES, SHOW VIEW, INSERT, DELETE, UPDATE, EXECUTE, CREATE VIEW  ON greenhouse.* TO 'ServerGH'@'%' REQUIRE ISSUER '/C=IT/ST=Italia/L=Napoli/O=TrioDeDangers/OU=GH/CN=MariaDB admin' SUBJECT '/C=IT/ST=Italia/L=Napoli/O=TrioDeDangers/OU=GH/CN=MariaDB user';
FLUSH PRIVILEGES;
