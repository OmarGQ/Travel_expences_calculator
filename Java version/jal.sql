-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 16-06-2018 a las 17:25:09
-- Versión del servidor: 5.7.21
-- Versión de PHP: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `jal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cantidades`
--

DROP TABLE IF EXISTS `cantidades`;
CREATE TABLE IF NOT EXISTS `cantidades` (
  `destino_general` enum('1','2','3') NOT NULL COMMENT '-america 2-europa, asia, oceania y africa 3-mexico',
  `rango` enum('1','2','3') NOT NULL,
  `clase` enum('0','1','2') NOT NULL DEFAULT '0' COMMENT '0-null 1-vida cara 2-vida media',
  `desayuno` int(3) NOT NULL,
  `comida` int(3) NOT NULL,
  `cena` int(3) NOT NULL,
  `hospedaje` int(5) NOT NULL,
  `total_dia` int(5) NOT NULL,
  `moneda` enum('pesos','dollars') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cantidades`
--

INSERT INTO `cantidades` (`destino_general`, `rango`, `clase`, `desayuno`, `comida`, `cena`, `hospedaje`, `total_dia`, `moneda`) VALUES
('1', '1', '0', 38, 56, 94, 380, 568, 'dollars'),
('1', '2', '0', 32, 53, 65, 319, 469, 'dollars'),
('1', '3', '0', 18, 38, 48, 238, 342, 'dollars'),
('2', '1', '0', 42, 62, 105, 422, 631, 'dollars'),
('2', '2', '0', 36, 59, 72, 355, 522, 'dollars'),
('2', '3', '0', 20, 42, 53, 264, 379, 'dollars'),
('3', '1', '1', 220, 270, 220, 1515, 2225, 'pesos'),
('3', '2', '1', 166, 238, 166, 1211, 1781, 'pesos'),
('3', '3', '1', 128, 202, 128, 807, 1285, 'pesos'),
('3', '1', '2', 137, 220, 137, 1218, 1712, 'pesos'),
('3', '2', '2', 128, 183, 128, 867, 1306, 'pesos'),
('3', '3', '2', 92, 147, 92, 579, 910, 'pesos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contador`
--

DROP TABLE IF EXISTS `contador`;
CREATE TABLE IF NOT EXISTS `contador` (
  `Codigo_V` int(2) NOT NULL,
  `des` int(2) NOT NULL,
  `com` int(2) NOT NULL,
  `cen` int(2) NOT NULL,
  `hos` int(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `representante`
--

DROP TABLE IF EXISTS `representante`;
CREATE TABLE IF NOT EXISTS `representante` (
  `Registro` varchar(10) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido_P` varchar(20) NOT NULL,
  `Apellido_M` varchar(20) NOT NULL,
  `Rango` enum('1','2','3') NOT NULL,
  PRIMARY KEY (`Registro`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `representante`
--

INSERT INTO `representante` (`Registro`, `Nombre`, `Apellido_P`, `Apellido_M`, `Rango`) VALUES
('123', 'Aixa', 'Godinez', 'Quinones', '2'),
('541', 'Omar', 'Godinez', 'Quinones', '1'),
('134', 'Axel', 'Hernandez', 'Cardenaz', '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `ID` varchar(10) NOT NULL,
  `pasword` varchar(12) NOT NULL,
  `nivel` int(1) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `pasword`, `nivel`) VALUES
('dani', '3334', 2),
('julieta', '3334', 1),
('omar', '3334', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viaje`
--

DROP TABLE IF EXISTS `viaje`;
CREATE TABLE IF NOT EXISTS `viaje` (
  `Codigo` int(10) NOT NULL AUTO_INCREMENT,
  `Registro` varchar(10) NOT NULL,
  `destino_general` enum('1','2','3') NOT NULL COMMENT '1-america 2-europa, asia, oceania y africa 3-mexico',
  `Pais` varchar(10) NOT NULL,
  `Ciudad` varchar(20) NOT NULL,
  `Hora_S` int(4) NOT NULL,
  `Hora_R` int(4) NOT NULL,
  `Fecha_S` date NOT NULL,
  `Fecha_R` date NOT NULL,
  `Clase` enum('0','1','2') NOT NULL DEFAULT '0' COMMENT '0-null 1-vida cara 2-vida media',
  PRIMARY KEY (`Codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=378 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viaticos`
--

DROP TABLE IF EXISTS `viaticos`;
CREATE TABLE IF NOT EXISTS `viaticos` (
  `Codigo_V` int(10) NOT NULL AUTO_INCREMENT,
  `Codigo` int(10) NOT NULL,
  `Desayunos` int(5) NOT NULL,
  `Comidas` int(5) NOT NULL,
  `Cenas` int(5) NOT NULL,
  `Hospedaje` int(6) NOT NULL,
  `Lavanderia` int(3) NOT NULL,
  `Combustible` int(4) NOT NULL,
  `Total_D` int(6) NOT NULL,
  `Total_P` int(6) NOT NULL,
  `Confirmacion` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Codigo_V`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
