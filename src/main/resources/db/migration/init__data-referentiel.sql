-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 15 fév. 2023 à 11:44
-- Version du serveur : 10.4.27-MariaDB
-- Version de PHP : 7.4.33

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `radiotherapie`
--

--
-- Déchargement des données de la table `categorie_personnel_seq`
--

INSERT INTO `categorie_personnel_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `consultation_radiotherapie_seq`
--

INSERT INTO `consultation_radiotherapie_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `decision_traitement_seq`
--

INSERT INTO `decision_traitement_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `etablissement_seq`
--

INSERT INTO `etablissement_seq` (`next_val`) VALUES
(1);

--
-- Déchargement des données de la table `frequence_radiotherapie_seq`
--

INSERT INTO `frequence_radiotherapie_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `grade_toxicite_rth`
--

INSERT INTO `grade_toxicite_rth` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `code`, `libelle`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `services`) VALUES
(1, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 1, 'gradeToxiciteRth 1', 'gradeToxiciteRth 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 2, 'gradeToxiciteRth 2', 'gradeToxiciteRth 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 3, 'gradeToxiciteRth 3', 'gradeToxiciteRth 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 4, 'gradeToxiciteRth 4', 'gradeToxiciteRth 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 5, 'gradeToxiciteRth 5', 'gradeToxiciteRth 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 6, 'gradeToxiciteRth 6', 'gradeToxiciteRth 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 7, 'gradeToxiciteRth 7', 'gradeToxiciteRth 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 8, 'gradeToxiciteRth 8', 'gradeToxiciteRth 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 9, 'gradeToxiciteRth 9', 'gradeToxiciteRth 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 10, 'gradeToxiciteRth 10', 'gradeToxiciteRth 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 11, 'gradeToxiciteRth 11', 'gradeToxiciteRth 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 12, 'gradeToxiciteRth 12', 'gradeToxiciteRth 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 13, 'gradeToxiciteRth 13', 'gradeToxiciteRth 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 14, 'gradeToxiciteRth 14', 'gradeToxiciteRth 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 15, 'gradeToxiciteRth 15', 'gradeToxiciteRth 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 16, 'gradeToxiciteRth 16', 'gradeToxiciteRth 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 17, 'gradeToxiciteRth 17', 'gradeToxiciteRth 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 18, 'gradeToxiciteRth 18', 'gradeToxiciteRth 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 19, 'gradeToxiciteRth 19', 'gradeToxiciteRth 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 20, 'gradeToxiciteRth 20', 'gradeToxiciteRth 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 21, 'gradeToxiciteRth 21', 'gradeToxiciteRth 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 22, 'gradeToxiciteRth 22', 'gradeToxiciteRth 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 23, 'gradeToxiciteRth 23', 'gradeToxiciteRth 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 24, 'gradeToxiciteRth 24', 'gradeToxiciteRth 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 25, 'gradeToxiciteRth 25', 'gradeToxiciteRth 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 26, 'gradeToxiciteRth 26', 'gradeToxiciteRth 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 27, 'gradeToxiciteRth 27', 'gradeToxiciteRth 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 28, 'gradeToxiciteRth 28', 'gradeToxiciteRth 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 29, 'gradeToxiciteRth 29', 'gradeToxiciteRth 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 30, 'gradeToxiciteRth 30', 'gradeToxiciteRth 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 31, 'gradeToxiciteRth 31', 'gradeToxiciteRth 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 32, 'gradeToxiciteRth 32', 'gradeToxiciteRth 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 33, 'gradeToxiciteRth 33', 'gradeToxiciteRth 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 34, 'gradeToxiciteRth 34', 'gradeToxiciteRth 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 35, 'gradeToxiciteRth 35', 'gradeToxiciteRth 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 36, 'gradeToxiciteRth 36', 'gradeToxiciteRth 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 37, 'gradeToxiciteRth 37', 'gradeToxiciteRth 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 38, 'gradeToxiciteRth 38', 'gradeToxiciteRth 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 39, 'gradeToxiciteRth 39', 'gradeToxiciteRth 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 40, 'gradeToxiciteRth 40', 'gradeToxiciteRth 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 41, 'gradeToxiciteRth 41', 'gradeToxiciteRth 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 42, 'gradeToxiciteRth 42', 'gradeToxiciteRth 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 43, 'gradeToxiciteRth 43', 'gradeToxiciteRth 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 44, 'gradeToxiciteRth 44', 'gradeToxiciteRth 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 45, 'gradeToxiciteRth 45', 'gradeToxiciteRth 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 46, 'gradeToxiciteRth 46', 'gradeToxiciteRth 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 47, 'gradeToxiciteRth 47', 'gradeToxiciteRth 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 48, 'gradeToxiciteRth 48', 'gradeToxiciteRth 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 49, 'gradeToxiciteRth 49', 'gradeToxiciteRth 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 50, 'gradeToxiciteRth 50', 'gradeToxiciteRth 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 51, 'gradeToxiciteRth 51', 'gradeToxiciteRth 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 52, 'gradeToxiciteRth 52', 'gradeToxiciteRth 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 53, 'gradeToxiciteRth 53', 'gradeToxiciteRth 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 54, 'gradeToxiciteRth 54', 'gradeToxiciteRth 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 55, 'gradeToxiciteRth 55', 'gradeToxiciteRth 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 56, 'gradeToxiciteRth 56', 'gradeToxiciteRth 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 57, 'gradeToxiciteRth 57', 'gradeToxiciteRth 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 58, 'gradeToxiciteRth 58', 'gradeToxiciteRth 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 59, 'gradeToxiciteRth 59', 'gradeToxiciteRth 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 60, 'gradeToxiciteRth 60', 'gradeToxiciteRth 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 61, 'gradeToxiciteRth 61', 'gradeToxiciteRth 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 62, 'gradeToxiciteRth 62', 'gradeToxiciteRth 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 63, 'gradeToxiciteRth 63', 'gradeToxiciteRth 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 64, 'gradeToxiciteRth 64', 'gradeToxiciteRth 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 65, 'gradeToxiciteRth 65', 'gradeToxiciteRth 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 66, 'gradeToxiciteRth 66', 'gradeToxiciteRth 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 67, 'gradeToxiciteRth 67', 'gradeToxiciteRth 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 68, 'gradeToxiciteRth 68', 'gradeToxiciteRth 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 69, 'gradeToxiciteRth 69', 'gradeToxiciteRth 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 70, 'gradeToxiciteRth 70', 'gradeToxiciteRth 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 71, 'gradeToxiciteRth 71', 'gradeToxiciteRth 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 72, 'gradeToxiciteRth 72', 'gradeToxiciteRth 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 73, 'gradeToxiciteRth 73', 'gradeToxiciteRth 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 74, 'gradeToxiciteRth 74', 'gradeToxiciteRth 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 75, 'gradeToxiciteRth 75', 'gradeToxiciteRth 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 76, 'gradeToxiciteRth 76', 'gradeToxiciteRth 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 77, 'gradeToxiciteRth 77', 'gradeToxiciteRth 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 78, 'gradeToxiciteRth 78', 'gradeToxiciteRth 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 79, 'gradeToxiciteRth 79', 'gradeToxiciteRth 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 80, 'gradeToxiciteRth 80', 'gradeToxiciteRth 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 81, 'gradeToxiciteRth 81', 'gradeToxiciteRth 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 82, 'gradeToxiciteRth 82', 'gradeToxiciteRth 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 83, 'gradeToxiciteRth 83', 'gradeToxiciteRth 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 84, 'gradeToxiciteRth 84', 'gradeToxiciteRth 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 85, 'gradeToxiciteRth 85', 'gradeToxiciteRth 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 86, 'gradeToxiciteRth 86', 'gradeToxiciteRth 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 87, 'gradeToxiciteRth 87', 'gradeToxiciteRth 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 88, 'gradeToxiciteRth 88', 'gradeToxiciteRth 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 89, 'gradeToxiciteRth 89', 'gradeToxiciteRth 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 90, 'gradeToxiciteRth 90', 'gradeToxiciteRth 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 91, 'gradeToxiciteRth 91', 'gradeToxiciteRth 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 92, 'gradeToxiciteRth 92', 'gradeToxiciteRth 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 93, 'gradeToxiciteRth 93', 'gradeToxiciteRth 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 94, 'gradeToxiciteRth 94', 'gradeToxiciteRth 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 95, 'gradeToxiciteRth 95', 'gradeToxiciteRth 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 96, 'gradeToxiciteRth 96', 'gradeToxiciteRth 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 97, 'gradeToxiciteRth 97', 'gradeToxiciteRth 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 98, 'gradeToxiciteRth 98', 'gradeToxiciteRth 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 99, 'gradeToxiciteRth 99', 'gradeToxiciteRth 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `grade_toxicite_rth_seq`
--

INSERT INTO `grade_toxicite_rth_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(3),
(3),
(3);

--
-- Déchargement des données de la table `histortique_prescription_radiotherapie_seq`
--

INSERT INTO `histortique_prescription_radiotherapie_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `immobilistion`
--

INSERT INTO `immobilistion` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `code`, `libelle`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `services`) VALUES
(1, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 1, 'immobilistion 1', 'immobilistion 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 2, 'immobilistion 2', 'immobilistion 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 3, 'immobilistion 3', 'immobilistion 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 4, 'immobilistion 4', 'immobilistion 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 5, 'immobilistion 5', 'immobilistion 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 6, 'immobilistion 6', 'immobilistion 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 7, 'immobilistion 7', 'immobilistion 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 8, 'immobilistion 8', 'immobilistion 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 9, 'immobilistion 9', 'immobilistion 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 10, 'immobilistion 10', 'immobilistion 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 11, 'immobilistion 11', 'immobilistion 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 12, 'immobilistion 12', 'immobilistion 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 13, 'immobilistion 13', 'immobilistion 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 14, 'immobilistion 14', 'immobilistion 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 15, 'immobilistion 15', 'immobilistion 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 16, 'immobilistion 16', 'immobilistion 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 17, 'immobilistion 17', 'immobilistion 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 18, 'immobilistion 18', 'immobilistion 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 19, 'immobilistion 19', 'immobilistion 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 20, 'immobilistion 20', 'immobilistion 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 21, 'immobilistion 21', 'immobilistion 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 22, 'immobilistion 22', 'immobilistion 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 23, 'immobilistion 23', 'immobilistion 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 24, 'immobilistion 24', 'immobilistion 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 25, 'immobilistion 25', 'immobilistion 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 26, 'immobilistion 26', 'immobilistion 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 27, 'immobilistion 27', 'immobilistion 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 28, 'immobilistion 28', 'immobilistion 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 29, 'immobilistion 29', 'immobilistion 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 30, 'immobilistion 30', 'immobilistion 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 31, 'immobilistion 31', 'immobilistion 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 32, 'immobilistion 32', 'immobilistion 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 33, 'immobilistion 33', 'immobilistion 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 34, 'immobilistion 34', 'immobilistion 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 35, 'immobilistion 35', 'immobilistion 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 36, 'immobilistion 36', 'immobilistion 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 37, 'immobilistion 37', 'immobilistion 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 38, 'immobilistion 38', 'immobilistion 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 39, 'immobilistion 39', 'immobilistion 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 40, 'immobilistion 40', 'immobilistion 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 41, 'immobilistion 41', 'immobilistion 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 42, 'immobilistion 42', 'immobilistion 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 43, 'immobilistion 43', 'immobilistion 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 44, 'immobilistion 44', 'immobilistion 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 45, 'immobilistion 45', 'immobilistion 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 46, 'immobilistion 46', 'immobilistion 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 47, 'immobilistion 47', 'immobilistion 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 48, 'immobilistion 48', 'immobilistion 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 49, 'immobilistion 49', 'immobilistion 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 50, 'immobilistion 50', 'immobilistion 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 51, 'immobilistion 51', 'immobilistion 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 52, 'immobilistion 52', 'immobilistion 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 53, 'immobilistion 53', 'immobilistion 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 54, 'immobilistion 54', 'immobilistion 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 55, 'immobilistion 55', 'immobilistion 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 56, 'immobilistion 56', 'immobilistion 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 57, 'immobilistion 57', 'immobilistion 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 58, 'immobilistion 58', 'immobilistion 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 59, 'immobilistion 59', 'immobilistion 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 60, 'immobilistion 60', 'immobilistion 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 61, 'immobilistion 61', 'immobilistion 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 62, 'immobilistion 62', 'immobilistion 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 63, 'immobilistion 63', 'immobilistion 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 64, 'immobilistion 64', 'immobilistion 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 65, 'immobilistion 65', 'immobilistion 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 66, 'immobilistion 66', 'immobilistion 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 67, 'immobilistion 67', 'immobilistion 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 68, 'immobilistion 68', 'immobilistion 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 69, 'immobilistion 69', 'immobilistion 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 70, 'immobilistion 70', 'immobilistion 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 71, 'immobilistion 71', 'immobilistion 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 72, 'immobilistion 72', 'immobilistion 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 73, 'immobilistion 73', 'immobilistion 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 74, 'immobilistion 74', 'immobilistion 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 75, 'immobilistion 75', 'immobilistion 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 76, 'immobilistion 76', 'immobilistion 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 77, 'immobilistion 77', 'immobilistion 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 78, 'immobilistion 78', 'immobilistion 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 79, 'immobilistion 79', 'immobilistion 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 80, 'immobilistion 80', 'immobilistion 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 81, 'immobilistion 81', 'immobilistion 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 82, 'immobilistion 82', 'immobilistion 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 83, 'immobilistion 83', 'immobilistion 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 84, 'immobilistion 84', 'immobilistion 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 85, 'immobilistion 85', 'immobilistion 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 86, 'immobilistion 86', 'immobilistion 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 87, 'immobilistion 87', 'immobilistion 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 88, 'immobilistion 88', 'immobilistion 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 89, 'immobilistion 89', 'immobilistion 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 90, 'immobilistion 90', 'immobilistion 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 91, 'immobilistion 91', 'immobilistion 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 92, 'immobilistion 92', 'immobilistion 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 93, 'immobilistion 93', 'immobilistion 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 94, 'immobilistion 94', 'immobilistion 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 95, 'immobilistion 95', 'immobilistion 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 96, 'immobilistion 96', 'immobilistion 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 97, 'immobilistion 97', 'immobilistion 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 98, 'immobilistion 98', 'immobilistion 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 99, 'immobilistion 99', 'immobilistion 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `immobilistion_seq`
--

INSERT INTO `immobilistion_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `modalite_radiotherapie`
--

INSERT INTO `modalite_radiotherapie` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `code`, `description`, `libelle`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `services`) VALUES
(1, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 1, 'modalite 1', NULL, 'modalite 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 2, 'modalite 2', NULL, 'modalite 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 3, 'modalite 3', NULL, 'modalite 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 4, 'modalite 4', NULL, 'modalite 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 5, 'modalite 5', NULL, 'modalite 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 6, 'modalite 6', NULL, 'modalite 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 7, 'modalite 7', NULL, 'modalite 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 8, 'modalite 8', NULL, 'modalite 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 9, 'modalite 9', NULL, 'modalite 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 10, 'modalite 10', NULL, 'modalite 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 11, 'modalite 11', NULL, 'modalite 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 12, 'modalite 12', NULL, 'modalite 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 13, 'modalite 13', NULL, 'modalite 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 14, 'modalite 14', NULL, 'modalite 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 15, 'modalite 15', NULL, 'modalite 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 16, 'modalite 16', NULL, 'modalite 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 17, 'modalite 17', NULL, 'modalite 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 18, 'modalite 18', NULL, 'modalite 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 19, 'modalite 19', NULL, 'modalite 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 20, 'modalite 20', NULL, 'modalite 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 21, 'modalite 21', NULL, 'modalite 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 22, 'modalite 22', NULL, 'modalite 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 23, 'modalite 23', NULL, 'modalite 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 24, 'modalite 24', NULL, 'modalite 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 25, 'modalite 25', NULL, 'modalite 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 26, 'modalite 26', NULL, 'modalite 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 27, 'modalite 27', NULL, 'modalite 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 28, 'modalite 28', NULL, 'modalite 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 29, 'modalite 29', NULL, 'modalite 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 30, 'modalite 30', NULL, 'modalite 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 31, 'modalite 31', NULL, 'modalite 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 32, 'modalite 32', NULL, 'modalite 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 33, 'modalite 33', NULL, 'modalite 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:55', '', NULL, b'0', NULL, NULL, 34, 'modalite 34', NULL, 'modalite 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 35, 'modalite 35', NULL, 'modalite 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 36, 'modalite 36', NULL, 'modalite 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 37, 'modalite 37', NULL, 'modalite 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 38, 'modalite 38', NULL, 'modalite 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 39, 'modalite 39', NULL, 'modalite 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 40, 'modalite 40', NULL, 'modalite 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 41, 'modalite 41', NULL, 'modalite 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 42, 'modalite 42', NULL, 'modalite 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 43, 'modalite 43', NULL, 'modalite 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 44, 'modalite 44', NULL, 'modalite 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 45, 'modalite 45', NULL, 'modalite 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 46, 'modalite 46', NULL, 'modalite 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 47, 'modalite 47', NULL, 'modalite 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 48, 'modalite 48', NULL, 'modalite 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 49, 'modalite 49', NULL, 'modalite 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 50, 'modalite 50', NULL, 'modalite 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 51, 'modalite 51', NULL, 'modalite 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 52, 'modalite 52', NULL, 'modalite 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 53, 'modalite 53', NULL, 'modalite 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 54, 'modalite 54', NULL, 'modalite 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 55, 'modalite 55', NULL, 'modalite 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 56, 'modalite 56', NULL, 'modalite 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 57, 'modalite 57', NULL, 'modalite 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 58, 'modalite 58', NULL, 'modalite 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 59, 'modalite 59', NULL, 'modalite 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 60, 'modalite 60', NULL, 'modalite 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 61, 'modalite 61', NULL, 'modalite 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 62, 'modalite 62', NULL, 'modalite 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 63, 'modalite 63', NULL, 'modalite 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 64, 'modalite 64', NULL, 'modalite 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 65, 'modalite 65', NULL, 'modalite 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 66, 'modalite 66', NULL, 'modalite 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 67, 'modalite 67', NULL, 'modalite 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 68, 'modalite 68', NULL, 'modalite 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 69, 'modalite 69', NULL, 'modalite 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 70, 'modalite 70', NULL, 'modalite 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 71, 'modalite 71', NULL, 'modalite 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 72, 'modalite 72', NULL, 'modalite 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 73, 'modalite 73', NULL, 'modalite 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 74, 'modalite 74', NULL, 'modalite 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 75, 'modalite 75', NULL, 'modalite 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 76, 'modalite 76', NULL, 'modalite 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 77, 'modalite 77', NULL, 'modalite 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 78, 'modalite 78', NULL, 'modalite 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 79, 'modalite 79', NULL, 'modalite 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 80, 'modalite 80', NULL, 'modalite 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 81, 'modalite 81', NULL, 'modalite 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 82, 'modalite 82', NULL, 'modalite 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 83, 'modalite 83', NULL, 'modalite 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 84, 'modalite 84', NULL, 'modalite 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 85, 'modalite 85', NULL, 'modalite 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 86, 'modalite 86', NULL, 'modalite 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 87, 'modalite 87', NULL, 'modalite 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 88, 'modalite 88', NULL, 'modalite 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 89, 'modalite 89', NULL, 'modalite 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 90, 'modalite 90', NULL, 'modalite 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 91, 'modalite 91', NULL, 'modalite 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 92, 'modalite 92', NULL, 'modalite 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 93, 'modalite 93', NULL, 'modalite 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 94, 'modalite 94', NULL, 'modalite 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 95, 'modalite 95', NULL, 'modalite 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 96, 'modalite 96', NULL, 'modalite 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 97, 'modalite 97', NULL, 'modalite 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 98, 'modalite 98', NULL, 'modalite 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 99, 'modalite 99', NULL, 'modalite 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `modalite_radiotherapie_seq`
--

INSERT INTO `modalite_radiotherapie_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `patient`
--

INSERT INTO `patient` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `age`, `date_naissance`, `ipp`, `nom`, `numero_classement`, `prenom`, `sexe`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`) VALUES
(1, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 1, 10, NULL, 'patient 1', 'patient 1', NULL, 'patient 1', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 2, 20, NULL, 'patient 2', 'patient 2', NULL, 'patient 2', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 3, 30, NULL, 'patient 3', 'patient 3', NULL, 'patient 3', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 4, 40, NULL, 'patient 4', 'patient 4', NULL, 'patient 4', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 5, 50, NULL, 'patient 5', 'patient 5', NULL, 'patient 5', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 6, 60, NULL, 'patient 6', 'patient 6', NULL, 'patient 6', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 7, 70, NULL, 'patient 7', 'patient 7', NULL, 'patient 7', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 8, 80, NULL, 'patient 8', 'patient 8', NULL, 'patient 8', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 9, 90, NULL, 'patient 9', 'patient 9', NULL, 'patient 9', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 10, 100, NULL, 'patient 10', 'patient 10', NULL, 'patient 10', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 11, 110, NULL, 'patient 11', 'patient 11', NULL, 'patient 11', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 12, 120, NULL, 'patient 12', 'patient 12', NULL, 'patient 12', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 13, 130, NULL, 'patient 13', 'patient 13', NULL, 'patient 13', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 14, 140, NULL, 'patient 14', 'patient 14', NULL, 'patient 14', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 15, 150, NULL, 'patient 15', 'patient 15', NULL, 'patient 15', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 16, 160, NULL, 'patient 16', 'patient 16', NULL, 'patient 16', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 17, 170, NULL, 'patient 17', 'patient 17', NULL, 'patient 17', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 18, 180, NULL, 'patient 18', 'patient 18', NULL, 'patient 18', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 19, 190, NULL, 'patient 19', 'patient 19', NULL, 'patient 19', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 20, 200, NULL, 'patient 20', 'patient 20', NULL, 'patient 20', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 21, 210, NULL, 'patient 21', 'patient 21', NULL, 'patient 21', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 22, 220, NULL, 'patient 22', 'patient 22', NULL, 'patient 22', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 23, 230, NULL, 'patient 23', 'patient 23', NULL, 'patient 23', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 24, 240, NULL, 'patient 24', 'patient 24', NULL, 'patient 24', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 25, 250, NULL, 'patient 25', 'patient 25', NULL, 'patient 25', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 26, 260, NULL, 'patient 26', 'patient 26', NULL, 'patient 26', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 27, 270, NULL, 'patient 27', 'patient 27', NULL, 'patient 27', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 28, 280, NULL, 'patient 28', 'patient 28', NULL, 'patient 28', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 29, 290, NULL, 'patient 29', 'patient 29', NULL, 'patient 29', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 30, 300, NULL, 'patient 30', 'patient 30', NULL, 'patient 30', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 31, 310, NULL, 'patient 31', 'patient 31', NULL, 'patient 31', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 32, 320, NULL, 'patient 32', 'patient 32', NULL, 'patient 32', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 33, 330, NULL, 'patient 33', 'patient 33', NULL, 'patient 33', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 34, 340, NULL, 'patient 34', 'patient 34', NULL, 'patient 34', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 35, 350, NULL, 'patient 35', 'patient 35', NULL, 'patient 35', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 36, 360, NULL, 'patient 36', 'patient 36', NULL, 'patient 36', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 37, 370, NULL, 'patient 37', 'patient 37', NULL, 'patient 37', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 38, 380, NULL, 'patient 38', 'patient 38', NULL, 'patient 38', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 39, 390, NULL, 'patient 39', 'patient 39', NULL, 'patient 39', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 40, 400, NULL, 'patient 40', 'patient 40', NULL, 'patient 40', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 41, 410, NULL, 'patient 41', 'patient 41', NULL, 'patient 41', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 42, 420, NULL, 'patient 42', 'patient 42', NULL, 'patient 42', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 43, 430, NULL, 'patient 43', 'patient 43', NULL, 'patient 43', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 44, 440, NULL, 'patient 44', 'patient 44', NULL, 'patient 44', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 45, 450, NULL, 'patient 45', 'patient 45', NULL, 'patient 45', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 46, 460, NULL, 'patient 46', 'patient 46', NULL, 'patient 46', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 47, 470, NULL, 'patient 47', 'patient 47', NULL, 'patient 47', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 48, 480, NULL, 'patient 48', 'patient 48', NULL, 'patient 48', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 49, 490, NULL, 'patient 49', 'patient 49', NULL, 'patient 49', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 50, 500, NULL, 'patient 50', 'patient 50', NULL, 'patient 50', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 51, 510, NULL, 'patient 51', 'patient 51', NULL, 'patient 51', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 52, 520, NULL, 'patient 52', 'patient 52', NULL, 'patient 52', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 53, 530, NULL, 'patient 53', 'patient 53', NULL, 'patient 53', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 54, 540, NULL, 'patient 54', 'patient 54', NULL, 'patient 54', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 55, 550, NULL, 'patient 55', 'patient 55', NULL, 'patient 55', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 56, 560, NULL, 'patient 56', 'patient 56', NULL, 'patient 56', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 57, 570, NULL, 'patient 57', 'patient 57', NULL, 'patient 57', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 58, 580, NULL, 'patient 58', 'patient 58', NULL, 'patient 58', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 59, 590, NULL, 'patient 59', 'patient 59', NULL, 'patient 59', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 60, 600, NULL, 'patient 60', 'patient 60', NULL, 'patient 60', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 61, 610, NULL, 'patient 61', 'patient 61', NULL, 'patient 61', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 62, 620, NULL, 'patient 62', 'patient 62', NULL, 'patient 62', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 63, 630, NULL, 'patient 63', 'patient 63', NULL, 'patient 63', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 64, 640, NULL, 'patient 64', 'patient 64', NULL, 'patient 64', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 65, 650, NULL, 'patient 65', 'patient 65', NULL, 'patient 65', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 66, 660, NULL, 'patient 66', 'patient 66', NULL, 'patient 66', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 67, 670, NULL, 'patient 67', 'patient 67', NULL, 'patient 67', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 68, 680, NULL, 'patient 68', 'patient 68', NULL, 'patient 68', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 69, 690, NULL, 'patient 69', 'patient 69', NULL, 'patient 69', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 70, 700, NULL, 'patient 70', 'patient 70', NULL, 'patient 70', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 71, 710, NULL, 'patient 71', 'patient 71', NULL, 'patient 71', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 72, 720, NULL, 'patient 72', 'patient 72', NULL, 'patient 72', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 73, 730, NULL, 'patient 73', 'patient 73', NULL, 'patient 73', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 74, 740, NULL, 'patient 74', 'patient 74', NULL, 'patient 74', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 75, 750, NULL, 'patient 75', 'patient 75', NULL, 'patient 75', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 76, 760, NULL, 'patient 76', 'patient 76', NULL, 'patient 76', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 77, 770, NULL, 'patient 77', 'patient 77', NULL, 'patient 77', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 78, 780, NULL, 'patient 78', 'patient 78', NULL, 'patient 78', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 79, 790, NULL, 'patient 79', 'patient 79', NULL, 'patient 79', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 80, 800, NULL, 'patient 80', 'patient 80', NULL, 'patient 80', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 81, 810, NULL, 'patient 81', 'patient 81', NULL, 'patient 81', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 82, 820, NULL, 'patient 82', 'patient 82', NULL, 'patient 82', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 83, 830, NULL, 'patient 83', 'patient 83', NULL, 'patient 83', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 84, 840, NULL, 'patient 84', 'patient 84', NULL, 'patient 84', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 85, 850, NULL, 'patient 85', 'patient 85', NULL, 'patient 85', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 86, 860, NULL, 'patient 86', 'patient 86', NULL, 'patient 86', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 87, 870, NULL, 'patient 87', 'patient 87', NULL, 'patient 87', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 88, 880, NULL, 'patient 88', 'patient 88', NULL, 'patient 88', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 89, 890, NULL, 'patient 89', 'patient 89', NULL, 'patient 89', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 90, 900, NULL, 'patient 90', 'patient 90', NULL, 'patient 90', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 91, 910, NULL, 'patient 91', 'patient 91', NULL, 'patient 91', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 92, 920, NULL, 'patient 92', 'patient 92', NULL, 'patient 92', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 93, 930, NULL, 'patient 93', 'patient 93', NULL, 'patient 93', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 94, 940, NULL, 'patient 94', 'patient 94', NULL, 'patient 94', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 95, 950, NULL, 'patient 95', 'patient 95', NULL, 'patient 95', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 96, 960, NULL, 'patient 96', 'patient 96', NULL, 'patient 96', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 97, 970, NULL, 'patient 97', 'patient 97', NULL, 'patient 97', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 98, 980, NULL, 'patient 98', 'patient 98', NULL, 'patient 98', 'Male', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 99, 990, NULL, 'patient 99', 'patient 99', NULL, 'patient 99', 'Female', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `patient_seq`
--

INSERT INTO `patient_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `personnel`
--

INSERT INTO `personnel` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `adresse`, `cin`, `email`, `expertise`, `ipp`, `mobile`, `nom`, `prenom`, `telephone`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `categorie_personnel`, `specialite`) VALUES
(1, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 1', NULL, 'personnel 1', 'personnel 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 2', NULL, 'personnel 2', 'personnel 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 3', NULL, 'personnel 3', 'personnel 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 4', NULL, 'personnel 4', 'personnel 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 5', NULL, 'personnel 5', 'personnel 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 6', NULL, 'personnel 6', 'personnel 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 7', NULL, 'personnel 7', 'personnel 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 8', NULL, 'personnel 8', 'personnel 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 9', NULL, 'personnel 9', 'personnel 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 10', NULL, 'personnel 10', 'personnel 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 11', NULL, 'personnel 11', 'personnel 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 12', NULL, 'personnel 12', 'personnel 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 13', NULL, 'personnel 13', 'personnel 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 14', NULL, 'personnel 14', 'personnel 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 15', NULL, 'personnel 15', 'personnel 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 16', NULL, 'personnel 16', 'personnel 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 17', NULL, 'personnel 17', 'personnel 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 18', NULL, 'personnel 18', 'personnel 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 19', NULL, 'personnel 19', 'personnel 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 20', NULL, 'personnel 20', 'personnel 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 21', NULL, 'personnel 21', 'personnel 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 22', NULL, 'personnel 22', 'personnel 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 23', NULL, 'personnel 23', 'personnel 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 24', NULL, 'personnel 24', 'personnel 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 25', NULL, 'personnel 25', 'personnel 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 26', NULL, 'personnel 26', 'personnel 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 27', NULL, 'personnel 27', 'personnel 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 28', NULL, 'personnel 28', 'personnel 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 29', NULL, 'personnel 29', 'personnel 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 30', NULL, 'personnel 30', 'personnel 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 31', NULL, 'personnel 31', 'personnel 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 32', NULL, 'personnel 32', 'personnel 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 33', NULL, 'personnel 33', 'personnel 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 34', NULL, 'personnel 34', 'personnel 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 35', NULL, 'personnel 35', 'personnel 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 36', NULL, 'personnel 36', 'personnel 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 37', NULL, 'personnel 37', 'personnel 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 38', NULL, 'personnel 38', 'personnel 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 39', NULL, 'personnel 39', 'personnel 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 40', NULL, 'personnel 40', 'personnel 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 41', NULL, 'personnel 41', 'personnel 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 42', NULL, 'personnel 42', 'personnel 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 43', NULL, 'personnel 43', 'personnel 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 44', NULL, 'personnel 44', 'personnel 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 45', NULL, 'personnel 45', 'personnel 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 46', NULL, 'personnel 46', 'personnel 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 47', NULL, 'personnel 47', 'personnel 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 48', NULL, 'personnel 48', 'personnel 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 49', NULL, 'personnel 49', 'personnel 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 50', NULL, 'personnel 50', 'personnel 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 51', NULL, 'personnel 51', 'personnel 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 52', NULL, 'personnel 52', 'personnel 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 53', NULL, 'personnel 53', 'personnel 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 54', NULL, 'personnel 54', 'personnel 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 55', NULL, 'personnel 55', 'personnel 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 56', NULL, 'personnel 56', 'personnel 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 57', NULL, 'personnel 57', 'personnel 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 58', NULL, 'personnel 58', 'personnel 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 59', NULL, 'personnel 59', 'personnel 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 60', NULL, 'personnel 60', 'personnel 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 61', NULL, 'personnel 61', 'personnel 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 62', NULL, 'personnel 62', 'personnel 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 63', NULL, 'personnel 63', 'personnel 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 64', NULL, 'personnel 64', 'personnel 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 65', NULL, 'personnel 65', 'personnel 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 66', NULL, 'personnel 66', 'personnel 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 67', NULL, 'personnel 67', 'personnel 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 68', NULL, 'personnel 68', 'personnel 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 69', NULL, 'personnel 69', 'personnel 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 70', NULL, 'personnel 70', 'personnel 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 71', NULL, 'personnel 71', 'personnel 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 72', NULL, 'personnel 72', 'personnel 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 73', NULL, 'personnel 73', 'personnel 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 74', NULL, 'personnel 74', 'personnel 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 75', NULL, 'personnel 75', 'personnel 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 76', NULL, 'personnel 76', 'personnel 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 77', NULL, 'personnel 77', 'personnel 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 78', NULL, 'personnel 78', 'personnel 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 79', NULL, 'personnel 79', 'personnel 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 80', NULL, 'personnel 80', 'personnel 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 81', NULL, 'personnel 81', 'personnel 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 82', NULL, 'personnel 82', 'personnel 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 83', NULL, 'personnel 83', 'personnel 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 84', NULL, 'personnel 84', 'personnel 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 85', NULL, 'personnel 85', 'personnel 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 86', NULL, 'personnel 86', 'personnel 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 87', NULL, 'personnel 87', 'personnel 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 88', NULL, 'personnel 88', 'personnel 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 89', NULL, 'personnel 89', 'personnel 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 90', NULL, 'personnel 90', 'personnel 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 91', NULL, 'personnel 91', 'personnel 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 92', NULL, 'personnel 92', 'personnel 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 93', NULL, 'personnel 93', 'personnel 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 94', NULL, 'personnel 94', 'personnel 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 95', NULL, 'personnel 95', 'personnel 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 96', NULL, 'personnel 96', 'personnel 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 97', NULL, 'personnel 97', 'personnel 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 98', NULL, 'personnel 98', 'personnel 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL, b'0', 'personnel 99', NULL, 'personnel 99', 'personnel 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `personnel_seq`
--

INSERT INTO `personnel_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `positionnement`
--

INSERT INTO `positionnement` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `code`, `libelle`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `services`) VALUES
(1, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 1, 'positionnement 1', 'positionnement 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 2, 'positionnement 2', 'positionnement 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 3, 'positionnement 3', 'positionnement 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 4, 'positionnement 4', 'positionnement 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 5, 'positionnement 5', 'positionnement 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 6, 'positionnement 6', 'positionnement 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 7, 'positionnement 7', 'positionnement 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 8, 'positionnement 8', 'positionnement 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 9, 'positionnement 9', 'positionnement 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 10, 'positionnement 10', 'positionnement 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 11, 'positionnement 11', 'positionnement 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 12, 'positionnement 12', 'positionnement 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 13, 'positionnement 13', 'positionnement 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 14, 'positionnement 14', 'positionnement 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 15, 'positionnement 15', 'positionnement 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 16, 'positionnement 16', 'positionnement 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 17, 'positionnement 17', 'positionnement 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 18, 'positionnement 18', 'positionnement 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 19, 'positionnement 19', 'positionnement 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 20, 'positionnement 20', 'positionnement 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 21, 'positionnement 21', 'positionnement 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 22, 'positionnement 22', 'positionnement 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 23, 'positionnement 23', 'positionnement 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 24, 'positionnement 24', 'positionnement 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 25, 'positionnement 25', 'positionnement 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 26, 'positionnement 26', 'positionnement 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 27, 'positionnement 27', 'positionnement 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 28, 'positionnement 28', 'positionnement 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 29, 'positionnement 29', 'positionnement 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 30, 'positionnement 30', 'positionnement 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 31, 'positionnement 31', 'positionnement 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 32, 'positionnement 32', 'positionnement 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 33, 'positionnement 33', 'positionnement 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 34, 'positionnement 34', 'positionnement 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 35, 'positionnement 35', 'positionnement 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 36, 'positionnement 36', 'positionnement 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 37, 'positionnement 37', 'positionnement 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 38, 'positionnement 38', 'positionnement 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 39, 'positionnement 39', 'positionnement 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 40, 'positionnement 40', 'positionnement 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 41, 'positionnement 41', 'positionnement 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 42, 'positionnement 42', 'positionnement 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 43, 'positionnement 43', 'positionnement 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 44, 'positionnement 44', 'positionnement 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 45, 'positionnement 45', 'positionnement 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 46, 'positionnement 46', 'positionnement 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 47, 'positionnement 47', 'positionnement 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 48, 'positionnement 48', 'positionnement 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 49, 'positionnement 49', 'positionnement 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 50, 'positionnement 50', 'positionnement 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 51, 'positionnement 51', 'positionnement 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 52, 'positionnement 52', 'positionnement 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 53, 'positionnement 53', 'positionnement 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 54, 'positionnement 54', 'positionnement 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 55, 'positionnement 55', 'positionnement 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 56, 'positionnement 56', 'positionnement 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 57, 'positionnement 57', 'positionnement 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 58, 'positionnement 58', 'positionnement 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 59, 'positionnement 59', 'positionnement 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 60, 'positionnement 60', 'positionnement 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 61, 'positionnement 61', 'positionnement 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 62, 'positionnement 62', 'positionnement 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 63, 'positionnement 63', 'positionnement 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 64, 'positionnement 64', 'positionnement 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 65, 'positionnement 65', 'positionnement 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 66, 'positionnement 66', 'positionnement 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 67, 'positionnement 67', 'positionnement 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 68, 'positionnement 68', 'positionnement 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 69, 'positionnement 69', 'positionnement 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 70, 'positionnement 70', 'positionnement 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 71, 'positionnement 71', 'positionnement 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 72, 'positionnement 72', 'positionnement 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 73, 'positionnement 73', 'positionnement 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 74, 'positionnement 74', 'positionnement 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 75, 'positionnement 75', 'positionnement 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 76, 'positionnement 76', 'positionnement 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 77, 'positionnement 77', 'positionnement 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 78, 'positionnement 78', 'positionnement 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 79, 'positionnement 79', 'positionnement 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 80, 'positionnement 80', 'positionnement 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 81, 'positionnement 81', 'positionnement 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 82, 'positionnement 82', 'positionnement 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 83, 'positionnement 83', 'positionnement 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 84, 'positionnement 84', 'positionnement 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 85, 'positionnement 85', 'positionnement 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 86, 'positionnement 86', 'positionnement 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 87, 'positionnement 87', 'positionnement 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 88, 'positionnement 88', 'positionnement 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 89, 'positionnement 89', 'positionnement 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 90, 'positionnement 90', 'positionnement 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 91, 'positionnement 91', 'positionnement 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 92, 'positionnement 92', 'positionnement 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 93, 'positionnement 93', 'positionnement 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 94, 'positionnement 94', 'positionnement 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 95, 'positionnement 95', 'positionnement 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 96, 'positionnement 96', 'positionnement 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 97, 'positionnement 97', 'positionnement 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 98, 'positionnement 98', 'positionnement 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 99, 'positionnement 99', 'positionnement 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `positionnement_seq`
--

INSERT INTO `positionnement_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `prescription_radiotherapie_seq`
--

INSERT INTO `prescription_radiotherapie_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `protocole_inclusion`
--

INSERT INTO `protocole_inclusion` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `code`, `date_inclusion`, `libelle`, `protocole_inclusion_statut`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `services`) VALUES
(1, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 1, 'protocoleInclusion 1', NULL, 'protocoleInclusion 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 2, 'protocoleInclusion 2', NULL, 'protocoleInclusion 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 3, 'protocoleInclusion 3', NULL, 'protocoleInclusion 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 4, 'protocoleInclusion 4', NULL, 'protocoleInclusion 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 5, 'protocoleInclusion 5', NULL, 'protocoleInclusion 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 6, 'protocoleInclusion 6', NULL, 'protocoleInclusion 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 7, 'protocoleInclusion 7', NULL, 'protocoleInclusion 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 8, 'protocoleInclusion 8', NULL, 'protocoleInclusion 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 9, 'protocoleInclusion 9', NULL, 'protocoleInclusion 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 10, 'protocoleInclusion 10', NULL, 'protocoleInclusion 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 11, 'protocoleInclusion 11', NULL, 'protocoleInclusion 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 12, 'protocoleInclusion 12', NULL, 'protocoleInclusion 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 13, 'protocoleInclusion 13', NULL, 'protocoleInclusion 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 14, 'protocoleInclusion 14', NULL, 'protocoleInclusion 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 15, 'protocoleInclusion 15', NULL, 'protocoleInclusion 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 16, 'protocoleInclusion 16', NULL, 'protocoleInclusion 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 17, 'protocoleInclusion 17', NULL, 'protocoleInclusion 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 18, 'protocoleInclusion 18', NULL, 'protocoleInclusion 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 19, 'protocoleInclusion 19', NULL, 'protocoleInclusion 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 20, 'protocoleInclusion 20', NULL, 'protocoleInclusion 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 21, 'protocoleInclusion 21', NULL, 'protocoleInclusion 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 22, 'protocoleInclusion 22', NULL, 'protocoleInclusion 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 23, 'protocoleInclusion 23', NULL, 'protocoleInclusion 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 24, 'protocoleInclusion 24', NULL, 'protocoleInclusion 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 25, 'protocoleInclusion 25', NULL, 'protocoleInclusion 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 26, 'protocoleInclusion 26', NULL, 'protocoleInclusion 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 27, 'protocoleInclusion 27', NULL, 'protocoleInclusion 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 28, 'protocoleInclusion 28', NULL, 'protocoleInclusion 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 29, 'protocoleInclusion 29', NULL, 'protocoleInclusion 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 30, 'protocoleInclusion 30', NULL, 'protocoleInclusion 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 31, 'protocoleInclusion 31', NULL, 'protocoleInclusion 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 32, 'protocoleInclusion 32', NULL, 'protocoleInclusion 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 33, 'protocoleInclusion 33', NULL, 'protocoleInclusion 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 34, 'protocoleInclusion 34', NULL, 'protocoleInclusion 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 35, 'protocoleInclusion 35', NULL, 'protocoleInclusion 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 36, 'protocoleInclusion 36', NULL, 'protocoleInclusion 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 37, 'protocoleInclusion 37', NULL, 'protocoleInclusion 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 38, 'protocoleInclusion 38', NULL, 'protocoleInclusion 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 39, 'protocoleInclusion 39', NULL, 'protocoleInclusion 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 40, 'protocoleInclusion 40', NULL, 'protocoleInclusion 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 41, 'protocoleInclusion 41', NULL, 'protocoleInclusion 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 42, 'protocoleInclusion 42', NULL, 'protocoleInclusion 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 43, 'protocoleInclusion 43', NULL, 'protocoleInclusion 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 44, 'protocoleInclusion 44', NULL, 'protocoleInclusion 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 45, 'protocoleInclusion 45', NULL, 'protocoleInclusion 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 46, 'protocoleInclusion 46', NULL, 'protocoleInclusion 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 47, 'protocoleInclusion 47', NULL, 'protocoleInclusion 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 48, 'protocoleInclusion 48', NULL, 'protocoleInclusion 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 49, 'protocoleInclusion 49', NULL, 'protocoleInclusion 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 50, 'protocoleInclusion 50', NULL, 'protocoleInclusion 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 51, 'protocoleInclusion 51', NULL, 'protocoleInclusion 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 52, 'protocoleInclusion 52', NULL, 'protocoleInclusion 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 53, 'protocoleInclusion 53', NULL, 'protocoleInclusion 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 54, 'protocoleInclusion 54', NULL, 'protocoleInclusion 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 55, 'protocoleInclusion 55', NULL, 'protocoleInclusion 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 56, 'protocoleInclusion 56', NULL, 'protocoleInclusion 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 57, 'protocoleInclusion 57', NULL, 'protocoleInclusion 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 58, 'protocoleInclusion 58', NULL, 'protocoleInclusion 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 59, 'protocoleInclusion 59', NULL, 'protocoleInclusion 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 60, 'protocoleInclusion 60', NULL, 'protocoleInclusion 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 61, 'protocoleInclusion 61', NULL, 'protocoleInclusion 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 62, 'protocoleInclusion 62', NULL, 'protocoleInclusion 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 63, 'protocoleInclusion 63', NULL, 'protocoleInclusion 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 64, 'protocoleInclusion 64', NULL, 'protocoleInclusion 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 65, 'protocoleInclusion 65', NULL, 'protocoleInclusion 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 66, 'protocoleInclusion 66', NULL, 'protocoleInclusion 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 67, 'protocoleInclusion 67', NULL, 'protocoleInclusion 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 68, 'protocoleInclusion 68', NULL, 'protocoleInclusion 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 69, 'protocoleInclusion 69', NULL, 'protocoleInclusion 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 70, 'protocoleInclusion 70', NULL, 'protocoleInclusion 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 71, 'protocoleInclusion 71', NULL, 'protocoleInclusion 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 72, 'protocoleInclusion 72', NULL, 'protocoleInclusion 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 73, 'protocoleInclusion 73', NULL, 'protocoleInclusion 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 74, 'protocoleInclusion 74', NULL, 'protocoleInclusion 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 75, 'protocoleInclusion 75', NULL, 'protocoleInclusion 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 76, 'protocoleInclusion 76', NULL, 'protocoleInclusion 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 77, 'protocoleInclusion 77', NULL, 'protocoleInclusion 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 78, 'protocoleInclusion 78', NULL, 'protocoleInclusion 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 79, 'protocoleInclusion 79', NULL, 'protocoleInclusion 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 80, 'protocoleInclusion 80', NULL, 'protocoleInclusion 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 81, 'protocoleInclusion 81', NULL, 'protocoleInclusion 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 82, 'protocoleInclusion 82', NULL, 'protocoleInclusion 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 83, 'protocoleInclusion 83', NULL, 'protocoleInclusion 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 84, 'protocoleInclusion 84', NULL, 'protocoleInclusion 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 85, 'protocoleInclusion 85', NULL, 'protocoleInclusion 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 86, 'protocoleInclusion 86', NULL, 'protocoleInclusion 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 87, 'protocoleInclusion 87', NULL, 'protocoleInclusion 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 88, 'protocoleInclusion 88', NULL, 'protocoleInclusion 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 89, 'protocoleInclusion 89', NULL, 'protocoleInclusion 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 90, 'protocoleInclusion 90', NULL, 'protocoleInclusion 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 91, 'protocoleInclusion 91', NULL, 'protocoleInclusion 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 92, 'protocoleInclusion 92', NULL, 'protocoleInclusion 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 93, 'protocoleInclusion 93', NULL, 'protocoleInclusion 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 94, 'protocoleInclusion 94', NULL, 'protocoleInclusion 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 95, 'protocoleInclusion 95', NULL, 'protocoleInclusion 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 96, 'protocoleInclusion 96', NULL, 'protocoleInclusion 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 97, 'protocoleInclusion 97', NULL, 'protocoleInclusion 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 98, 'protocoleInclusion 98', NULL, 'protocoleInclusion 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:58', '', NULL, b'0', NULL, NULL, 99, 'protocoleInclusion 99', NULL, 'protocoleInclusion 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `protocole_inclusion_seq`
--

INSERT INTO `protocole_inclusion_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `role_app`
--

INSERT INTO `role_app` (`id`, `authority`, `created_at`, `updated_at`) VALUES
(1, 'ROLE_ADMIN', NULL, NULL);

--
-- Déchargement des données de la table `seance_radiotherapie_seq`
--

INSERT INTO `seance_radiotherapie_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `services_seq`
--

INSERT INTO `services_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `site`
--

INSERT INTO `site` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `code`, `libelle`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `services`) VALUES
(1, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 1, 'site 1', 'site 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 2, 'site 2', 'site 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 3, 'site 3', 'site 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 4, 'site 4', 'site 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 5, 'site 5', 'site 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 6, 'site 6', 'site 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 7, 'site 7', 'site 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 8, 'site 8', 'site 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 9, 'site 9', 'site 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 10, 'site 10', 'site 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 11, 'site 11', 'site 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 12, 'site 12', 'site 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 13, 'site 13', 'site 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 14, 'site 14', 'site 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 15, 'site 15', 'site 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 16, 'site 16', 'site 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 17, 'site 17', 'site 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 18, 'site 18', 'site 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 19, 'site 19', 'site 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 20, 'site 20', 'site 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 21, 'site 21', 'site 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 22, 'site 22', 'site 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 23, 'site 23', 'site 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 24, 'site 24', 'site 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 25, 'site 25', 'site 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 26, 'site 26', 'site 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 27, 'site 27', 'site 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 28, 'site 28', 'site 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 29, 'site 29', 'site 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 30, 'site 30', 'site 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 31, 'site 31', 'site 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 32, 'site 32', 'site 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 33, 'site 33', 'site 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 34, 'site 34', 'site 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 35, 'site 35', 'site 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 36, 'site 36', 'site 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 37, 'site 37', 'site 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 38, 'site 38', 'site 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 39, 'site 39', 'site 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 40, 'site 40', 'site 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 41, 'site 41', 'site 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 42, 'site 42', 'site 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 43, 'site 43', 'site 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 44, 'site 44', 'site 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 45, 'site 45', 'site 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 46, 'site 46', 'site 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 47, 'site 47', 'site 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 48, 'site 48', 'site 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 49, 'site 49', 'site 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 50, 'site 50', 'site 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 51, 'site 51', 'site 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 52, 'site 52', 'site 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 53, 'site 53', 'site 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 54, 'site 54', 'site 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 55, 'site 55', 'site 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 56, 'site 56', 'site 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 57, 'site 57', 'site 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 58, 'site 58', 'site 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 59, 'site 59', 'site 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 60, 'site 60', 'site 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 61, 'site 61', 'site 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 62, 'site 62', 'site 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 63, 'site 63', 'site 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 64, 'site 64', 'site 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 65, 'site 65', 'site 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 66, 'site 66', 'site 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 67, 'site 67', 'site 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 68, 'site 68', 'site 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 69, 'site 69', 'site 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 70, 'site 70', 'site 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 71, 'site 71', 'site 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 72, 'site 72', 'site 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 73, 'site 73', 'site 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 74, 'site 74', 'site 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 75, 'site 75', 'site 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 76, 'site 76', 'site 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 77, 'site 77', 'site 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 78, 'site 78', 'site 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 79, 'site 79', 'site 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 80, 'site 80', 'site 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 81, 'site 81', 'site 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 82, 'site 82', 'site 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 83, 'site 83', 'site 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 84, 'site 84', 'site 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 85, 'site 85', 'site 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 86, 'site 86', 'site 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 87, 'site 87', 'site 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 88, 'site 88', 'site 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 89, 'site 89', 'site 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 90, 'site 90', 'site 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 91, 'site 91', 'site 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 92, 'site 92', 'site 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 93, 'site 93', 'site 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 94, 'site 94', 'site 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 95, 'site 95', 'site 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 96, 'site 96', 'site 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 97, 'site 97', 'site 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 98, 'site 98', 'site 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:57', '', NULL, b'0', NULL, NULL, 99, 'site 99', 'site 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `site_seq`
--

INSERT INTO `site_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `specialite_seq`
--

INSERT INTO `specialite_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `statut_radiotherapie_seq`
--

INSERT INTO `statut_radiotherapie_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `type_consultation_radiotherapie_seq`
--

INSERT INTO `type_consultation_radiotherapie_seq` (`next_val`) VALUES
(1),
(1);

--
-- Déchargement des données de la table `type_toxicite_rth`
--

INSERT INTO `type_toxicite_rth` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `code`, `libelle`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `services`) VALUES
(1, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 1, 'typeToxiciteRth 1', 'typeToxiciteRth 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 2, 'typeToxiciteRth 2', 'typeToxiciteRth 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 3, 'typeToxiciteRth 3', 'typeToxiciteRth 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 4, 'typeToxiciteRth 4', 'typeToxiciteRth 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 5, 'typeToxiciteRth 5', 'typeToxiciteRth 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 6, 'typeToxiciteRth 6', 'typeToxiciteRth 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 7, 'typeToxiciteRth 7', 'typeToxiciteRth 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 8, 'typeToxiciteRth 8', 'typeToxiciteRth 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 9, 'typeToxiciteRth 9', 'typeToxiciteRth 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 10, 'typeToxiciteRth 10', 'typeToxiciteRth 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 11, 'typeToxiciteRth 11', 'typeToxiciteRth 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 12, 'typeToxiciteRth 12', 'typeToxiciteRth 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 13, 'typeToxiciteRth 13', 'typeToxiciteRth 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 14, 'typeToxiciteRth 14', 'typeToxiciteRth 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 15, 'typeToxiciteRth 15', 'typeToxiciteRth 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 16, 'typeToxiciteRth 16', 'typeToxiciteRth 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 17, 'typeToxiciteRth 17', 'typeToxiciteRth 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 18, 'typeToxiciteRth 18', 'typeToxiciteRth 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 19, 'typeToxiciteRth 19', 'typeToxiciteRth 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 20, 'typeToxiciteRth 20', 'typeToxiciteRth 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 21, 'typeToxiciteRth 21', 'typeToxiciteRth 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 22, 'typeToxiciteRth 22', 'typeToxiciteRth 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 23, 'typeToxiciteRth 23', 'typeToxiciteRth 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 24, 'typeToxiciteRth 24', 'typeToxiciteRth 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 25, 'typeToxiciteRth 25', 'typeToxiciteRth 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 26, 'typeToxiciteRth 26', 'typeToxiciteRth 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 27, 'typeToxiciteRth 27', 'typeToxiciteRth 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 28, 'typeToxiciteRth 28', 'typeToxiciteRth 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 29, 'typeToxiciteRth 29', 'typeToxiciteRth 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 30, 'typeToxiciteRth 30', 'typeToxiciteRth 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 31, 'typeToxiciteRth 31', 'typeToxiciteRth 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 32, 'typeToxiciteRth 32', 'typeToxiciteRth 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 33, 'typeToxiciteRth 33', 'typeToxiciteRth 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 34, 'typeToxiciteRth 34', 'typeToxiciteRth 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 35, 'typeToxiciteRth 35', 'typeToxiciteRth 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 36, 'typeToxiciteRth 36', 'typeToxiciteRth 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 37, 'typeToxiciteRth 37', 'typeToxiciteRth 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 38, 'typeToxiciteRth 38', 'typeToxiciteRth 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 39, 'typeToxiciteRth 39', 'typeToxiciteRth 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 40, 'typeToxiciteRth 40', 'typeToxiciteRth 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 41, 'typeToxiciteRth 41', 'typeToxiciteRth 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 42, 'typeToxiciteRth 42', 'typeToxiciteRth 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 43, 'typeToxiciteRth 43', 'typeToxiciteRth 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 44, 'typeToxiciteRth 44', 'typeToxiciteRth 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 45, 'typeToxiciteRth 45', 'typeToxiciteRth 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 46, 'typeToxiciteRth 46', 'typeToxiciteRth 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 47, 'typeToxiciteRth 47', 'typeToxiciteRth 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 48, 'typeToxiciteRth 48', 'typeToxiciteRth 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 49, 'typeToxiciteRth 49', 'typeToxiciteRth 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 50, 'typeToxiciteRth 50', 'typeToxiciteRth 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 51, 'typeToxiciteRth 51', 'typeToxiciteRth 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 52, 'typeToxiciteRth 52', 'typeToxiciteRth 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 53, 'typeToxiciteRth 53', 'typeToxiciteRth 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 54, 'typeToxiciteRth 54', 'typeToxiciteRth 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 55, 'typeToxiciteRth 55', 'typeToxiciteRth 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 56, 'typeToxiciteRth 56', 'typeToxiciteRth 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 57, 'typeToxiciteRth 57', 'typeToxiciteRth 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 58, 'typeToxiciteRth 58', 'typeToxiciteRth 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 59, 'typeToxiciteRth 59', 'typeToxiciteRth 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 60, 'typeToxiciteRth 60', 'typeToxiciteRth 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 61, 'typeToxiciteRth 61', 'typeToxiciteRth 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 62, 'typeToxiciteRth 62', 'typeToxiciteRth 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 63, 'typeToxiciteRth 63', 'typeToxiciteRth 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 64, 'typeToxiciteRth 64', 'typeToxiciteRth 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 65, 'typeToxiciteRth 65', 'typeToxiciteRth 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 66, 'typeToxiciteRth 66', 'typeToxiciteRth 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 67, 'typeToxiciteRth 67', 'typeToxiciteRth 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 68, 'typeToxiciteRth 68', 'typeToxiciteRth 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 69, 'typeToxiciteRth 69', 'typeToxiciteRth 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 70, 'typeToxiciteRth 70', 'typeToxiciteRth 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 71, 'typeToxiciteRth 71', 'typeToxiciteRth 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 72, 'typeToxiciteRth 72', 'typeToxiciteRth 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 73, 'typeToxiciteRth 73', 'typeToxiciteRth 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 74, 'typeToxiciteRth 74', 'typeToxiciteRth 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 75, 'typeToxiciteRth 75', 'typeToxiciteRth 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 76, 'typeToxiciteRth 76', 'typeToxiciteRth 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 77, 'typeToxiciteRth 77', 'typeToxiciteRth 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 78, 'typeToxiciteRth 78', 'typeToxiciteRth 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 79, 'typeToxiciteRth 79', 'typeToxiciteRth 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 80, 'typeToxiciteRth 80', 'typeToxiciteRth 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 81, 'typeToxiciteRth 81', 'typeToxiciteRth 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 82, 'typeToxiciteRth 82', 'typeToxiciteRth 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 83, 'typeToxiciteRth 83', 'typeToxiciteRth 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 84, 'typeToxiciteRth 84', 'typeToxiciteRth 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 85, 'typeToxiciteRth 85', 'typeToxiciteRth 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 86, 'typeToxiciteRth 86', 'typeToxiciteRth 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 87, 'typeToxiciteRth 87', 'typeToxiciteRth 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 88, 'typeToxiciteRth 88', 'typeToxiciteRth 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 89, 'typeToxiciteRth 89', 'typeToxiciteRth 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 90, 'typeToxiciteRth 90', 'typeToxiciteRth 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 91, 'typeToxiciteRth 91', 'typeToxiciteRth 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 92, 'typeToxiciteRth 92', 'typeToxiciteRth 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 93, 'typeToxiciteRth 93', 'typeToxiciteRth 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 94, 'typeToxiciteRth 94', 'typeToxiciteRth 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 95, 'typeToxiciteRth 95', 'typeToxiciteRth 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 96, 'typeToxiciteRth 96', 'typeToxiciteRth 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 97, 'typeToxiciteRth 97', 'typeToxiciteRth 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 98, 'typeToxiciteRth 98', 'typeToxiciteRth 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:59', '', NULL, b'0', NULL, NULL, 99, 'typeToxiciteRth 99', 'typeToxiciteRth 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `type_toxicite_rth_seq`
--

INSERT INTO `type_toxicite_rth_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `type_traitement`
--

INSERT INTO `type_traitement` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `code`, `libelle`, `style`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`) VALUES
(1, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 1', 'typeTraitement 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 2', 'typeTraitement 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 3', 'typeTraitement 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 4', 'typeTraitement 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 5', 'typeTraitement 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 6', 'typeTraitement 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 7', 'typeTraitement 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 8', 'typeTraitement 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 9', 'typeTraitement 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 10', 'typeTraitement 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 11', 'typeTraitement 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 12', 'typeTraitement 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 13', 'typeTraitement 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 14', 'typeTraitement 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 15', 'typeTraitement 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 16', 'typeTraitement 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 17', 'typeTraitement 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 18', 'typeTraitement 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 19', 'typeTraitement 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 20', 'typeTraitement 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 21', 'typeTraitement 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 22', 'typeTraitement 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 23', 'typeTraitement 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 24', 'typeTraitement 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 25', 'typeTraitement 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 26', 'typeTraitement 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 27', 'typeTraitement 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 28', 'typeTraitement 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 29', 'typeTraitement 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 30', 'typeTraitement 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 31', 'typeTraitement 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 32', 'typeTraitement 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 33', 'typeTraitement 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 34', 'typeTraitement 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 35', 'typeTraitement 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 36', 'typeTraitement 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 37', 'typeTraitement 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 38', 'typeTraitement 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 39', 'typeTraitement 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 40', 'typeTraitement 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 41', 'typeTraitement 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 42', 'typeTraitement 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 43', 'typeTraitement 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 44', 'typeTraitement 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 45', 'typeTraitement 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 46', 'typeTraitement 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 47', 'typeTraitement 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 48', 'typeTraitement 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 49', 'typeTraitement 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 50', 'typeTraitement 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 51', 'typeTraitement 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 52', 'typeTraitement 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 53', 'typeTraitement 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 54', 'typeTraitement 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 55', 'typeTraitement 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 56', 'typeTraitement 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 57', 'typeTraitement 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 58', 'typeTraitement 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 59', 'typeTraitement 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 60', 'typeTraitement 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 61', 'typeTraitement 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 62', 'typeTraitement 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 63', 'typeTraitement 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 64', 'typeTraitement 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 65', 'typeTraitement 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 66', 'typeTraitement 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 67', 'typeTraitement 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 68', 'typeTraitement 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 69', 'typeTraitement 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 70', 'typeTraitement 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 71', 'typeTraitement 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 72', 'typeTraitement 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 73', 'typeTraitement 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 74', 'typeTraitement 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 75', 'typeTraitement 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 76', 'typeTraitement 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 77', 'typeTraitement 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 78', 'typeTraitement 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 79', 'typeTraitement 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 80', 'typeTraitement 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 81', 'typeTraitement 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 82', 'typeTraitement 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 83', 'typeTraitement 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 84', 'typeTraitement 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 85', 'typeTraitement 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 86', 'typeTraitement 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 87', 'typeTraitement 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 88', 'typeTraitement 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 89', 'typeTraitement 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 90', 'typeTraitement 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 91', 'typeTraitement 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 92', 'typeTraitement 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 93', 'typeTraitement 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 94', 'typeTraitement 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 95', 'typeTraitement 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 96', 'typeTraitement 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 97', 'typeTraitement 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 98', 'typeTraitement 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:58', '', NULL, 'typeTraitement 99', 'typeTraitement 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `type_traitement_seq`
--

INSERT INTO `type_traitement_seq` (`next_val`) VALUES
(100),
(100);

--
-- Déchargement des données de la table `users_roles`
--

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES
(2, 1);

--
-- Déchargement des données de la table `user_app`
--

INSERT INTO `user_app` (`id`, `account_non_expired`, `account_non_locked`, `created_at`, `credentials_non_expired`, `email`, `enabled`, `nom`, `password`, `password_changed`, `prenom`, `updated_at`, `username`, `etablissement`) VALUES
(2, b'1', b'1', '2023-02-15 10:42:59', b'1', 'admin', b'1', 'admin', '$2a$10$JZN19fH3onSu8vCVkOR9pO3f1L32hS2ddP3THsFeLdS7Ia0PT5xWy', b'0', 'admin', NULL, 'admin', NULL);

--
-- Déchargement des données de la table `visee`
--

INSERT INTO `visee` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `actif`, `etablissement_id`, `hl7`, `ordre`, `code`, `description`, `libelle`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `services`) VALUES
(1, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 1, 'visee 1', NULL, 'visee 1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 2, 'visee 2', NULL, 'visee 2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 3, 'visee 3', NULL, 'visee 3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 4, 'visee 4', NULL, 'visee 4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 5, 'visee 5', NULL, 'visee 5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 6, 'visee 6', NULL, 'visee 6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 7, 'visee 7', NULL, 'visee 7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 8, 'visee 8', NULL, 'visee 8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(9, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 9, 'visee 9', NULL, 'visee 9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 10, 'visee 10', NULL, 'visee 10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(11, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 11, 'visee 11', NULL, 'visee 11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 12, 'visee 12', NULL, 'visee 12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 13, 'visee 13', NULL, 'visee 13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(14, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 14, 'visee 14', NULL, 'visee 14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 15, 'visee 15', NULL, 'visee 15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(16, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 16, 'visee 16', NULL, 'visee 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(17, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 17, 'visee 17', NULL, 'visee 17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(18, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 18, 'visee 18', NULL, 'visee 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(19, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 19, 'visee 19', NULL, 'visee 19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(20, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 20, 'visee 20', NULL, 'visee 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(21, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 21, 'visee 21', NULL, 'visee 21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(22, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 22, 'visee 22', NULL, 'visee 22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(23, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 23, 'visee 23', NULL, 'visee 23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(24, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 24, 'visee 24', NULL, 'visee 24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(25, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 25, 'visee 25', NULL, 'visee 25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(26, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 26, 'visee 26', NULL, 'visee 26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(27, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 27, 'visee 27', NULL, 'visee 27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 28, 'visee 28', NULL, 'visee 28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(29, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 29, 'visee 29', NULL, 'visee 29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 30, 'visee 30', NULL, 'visee 30', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(31, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 31, 'visee 31', NULL, 'visee 31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(32, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 32, 'visee 32', NULL, 'visee 32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 33, 'visee 33', NULL, 'visee 33', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(34, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 34, 'visee 34', NULL, 'visee 34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(35, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 35, 'visee 35', NULL, 'visee 35', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(36, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 36, 'visee 36', NULL, 'visee 36', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(37, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 37, 'visee 37', NULL, 'visee 37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 38, 'visee 38', NULL, 'visee 38', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(39, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 39, 'visee 39', NULL, 'visee 39', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(40, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 40, 'visee 40', NULL, 'visee 40', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 41, 'visee 41', NULL, 'visee 41', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(42, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 42, 'visee 42', NULL, 'visee 42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(43, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 43, 'visee 43', NULL, 'visee 43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(44, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 44, 'visee 44', NULL, 'visee 44', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(45, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 45, 'visee 45', NULL, 'visee 45', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(46, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 46, 'visee 46', NULL, 'visee 46', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(47, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 47, 'visee 47', NULL, 'visee 47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(48, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 48, 'visee 48', NULL, 'visee 48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(49, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 49, 'visee 49', NULL, 'visee 49', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(50, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 50, 'visee 50', NULL, 'visee 50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(51, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 51, 'visee 51', NULL, 'visee 51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(52, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 52, 'visee 52', NULL, 'visee 52', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(53, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 53, 'visee 53', NULL, 'visee 53', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(54, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 54, 'visee 54', NULL, 'visee 54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(55, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 55, 'visee 55', NULL, 'visee 55', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(56, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 56, 'visee 56', NULL, 'visee 56', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(57, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 57, 'visee 57', NULL, 'visee 57', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(58, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 58, 'visee 58', NULL, 'visee 58', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(59, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 59, 'visee 59', NULL, 'visee 59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(60, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 60, 'visee 60', NULL, 'visee 60', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(61, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 61, 'visee 61', NULL, 'visee 61', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(62, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 62, 'visee 62', NULL, 'visee 62', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(63, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 63, 'visee 63', NULL, 'visee 63', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(64, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 64, 'visee 64', NULL, 'visee 64', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(65, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 65, 'visee 65', NULL, 'visee 65', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(66, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 66, 'visee 66', NULL, 'visee 66', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(67, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 67, 'visee 67', NULL, 'visee 67', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(68, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 68, 'visee 68', NULL, 'visee 68', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(69, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 69, 'visee 69', NULL, 'visee 69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(70, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 70, 'visee 70', NULL, 'visee 70', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(71, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 71, 'visee 71', NULL, 'visee 71', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(72, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 72, 'visee 72', NULL, 'visee 72', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(73, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 73, 'visee 73', NULL, 'visee 73', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(74, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 74, 'visee 74', NULL, 'visee 74', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(75, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 75, 'visee 75', NULL, 'visee 75', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(76, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 76, 'visee 76', NULL, 'visee 76', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(77, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 77, 'visee 77', NULL, 'visee 77', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(78, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 78, 'visee 78', NULL, 'visee 78', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(79, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 79, 'visee 79', NULL, 'visee 79', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(80, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 80, 'visee 80', NULL, 'visee 80', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(81, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 81, 'visee 81', NULL, 'visee 81', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(82, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 82, 'visee 82', NULL, 'visee 82', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(83, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 83, 'visee 83', NULL, 'visee 83', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(84, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 84, 'visee 84', NULL, 'visee 84', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(85, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 85, 'visee 85', NULL, 'visee 85', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(86, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 86, 'visee 86', NULL, 'visee 86', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(87, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 87, 'visee 87', NULL, 'visee 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(88, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 88, 'visee 88', NULL, 'visee 88', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(89, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 89, 'visee 89', NULL, 'visee 89', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(90, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 90, 'visee 90', NULL, 'visee 90', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(91, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 91, 'visee 91', NULL, 'visee 91', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(92, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 92, 'visee 92', NULL, 'visee 92', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(93, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 93, 'visee 93', NULL, 'visee 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(94, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 94, 'visee 94', NULL, 'visee 94', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(95, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 95, 'visee 95', NULL, 'visee 95', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(96, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 96, 'visee 96', NULL, 'visee 96', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(97, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 97, 'visee 97', NULL, 'visee 97', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(98, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 98, 'visee 98', NULL, 'visee 98', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(99, '', '2023-02-15 10:42:56', '', NULL, b'0', NULL, NULL, 99, 'visee 99', NULL, 'visee 99', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `visee_seq`
--

INSERT INTO `visee_seq` (`next_val`) VALUES
(100),
(100);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;