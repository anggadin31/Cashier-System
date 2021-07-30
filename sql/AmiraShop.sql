create database amirashop

use amirashop

CREATE TABLE Produk(
ID_Pr varchar(15) NOT NULL PRIMARY KEY,
nama_Pr varchar(20),
jml_Pr int,
harga_Pr Money)

CREATE TABLE supplier(
ID_supp varchar(15) NOT NULL PRIMARY KEY,
nama_supp varchar(20),
alamat varchar(30),
notelp varchar(14))

CREATE TABLE jasa(
ID_jasa varchar(15) NOT NULL PRIMARY KEY,
nama_jasa varchar(20),
harga_jasa Money)

CREATE TABLE kasir(
ID_kasir varchar(15) NOT NULL PRIMARY KEY,
nama_kasir varchar(20)
)

CREATE TABLE member(
ID_member varchar(15) NOT NULL PRIMARY KEY,
nama_member varchar(20)
)

CREATE TABLE diskon(
ID_Pr varchar(15) FOREIGN KEY REFERENCES Produk(ID_Pr),
ID_diskon varchar(15) NOT NULL PRIMARY KEY,
tgl_disk date,
jml_disk int)

CREATE TABLE kategori(
ID_Pr varchar(15) FOREIGN KEY REFERENCES Produk(ID_Pr),
ID_kat varchar(15) NOT NULL PRIMARY KEY,
nama_kat varchar(20)
)

select p.ID_Pr, p.nama_Pr, p.jml_Pr,p.harga_Pr,k.nama_kat as 'Kategori' from Produk p, kategori k where p.ID_Pr=k.ID_Pr
CREATE TABLE layanan(
ID_kasir varchar(15) FOREIGN KEY REFERENCES kasir(ID_kasir),
ID_pel varchar(15) NOT NULL PRIMARY KEY,
nama_pel varchar(20)
)

CREATE TABLE penjualan_jasa(
ID_kasir varchar(15) FOREIGN KEY REFERENCES kasir(ID_kasir),
ID_jasa varchar(15) FOREIGN KEY REFERENCES jasa(ID_jasa),
nama_jasa varchar(20),
harga_jasa money
)

CREATE TABLE penjualan_produk(
ID_kasir varchar(15) FOREIGN KEY REFERENCES kasir(ID_kasir),
ID_Pr varchar(15) FOREIGN KEY REFERENCES produk(ID_Pr),
nama_produk varchar(20),
jml_Pr int,
harga_produk money,
)

CREATE TABLE memasok(
ID_supp varchar(15) FOREIGN KEY REFERENCES supplier(ID_supp),
ID_prod varchar(15) FOREIGN KEY REFERENCES produk(ID_Pr),
nama_Pr varchar(20),
jml_Pr int,
harga_Pr money
)

CREATE TABLE supplier_telp(
ID_supp varchar(15) FOREIGN KEY REFERENCES supplier(ID_supp),
no_telp int
)

