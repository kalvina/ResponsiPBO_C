-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Jan 2021 pada 05.54
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `perpustakaan`
--

CREATE TABLE `perpustakaan` (
  `kode` int(10) NOT NULL,
  `judul_buku` varchar(50) NOT NULL,
  `genre_buku` varchar(30) NOT NULL,
  `penulis_buku` varchar(60) NOT NULL,
  `penerbit_buku` varchar(50) NOT NULL,
  `lokasi_buku` varchar(20) NOT NULL,
  `stok_buku` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `perpustakaan`
--

INSERT INTO `perpustakaan` (`kode`, `judul_buku`, `genre_buku`, `penulis_buku`, `penerbit_buku`, `lokasi_buku`, `stok_buku`) VALUES
(1, 'Naruto', '', 'Kishimoto', 'Konoha', 'Lantai 1', 10),
(2, 'Harry Potter', '', 'Suminten', 'Gramedia', 'Lantai 2', 100),
(3, 'Susi Susanti', '', 'Bambang', 'Erlangga', 'Lantai 3', 100);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `perpustakaan`
--
ALTER TABLE `perpustakaan`
  ADD PRIMARY KEY (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
