-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 21, 2023 at 05:11 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `alshifahospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `DName` varchar(200) NOT NULL,
  `DUsername` varchar(200) NOT NULL,
  `DPassword` varchar(200) NOT NULL,
  `DGender` varchar(200) NOT NULL,
  `DQualification` varchar(200) NOT NULL,
  `DDepartment` varchar(200) NOT NULL,
  `DDutyHours` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`DName`, `DUsername`, `DPassword`, `DGender`, `DQualification`, `DDepartment`, `DDutyHours`) VALUES
('', 'dsdsda', 'sds', '', '', '', ''),
('knmij', 'jij', 'ioi', 'ijij', 'iij', 'Physician', 'Day Duty'),
('', 'ojdo', 'ojss', '', '', '', ''),
('', '', '', '', '', 'Physician', 'Day Duty'),
('', '', '', '', '', '', ''),
('Ibtisam', 'ib', '0000', 'Male', 'Bachelors', 'Neurologist', 'Night Duty'),
('', 'Ibtisam', '0000', '', '', '', ''),
('Ainy', 'saa', '0000', 'F', 'F', 'Physician', 'Day Duty'),
('abcd', 'sas', 'sdksa', 'skd', 'sks', 'Physician', 'Day Duty'),
('', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `PName` varchar(200) NOT NULL,
  `PUsername` varchar(200) NOT NULL,
  `PPassword` varchar(200) NOT NULL,
  `PBloodGroup` varchar(200) NOT NULL,
  `PCity` varchar(200) NOT NULL,
  `PGender` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`PName`, `PUsername`, `PPassword`, `PBloodGroup`, `PCity`, `PGender`) VALUES
('iybiu', 'iuui', 'iuhiu', 'uui', 'iuui', 'hiuh'),
('', '', '', '', '', ''),
('Ibtisam', 'iiib', 'oao', 'kakxa', 'Okara', 'MALE');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
