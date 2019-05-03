<?php

	require_once 'koneksi.php';
	if($_SERVER['REQUEST_METHOD'] == 'POST') {
		$kode = $_POST['kode'];
		$nama = $_POST['nama'];
		$alamat = $_POST['alamat'];
		$query = "INSERT INTO tb_pasar (kode, nama, alamat) VALUES ('$kode','$nama','$alamat')";
		$exeQuery = mysqli_query($konek, $query);
		echo ($exeQuery) ? json_encode(array('kode' =>1, 'pesan' => 'berhasil menambahkan data')) : 
		json_encode(array('kode' =>2, 'pesan' => 'data gagal ditambahkan'));
	} else {
		echo json_encode(array('kode' =>101, 'pesan' => 'request tidak valid'));
	}

?>